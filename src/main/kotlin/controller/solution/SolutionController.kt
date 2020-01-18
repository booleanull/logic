package controller.solution

import com.google.gson.Gson
import controller.base.BaseController
import controller.base.response.BadRequestErrorResponse
import controller.solution.model.BaseSolution
import controller.solution.model.FormulaListSolution
import controller.solution.response.SolutionNotSerializableErrorResponse
import controller.solution.response.SolutionOkResponse
import controller.solution.response.SolutionResolutionOkResponse
import controller.solution.response.SolutionWrongCoeffErrorResponse
import daggerSolutionComponent
import manager.solution.InconsistencySolution
import manager.solution.ValiditySolution
import manager.exception.NotSerializableException
import manager.exception.WrongCoeffException
import manager.solution.ConsequenceSolution
import manager.solution.ResolutionSolution
import spark.Spark.post
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class SolutionController : BaseController {

    @Inject
    lateinit var gson: Gson
    @Inject
    lateinit var validitySolution: ValiditySolution
    @Inject
    lateinit var inconsistencySolution: InconsistencySolution
    @Inject
    lateinit var consequenceSolution: ConsequenceSolution
    @Inject
    lateinit var resolutionSolution: ResolutionSolution

    init {
        daggerSolutionComponent.inject(this)
    }

    override fun start() {
        println("SolutionController is enabled")
        initValidity()
        initInconsistency()
        initConsequence()
        initResolution()
    }

    private fun initValidity() {
        post("/api/validity", { req, res ->
            val data = gson.fromJson(req.body(), BaseSolution::class.java)

            val time = SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(Calendar.getInstance().time)
            println("[LOG][VALIDITY] Connected from ${req.ip()} in $time")

            try {
                val result = validitySolution.makeValidity(data.data)
                return@post SolutionOkResponse(result.first, result.second)
            } catch (e: NotSerializableException) {
                SolutionNotSerializableErrorResponse.halt(gson)
            } catch (e: WrongCoeffException) {
                SolutionWrongCoeffErrorResponse.halt(gson)
            }

            return@post BadRequestErrorResponse
        }, gson::toJson)
    }

    private fun initInconsistency() {
        post("/api/inconsistency", { req, res ->
            val data = gson.fromJson(req.body(), BaseSolution::class.java)

            val time = SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(Calendar.getInstance().time)
            println("[LOG][INCONSISTENCY] Connected from ${req.ip()} in $time")

            try {
                val result = inconsistencySolution.makeInconsistency(data.data)
                return@post SolutionOkResponse(result.first, result.second)
            } catch (e: NotSerializableException) {
                SolutionNotSerializableErrorResponse.halt(gson)
            } catch (e: WrongCoeffException) {
                SolutionWrongCoeffErrorResponse.halt(gson)
            }

            return@post BadRequestErrorResponse
        }, gson::toJson)
    }

    private fun initConsequence() {
        post("/api/consequence", { req, res ->
            val data = gson.fromJson(req.body(), FormulaListSolution::class.java)

            val time = SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(Calendar.getInstance().time)
            println("[LOG][CONSEQUENCE] Connected from ${req.ip()} in $time")

            try {
                val result = consequenceSolution.makeConsequence(data.data, data.formula)
                return@post SolutionOkResponse(result.first, result.second)
            } catch (e: NotSerializableException) {
                SolutionNotSerializableErrorResponse.halt(gson)
            } catch (e: IndexOutOfBoundsException) {
                SolutionNotSerializableErrorResponse.halt(gson)
            } catch (e: WrongCoeffException) {
                SolutionWrongCoeffErrorResponse.halt(gson)
            }

            return@post BadRequestErrorResponse
        }, gson::toJson)
    }

    private fun initResolution() {
        post("/api/resolution", { req, res ->
            val data = gson.fromJson(req.body(), FormulaListSolution::class.java)

            val time = SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(Calendar.getInstance().time)
            println("[LOG][RESOLUTION] Connected from ${req.ip()} in $time")

            try {
                val result = resolutionSolution.makeResolution(data.data, data.formula)
                return@post SolutionResolutionOkResponse(result.first, result.second)
            } catch (e: NotSerializableException) {
                SolutionNotSerializableErrorResponse.halt(gson)
            } catch (e: WrongCoeffException) {
                SolutionWrongCoeffErrorResponse.halt(gson)
            }

            return@post BadRequestErrorResponse
        }, gson::toJson)
    }
}