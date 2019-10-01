package by.kazak.selenide.gribletest.widgets;

import com.codeborne.selenide.Selenide;

public class MainPage {

    public void open () {
        Selenide.open("/");
    }
}
