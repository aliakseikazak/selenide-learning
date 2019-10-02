package by.kazak.selenide.suites;

import by.kazak.selenide.gribletest.configs.BaseTest;
import by.kazak.selenide.gribletest.pages.DataStorages;
import by.kazak.selenide.gribletest.pages.Product;
import by.kazak.selenide.gribletest.pages.Home;
import by.kazak.selenide.gribletest.page_objects.Table;
import org.junit.Test;

public class GribleUsageTest extends BaseTest {

    @Test
    public void createTestTableBasedOnDataStorageForNewProduct () {
        Home home = app.home();
        home.open();

        String name = String.format("Product #%s", System.currentTimeMillis());
        home.add(name);

        Product product = home.open(name);

        DataStorages dataStorages = product.openDataStorages();
        dataStorages.addCategory("Users");
        dataStorages.addDataStorage("Users", "Blobs");
        dataStorages.addDataStorage("Users", "Credentials");

        Table table = dataStorages.table();
        table.column(0).setName("username");
        table.addColumnAfter(0);
    }
}
