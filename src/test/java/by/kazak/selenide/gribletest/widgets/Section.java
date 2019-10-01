package by.kazak.selenide.gribletest.widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class Section {
    private final String name;

    public Section (String name) {
        this.name = name;
    }

    private SelenideElement element () {
        return $$(".section-cell").findBy(text(name));
    }

    public void click () {
        this.element().click();
    }
}
