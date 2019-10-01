package by.kazak.selenide.utilities;

import java.util.ResourceBundle;

public class PropertyManager {
    private static final ResourceBundle tc, td;

    static {
        tc = ResourceBundle.getBundle("properties.test-config");
        td = ResourceBundle.getBundle("properties.test-data");
    }

    public static String getConfigProperty (String s) {
        return tc.getString(s);
    }

    public static String getProperty (String s) {
        return td.getString(s);
    }
}
