package by.kazak.selenide.gribletest.page_objects;

import static com.codeborne.selenide.Selenide.$;

public class ManageButtons {

    public void save () {
        $("#btn-save-data-item").click();
    }
}
