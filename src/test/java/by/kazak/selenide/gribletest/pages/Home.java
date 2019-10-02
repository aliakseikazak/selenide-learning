package by.kazak.selenide.gribletest.pages;

import by.kazak.selenide.gribletest.page_objects.ConfirmationDialog;
import by.kazak.selenide.gribletest.page_objects.Dialog;
import by.kazak.selenide.gribletest.page_objects.Section;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Home {

    public Home () {
    }

    public void open () {
        Selenide.open("/");
    }

    public void add (String name) {
        $("#btn-add-product").click();
        new Dialog().setFor("Name:", name).setFor("Path:", name).submit();
        new ConfirmationDialog().confirm();
    }

    public Product open (String name) {
        new Section(name).click();
        return new Product();
    }

    public void shouldHave (String name) {
        new Section(name).shouldBe(visible);
    }
}
