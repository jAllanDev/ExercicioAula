public class FundoDeAplicacao extends InstrumentoFInanceiro {
    private float rentabilidade;

    public void setRentabilidade(float rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    public float calcularSaldoTotal() {
        return getSaldo() + rentabilidade;
    }


}
