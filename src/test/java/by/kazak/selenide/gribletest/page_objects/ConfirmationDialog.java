package by.kazak.selenide.gribletest.page_objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ConfirmationDialog {
    private SelenideElement container;

    public ConfirmationDialog () {
        this.container = $(".noty_type_confirm");
    }

    public void confirm () {
        this.container.find(".btn-primary").click();
    }

    public void decline () {
        this.container.find(".btn-danger").click();
    }
}
