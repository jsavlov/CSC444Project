package csc444project;

import java.util.HashMap;
import java.util.Map;



public class mjClass {

    protected String name;
    private mjClass subclass;

    private final Map<String, mjMethod> methodMap = new HashMap<String, mjMethod>();
    private final Map<String, mjVar> varMap = new HashMap<String, mjVar>();


    public mjClass() {
        throw new Error("Cannot have an mjClass with no name...");
    }

    public void addMethod(mjMethod method) {
        methodMap.put(method.getName(), method);
    }

    public void addVar(mjVar var) {
        varMap.put(var.getName(), var);
    }

    public mjClass(String n) {
        name = n;
    }

    public String getName() { return name; }
}
