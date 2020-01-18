package controller.settings

import com.google.gson.Gson
import controller.base.BaseController
import daggerSolutionComponent
import spark.Spark
import javax.inject.Inject

class SettingsController: BaseController {

    @Inject
    lateinit var gson: Gson

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun start() {
        initOptions()
        initBeforeMethod()
    }

    fun initOptions() {
        Spark.options("/*"
        ) { request, response ->

            val accessControlRequestHeaders = request
                .headers("Access-Control-Request-Headers")
            if(accessControlRequestHeaders != null) {
                response.header("Access-Control-Allow-Headers",
                    accessControlRequestHeaders)
            }

            val accessControlRequestMethod = request
                .headers("Access-Control-Request-Method")
            if(accessControlRequestMethod != null) {
                response.header("Access-Control-Allow-Methods",
                    accessControlRequestMethod)
            }

            "OK"
        }
    }

    fun initBeforeMethod() {
        Spark.before("*") { req, res ->
            res.header("Access-Control-Allow-Origin", "*")
        }
    }
}