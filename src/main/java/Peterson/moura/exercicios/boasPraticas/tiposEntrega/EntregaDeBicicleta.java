package Peterson.moura.exercicios.boasPraticas.tiposEntrega;

import Peterson.moura.exercicios.boasPraticas.Pacote;
import Peterson.moura.exercicios.boasPraticas.pessoas.Cliente;
import Peterson.moura.exercicios.boasPraticas.pessoas.Entrega;
import Peterson.moura.exercicios.boasPraticas.pessoas.EntregaInterface;
import Peterson.moura.exercicios.boasPraticas.pessoas.Entregador;

public class EntregaDeBicicleta implements EntregaInterface {

    private  Pacote pacote;

    @Override
    public Double entregar(Entrega entrega) {
        if (entrega.getPacote().ehvalidoParaBicicleta()){
            System.out.println("Entregador: " + entrega.getEntregador().getNome() );
            System.out.println("Entregando o pacote: " + entrega.getPacote().getPeso() );
            System.out.println("Pronto! Entregue para: " + entrega.getCliente().getNome() );
            return 20d;
        }else{
            throw  new RuntimeException("Não dá pra carregar isso na bicileta! Muito pesado!");
        }
    }




}

