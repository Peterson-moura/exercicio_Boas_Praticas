package Peterson.moura.exercicios.boasPraticas.tiposEntrega;

import Peterson.moura.exercicios.boasPraticas.Pacote;
import Peterson.moura.exercicios.boasPraticas.pessoas.Cliente;
import Peterson.moura.exercicios.boasPraticas.pessoas.Entrega;
import Peterson.moura.exercicios.boasPraticas.pessoas.EntregaInterface;
import Peterson.moura.exercicios.boasPraticas.pessoas.Entregador;

public class EntregaDeMoto implements EntregaInterface {

    @Override
    public Double entregar(Entrega entrega) {
        if(entrega.getEntregador().ehValidaHabilitacao()){
            if(entrega.getPacote().ehValidoParaCarro()){
                System.out.println("Entregador: " + entrega.getEntregador().getNome());
                System.out.println("Pronto! Entregue rapidinho de moto!");
                return 10d;
            }
        }
        throw  new RuntimeException("O pacote não cabe no báu da moto !!!");
    }
}





