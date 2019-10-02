package by.kazak.selenide.gribletest.page_objects;

import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;

public class Column {
    private final SelenideElement container;

    public Column (SelenideElement container) {
        this.container = container;
    }

    @Step
    public SelenideElement element () {
        return this.container;
    }

    @Step
    public ContextMenu menu () {
        return new ContextMenu(this.container);
    }

    @Step
    public void setName (String name) {
        menu().open();
        menu().inputFor("Column name").setValue(name);
        menu().select("Save");
    }
}
