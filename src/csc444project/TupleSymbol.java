package csc444project;

import org.objectweb.asm.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class TupleSymbol extends MJSymbol implements Returnable {

    private MJSymbol[] elementList;
    private int numberOfElements;
    private Map<String, MJClass> classList;
    private List<MJClass> classTypes = new ArrayList<>();

    public TupleSymbol(String name, boolean isField, String types, Map<String, MJClass> classList) {
        super(name, isField);

        this.classList = classList;
        generateElementList(elementList, types);

    }

    private void generateElementList(MJSymbol[] elemList, String typeStr) {
        TupleClass tc = new TupleClass(this.getName() + "_elementClass");
        typeStr = typeStr.substring(1, typeStr.length() - 1);
        String[] splitTypes = typeStr.split(",");
        elementList = new MJSymbol[splitTypes.length];

        final String genericNamePrefix = this.name + "_tupleElem#";

        for (int i = 0; i < splitTypes.length; i++) {
            MJSymbol sym = new MJSymbol(genericNamePrefix + i, classList.get(splitTypes[i]), isField);
            this.elementList[i] = sym;
            classTypes.add(classList.get(splitTypes[i]));
            tc.addElementType(classList.get(splitTypes[i]));
        }
        this.type = tc;
    }

    public List<MJClass> getTypeList() {
        return this.classTypes;
    }

    @Override
    public Returnable getReturnType()
    {
        return this;
    }

    @Override
    public void setReturnType(Returnable returnType)
    {

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
