package Peterson.moura.exercicios.boasPraticas;

import Peterson.moura.exercicios.boasPraticas.pessoas.Cliente;
import Peterson.moura.exercicios.boasPraticas.pessoas.Entregador;
import Peterson.moura.exercicios.boasPraticas.tiposEntrega.EntregaDeBicicleta;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class EntregaServiceTest {

    @Test
    public void deve_chamar_o_calculo_de_bicicleta_quando_entregador_nao_tiver_habilitacao_valida_e_o_peso_do_pacote_for_menor_que_cem(){
        //GIVEN - DADO QUE
        /*HabilitacaoMoto habilitacaoMoto = new HabilitacaoMoto(false);
        Entregador entregador = new Entregador("Peterson","peterson@",habilitacaoMoto);
        Cliente cliente = new Cliente("Sabino");
        EntregaDeBicicleta mock = Mockito.mock(EntregaDeBicicleta.class);
        Pacote pacote = new Pacote("Lanche",80d,60d);
        EntregaService entregaService = new EntregaService(mock,entregador,cliente,pacote);

        //WHEN - QUANDO
        entregaService.calcularTempoDeEntrega();

        //THEN - ENTAO
        Mockito.verify(mock).entregar();
    }

    @Test
    public void deve_dar_mensagem_de_erro_ao_entregarDebicicleta_com_pesso_mais_que_cem(){

        //GIVEN - DADO QUE
        HabilitacaoMoto habilitacaoMoto = new HabilitacaoMoto(false);
        Entregador entregador = new Entregador("Peterson","peterson@",habilitacaoMoto);
        Cliente cliente = new Cliente("Sabino");
        EntregaDeBicicleta mock = Mockito.mock(EntregaDeBicicleta.class);
        Pacote pacote = new Pacote("Lanche",180d,2000d);
        EntregaService entregaService = new EntregaService(mock,entregador,cliente,pacote);

       Exception exception = assertThrows(RuntimeException.class, () -> {
            entregaService.calcularTempoDeEntrega();
        });

        String expectedMessage = "Não dá pra carregar isso na bicileta! Muito pesado!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    public void deve_chamar_o_calculo_de_moto_quando_entregador_tiver_habilitacao_valida_e_os_metroscubicos_for_menor_que_trinta(){
        HabilitacaoMoto habilitacaoMoto = new HabilitacaoMoto(true);
        Entregador entregador = new Entregador("Peterson","peterson@",habilitacaoMoto);
        Cliente cliente = new Cliente("Sabino");
        EntregaDeBicicleta mock = Mockito.mock(EntregaDeBicicleta.class);
        Pacote pacote = new Pacote("Lanche",10d,10d);
        EntregaService entregaService = new EntregaService(mock,entregador,cliente,pacote);

        //WHEN - QUANDO
        Double resultado = entregaService.calcularTempoDeEntrega();

        //THEN - ENTAO
        assertEquals(10d,resultado.doubleValue());
    }

    @Test
    public void deve_chamar_o_erro_da_moto_quando_entregador_tiver_habilitacao_valida_e_os_metroscubicos_for_maior_que_trinta(){
        HabilitacaoMoto habilitacaoMoto = new HabilitacaoMoto(true);
        Entregador entregador = new Entregador("Peterson","peterson@",habilitacaoMoto);
        Cliente cliente = new Cliente("Sabino");
        EntregaDeBicicleta mock = Mockito.mock(EntregaDeBicicleta.class);
        Pacote pacote = new Pacote("Lanche",10d,60d);
        EntregaService entregaService = new EntregaService(mock,entregador,cliente,pacote);

        Exception exception = assertThrows(RuntimeException.class, () -> {
            entregaService.calcularTempoDeEntrega();
        });

        String expectedMessage = "O pacote não cabe no báu da moto !!!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

         */

}
}