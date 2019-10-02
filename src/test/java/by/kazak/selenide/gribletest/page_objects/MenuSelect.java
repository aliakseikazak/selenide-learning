package by.kazak.selenide.gribletest.page_objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;

public class MenuSelect {
    private final SelenideElement container;
    private final String label;

    public MenuSelect (SelenideElement container, String label) {
        this.container = container;
        this.label = label;
    }

    public SelenideElement element () {
        return this.container.find(withText(this.label)).find(byXpath("../../following-sibling::*//select"));
    }

    public MenuSelect selectOption (String text) {
        element().selectOption(text);
        return this;
    }
}
