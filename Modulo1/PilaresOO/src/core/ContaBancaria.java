package core;

public class ContaBancaria {

    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancaria(int numero, String titular) {
        super();
        this.numero = numero;
        this.titular = titular;



    }

    public double getSaldo() {
        return saldo;
    }

    public void creditar(double valor) {
        this.saldo += valor;
    }

    public boolean debitar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Valor de R$ " + valor + " debitado de sua conta, seu saldo atual é de R$ " + this.saldo);

            return true;
        } else {
            System.out.println("Saldo insuficiente, R$ " + this.saldo);
            return false;
        }

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numero=" + numero +
                ", titular='" + titular  +
                ", saldo=" + saldo +
                '}';
    }
}
