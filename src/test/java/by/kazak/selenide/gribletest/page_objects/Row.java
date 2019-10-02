package by.kazak.selenide.gribletest.page_objects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class Row {
    private final SelenideElement container;

    public Row (SelenideElement container) {
        this.container = container;
    }

    public Cell cell (int index) {
        return new Cell(this.cells().get(index));
    }

    private ElementsCollection cells () {
        return this.container.findAll("td");
    }
}
