package by.kazak.selenide.gribletest.page_objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Dialog {
    private SelenideElement container;

    public Dialog () {
        this.container = $(".ui-dialog");
    }

    public Dialog setFor (String label, String value) {
        new DialogInput(this.container, label).setValue(value);
        return this;
    }

    public void submit () {
        this.container.find("[id^=dialog-bt]").click();
    }
}
