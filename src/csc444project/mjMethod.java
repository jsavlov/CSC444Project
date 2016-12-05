package csc444project;

import java.util.HashMap;
import java.util.Map;


public class mjMethod {

    private final Map<String, mjVar> varMap = new HashMap<String, mjVar>();

    private String name;
    private mjClass methodClass;
    private String returnType;

    public mjMethod() {}

    public mjMethod(String n, mjClass c) {
        this.name = n;
        this.methodClass = c;
    }

    public mjMethod(String n, String rt, mjClass c) {
        this.name = n;
        this.returnType = rt;
        this.methodClass = c;
    }

    public void addVar(mjVar var) {
        varMap.put(var.getName(), var);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public mjClass getMethodClass() {
        return methodClass;
    }

    public void setMethodClass(mjClass methodClass) {
        this.methodClass = methodClass;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }
}
