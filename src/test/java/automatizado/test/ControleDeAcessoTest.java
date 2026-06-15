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
    public void CT001_deveLogarUsuarioComSenhaEEmailValidos(){
        controleDeAcessoPO.preencherDados("admin@admin.com", "admin@123");

        String elementoPaginaProduto = driver.getTitle();

        assertEquals("Controle de Produtos", elementoPaginaProduto);

    }

    @Test
    public void CT002_naoDeveLogarComCamposEmBranco(){
        controleDeAcessoPO.preencherDados("", "");

        String messageError = controleDeAcessoPO.obterMensagemErro();

        assertEquals("Informe usuário e senha, os campos não podem ser brancos.", messageError); 

    }


    @Test
    public void CT003_naoDeveLogarComCampoSenhaEmBranco(){
        controleDeAcessoPO.preencherDados("admin@email.com", "");

        String messageError = controleDeAcessoPO.obterMensagemErro();

        assertEquals("Informe usuário e senha, os campos não podem ser brancos.", messageError); 

    }


    @Test
    public void CT004_naoDeveLogarComCampoEmailEmBranco(){
        controleDeAcessoPO.preencherDados("", "admin123");

        String messageError = controleDeAcessoPO.obterMensagemErro();

        assertEquals("Informe usuário e senha, os campos não podem ser brancos.", messageError); 

    }


    @Test
    public void CT005_naoDeveLogarComDadosInvalidos(){
        controleDeAcessoPO.preencherDados("admin@gmail.com", "123456");

        String messageError = controleDeAcessoPO.obterMensagemErro();

        assertEquals("E-mail ou senha inválidos", messageError); 

    }


    @Test
    public void CT006_naoDeveLogarComSenhaInvalida(){
        controleDeAcessoPO.preencherDados("admin@admin.com", "admin123");

        String messageError = controleDeAcessoPO.obterMensagemErro();

        assertEquals("E-mail ou senha inválidos", messageError); 

    }

    @Test
    public void CT007_naoDeveLogarComEmailInvalido(){
        controleDeAcessoPO.preencherDados("admin@email.com", "admin@123");

        String messageError = controleDeAcessoPO.obterMensagemErro();

        assertEquals("E-mail ou senha inválidos", messageError); 

    }


















    
}
