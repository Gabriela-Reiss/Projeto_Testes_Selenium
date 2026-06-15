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


    //teste falha, sendo necessário pedir que clique duas vezes no botão de criar para que abra o modal
    @Test
    public void CT_010deveAbrirModalDeCadastroAoClicarEmCriar(){
        controleDeProdutosPO.clicarBotao(controleDeProdutosPO.btnCriar);
        controleDeProdutosPO.clicarBotao(controleDeProdutosPO.btnCriar);
        assertEquals("Produto", controleDeProdutosPO.tituloModal.getText());
    }

    @Test
    public void CT_011deveFecharModalDeCadastroAoClicarEmX(){
        controleDeProdutosPO.clicarBotao(controleDeProdutosPO.btnCriar);
        controleDeProdutosPO.clicarBotao(controleDeProdutosPO.btnCriar);
        controleDeProdutosPO.clicarBotao(controleDeProdutosPO.btnX);
        String elementoPaginaProduto = driver.getTitle();

        assertEquals("Controle de Produtos", elementoPaginaProduto);
    }

    @Test
    public void CT_012deveFecharModalDeCadastroAoClicarEmSair(){
        controleDeProdutosPO.clicarBotao(controleDeProdutosPO.btnCriar);
        controleDeProdutosPO.clicarBotao(controleDeProdutosPO.btnCriar);
        controleDeProdutosPO.clicarBotao(controleDeProdutosPO.btnSair);
        String elementoPaginaProduto = driver.getTitle();

        assertEquals("Controle de Produtos", elementoPaginaProduto);
    }

    @Test
    public void CT_013naoDevePermitirCadastroDeProdutoComCamposEmBranco(){
        controleDeProdutosPO.clicarBotao(controleDeProdutosPO.btnCriar);
        controleDeProdutosPO.clicarBotao(controleDeProdutosPO.btnCriar);

        controleDeProdutosPO.preencherDados("", "", "", "", "");
        String messageError = controleDeProdutosPO.obterMensagemErro();

        assertEquals("Todos os campos são obrigatórios para o cadastro!", messageError);
    }

    @Test
    public void CT_014naoDevePermitirCadastroDeProdutoComUmDosCampoEmBranco(){
        controleDeProdutosPO.clicarBotao(controleDeProdutosPO.btnCriar);
        controleDeProdutosPO.clicarBotao(controleDeProdutosPO.btnCriar);

        controleDeProdutosPO.preencherDados("12356", "Mel de Abelha", "8", "50", "");
        String messageError = controleDeProdutosPO.obterMensagemErro();

        assertEquals("Todos os campos são obrigatórios para o cadastro!", messageError);
    }

    @Test
    public void CT_015deveCadastrarProdutoComTodosOsCamposPreenchidos(){
        controleDeProdutosPO.clicarBotao(controleDeProdutosPO.btnCriar);
        controleDeProdutosPO.clicarBotao(controleDeProdutosPO.btnCriar);

        controleDeProdutosPO.preencherDados("12356", "Mel de Abelha", "8", "50", "12/06/2026");
     
        controleDeProdutosPO.clicarBotao(controleDeProdutosPO.btnSair);

        assertEquals("12356", controleDeProdutosPO.verificarCadastro());


    }






















    
}
