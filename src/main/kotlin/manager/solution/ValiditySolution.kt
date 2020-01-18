package manager.solution

import daggerSolutionComponent
import manager.Expression
import manager.Parser
import java.lang.StringBuilder
import javax.inject.Inject

class ValiditySolution {

    @Inject
    lateinit var baseSolution: BaseSolution

    init {
        daggerSolutionComponent.inject(this)
    }

    fun makeValidity(formal: String): Pair<Boolean, Map<String, List<Boolean>>> {
        val list = baseSolution.splitIntoGroups(formal)
        val args = baseSolution.getArgs(list)
        val combinations = baseSolution.getCombination(args)
        val expr = Parser(list).parse()
        val map = mutableMapOf<String, MutableList<Boolean>>()
        val mapReturn = mutableMapOf<String, MutableList<Boolean>>()
        var ret = true
        combinations.forEachIndexed { index, it ->
            val calc = expr.calculate(it)
            val exprTag = expr.tag.distinct()
            if(index == 0) {
                exprTag.forEach {
                    map[it.first] = mutableListOf(it.second)
                }
            } else {
                exprTag.forEach {
                    map[it.first]!!.add(it.second)
                }
            }
            expr.tag = mutableListOf()
            if(!calc) ret = false
        }
        map.forEach { (t, u) ->
            if(t.length == 1) {
                mapReturn[t] = u
            }
        }
        map.forEach { (t, u) ->
            if(t.length != 1) {
                mapReturn[t] = u
            }
        }
        return Pair(ret, mapReturn)
    }
}