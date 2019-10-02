package by.kazak.selenide.gribletest.page_objects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;

public class Row {
    private final SelenideElement container;

    public Row (SelenideElement container) {
        this.container = container;
    }

    @Step
    public int size () {
        return cells().size();
    }

    @Step
    public ElementsCollection cells () {
        return this.container.findAll("td");
    }

    @Step
    public Cell cell (int index) {
        return new Cell(cells().get(index));
    }

    @Step
    public void fill (String... data) {
        for (int i = 0; i < size(); i++) {
            cell(i).fill(data[i]);
        }
    }
}
