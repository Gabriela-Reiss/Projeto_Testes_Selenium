package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ControleDeAcessoPO extends BasePO{

    public ControleDeAcessoPO(WebDriver driver){
        super(driver);
    }


    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "senha")
    public WebElement inputSenha;


    @FindBy(id = "btn-entrar")
    public WebElement btnEntrar;

    @FindBy(id = "mensagem")
    public WebElement messageSpan;


    public void preencherDados(String email, String senha){
        inputEmail.sendKeys(email);
        inputSenha.sendKeys(senha);

        btnEntrar.click();
    }

    public String obterMensagemErro(){
        return messageSpan.getText();
    }









    
}
