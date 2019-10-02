package by.kazak.selenide.gribletest.pages;

import by.kazak.selenide.gribletest.page_objects.Section;
import com.codeborne.selenide.Selenide;
import ru.yandex.qatools.allure.annotations.Step;

public class Product {
    private final int id;

    public Product (int id) {
        this.id = id;
    }

    public Product (String id) {
        this(Integer.valueOf(id));
    }

    @Step
    public DataStorages openDataStorages () {
        new Section("Data Storages").click();
        return new DataStorages();
    }

    @Step
    public void open () {
        Selenide.open("/?product=" + this.id);
    }

    @Step
    public TestTables openTestTables () {
        new Section("Test Tables").click();
        return new TestTables();
    }
}
