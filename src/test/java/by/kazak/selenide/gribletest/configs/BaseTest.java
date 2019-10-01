package by.kazak.selenide.gribletest.configs;

import com.codeborne.selenide.Configuration;
import org.junit.Before;

import static by.kazak.selenide.utilities.PropertyManager.getProperty;

public class BaseTest {

    @Before
    public void init(){
        Configuration.baseUrl = getProperty("main.page.url");
    }
}
