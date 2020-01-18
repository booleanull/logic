package di

import dagger.Module
import dagger.Provides
import manager.solution.*
import javax.inject.Singleton

@Module
class SolutionModule {

    @Singleton
    @Provides
    fun provideBaseSolution(): BaseSolution {
        return BaseSolution()
    }

    @Singleton
    @Provides
    fun provideValiditySolution(): ValiditySolution {
        return ValiditySolution()
    }

    @Singleton
    @Provides
    fun provideInconsistencySolution(): InconsistencySolution {
        return InconsistencySolution()
    }

    @Singleton
    @Provides
    fun provideConsequenceSolution(): ConsequenceSolution {
        return ConsequenceSolution()
    }

    @Singleton
    @Provides
    fun provideResolutionSolution(): ResolutionSolution {
        return ResolutionSolution()
    }
}