package manager

import manager.exception.NotSerializableException

class Parser(val groups: List<String>) {
    var pos = 0

    private val operationMap =
        mapOf(
            "∨" to Expression.Operation.PLUS,
            "∧" to Expression.Operation.TIMES,
            "⊕" to Expression.Operation.XOR,
            "→" to Expression.Operation.IMPLICATION,
            "⇔" to Expression.Operation.EQUIVALENCE
        )

    fun parse(): Expression {
        val result = parseExpression()
        if (pos < groups.size) throw NotSerializableException()
        return result
    }

    private fun parseExpression(): Expression {
        var left = parseItem()
        while (pos < groups.size) {
            val op = operationMap[groups[pos]]
            if (op == Expression.Operation.XOR || op == Expression.Operation.EQUIVALENCE || op == Expression.Operation.IMPLICATION) {
                pos++
                left = Expression.Binary(left, op, parseItem())
            } else return left
        }
        return left
    }

    private fun parseItem(): Expression {
        var left = parseFactor()
        while (pos < groups.size) {
            val op = operationMap[groups[pos]]
            if (op == Expression.Operation.TIMES || op == Expression.Operation.PLUS) {
                pos++
                left = Expression.Binary(
                    left, op, parseFactor()
                )
            } else return left
        }
        return left
    }

    private fun parseFactor(): Expression =
        if (pos >= groups.size) throw NotSerializableException()
        else {
            val group = groups[pos++]
            when (group) {
                "!" -> Expression.Negate(parseFactor())
                "(" -> {
                    val arg = parseExpression()
                    val next = groups[pos++]
                    if (next == ")") arg
                    else throw NotSerializableException()
                }
                else -> Expression.Variable(group)
            }
        }
}