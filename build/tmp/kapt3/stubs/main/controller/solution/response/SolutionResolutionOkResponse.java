package controller.solution.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcontroller/solution/response/SolutionResolutionOkResponse;", "Lcontroller/base/response/BaseOkResponse;", "result", "", "description", "", "", "(ZLjava/util/List;)V", "getDescription", "()Ljava/util/List;", "getResult", "()Z", "logic"})
public final class SolutionResolutionOkResponse extends controller.base.response.BaseOkResponse {
    @com.google.gson.annotations.Expose()
    private final boolean result = false;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    private final java.util.List<java.lang.String> description = null;
    
    public final boolean getResult() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDescription() {
        return null;
    }
    
    public SolutionResolutionOkResponse(boolean result, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> description) {
        super(0);
    }
}