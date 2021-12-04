package Peterson.moura.exercicios.boasPraticas.tiposEntregas;

import Peterson.moura.exercicios.boasPraticas.Pacote;
import Peterson.moura.exercicios.boasPraticas.pessoas.Cliente;
import Peterson.moura.exercicios.boasPraticas.pessoas.Entregador;

public class EntregaDeBicicleta {

    public Double entregar(Entregador entregador, Cliente cliente, Pacote pacote){

        System.out.println("Entregador: " + entregador.getNome());
        System.out.println("Entregando o pacote: " + pacote.getDescricao());
        System.out.println("Pronto! Entregue para: " + cliente.getNome());

        return 20d;
    }
    }

