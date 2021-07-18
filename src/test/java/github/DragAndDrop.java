package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {

  @Test
  void dragAndDropMethod() {

    open("https://the-internet.herokuapp.com/drag_and_drop");
    $(".example").shouldHave(text("Drag and Drop"));
    $("#column-a").dragAndDropTo($("#column-b"));
    $("#column-a").shouldHave(text("B"));
    $("#column-b").shouldHave(text("A"));

  }

}
