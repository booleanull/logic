package di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Ldi/SolutionModule;", "", "()V", "provideBaseSolution", "Lmanager/solution/BaseSolution;", "provideConsequenceSolution", "Lmanager/solution/ConsequenceSolution;", "provideInconsistencySolution", "Lmanager/solution/InconsistencySolution;", "provideResolutionSolution", "Lmanager/solution/ResolutionSolution;", "provideValiditySolution", "Lmanager/solution/ValiditySolution;", "logic"})
@dagger.Module()
public final class SolutionModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final manager.solution.BaseSolution provideBaseSolution() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final manager.solution.ValiditySolution provideValiditySolution() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final manager.solution.InconsistencySolution provideInconsistencySolution() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final manager.solution.ConsequenceSolution provideConsequenceSolution() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final manager.solution.ResolutionSolution provideResolutionSolution() {
        return null;
    }
    
    public SolutionModule() {
        super();
    }
}