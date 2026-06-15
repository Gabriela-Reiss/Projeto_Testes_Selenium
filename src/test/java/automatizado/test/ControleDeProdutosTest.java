package automatizado.test;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

import automatizado.page.ControleDeAcessoPO;
import automatizado.page.ControleDeProdutosPO;

public class ControleDeProdutosTest extends BateTest{

    public static ControleDeProdutosPO controleDeProdutosPO;
    public static ControleDeAcessoPO controleDeAcessoPO;

    @BeforeClass
    public static void prepararTeste(){
        controleDeProdutosPO = new ControleDeProdutosPO(driver);
        controleDeAcessoPO = new ControleDeAcessoPO(driver);
        controleDeAcessoPO.preencherDados("admin@admin.com", "admin@123");
    }

    @Test
    public void CT_008deveManterNaPaginaAoClicarNaLogo(){
        controleDeProdutosPO.clicarBotao(controleDeProdutosPO.tituloPagina);

        String elementoPaginaProduto = driver.getTitle();

        assertEquals("Controle de Produtos", elementoPaginaProduto);
    }


    //teste falha, pois ao clicar em voltar não esta voltando para tela de login
    @Test
    public void CT_009deveVoltarParaPaginaLoginAoClicarNoBotaoVoltar(){
        controleDeProdutosPO.clicarBotao(controleDeProdutosPO.btnVoltar);

        String elementoPaginaProduto = driver.getTitle();

        assertEquals("Login", elementoPaginaProduto);
    }



    
}
