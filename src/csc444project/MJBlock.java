package csc444project;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MJBlock implements Scope {

    /*
        Instance variables
     */

    private Map<String, MJSymbol> localVars = new HashMap<>();
    private Map<String, MJSymbol> initializedVars = new HashMap<>();
    private Scope enclosingScope;
    private String name = "local_var";

    public MJBlock(Scope enclosingScope) {
        this.enclosingScope = enclosingScope;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Scope getEnclosingScope() {
        return this.enclosingScope;
    }

    @Override
    public void defineSymbol(MJSymbol symbol) {
        localVars.put(symbol.getName(), symbol);
    }

    @Override
    public void initializeSymbol(MJSymbol symbol) {
        initializedVars.put(symbol.getName(), symbol);
    }

    @Override
    public MJSymbol lookupSymbol(String name) {
        if (localVars.containsKey(name)) {
            return localVars.get(name);
        } else {
            return this.getEnclosingScope().lookupSymbol(name);
        }
    }

    @Override
    public Set<MJSymbol> getInitializedVariables()
    {
        return new HashSet<>(this.initializedVars.values());
    }

    @Override
    public MJSymbol lookupSymbolLocally(String name) {
        return localVars.get(name);
    }

    @Override
    public boolean hasBeenInitialized(String name) {
        if (initializedVars.containsKey(name)) {
            return true;
        } else return this.getEnclosingScope().hasBeenInitialized(name);
    }

    @Override
    public Set<MJSymbol> setOfSymbols() {
        return new HashSet<>(this.initializedVars.values());
    }
}
