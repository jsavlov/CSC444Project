package csc444project;


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
}
