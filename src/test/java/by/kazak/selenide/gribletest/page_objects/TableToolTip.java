package by.kazak.selenide.gribletest.page_objects;

import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Selenide.$;

public class TableToolTip {

    @Step
    public void shouldHaveKeyRowCells (String... texts) {
        $(".tooltip").find(".key-row").findAll(".table-cell").shouldHave(exactTexts(texts));
    }

    @Step
    public void shouldHaveValueRowCells (String... texts) {
        $(".tooltip").find(".value-row").findAll(".table-cell").shouldHave(exactTexts(texts));
    }
}
