package controller.solution;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020\"H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006\'"}, d2 = {"Lcontroller/solution/SolutionController;", "Lcontroller/base/BaseController;", "()V", "consequenceSolution", "Lmanager/solution/ConsequenceSolution;", "getConsequenceSolution", "()Lmanager/solution/ConsequenceSolution;", "setConsequenceSolution", "(Lmanager/solution/ConsequenceSolution;)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "inconsistencySolution", "Lmanager/solution/InconsistencySolution;", "getInconsistencySolution", "()Lmanager/solution/InconsistencySolution;", "setInconsistencySolution", "(Lmanager/solution/InconsistencySolution;)V", "resolutionSolution", "Lmanager/solution/ResolutionSolution;", "getResolutionSolution", "()Lmanager/solution/ResolutionSolution;", "setResolutionSolution", "(Lmanager/solution/ResolutionSolution;)V", "validitySolution", "Lmanager/solution/ValiditySolution;", "getValiditySolution", "()Lmanager/solution/ValiditySolution;", "setValiditySolution", "(Lmanager/solution/ValiditySolution;)V", "initConsequence", "", "initInconsistency", "initResolution", "initValidity", "start", "logic"})
public final class SolutionController implements controller.base.BaseController {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.gson.Gson gson;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public manager.solution.ValiditySolution validitySolution;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public manager.solution.InconsistencySolution inconsistencySolution;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public manager.solution.ConsequenceSolution consequenceSolution;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public manager.solution.ResolutionSolution resolutionSolution;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    public final void setGson(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final manager.solution.ValiditySolution getValiditySolution() {
        return null;
    }
    
    public final void setValiditySolution(@org.jetbrains.annotations.NotNull()
    manager.solution.ValiditySolution p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final manager.solution.InconsistencySolution getInconsistencySolution() {
        return null;
    }
    
    public final void setInconsistencySolution(@org.jetbrains.annotations.NotNull()
    manager.solution.InconsistencySolution p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final manager.solution.ConsequenceSolution getConsequenceSolution() {
        return null;
    }
    
    public final void setConsequenceSolution(@org.jetbrains.annotations.NotNull()
    manager.solution.ConsequenceSolution p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final manager.solution.ResolutionSolution getResolutionSolution() {
        return null;
    }
    
    public final void setResolutionSolution(@org.jetbrains.annotations.NotNull()
    manager.solution.ResolutionSolution p0) {
    }
    
    @java.lang.Override()
    public void start() {
    }
    
    private final void initValidity() {
    }
    
    private final void initInconsistency() {
    }
    
    private final void initConsequence() {
    }
    
    private final void initResolution() {
    }
    
    public SolutionController() {
        super();
    }
}