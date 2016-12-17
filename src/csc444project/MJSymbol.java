package csc444project;


public class MJSymbol
{
    protected String name;
    protected Returnable type;
    protected boolean isField;
    protected boolean isTuple = false;
    protected boolean beenInitialized = false;
    protected int loc_id = -1;
    protected int parameter_list_id = -1;

    public void init()
    {
        beenInitialized = true;
    }

    public boolean isInitialized()
    {
        return beenInitialized;
    }

    public MJSymbol(String name, boolean isField)
    {
        this.name = name;
        this.isField = isField;
    }

    public MJSymbol(String name, MJClass mjclass, boolean isField)
    {
        this(name, isField);
        this.type = mjclass;
    }

    protected MJSymbol()
    {
    }

    public String getName()
    {
        return this.name;
    }

    public Returnable getType()
    {
        return this.type;
    }

    public boolean isField()
    {
        return isField;
    }

    public boolean hasLocalId()
    {
        return loc_id != -1;
    }

    public int getLocalId()
    {
        assert loc_id >= 0;
        assert !isField;
        return loc_id;
    }

    public void setLocalId(int localIdentifier)
    {
        assert !isField;
        this.loc_id = localIdentifier;
    }

    public boolean isParameter()
    {
        return parameter_list_id != -1;
    }

    public void setParameterId(int parameterListIdentifier)
    {
        this.parameter_list_id = parameterListIdentifier;
    }

    public int getParameterListId()
    {
        return parameter_list_id;
    }

    @Override
    public String toString()
    {
        if (type != null)
            return '<' + getName() + ":" + type + '>';
        return getName();
    }
}
