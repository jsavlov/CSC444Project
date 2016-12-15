package csc444project;

import java.util.ArrayList;
import java.util.List;


public class TupleClass extends MJClass
{

    private List<MJClass> tupleElementTypes = new ArrayList<>();

    public TupleClass(String n)
    {
        super(n);
    }

    public void addElementType(MJClass mjc) {
        tupleElementTypes.add(mjc);
    }

    public MJClass getElementTypeAt(int index) {
        return tupleElementTypes.get(index);
    }


    @Override
    public boolean equals(Object obj)
    {
        TupleClass otherTC = (TupleClass) obj;
        List<MJClass> newObjElemTypes = otherTC.tupleElementTypes;

        if (tupleElementTypes.size() != newObjElemTypes.size()) {
            return false;
        }

        for (int i = 0; i < tupleElementTypes.size(); i++) {
            if (tupleElementTypes.get(i) != newObjElemTypes.get(i)) {
                return false;
            }
        }

        return true;
    }
}
