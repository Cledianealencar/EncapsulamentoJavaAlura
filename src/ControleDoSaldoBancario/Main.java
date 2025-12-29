package ControleDoSaldoBancario;

public class Main {
    public static void main(String[] args) {
        Banco conta = new Banco("Diane");

        conta.exibirSaldo();

        conta.deposito(1000);
        conta.exibirSaldo();

        conta.saque(500.35);
        conta.exibirSaldo();

        conta.exibirSaldo();
        conta.saque(1200);

        conta.exibirSaldo();
        conta.deposito(-50);
    }
}
