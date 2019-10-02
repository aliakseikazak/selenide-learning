package by.kazak.selenide.gribletest.widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;

public class MenuInput {
    private final SelenideElement parent;
    private final String label;

    public MenuInput (SelenideElement parent, String label) {
        this.parent = parent;
        this.label = label;
    }

    public SelenideElement element () {
        return this.parent.find(withText(this.label)).parent().find("input");
    }

    public MenuInput setValue (String name) {
        element().click();
        element().setValue(name);
        return this;
    }

    public MenuInput click () {
        element().click();
        return this;
    }
}
