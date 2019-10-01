package by.kazak.selenide.gribletest.configs;

import by.kazak.selenide.gribletest.widgets.App;
import com.codeborne.selenide.Configuration;
import org.junit.Before;

import static by.kazak.selenide.utilities.PropertyManager.getProperty;

public class BaseTest {
    public App app = new App();

    @Before
    public void init(){
        Configuration.baseUrl = getProperty("main.page.url");
    }
}
