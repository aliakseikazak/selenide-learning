package by.kazak.selenide.gribletest.widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class Dialog {
    private SelenideElement container = $(".ui-dialog");

    public Dialog setFor (String label, String value) {
        this.container.$(withText(label)).parent().find("input").setValue(value);
        return this;
    }

    public void submit () {
        this.container.find("[id^=dialog-bt]").click();
    }
}
