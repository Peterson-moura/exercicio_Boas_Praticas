package Peterson.moura.exercicios.boasPraticas;

import Peterson.moura.exercicios.boasPraticas.pessoas.Cliente;
import Peterson.moura.exercicios.boasPraticas.pessoas.Entregador;
import Peterson.moura.exercicios.boasPraticas.tiposEntregas.EntregaDeBicicleta;

public class EntregaService {

    private final EntregaDeBicicleta entregadeBicicleta;

    private final Entregador entregador;

    private final Cliente cliente;

    private final Pacote pacote;

    public EntregaService(EntregaDeBicicleta entregadeBicicleta, Entregador entregador, Cliente cliente, Pacote pacote) {
        this.entregadeBicicleta = entregadeBicicleta;
        this.entregador = entregador;
        this.cliente = cliente;
        this.pacote = pacote;
    }

    public  Double calcularTempoDeEntrega(){
        if(entregador.getHabilitacaoMoto().getValida()){
            if(pacote.getMetrosCubicos()<30d) {
                System.out.println("Entregador: " + entregador.getNome());
                System.out.println("Pronto! Entregue rapidinho de moto!");
                return 10d;
            }else{
                throw  new RuntimeException("O pacote não cabe no báu da moto !!!");
            }
        }
        if (pacote.getPeso()<100){
            return  entregadeBicicleta.entregar(entregador,cliente,pacote);
        }else{
            throw  new RuntimeException("Não dá pra carregar isso na bicileta! Muito pesado!");
        }
    }
}
