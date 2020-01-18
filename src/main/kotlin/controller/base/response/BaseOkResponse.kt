package controller.base.response

open class BaseOkResponse(httpStatus: Int = 200): BaseResponse("ok", httpStatus = httpStatus)