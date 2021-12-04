package Peterson.moura.exercicios.boasPraticas;

public class Pacote {

    public String descricao;

    public Double peso;

    public Double metrosCubicos;

    public Pacote(String descricao, Double peso, Double metrosCubicos) {
        this.descricao = descricao;
        this.peso = peso;
        this.metrosCubicos = metrosCubicos;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getMetrosCubicos() {
        return metrosCubicos;
    }

    public boolean ehvalidoParaBicicleta() {
        return getPeso() < 100d;
    }
    public boolean ehValidoParaCarro(){
        return getMetrosCubicos()<30d;
    }


}
