package controller.solution.model

import com.google.gson.annotations.Expose

data class FormulaListSolution(
    @Expose
    val data: List<String>,
    @Expose
    val formula: String
)