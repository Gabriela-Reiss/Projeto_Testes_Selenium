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


    public void clicarBotao(WebElement btn){
        btn.click();
    }


}
