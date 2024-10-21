import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<InstrumentoFInanceiro> instrumentos;

    public Banco() {
        this.instrumentos = new ArrayList<>();
    }

    public void adicionar(InstrumentoFInanceiro instrumento) {
        instrumentos.add(instrumento);
        }

    public float calcularSaldos() {
        float saldoTotal = 0;
        for (InstrumentoFInanceiro instrumento : instrumentos) {
            saldoTotal += instrumento.calcularSaldoTotal();
        }
        return saldoTotal;
    }



}
