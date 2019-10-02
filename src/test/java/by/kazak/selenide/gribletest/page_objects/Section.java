package by.kazak.selenide.gribletest.page_objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class Section {
    private final String name;

    public Section (String name) {
        this.name = name;
    }

    private SelenideElement element () {
        return $$(".section-cell").findBy(text(this.name));
    }

    public void click () {
        this.element().click();
    }

    public void shouldBe (Condition condition) {
        this.element().shouldBe(condition);
    }
}
