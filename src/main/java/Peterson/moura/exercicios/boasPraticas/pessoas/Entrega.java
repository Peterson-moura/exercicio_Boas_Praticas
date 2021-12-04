package Peterson.moura.exercicios.boasPraticas.pessoas;

import Peterson.moura.exercicios.boasPraticas.Pacote;
import Peterson.moura.exercicios.boasPraticas.TipoEntrega;

public class Entrega {

    private TipoEntrega tipoEntrega;

    private Cliente cliente;

    private Entregador entregador;

    private Pacote pacote;

    public Entrega(TipoEntrega tipoEntrega, Cliente cliente, Entregador entregador,Pacote pacote) {
        this.tipoEntrega = tipoEntrega;
        this.cliente = cliente;
        this.entregador = entregador;
        this.pacote = pacote;
    }

    public TipoEntrega getTipoEntrega() {
        return tipoEntrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public Pacote getPacote(){
        return pacote;
    }
}
