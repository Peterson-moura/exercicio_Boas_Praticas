package Peterson.moura.exercicios.boasPraticas;

import Peterson.moura.exercicios.boasPraticas.pessoas.Cliente;
import Peterson.moura.exercicios.boasPraticas.pessoas.Entregador;
import Peterson.moura.exercicios.boasPraticas.tiposEntregas.EntregaDeBicicleta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntregaServiceTest {

    @Test
    public void calcular_Entrega_Bicicleta_Correto(){

        //GIVEN - DADO QUE
        HabilitacaoMoto habilitacaoMoto = new HabilitacaoMoto(false);

        Entregador entregador = new Entregador("Peterson","peterson@",habilitacaoMoto);

        Cliente cliente = new Cliente("Sabino");

        EntregaDeBicicleta entregaDeBicicleta = new EntregaDeBicicleta();

        Pacote pacote = new Pacote("Lanche",80d,60d);

        EntregaService entregaService = new EntregaService(entregaDeBicicleta,entregador, cliente,pacote);

        //WHEN - QUANDO
        double resultado = entregaService.calcularTempoDeEntrega();

       //THEN - ENTAO
        double resultadoEsperado = 20d;
        Assertions.assertEquals(resultadoEsperado,resultado);

    }

}