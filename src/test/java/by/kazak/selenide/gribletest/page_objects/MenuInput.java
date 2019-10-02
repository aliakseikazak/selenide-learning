package by.kazak.selenide.gribletest.page_objects;

import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selectors.*;

public class MenuInput {
    private final SelenideElement container;
    private final String label;

    public MenuInput (SelenideElement container, String label) {
        this.container = container;
        this.label = label;
    }

    @Step
    public SelenideElement element () {
        return this.container.find(withText(this.label)).find(byXpath("../input"));
    }

    @Step
    public MenuInput setValue (String name) {
        element().click();
        element().setValue(name);
        return this;
    }

    @Step
    public MenuInput click () {
        element().click();
        return this;
    }
}
