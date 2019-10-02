package by.kazak.selenide.gribletest.page_objects.paradigm_shift;

import com.codeborne.selenide.SelenideElement;

public class Form {
    private final SelenideElement dialog;

    public Form (SelenideElement dialog) {
        this.dialog = dialog;
    }

    public void fill (WidgetValue... inputValues) {
        for (WidgetValue value : inputValues) {
            value.setInDialog(this.dialog);
        }
    }
}
