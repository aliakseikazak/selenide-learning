package by.kazak.selenide.gribletest.page_objects;

import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class Cell {
    private final SelenideElement container;

    public Cell (SelenideElement container) {
        this.container = container;
    }

    @Step
    public SelenideElement element () {
        return this.container;
    }

    @Step
    public ContextMenu menu () {
        return new ContextMenu($(".htContextMenu"), this.container);
    }

    @Step
    public Cell fill (String value) {
        if (!this.container.has(cssClass("current"))) {
            this.container.click();
        }
        this.container.doubleClick();
        $$(".handsontableInput").findBy(visible).setValue(value).pressEnter();
        return this;
    }

    @Step
    public void hover () {
        this.container.hover();
    }
}
