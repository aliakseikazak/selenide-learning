package by.kazak.selenide.tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import jdk.jfr.Description;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {
    private static final String GOOGLE_URL = "http://google.com";
    private static final String SEARCH_INPUT = "q";
    private static final String SEARCH_PHRASE = "Selenide";
    private static final int EXPECTED_RESULTS_SIZE = 10;
    private static final String RESULTS_LOCATOR = "//div[@class='ellip']";

    @Test
    @Description ("Simple UI test using Selenide Framework")
    public void userCanSearchKeywordWithGoogle () {
        open(GOOGLE_URL);
        $(By.name(SEARCH_INPUT)).setValue(SEARCH_PHRASE).pressEnter();

        $$x(RESULTS_LOCATOR).shouldHave(CollectionCondition.size(EXPECTED_RESULTS_SIZE));
        $x(RESULTS_LOCATOR).shouldHave(Condition.text("Selenide: concise UI tests in Java"));
    }
}
