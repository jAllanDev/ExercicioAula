public class InstrumentoFInanceiro {
    private float saldo;

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public float calcularSaldoTotal() {
       return  saldo += saldo;
    }
}
