package by.kazak.selenide.gribletest.configs;

import com.codeborne.selenide.Configuration;
import org.junit.Before;

public class BaseTest {

    @Before
    public void init(){
        Configuration.baseUrl = "http://localhost:8123";
    }
}
