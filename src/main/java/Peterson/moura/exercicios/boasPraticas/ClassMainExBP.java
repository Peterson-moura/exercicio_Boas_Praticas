package Peterson.moura.exercicios.boasPraticas;

import Peterson.moura.exercicios.boasPraticas.pessoas.Cliente;
import Peterson.moura.exercicios.boasPraticas.pessoas.Entrega;
import Peterson.moura.exercicios.boasPraticas.pessoas.EntregaInterface;
import Peterson.moura.exercicios.boasPraticas.pessoas.Entregador;
import Peterson.moura.exercicios.boasPraticas.tiposEntrega.EntregaDeBicicleta;

public class ClassMainExBP {

    public static void main(String[] args) {

        /*System.out.println("=========================================");
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

        //---------------------------------------------------
        */

       /* Cliente cliente1 = new Cliente("Peterson");

        HabilitacaoMoto habilitacaoMoto1 = new HabilitacaoMoto(false);

        Entregador entregador1 = new Entregador("Lodosviku","peterson@",habilitacaoMoto1);

        Pacote pacote1 = new Pacote("Lanche",230d,10d);

        Entrega entrega = new Entrega(TipoEntrega.BICICLETA, cliente1,entregador1,pacote1);

        EntregaInterface entregaInterface = FabricaEntrega.criarEntrega(entrega);

        EntregaService entregaService1 = new EntregaService(entrega,entregaInterface);

        entregaService1.calcularTempoDeEntrega(entrega);*/

        //ENTREGA DE MOTO HABILITAÇÃO FALSE

        Cliente cliente2 = new Cliente("Peterson");

        HabilitacaoMoto habilitacaoMoto2 = new HabilitacaoMoto(true);

        Entregador entregador2 = new Entregador("Lodosviku","peterson@",habilitacaoMoto2);

        Pacote pacote2 = new Pacote("Lanche",230d,10d);

        Entrega entrega2 = new Entrega(TipoEntrega.MOTO, cliente2,entregador2,pacote2);

        EntregaInterface entregaInterface2 = FabricaEntrega.criarEntrega(entrega2);

        EntregaService entregaService2 = new EntregaService(entrega2,entregaInterface2);

        entregaService2.calcularTempoDeEntrega(entrega2);


    }
}
