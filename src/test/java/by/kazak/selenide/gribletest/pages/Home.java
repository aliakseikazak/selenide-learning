package by.kazak.selenide.gribletest.pages;

import by.kazak.selenide.gribletest.page_objects.ConfirmationDialog;
import by.kazak.selenide.gribletest.page_objects.Dialog;
import by.kazak.selenide.gribletest.page_objects.Section;
import com.codeborne.selenide.Selenide;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.$;

public class Home {

    @Step
    public void open () {
        Selenide.open("/");
    }

    @Step
    public void addProduct (String name) {
        addProduct(name, name);
    }

    @Step
    public void addProduct (String name, String path) {
        $("#btn-add-product").click();
        new Dialog().setForLabel("Name:", name).setForLabel("Path:", path).confirm();
        new ConfirmationDialog().confirm();
    }

    @Step
    public Product openProduct (String productName) {
        Section productSection = new Section(productName);
        String productId = productSection.element().find(".product-item").getAttribute("id");
        productSection.click();
        return new Product(productId);
    }
}
