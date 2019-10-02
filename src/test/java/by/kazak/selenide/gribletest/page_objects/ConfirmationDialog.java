package by.kazak.selenide.gribletest.page_objects;

import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.$;

public class ConfirmationDialog {
    private SelenideElement container;

    public ConfirmationDialog () {
        this.container = $(".noty_type_confirm");
    }

    @Step
    public void confirm () {
        this.container.find(".btn-primary").click();
    }
}
