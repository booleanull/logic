package controller.base.response

open class BaseErrorResponse(error: String, httpStatus: Int): BaseResponse("error", error, httpStatus)