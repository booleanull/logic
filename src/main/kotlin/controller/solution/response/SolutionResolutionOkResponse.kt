package controller.solution.response

import com.google.gson.annotations.Expose
import controller.base.response.BaseOkResponse

class SolutionResolutionOkResponse(
    @Expose
    val result: Boolean,
    @Expose
    val description: List<String>
) : BaseOkResponse()