package by.kazak.selenide.gribletest.pages;

import by.kazak.selenide.gribletest.page_objects.*;
import ru.yandex.qatools.allure.annotations.Step;

public class TestTables {

    @Step
    public void addCategory (String name) {
        new Categories().add(name);
    }

    @Step
    public void addTestTable (String category, String name) {

        new ContextMenu(new Category(category).element()).open().select("Add table");
        Dialog dialog = new Dialog();
        dialog.inputFor("Name:").setValue(name);
        dialog.confirm();
    }

    @Step
    public Table table () {
        return new Table();
    }

    @Step
    public void save () {
        new ManageButtons().save();
    }
}
