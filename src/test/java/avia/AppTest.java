package avia;


import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.SelenideElement.*;
import org.openqa.selenium.WebDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
  @Test
  public void aviakassaPage() {
      //Pages pag=new Pages(web);
      SearchPage s= SearchPage.createSearchPage();
      RecommendPage r=RecommendPage.createRecommendPage();
      s.openBrowser("https://aviakassa.com");
      //s.setElements();
      s.search("Moscow", "LED", "240518");
      r.checkDepartureCity("Moscow");
  }
  /*@Test
  public void aviakassa() {
    open("https://aviakassa.com");
    $("input[data-reactid*='1$segment-4.0.']").setValue("MOW");
    //$("input[data-reactid*='.0.2.2.1.0.0.0.1.0.$=1$segment-4.0.$.1.$AviaAirportInput-6.0.0.2']").setValue("Taganrog");
    //$("input[data-reactid*='1$segment-4.1.']").pressEnter();
    //$("span[data-reactid*='.0.2.2.1.0.0.0.1.0.$=1$segment-4.0']").click();
    $(byText("Moscow")).click();
    $("input[data-reactid*='1$segment-4.1.']").setValue("LED");
    $(byText("LED")).click();
    $("input[data-reactid*='1$segment-4.2.']").setValue("24.05.2018").pressEnter();
    //$("input[data-reactid*='1$segment-4.0.']").shouldHave(attribute("value","Moscow"));
    $(byText("Moscow")).shouldHave(text("Moscow"));
    
  }*/
}
