package csc444project;

import org.objectweb.asm.Type;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class MJClass implements Scope, Returnable, Comparable
{

    protected String name;
    MJClass superclass;

    private final Map<String, MJMethod> methodMap = new HashMap<String, MJMethod>();
    private final Map<String, MJSymbol> symMap = new HashMap<>();


    public MJClass()
    {
        throw new Error("Cannot have an MJClass with no name...");
    }

    public MJClass(String n)
    {
        name = n;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public Scope getEnclosingScope()
    {
        return null;
    }

    @Override
    public void defineSymbol(MJSymbol symbol)
    {
        symMap.put(symbol.getName(), symbol);
    }

    @Override
    public void initializeSymbol(MJSymbol symbol)
    {
        //throw new Error("Major problem, Jack...");
    }

    public MJClass getSuperclass()
    {
        return this.superclass;
    }

    public boolean isInstanceOf(Returnable queriedClass)
    {
        if (this.superclass == null && queriedClass != this) return false;
        else if (queriedClass == this) return true;

        else
            return this.superclass.isInstanceOf(queriedClass);
    }

    @Override
    public Set<MJSymbol> getInitializedVariables()
    {
        return null;
    }

    @Override
    public MJSymbol lookupSymbol(String name)
    {
        MJSymbol symbol = null;
        for (MJClass workingClass = this;
             symbol == null && workingClass != null;
             workingClass = workingClass.getSuperclass()) {
            symbol = workingClass.symMap.get(name);
        }

        return symbol;
    }

    @Override
    public MJSymbol lookupSymbolLocally(String name)
    {
        return this.symMap.get(name);
    }

    @Override
    public boolean hasBeenInitialized(String name)
    {
        return this.lookupSymbol(name) != null;
    }

    @Override
    public Set<MJSymbol> setOfSymbols()
    {
        return null;
    }

    @Override
    public Returnable getReturnType()
    {
        return null;
    }

    @Override
    public void setReturnType(Returnable returnType)
    {

    }

    public Type getAsmType()
    {
        if (this.name.equals("int")) {
            return Type.INT_TYPE;
        } else if (this.name.equals("boolean")) {
            return Type.BOOLEAN_TYPE;
        } else if (this.name.equals("int[]")) {
            return Type.getType(int[].class);
        } else {
            return Type.getType("L" + this.name + ";");
        }
    }

    @Override
    public String toString()
    {
        return name;
    }

    @Override
    public int compareTo(Object o)
    {
        if (!(o instanceof MJClass)) {
            throw new Error("Comparison error with MJClass...");
        }

        return ((MJClass) o).getName().compareTo(this.getName());
    }
}
