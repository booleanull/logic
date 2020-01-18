package manager.solution

import daggerSolutionComponent
import java.lang.StringBuilder
import javax.inject.Inject

class ConsequenceSolution {

    @Inject
    lateinit var validitySolution: ValiditySolution

    init {
        daggerSolutionComponent.inject(this)
    }

    fun makeConsequence(list: List<String>, formula: String): Pair<Boolean, Map<String, List<Boolean>>> {
        val stringBuilder = StringBuilder().apply {
            append("(")
            if(list.size != 1) {
                for (i in 0 until list.size - 1) {
                    append("(${list[i]}) ∧ ")
                }
            }
            append("${list.last()}) → ($formula)")
        }
        return validitySolution.makeValidity(stringBuilder.toString())
    }
}