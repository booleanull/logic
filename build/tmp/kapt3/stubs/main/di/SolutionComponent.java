package di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&\u00a8\u0006\u0010"}, d2 = {"Ldi/SolutionComponent;", "", "inject", "", "settingsController", "Lcontroller/settings/SettingsController;", "solutionController", "Lcontroller/solution/SolutionController;", "consequenceSolution", "Lmanager/solution/ConsequenceSolution;", "inconsistencySolution", "Lmanager/solution/InconsistencySolution;", "resolutionSolution", "Lmanager/solution/ResolutionSolution;", "validitySolution", "Lmanager/solution/ValiditySolution;", "logic"})
@dagger.Component(modules = {di.SolutionModule.class, di.GsonModule.class})
@javax.inject.Singleton()
public abstract interface SolutionComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    controller.solution.SolutionController solutionController);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    controller.settings.SettingsController settingsController);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    manager.solution.ValiditySolution validitySolution);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    manager.solution.InconsistencySolution inconsistencySolution);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    manager.solution.ConsequenceSolution consequenceSolution);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    manager.solution.ResolutionSolution resolutionSolution);
}