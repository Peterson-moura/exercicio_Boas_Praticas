package Peterson.moura.exercicios.boasPraticas;

import Peterson.moura.exercicios.boasPraticas.pessoas.Cliente;
import Peterson.moura.exercicios.boasPraticas.pessoas.Entregador;
import Peterson.moura.exercicios.boasPraticas.tiposEntregas.EntregaDeBicicleta;

public class ClassMainExBP {

    public static void main(String[] args) {

        System.out.println("=========================================");
        // Criando dependências
        HabilitacaoMoto habilitacaoMoto = new HabilitacaoMoto(false);
        Entregador entregador = new Entregador("Sabino", "sabino@teste", habilitacaoMoto);
        Cliente cliente = new Cliente("Bruna");
        Pacote pacote = new Pacote("Sushi", 20D, 20D);
        EntregaDeBicicleta entregaDeBicicleta = new EntregaDeBicicleta();

        // Criando o serviço e mandando executar
        EntregaService entregaService = new EntregaService(entregaDeBicicleta, entregador, cliente, pacote);
        Double tempo = entregaService.calcularTempoDeEntrega();

        // Mostrando o tempo final no terminal
        System.out.println("=========================================");
        System.out.println("Tempo previsto para a entrega: " + tempo);


    }
}
