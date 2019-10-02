package by.kazak.selenide.gribletest.configs;

import by.kazak.selenide.gribletest.App;
import com.codeborne.selenide.Configuration;
import org.junit.Before;

import static by.kazak.selenide.gribletest.utilities.PropertyManager.*;

public class BaseTest {
    public App app = new App();

    @Before
    public void init () {
        Configuration.startMaximized = Boolean.parseBoolean(getConfigProperty("browser.maximize"));
        Configuration.holdBrowserOpen = Boolean.parseBoolean(getConfigProperty("browser.holdOpen"));
        Configuration.baseUrl = getProperty("mainPage.url");
        Configuration.fastSetValue = Boolean.parseBoolean(getConfigProperty("input.fastSetValue"));
    }
}
