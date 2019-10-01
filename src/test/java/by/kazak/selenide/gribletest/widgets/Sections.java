package by.kazak.selenide.gribletest.widgets;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$$;

public class Sections {

    public ElementsCollection elements () {
        return $$(".section-cell");
    }

    public void shouldBe (String[] names) {
        this.elements().shouldHave(exactTexts(names));
    }

    public Section find (String section) {
        return new Section(this.elements().findBy(exactText(section)));
    }
}
