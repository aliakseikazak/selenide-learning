package by.kazak.selenide.gribletest.page_objects;

import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$$;

public class ContextMenu {
    private final SelenideElement container;
    private final SelenideElement element;

    public ContextMenu (SelenideElement container, SelenideElement element) {
        this.container = container;
        this.element = element;
    }

    public ContextMenu (SelenideElement element) {
        this($$(".context-menu-list").findBy(visible), element);
    }

    @Step
    public ContextMenu open () {
        this.element.contextClick();
        return this;
    }

    @Step
    public void select (String item) {
        this.container.find(byText(item)).click();
    }

    @Step
    public MenuInput inputFor (String label) {
        return new MenuInput(this.container, label);
    }

    @Step
    public ContextMenu editInput (String label, String value) {
        inputFor(label).setValue(value);
        return this;
    }

    @Step
    public MenuSelect selectFor (String label) {
        return new MenuSelect(this.container, label);
    }

    public SelenideElement element () {
        return this.container;
    }
}
