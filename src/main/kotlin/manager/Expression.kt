package manager

import manager.exception.WrongCoeffException
import java.lang.StringBuilder

sealed class Expression {
    var tag = mutableListOf<Pair<String, Boolean>>()
    data class Variable(val key: String) : Expression()
    enum class Operation {
        PLUS,
        TIMES,
        XOR,
        IMPLICATION,
        EQUIVALENCE;
    }
    class Binary(
        val left: Expression,
        val op: Operation,
        val right: Expression
    ) : Expression()
    class Negate(val arg: Expression) : Expression()

    fun calculate(map: Map<String, Boolean>): Boolean = when (this) {
        is Variable -> {
            tag.add(Pair(key, map[key] ?: throw WrongCoeffException()))
            map[key] ?: throw WrongCoeffException()
        }
        is Negate -> {
            val t = !arg.calculate(map)
            tag.addAll(arg.tag)
            tag.add(Pair("!(${this.arg.tag.last().first})", t))
            arg.tag = mutableListOf()
            t
        }
        is Binary -> {
            val left = left.calculate(map)
            val right = right.calculate(map)
            tag.addAll(this.left.tag)
            tag.addAll(this.right.tag)
            when (op) {
                Operation.PLUS -> {
                    tag.add(Pair("(${this.left.tag.last().first} ∨ ${this.right.tag.last().first})", left || right))
                    this.left.tag = mutableListOf()
                    this.right.tag = mutableListOf()
                    left || right
                }
                Operation.TIMES -> {
                    tag.add(Pair("(${this.left.tag.last().first} ∧ ${this.right.tag.last().first})", left && right))
                    this.left.tag = mutableListOf()
                    this.right.tag = mutableListOf()
                    left && right
                }
                Operation.XOR -> {
                    tag.add(Pair("(${this.left.tag.last().first} ⊕ ${this.right.tag.last().first})", left.xor(right)))
                    this.left.tag = mutableListOf()
                    this.right.tag = mutableListOf()
                    left.xor(right)
                }
                Operation.IMPLICATION -> {
                    tag.add(Pair("(${this.left.tag.last().first} → ${this.right.tag.last().first})", !left || right))
                    this.left.tag = mutableListOf()
                    this.right.tag = mutableListOf()
                    !left || right
                }
                Operation.EQUIVALENCE -> {
                    tag.add(Pair("(${this.left.tag.last().first} ⇔ ${this.right.tag.last().first})", !(left.xor(right))))
                    this.left.tag = mutableListOf()
                    this.right.tag = mutableListOf()
                    !(left.xor(right))
                }
            }
        }
    }
}


