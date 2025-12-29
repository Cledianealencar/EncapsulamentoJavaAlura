package ControleDoSaldoBancario;

public class Banco {
    private String titular;
    private double saldo;
    private double saque;

    public Banco(String titular){
        this.titular = titular;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor){
        if (valor > 0 ){
            this.saldo += valor;
            System.out.println("Deposito realizado com sucesso!");
        }else{
            System.out.println("Deposito inválido!");
        }
    }

    public void saque(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Saque inválido!");
        }
    }

    public void exibirSaldo(){
        System.out.println("===============================");
        System.out.println("       Conta bancaria:");
        System.out.println("===============================");
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }
}
