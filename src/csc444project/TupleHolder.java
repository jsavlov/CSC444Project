package csc444project;


import org.objectweb.asm.Type;

public class TupleHolder extends MJSymbol implements Returnable {

    private String typeString;

    protected TupleHolder() {
        super();
        this.isTuple = true;
    }

    public TupleHolder(String typestr) {
        this();
        this.typeString = typestr;
    }



    @Override
    public Returnable getReturnType() {
        return null;
    }

    @Override
    public void setReturnType(Returnable returnType) {

    }

    @Override
    public Type getAsmType()
    {
        return null;
    }

    @Override
    public boolean isInstanceOf(Returnable queriedClass)
    {
        return false;
    }
}
