package Iniciador;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Rota {

    protected static WebDriver chrome;

    @BeforeClass
    public static void rota(){
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("file:///C:/Users/FireW/OneDrive/Documentos/Desenvolvimento/sistema/login.html");
    }

    @AfterClass
    public  static void fechar(){
        chrome.quit();
    }

}


