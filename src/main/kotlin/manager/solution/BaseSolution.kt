package manager.solution

class BaseSolution {
    fun splitIntoGroups(string: String): List<String> {
        val matchResults = Regex(
            """x|\+|-|\*|/|\(|\)|\d+| +?|.+?""").
            findAll(string)
        return matchResults.map { it.value }
            .filter { it.isNotBlank() }
            .toList()
    }

    fun getArgs(list: List<String>): List<String> {
        return list.filter {
            it != "(" && it != ")" && it != "∨" && it != "∧" && it != "⊕" && it != "→" && it != "⇔" && it != "!"
        }.distinct()
    }

    fun getCombination(list: List<String>): List<Map<String, Boolean>> {
        val combinations = mutableListOf<Map<String, Boolean>>()
        var lastElement = ""
        for (i in 0 until list.size) {
            lastElement += "1"
        }
        var byte = 0
        var stringCombination = ""
        while (lastElement != stringCombination) {
            stringCombination = byte.toUInt().toString(2)
            var adaptedStringCombination = stringCombination
            while (adaptedStringCombination.length < list.size) {
                adaptedStringCombination = "0$adaptedStringCombination"
            }
            val map = mutableMapOf<String, Boolean>()
            list.forEachIndexed { index, string ->
                map[string] = adaptedStringCombination[index] == '1'
            }
            combinations.add(map)
            byte++
        }
        return combinations
    }
}