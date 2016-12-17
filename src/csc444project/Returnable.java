package csc444project;


import org.objectweb.asm.Type;

public interface Returnable {

    Returnable getReturnType();
    void setReturnType(Returnable returnType);
    boolean isInstanceOf(Returnable queriedClass);
    Type getAsmType();
    String getName();
}
