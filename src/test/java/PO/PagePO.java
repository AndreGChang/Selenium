package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PagePO extends BasePO {

    @FindBy(id="email")
    public WebElement inputEmail;

    @FindBy(id="senha")
    public WebElement inputSenha;

    @FindBy(id = "mensagem")
    public WebElement errorinput;

    @FindBy(id ="btn-entrar")
    public WebElement botaoEntrar;

    @FindBy(id="btn-adicionar")
    public WebElement botaoAddLista;

    public PagePO(WebDriver chrome) {
        super(chrome);
    }
}
