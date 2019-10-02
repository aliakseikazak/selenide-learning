package by.kazak.selenide.gribletest.page_objects;

import com.codeborne.selenide.SelenideElement;

public class Column {
    private final SelenideElement container;

    public Column (SelenideElement container) {
        this.container = container;
    }

    public void setName (String name) {
        new ContextMenu(this.container).open().editInput("Column name", name).select("Save");
    }
}
