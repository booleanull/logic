package manager.solution

import daggerSolutionComponent
import java.lang.StringBuilder
import javax.inject.Inject

class ResolutionSolution {

    @Inject
    lateinit var baseSolution: BaseSolution

    init {
        daggerSolutionComponent.inject(this)
    }

    fun makeResolution(list: List<String>, formula: String): Pair<Boolean, List<String>> {
        val loggerList = mutableListOf<String>()
        val mutableList = mutableListOf<String>()
        list.forEach {
            it.split(" ∧ ").forEach {st ->
                mutableList.add(st)
            }
        }
        var stringBuilder = StringBuilder()
        var t = 0
        while (t != mutableList.size) {
            while (mutableList[t].contains("→")) {
                val string = StringBuilder()
                val pos = mutableList[t].indexOf('→')
                if (pos < 3 || mutableList[t][pos - 3] != '!') {
                    string.append(mutableList[t].substring(0, pos - 2))
                    string.append('!')
                } else {
                    string.append(if (pos - 3 >= 0) mutableList[t].substring(0, pos - 3) else "")
                }
                string.append(mutableList[t][pos - 2])
                string.append(" ∨ ")
                string.append(mutableList[t].substring(pos + 2, mutableList[t].length))
                mutableList[t] = string.toString()
            }
            t++
        }
        /*var form = formula.split(" ∧ ")
        form.forEach {
            stringBuilder = StringBuilder()
            val mt = mutableListOf<Char>()
            it.forEach {
                if (it == '∨' || it == '→') {
                    mt.add(it)
                }
            }
            mt.add('1')
            it.split(" ∨ ", " → ").forEachIndexed { index, it ->
                if (it[0] == '!')
                    stringBuilder.append(it.replace("!", "") + " ${mt[index]} ")
                else {
                    stringBuilder.append("!$it ${mt[index]} ")
                }
            }
            var q = stringBuilder.substring(0, stringBuilder.length - 3).toString()
            while (q.contains("→")) {
                val string = StringBuilder()
                val pos = q.indexOf('→')
                if (pos < 3 || q[pos - 3] != '!') {
                    string.append(q.substring(0, pos - 2))
                    string.append('!')
                } else {
                    string.append(if (pos - 3 >= 0) q.substring(0, pos - 3) else "")
                }
                string.append(q[pos - 2])
                string.append(" ∨ ")
                string.append(q.substring(pos + 2, q.length))
                q = string.toString()
            }
            mutableList.add(q)
        }*/
        mutableList.forEach {
            loggerList.add("R${loggerList.size + 1}: $it")
        }
        var repeat: Boolean
        do {
            repeat = false
            val size = mutableList.size
            for (i in 0 until size) {
                val args = baseSolution.getArgs(baseSolution.splitIntoGroups(mutableList[i]))
                for (j in 0 until size) {
                    if (i != j) {
                        if (mutableList[i].length < mutableList[j].length) {
                            args.forEach {
                                if ((mutableList[j].contains(it) && !mutableList[j].contains("!$it") && mutableList[i].contains(
                                        "!$it"
                                    ))
                                    || (mutableList[j].contains("!$it") && mutableList[i].contains(it) && !mutableList[i].contains(
                                        "!$it"
                                    ))
                                ) {
                                    val new = mutableList[j]
                                        .replace(" ∨ !$it", "")
                                        .replace("!$it ∨ ", "")
                                        .replace("!$it", "")
                                        .replace(" ∨ $it", "")
                                        .replace("$it ∨ ", "")
                                        .replace(it, "")

                                    if (!mutableList.contains(new)) {
                                        loggerList.add("R${loggerList.size + 1}: R${i + 1} рез R${j + 1} = ${if (new.isNullOrEmpty()) "□" else new}")
                                        mutableList.add(new)
                                        if (mutableList.last().isEmpty()) return Pair(true, loggerList)
                                        repeat = true
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } while (repeat)
        return Pair(false, loggerList)
    }
}