package main;

import core.ContaBancaria;
import core.ContaEspecial;

public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(122,"Rodrigo");
        ContaEspecial c2 = new ContaEspecial(123, "Anselmo",154);

        c1.creditar(1000);
        c2.creditar(10);

        System.out.println(c1);
        System.out.print(c2);
    }
}
