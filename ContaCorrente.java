public class ContaCorrente extends InstrumentoFInanceiro {
    private float limite;

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public float calcularSaldoTotal() {
        return limite + getSaldo();
    }



}

