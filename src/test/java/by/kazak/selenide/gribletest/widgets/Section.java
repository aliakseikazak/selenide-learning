package by.kazak.selenide.gribletest.widgets;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class Section {
    private final SelenideElement container;

    public Section (SelenideElement container) {
        this.container = container;
    }

    public void click () {
        this.container.click();
    }

    public void shouldBe (Condition condition) {
        this.container.shouldBe(condition);
    }
}
