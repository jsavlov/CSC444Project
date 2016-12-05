package csc444project;


public class mjVar {

    private String varType;
    private String name;

    private mjClass parentClass;
    private mjMethod parentMethod;

    public mjVar(String t, String n) {
        this.varType = t;
        this.name = n;
    }

    public String getVarType() {
        return varType;
    }

    public void setVarType(String varType) {
        this.varType = varType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public mjClass getParentClass() {
        return parentClass;
    }

    public void setParentClass(mjClass parentClass) {
        this.parentClass = parentClass;
    }

    public mjMethod getParentMethod() {
        return parentMethod;
    }

    public void setParentMethod(mjMethod parentMethod) {
        this.parentMethod = parentMethod;
    }
}
