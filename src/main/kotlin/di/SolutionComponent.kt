package di

import controller.settings.SettingsController
import controller.solution.SolutionController
import dagger.Component
import manager.solution.ConsequenceSolution
import manager.solution.InconsistencySolution
import manager.solution.ResolutionSolution
import manager.solution.ValiditySolution
import javax.inject.Singleton

@Singleton
@Component(modules = [SolutionModule::class, GsonModule::class])
interface SolutionComponent {

    fun inject(solutionController: SolutionController)
    fun inject(settingsController: SettingsController)

    fun inject(validitySolution: ValiditySolution)
    fun inject(inconsistencySolution: InconsistencySolution)
    fun inject(consequenceSolution: ConsequenceSolution)
    fun inject(resolutionSolution: ResolutionSolution)
}