package by.kazak.selenide.gribletest.widgets;

import static com.codeborne.selenide.Selenide.$;

public class Categories {

    public Categories add (String name) {
        $("#btn-add-category").click();
        new Dialog().setFor("Name:", name).submit();
        return this;
    }
}
