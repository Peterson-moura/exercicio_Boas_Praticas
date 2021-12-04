package Peterson.moura.exercicios.boasPraticas;

import Peterson.moura.exercicios.boasPraticas.pessoas.Cliente;
import Peterson.moura.exercicios.boasPraticas.pessoas.Entrega;
import Peterson.moura.exercicios.boasPraticas.pessoas.EntregaInterface;
import Peterson.moura.exercicios.boasPraticas.tiposEntrega.EntregaDeBicicleta;
import Peterson.moura.exercicios.boasPraticas.tiposEntrega.EntregaDeMoto;

public class FabricaEntrega {

    public static EntregaInterface criarEntrega(Entrega entrega){

        if(TipoEntrega.MOTO.equals(entrega.getTipoEntrega())){
            return new EntregaDeMoto();
        }else{
            return  new EntregaDeBicicleta();
        }
    }
}
