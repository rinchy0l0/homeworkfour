package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertions {

    @Test
    void softAssertionsMethod() {

        open("https://github.com/selenide/selenide");
        $(byText("Wiki")).click();
        $("#wiki-body").shouldHave(text("Welcome to the selenide wiki"));
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("#wiki-body").$(byText("Soft assertions")).click();
        $("#wiki-body").shouldHave(text("Unit5"));
    }
}
