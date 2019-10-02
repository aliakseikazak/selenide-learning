package by.kazak.selenide.gribletest.pages;

import by.kazak.selenide.gribletest.page_objects.*;
import ru.yandex.qatools.allure.annotations.Step;

public class DataStorages {

    @Step
    public void addCategory (String name) {
        new Categories().add(name);
    }

    @Step
    public void addDataStorage (String category, String name) {
        new Category(category).menu().open().select("Add storage");
        new Dialog().setForLabel("Name:", name).setForLabel("Class name:", name).confirm();
    }

    @Step
    public void save () {
        new ManageButtons().save();
    }

    @Step
    public Table table () {
        return new Table();
    }
}
