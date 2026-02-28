package main;

import core.ContaBancaria;
import core.ContaEspecial;

public class Main {
    public static void main(String[] args) {

        ContaBancaria c1, c2;

        c1 = new ContaBancaria(122, "Rodrigo");
        c2 = new ContaEspecial(123, "Anselmo", 154);


        c1.creditar(500);
        c2.creditar(10);

        if (c1.debitar(700)) {
            System.out.println("Débito realizado" + c1.getSaldo());
            System.out.print(c1);
        } else {
            System.out.println("Saldo Insuficiente");
        }


        System.out.println(c1);
        System.out.print(c2);
    }
}
