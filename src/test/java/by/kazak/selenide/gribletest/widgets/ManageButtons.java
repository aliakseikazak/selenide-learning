package by.kazak.selenide.gribletest.widgets;

import static com.codeborne.selenide.Selenide.$;

public class ManageButtons {

    public void save () {
        $("#btn-save-data-item").click();
    }
}
