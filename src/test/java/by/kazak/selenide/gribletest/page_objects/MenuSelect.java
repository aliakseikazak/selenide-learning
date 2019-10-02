package by.kazak.selenide.gribletest.page_objects;

import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selectors.*;

public class MenuSelect {
    private final SelenideElement container;
    private final String label;

    public MenuSelect (SelenideElement container, String label) {
        this.container = container;
        this.label = label;
    }

    @Step
    public SelenideElement element () {
        return this.container.find(withText(this.label)).find(byXpath("../../following-sibling::*//select"));
    }

    @Step
    public MenuSelect selectOption (String text) {
        element().selectOption(text);
        return this;
    }
}
