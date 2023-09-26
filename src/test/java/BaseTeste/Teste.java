package BaseTeste;

import Iniciador.Rota;
import PO.PagePO;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Keys;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Teste extends Rota {
    public static PagePO pagePO;

    @BeforeClass
    public static void inicializarPagina(){
        pagePO = new PagePO(chrome);
    }

    @Test
    public void a(){
        pagePO.inputEmail.sendKeys("adminadmin.com" + Keys.ENTER);

        String data = pagePO.errorinput.getText();

        System.out.println(data);

        Assert.assertEquals("Informe usuário e senha, os campos não podem ser brancos.",data);
    }

    @Test
    public void b(){
        pagePO.inputEmail.clear();
        pagePO.inputSenha.clear();

        pagePO.inputSenha.sendKeys("admin123" + Keys.ENTER);

        String data = pagePO.errorinput.getText();

        System.out.println(data);

        Assert.assertEquals("Informe usuário e senha, os campos não podem ser brancos.",data);
    }

    @Test
    public void c(){
        pagePO.inputEmail.clear();
        pagePO.inputSenha.clear();

        pagePO.botaoEntrar.click();

        String data = pagePO.errorinput.getText();

        System.out.println(data);

        Assert.assertEquals("Informe usuário e senha, os campos não podem ser brancos.",data);
    }

    @Test
    public void d(){
        pagePO.inputEmail.clear();
        pagePO.inputSenha.clear();
        pagePO.inputSenha.sendKeys("admin");
        pagePO.inputEmail.sendKeys("admin@a.com" + Keys.ENTER);

        String data = pagePO.errorinput.getText();

        System.out.println(data);

        Assert.assertEquals("E-mail ou senha inválidos",data);
    }

    @Test
    public void e(){
        pagePO.inputEmail.clear();
        pagePO.inputSenha.clear();
        pagePO.inputSenha.sendKeys("admin@123" + Keys.ENTER);


        String data = pagePO.errorinput.getText();

        System.out.println(data);

        Assert.assertEquals("Informe usuário e senha, os campos não podem ser brancos.",data);
    }

    @Test
    public void f(){
        pagePO.inputEmail.clear();
        pagePO.inputSenha.clear();
        pagePO.inputEmail.sendKeys("admin@admin.com" + Keys.ENTER);

        String data = pagePO.errorinput.getText();

        System.out.println(data);

        Assert.assertEquals("Informe usuário e senha, os campos não podem ser brancos.",data);
    }

    @Test
    public void g(){
        pagePO.inputEmail.clear();
        pagePO.inputSenha.clear();
        pagePO.inputEmail.sendKeys("admin@admin.com");
        pagePO.inputSenha.sendKeys("admin@123");

        pagePO.botaoEntrar.click();

        Assert.assertTrue(pagePO.botaoAddLista.isEnabled());
    }


}
