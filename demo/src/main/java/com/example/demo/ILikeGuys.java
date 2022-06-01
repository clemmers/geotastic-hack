package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ILikeGuys {

    @FXML
    private Button testtest;
    @FXML
    private Button testtesttest;

    private WebDriver driver;

    @FXML
    protected void onStartupButtonClick() {

        testtest.setVisible(false);
        testtest.setManaged(false);
        testtesttest.setManaged(true);
        testtesttest.setVisible(true);

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://geotastic.net/home");

    }
    @FXML
    protected void onFindLocationButtonClick()
    {
        WebElement lmfao = driver.findElement(new By.ByXPath("/html/body/div[1]/div[1]/main/div/div/div[3]/div[2]/div[3]/div[1]/div[3]/div/div/div[12]/div/a"));
        String link = lmfao.getAttribute("href");
        System.out.println("text: " + link);
        
    }
}
