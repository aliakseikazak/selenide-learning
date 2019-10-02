package by.kazak.selenide.gribletest.page_objects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Table {
    private SelenideElement container = $("#table-container");

    public Column column (int index) {
        return new Column(this.column().get(index + 1));
    }

    public ElementsCollection column () {
        return this.head().findAll("th");
    }

    public SelenideElement head () {
        return this.container.find("thead");
    }

    public SelenideElement body () {
        return this.container.find("tbody");
    }

    public void addColumnAfter (int index) {
        this.row(index).cell(index).menu().open().select("Insert column on the right");
    }

    private Row row (int index) {
        return new Row(this.rows().get(index));
    }

    private ElementsCollection rows () {
        return this.body().findAll("tr");
    }
}
