package by.kazak.selenide.gribletest.page_objects;

import static com.codeborne.selenide.Selenide.$;

public class Categories {

    public Categories add (String name) {
        $("#btn-add-category").click();
        new Dialog().setFor("Name:", name).submit();
        return this;
    }
}
