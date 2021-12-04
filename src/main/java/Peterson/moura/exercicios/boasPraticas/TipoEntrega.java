package Peterson.moura.exercicios.boasPraticas;

public enum TipoEntrega {
    MOTO(1L), BICICLETA(2L);

    private long id;

    TipoEntrega(long id) {
        this.id = id;
    }
}
