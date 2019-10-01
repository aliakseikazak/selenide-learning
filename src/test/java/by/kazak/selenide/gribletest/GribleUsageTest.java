package by.kazak.selenide.gribletest;

import by.kazak.selenide.gribletest.configs.BaseTest;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class GribleUsageTest extends BaseTest {

    @Test
    public void createTestTableBasedOnDataStorageForNewProduct () {
        open("/");
    }
}
