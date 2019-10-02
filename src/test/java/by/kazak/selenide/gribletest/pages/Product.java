package by.kazak.selenide.gribletest.pages;

import by.kazak.selenide.gribletest.widgets.Section;

public class Product {

    public DataStorages openDataStorages () {
        new Section("Data Storages").click();
        return new DataStorages();
    }
}
