package by.kazak.selenide.suites;

import by.kazak.selenide.gribletest.configs.BaseTest;
import by.kazak.selenide.gribletest.page_objects.ContextMenu;
import by.kazak.selenide.gribletest.pages.DataStorages;
import by.kazak.selenide.gribletest.pages.Product;
import by.kazak.selenide.gribletest.pages.Home;
import by.kazak.selenide.gribletest.page_objects.Table;
import by.kazak.selenide.gribletest.pages.TestTables;
import org.junit.Test;

import static by.kazak.selenide.core.Gherkin.*;
import static com.codeborne.selenide.Selenide.*;
import static java.util.Arrays.asList;

public class GribleUsageTest extends BaseTest {

    @Test
    public void createTestTableBasedOnDataStorageForNewProduct () {
        GIVEN("At Home page");
        Home home = app.home();
        home.open();

        String productName = String.format("Product #%s", System.currentTimeMillis());
        WHEN("New product created: " + productName);
        home.addProduct(productName);

        AND("Its Data Storages opened");
        Product product = home.openProduct(productName);
        DataStorages dataStorages = product.openDataStorages();

        THEN("Create two Data Storages under new category created");
        dataStorages.addCategory("Users");
        dataStorages.addDataStorage("Users", "Blobs");
        dataStorages.addDataStorage("Users", "Credentials");

        EXPECT("Storage table with one column 'editme' and one empty row");
        Table firstTable = dataStorages.table();
        firstTable.shouldHaveColumnHeaders("editme");
        firstTable.shouldHaveRows(asList(""));

        THEN("edit current column name and add one more column");
        firstTable.column(0).setName("username");
        firstTable.addColumnAfter(0, "password");

        THEN("Fill existing table row with data");
        firstTable.row(0).fill("John", "qwerty");
        firstTable.shouldHaveRows(asList("John", "qwerty"));

        AND("Add one more row with data");
        firstTable.addRowAfter(0).fill("Jane", "ytrewq");
        firstTable.shouldHaveRows(asList("John", "qwerty"), asList("Jane", "ytrewq"));

        THEN("Save changes");
        dataStorages.save();

        THEN("Open product test tables");
        product.open();
        TestTables testTables = product.openTestTables();

        AND("Add new test table under new category");
        testTables.addCategory("Users");
        testTables.addTestTable("Users", "LoginValidation");

        EXPECT("Test table with one column 'editme' and one empty row");
        Table secondTable = testTables.table();

        firstTable.shouldHaveColumnHeaders("editme");
        firstTable.shouldHaveRows(asList(""));

        THEN("Configure first column to be connected to data storage prepared above");
        ContextMenu menu;
        menu = secondTable.column(0).menu();
        menu.open();
        menu.inputFor("Column name").setValue("username");
        menu.inputFor("Data storage").click();
        menu.selectFor("Data storage").selectOption("Credentials");
        menu.select("Save");

        THEN("Connect first cell of this column to first row from data storage");
        secondTable.row(0).cell(0).fill("1");
        secondTable.row(0).cell(0).hover();

        EXPECT("Connection works by showing connected data in a cell tooltip (on hover)");
        secondTable.toolTip().shouldHaveKeyRowCells("", "username", "password");
        secondTable.toolTip().shouldHaveValueRowCells("1", "John", "qwerty");

        THEN("Adds one more column for data and fill its cell");
        secondTable.addColumnAfter(0, "login valid?");
        secondTable.row(0).cell(1).fill("true");
        secondTable.shouldHaveRows(asList("1", "true"));

        THEN("Adds one more row with both connected data storage data and new data");
        menu = secondTable.row(0).cell(0).menu();
        menu.open();
        menu.select("Insert row below");
        secondTable.row(1).fill("2", "false");

        secondTable.shouldHaveRows(asList("1", "true"), asList("2", "false"));

        secondTable.row(1).cell(0).hover();
        secondTable.toolTip().shouldHaveKeyRowCells("", "username", "password");
        secondTable.toolTip().shouldHaveValueRowCells("2", "Jane", "ytrewq");

        THEN("Save changes");
        testTables.save();

        refresh();

        secondTable.shouldHaveRows(asList("1", "true"), asList("2", "false"));
    }
}
