package by.kazak.selenide.gribletest;

import by.kazak.selenide.gribletest.configs.BaseTest;
import by.kazak.selenide.gribletest.widgets.Products;
import org.junit.Test;

public class GribleUsageTest extends BaseTest {

    @Test
    public void createTestTableBasedOnDataStorageForNewProduct () {
        Products products = app.products();
        products.open();

        String name = String.format("Product #%s", System.currentTimeMillis());
        products.add(name);
        products.open(name);
    }
}
