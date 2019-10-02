package by.kazak.selenide.gribletest.widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;

public class DialogInput {
    private final SelenideElement parent;
    private final String label;

    public DialogInput (SelenideElement parent, String label) {
        this.parent = parent;
        this.label = label;
    }

    private SelenideElement element () {
        return this.parent.$(withText(this.label)).parent().find("input");
    }

    public void setValue (String value) {
        this.element().setValue(value);
    }
}
