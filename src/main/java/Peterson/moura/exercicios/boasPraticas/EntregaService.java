package Peterson.moura.exercicios.boasPraticas;

import Peterson.moura.exercicios.boasPraticas.pessoas.Cliente;
import Peterson.moura.exercicios.boasPraticas.pessoas.Entrega;
import Peterson.moura.exercicios.boasPraticas.pessoas.EntregaInterface;
import Peterson.moura.exercicios.boasPraticas.pessoas.Entregador;

public class EntregaService {

    private final Entrega entrega;

    private EntregaInterface entregaInterface;

    private Entregador entregador;

    private Cliente cliente;

    private Pacote pacote;

    private double tempo;


    public EntregaService(Entrega entrega, EntregaInterface entregaInterface) {
        this.entrega = entrega;
        this.entregaInterface = entregaInterface;
    }

    public Double calcularTempoDeEntrega(Entrega entrega){
        return entregaInterface.entregar(entrega);
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public EntregaInterface getEntregaInterface() {
        return entregaInterface;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public double getTempo() {
        return tempo;
    }
}
