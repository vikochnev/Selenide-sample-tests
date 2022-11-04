import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.*;

public class SearchTests {
    @Test
    void mySearchTest() {
        open("https://yandex.ru/metro/moscow?scheme_id=sc34974011");
        $(By.cssSelector("input[placeholder=Откуда")).setValue("Новаторская").pressEnter();;
        $(By.cssSelector("input[placeholder=Куда")).setValue("Преображенская площадь").pressEnter();
        webdriver().shouldHave(url("https://yandex.ru/metro/moscow/st37829639/st44556533?route_from_id=st37829639&route_to_id=st44556533&scheme_id=sc34974011"));
    }
}
