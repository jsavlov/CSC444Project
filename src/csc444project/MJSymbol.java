package csc444project;


public class MJSymbol {
    protected String name;
    protected MJClass type;
    protected boolean isField;
    protected boolean isTuple = false;
    protected boolean beenInitialized = false;
    protected int loc_id = -1;
    protected int parameter_list_id = -1;

    public void init() {
        beenInitialized = true;
    }

    public boolean isInitialized() {
        return beenInitialized;
    }

    public MJSymbol(String name, boolean isField) {
        this.name = name;
        this.isField = isField;
    }

    public MJSymbol(String name, MJClass mjclass, boolean isField) {
        this(name, isField);
        this.type = mjclass;
    }

    protected MJSymbol() { }

    public String getName() {
        return this.name;
    }

    public MJClass getType() {
        return this.type;
    }


}
