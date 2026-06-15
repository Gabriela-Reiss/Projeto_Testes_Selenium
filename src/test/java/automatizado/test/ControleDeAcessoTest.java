package automatizado.test;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

import automatizado.page.ControleDeAcessoPO;

public class ControleDeAcessoTest extends BateTest{
    
    public static ControleDeAcessoPO controleDeAcessoPO;

    @BeforeClass
    public static void prepararTeste(){
        controleDeAcessoPO = new ControleDeAcessoPO(driver);
    }

    @Test
    public void deveLogarUsuarioComSenhaEEmailValidos(){
        controleDeAcessoPO.preencherDados("admin@admin.com", "admin@123");

        String elementoPaginaProduto = driver.getTitle();

        assertEquals("Controle de Produtos", elementoPaginaProduto);



    }

    



    
}
