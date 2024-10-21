public class Acao extends InstrumentoFInanceiro {
    private int cotas;

    public void setCotas(int cotas) {
        this.cotas = cotas;
    }

    @Override
    public float calcularSaldoTotal() {
        return getSaldo() * cotas;
    }


}
