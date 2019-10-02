package by.kazak.selenide.gribletest.page_objects;

import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.$;

public class Categories {

    @Step
    public Categories add (String name) {
        $("#btn-add-category").click();
        new Dialog().setForLabel("Name:", name).confirm();
        return this;
    }
}
