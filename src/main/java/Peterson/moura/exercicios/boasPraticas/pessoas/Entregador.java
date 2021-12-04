package Peterson.moura.exercicios.boasPraticas.pessoas;

import Peterson.moura.exercicios.boasPraticas.HabilitacaoMoto;

public class Entregador {

    public String nome;

    public String email;

    public String telefone;

    public HabilitacaoMoto habilitacaoMoto;

    public Entregador(String nome, String email,  HabilitacaoMoto habilitacaoMoto) {
        this.nome = nome;
        this.email = email;
        this.habilitacaoMoto = habilitacaoMoto;
    }

    public String getNome() {
        return nome;
    }

    public HabilitacaoMoto getHabilitacaoMoto() {
        return habilitacaoMoto;
    }

    public boolean ehValidaHabilitacao(){
        return getHabilitacaoMoto().getValida() == true;
    }

}
