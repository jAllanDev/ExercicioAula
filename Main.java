//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Banco banco = new Banco();

    Acao acao = new Acao();
    acao.setCotas(5);
    acao.setSaldo(1000);

    ContaCorrente conta = new ContaCorrente();
    conta.setSaldo(500);
    conta.setLimite(1000);

    FundoDeAplicacao fundo = new FundoDeAplicacao();
    fundo.setSaldo(300);
    fundo.setRentabilidade(100);

    banco.adicionar(acao);
    banco.adicionar(conta);
    banco.adicionar(fundo);

        System.out.println("Saldo total no banco : " + banco.calcularSaldos());


    }
}