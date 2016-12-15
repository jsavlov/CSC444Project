package csc444project;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.*;


public class MJMethod extends MJSymbol implements Scope, Returnable {

    private final Map<String, MJSymbol> localVars = new HashMap<>();

    private final Map<String, MJSymbol> parameterList = new HashMap<>();
    private final Map<String, MJSymbol> initializedVars = new HashMap<>();


    ParseTreeProperty<Scope> scopeList;

    private String name;
    private Scope owner;
    private Scope methodBody;
    private Returnable returnType;

    public MJMethod() {}

    public MJMethod(String n, Scope owner) {
        this.name = n;
        this.owner = owner;
    }

    public MJMethod(String n, Returnable rt, Scope owner) {
        this.name = n;
        this.returnType = rt;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Returnable getReturnType() {
        return returnType;
    }

    public void setReturnType(Returnable returnType) {
        this.returnType = returnType;
    }


    public void addParameter(MJSymbol sym) {
        this.parameterList.put(sym.getName(), sym);
    }

    public List<MJSymbol> getParameterList() {
        return new ArrayList<MJSymbol>(parameterList.values());
    }

    public List<MJClass> getParameterListDef() {
        List<MJSymbol> paramList = getParameterList();
        List<MJClass> paramListDef = new ArrayList<>();

        for (MJSymbol sym : paramList) {
            paramListDef.add(sym.getType());
        }
        return paramListDef;
    }

    @Override
    public Scope getEnclosingScope() {
        return this.owner;
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
        if (parameterList.containsKey(name)) {
            return parameterList.get(name);
        } else if (localVars.containsKey(name)) {
            return localVars.get(name);
        } else {
            return this.getEnclosingScope().lookupSymbol(name);
        }
    }

    @Override
    public MJSymbol lookupSymbolLocally(String name) {
        if (parameterList.containsKey(name)) {
            return this.parameterList.get(name);
        } else {
            return localVars.get(name);
        }
    }

    @Override
    public boolean hasBeenInitialized(String name) {
        if (initializedVars.containsKey(name) || parameterList.containsKey(name)) {
            return true;
        } else return this.getEnclosingScope().hasBeenInitialized(name);
    }

    @Override
    public Set<MJSymbol> setOfSymbols() {
        return new HashSet<>(this.initializedVars.values());
    }

    public static String getMethodSignature(mjgrammarParser.Method_decContext ctx) {
        return ctx.method_name().ID().getText() + "()";
    }

    @Override
    public Set<MJSymbol> getInitializedVariables()
    {
        return new HashSet<>(this.initializedVars.values());
    }
}
