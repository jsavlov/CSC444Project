package csc444project;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jason on 12/4/16.
 */
public class mjClass {

    protected String name;
    private mjClass subclass;

    private final Map<String, mjMethod> methodMap = new HashMap<String, mjMethod>();


    public mjClass() {
        throw new Error("Cannot have an mjClass with no name...");
    }

    public mjClass(String n) {
        name = n;
    }

    public String getName() { return name; }
}
