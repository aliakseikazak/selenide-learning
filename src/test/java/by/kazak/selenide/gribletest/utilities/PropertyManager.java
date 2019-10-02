package by.kazak.selenide.gribletest.utilities;

import java.util.ResourceBundle;

public class PropertyManager {
    private static final ResourceBundle tc, td;

    static {
        tc = ResourceBundle.getBundle("properties.test-config");
        td = ResourceBundle.getBundle("properties.test-data");
    }

    public static String getConfigProperty (String property) {
        return tc.getString(property);
    }

    public static String getProperty (String property) {
        return td.getString(property);
    }
}
