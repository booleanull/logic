package controller.solution.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bR*\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcontroller/solution/response/SolutionOkResponse;", "Lcontroller/base/response/BaseOkResponse;", "result", "", "description", "", "", "", "(ZLjava/util/Map;)V", "getDescription", "()Ljava/util/Map;", "getResult", "()Z", "logic"})
public final class SolutionOkResponse extends controller.base.response.BaseOkResponse {
    @com.google.gson.annotations.Expose()
    private final boolean result = false;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final java.util.Map<java.lang.String, java.util.List<java.lang.Boolean>> description = null;
    
    public final boolean getResult() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.util.List<java.lang.Boolean>> getDescription() {
        return null;
    }
    
    public SolutionOkResponse(boolean result, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ? extends java.util.List<java.lang.Boolean>> description) {
        super(0);
    }
}