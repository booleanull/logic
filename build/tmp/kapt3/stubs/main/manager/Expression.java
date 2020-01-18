package manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u000f\u0010\u0011\u0012B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\f\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u000eR,\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u0013\u0014\u0015\u00a8\u0006\u0016"}, d2 = {"Lmanager/Expression;", "", "()V", "tag", "", "Lkotlin/Pair;", "", "", "getTag", "()Ljava/util/List;", "setTag", "(Ljava/util/List;)V", "calculate", "map", "", "Binary", "Negate", "Operation", "Variable", "Lmanager/Expression$Variable;", "Lmanager/Expression$Binary;", "Lmanager/Expression$Negate;", "logic"})
public abstract class Expression {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<kotlin.Pair<java.lang.String, java.lang.Boolean>> tag;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.Boolean>> getTag() {
        return null;
    }
    
    public final void setTag(@org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<java.lang.String, java.lang.Boolean>> p0) {
    }
    
    public final boolean calculate(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Boolean> map) {
        return false;
    }
    
    private Expression() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lmanager/Expression$Variable;", "Lmanager/Expression;", "key", "", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "logic"})
    public static final class Variable extends manager.Expression {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String key = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getKey() {
            return null;
        }
        
        public Variable(@org.jetbrains.annotations.NotNull()
        java.lang.String key) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final manager.Expression.Variable copy(@org.jetbrains.annotations.NotNull()
        java.lang.String key) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lmanager/Expression$Operation;", "", "(Ljava/lang/String;I)V", "PLUS", "TIMES", "XOR", "IMPLICATION", "EQUIVALENCE", "logic"})
    public static enum Operation {
        /*public static final*/ PLUS /* = new PLUS() */,
        /*public static final*/ TIMES /* = new TIMES() */,
        /*public static final*/ XOR /* = new XOR() */,
        /*public static final*/ IMPLICATION /* = new IMPLICATION() */,
        /*public static final*/ EQUIVALENCE /* = new EQUIVALENCE() */;
        
        Operation() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lmanager/Expression$Binary;", "Lmanager/Expression;", "left", "op", "Lmanager/Expression$Operation;", "right", "(Lmanager/Expression;Lmanager/Expression$Operation;Lmanager/Expression;)V", "getLeft", "()Lmanager/Expression;", "getOp", "()Lmanager/Expression$Operation;", "getRight", "logic"})
    public static final class Binary extends manager.Expression {
        @org.jetbrains.annotations.NotNull()
        private final manager.Expression left = null;
        @org.jetbrains.annotations.NotNull()
        private final manager.Expression.Operation op = null;
        @org.jetbrains.annotations.NotNull()
        private final manager.Expression right = null;
        
        @org.jetbrains.annotations.NotNull()
        public final manager.Expression getLeft() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final manager.Expression.Operation getOp() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final manager.Expression getRight() {
            return null;
        }
        
        public Binary(@org.jetbrains.annotations.NotNull()
        manager.Expression left, @org.jetbrains.annotations.NotNull()
        manager.Expression.Operation op, @org.jetbrains.annotations.NotNull()
        manager.Expression right) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lmanager/Expression$Negate;", "Lmanager/Expression;", "arg", "(Lmanager/Expression;)V", "getArg", "()Lmanager/Expression;", "logic"})
    public static final class Negate extends manager.Expression {
        @org.jetbrains.annotations.NotNull()
        private final manager.Expression arg = null;
        
        @org.jetbrains.annotations.NotNull()
        public final manager.Expression getArg() {
            return null;
        }
        
        public Negate(@org.jetbrains.annotations.NotNull()
        manager.Expression arg) {
            super();
        }
    }
}