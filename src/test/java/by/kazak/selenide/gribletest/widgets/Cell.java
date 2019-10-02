package by.kazak.selenide.gribletest.widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Cell {
    private final SelenideElement container;

    public Cell (SelenideElement container) {
        this.container = container;
    }

    public ContextMenu menu () {
        return new ContextMenu($(".htContextMenu"), this.container);
    }
}
