package controller.solution.response

import com.google.gson.annotations.Expose
import controller.base.response.BaseOkResponse

class SolutionOkResponse(
    @Expose
    val result: Boolean,
    @Expose
    val description: Map<String, List<Boolean>>?
) : BaseOkResponse()