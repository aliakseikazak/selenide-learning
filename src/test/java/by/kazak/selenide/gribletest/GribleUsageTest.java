package by.kazak.selenide.gribletest;

import by.kazak.selenide.gribletest.configs.BaseTest;
import by.kazak.selenide.gribletest.widgets.MainPage;
import org.junit.Test;

public class GribleUsageTest extends BaseTest {

    @Test
    public void createTestTableBasedOnDataStorageForNewProduct () {
        MainPage mainPage = new MainPage();
        mainPage.open();
    }
}
