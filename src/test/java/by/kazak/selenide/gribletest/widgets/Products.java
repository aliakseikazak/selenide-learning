package by.kazak.selenide.gribletest.widgets;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class Products {

    public Products () {
    }

    public void open () {
        Selenide.open("/");
    }

    public void add (String name) {
        $("#btn-add-product").click();
        new Dialog().setFor("Name:", name).setFor("Path:", name).submit();
        new ConfirmationDialog().confirm();
    }

    public void open (String name) {
        new Section(name).click();
    }
}
