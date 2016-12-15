package csc444project;

import java.util.Map;

/**
 * Created by jason on 12/7/16.
 */
public class ClassNamingListener extends mjgrammarBaseListener {

    private Map<String, MJClass> classes;

    private mjgrammarParser parser;

    public ClassNamingListener(Map<String, MJClass> classes, mjgrammarParser parser) {
        this.classes = classes;
        this.parser = parser;
    }

    @Override
    public void enterMain_class_dec(mjgrammarParser.Main_class_decContext ctx) {
        //super.enterMain_class_dec(ctx);

        MJClass currentClass;
        currentClass = new MJClass("int[]");
        classes.put(currentClass.getName(), currentClass);

        currentClass = new MJClass("int");
        classes.put(currentClass.getName(), currentClass);

        currentClass = new MJClass("boolean");
        classes.put(currentClass.getName(), currentClass);

        currentClass = new MJClass(ctx.main_class_name().getText());
        classes.put(currentClass.getName(), currentClass);
    }

    @Override
    public void enterClass_dec(mjgrammarParser.Class_decContext ctx) {
        //super.enterClass_dec(ctx);

        MJClass currentClass = new MJClass(ctx.class_name().getText());

        if (classes.put(currentClass.getName(), currentClass) != null) {
            // TODO: add error handling code to handle duplicate classes
        }
    }
}
