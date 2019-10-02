package by.kazak.selenide.gribletest.pages;

import by.kazak.selenide.gribletest.widgets.*;

public class DataStorages {

    public void addCategory (String name) {
        new Categories().add(name);
    }


    public void addDataStorage (String category, String name) {
        new Category(category).menu().open().select("Add storage");

        new Dialog().setFor("Name:", name).setFor("Class name:", name).submit();
    }

    public void save () {
        new ManageButtons().save();
    }

    public Table table () {
        return new Table();
    }
}
