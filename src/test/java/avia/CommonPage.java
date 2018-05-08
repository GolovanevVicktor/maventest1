/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avia;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author user
 */
public class CommonPage {
    WebDriver web;
    String flights=".//div[@class='Nav']/div[contains(@data-reactid,'$0')]";
    public WebDriver openBrowser(String url){
    open(url);
    this.web=getWebDriver();
    return web;}
    
}
