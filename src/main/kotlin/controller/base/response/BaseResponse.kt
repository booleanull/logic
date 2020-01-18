package controller.base.response

import com.google.gson.Gson
import com.google.gson.annotations.Expose
import spark.HaltException
import spark.Spark

open class BaseResponse(@Expose
                        val status: String,
                        @Expose
                        val error: String? = null,
                        @Expose(serialize = false)
                        val httpStatus: Int) {

    fun halt(gson: Gson): HaltException {
        return Spark.halt(this.httpStatus, gson.toJson(this))
    }
}
