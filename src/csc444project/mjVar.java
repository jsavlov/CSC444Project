package csc444project;


public class mjVar {

    private String varType;
    private String name;

    private MJClass parentClass;
    private MJMethod parentMethod;

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

    public MJClass getParentClass() {
        return parentClass;
    }

    public void setParentClass(MJClass parentClass) {
        this.parentClass = parentClass;
    }

    public MJMethod getParentMethod() {
        return parentMethod;
    }

    public void setParentMethod(MJMethod parentMethod) {
        this.parentMethod = parentMethod;
    }
}
