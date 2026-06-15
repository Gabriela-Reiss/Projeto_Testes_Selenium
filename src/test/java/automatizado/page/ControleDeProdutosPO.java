package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ControleDeProdutosPO extends BasePO{
    

    public ControleDeProdutosPO(WebDriver driver){
        super(driver);
    }

    @FindBy(className= "navbar-brand")
    public WebElement tituloPagina;

    @FindBy(className= "nav-link")
    public WebElement btnVoltar;

    @FindBy(id= "btn-adicionar")
    public WebElement btnCriar;

    @FindBy(className= "modal-title")
    public WebElement tituloModal;

    @FindBy(className= "close")
    public WebElement btnX;

    @FindBy(id= "btn-sair")
    public WebElement btnSair;

     @FindBy(id= "codigo")
    public WebElement inputCodigo;

    @FindBy(id= "nome")
    public WebElement inputNome;

    @FindBy(id= "quantidade")
    public WebElement inputQuantidade;

    @FindBy(id= "valor")
    public WebElement inputValor;

    @FindBy(id= "data")
    public WebElement inputDataCadastro;

    @FindBy(id= "btn-salvar")
    public WebElement btnSalvar;

    @FindBy(id= "mensagem")
    public WebElement spamMessage;

    @FindBy(css= "tbody tr td:first-child")
    public WebElement elementoCadastrado;

    public void clicarBotao(WebElement btn){
        btn.click();
    }

    public void preencherDados(String codigo, String nome, String quantidade, String valor, String data){
        inputCodigo.sendKeys(codigo);
        inputNome.sendKeys(nome);
        inputQuantidade.sendKeys(quantidade);
        inputValor.sendKeys(valor);
        inputDataCadastro.sendKeys(data);

        btnSalvar.click();

    }

    public String obterMensagemErro(){
        return spamMessage.getText();
    }

    public String verificarCadastro(){
        return elementoCadastrado.getText();
    }

}
