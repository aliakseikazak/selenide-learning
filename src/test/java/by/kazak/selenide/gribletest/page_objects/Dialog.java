package by.kazak.selenide.gribletest.page_objects;

import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.$;

public class Dialog {
    private SelenideElement container = $(".ui-dialog");
    private SelenideElement buttons = $(".dialog-buttons");

    @Step
    public Dialog setForLabel (String label, String value) {
        inputFor(label).setValue(value);
        return this;
    }

    @Step
    public SelenideElement inputFor (String label) {
        return new DialogInput(this.container, label).element();
    }

    @Step
    public void confirm () {
        buttons.find("[id^='dialog-btn'").click();
    }
}
