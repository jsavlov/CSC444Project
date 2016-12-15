package csc444project;


import java.util.Set;

public interface Scope {

    String getName();

    Scope getEnclosingScope();

    void defineSymbol(MJSymbol symbol);

    void initializeSymbol(MJSymbol symbol);

    MJSymbol lookupSymbol(String name);

    MJSymbol lookupSymbolLocally(String name);

    boolean hasBeenInitialized(String name);

    Set<MJSymbol> getInitializedVariables();

    Set<MJSymbol> setOfSymbols();

    static MJClass getEnclosingClass(Scope scope) {
        while (!(scope instanceof MJClass)) {
            scope = scope.getEnclosingScope();
        }

        return (MJClass) scope;
    }

    static MJMethod getEnclosingMethod(Scope scope) {
        while (!(scope instanceof MJMethod)) {
            scope = scope.getEnclosingScope();
        }

        return (MJMethod) scope;
    }

}
