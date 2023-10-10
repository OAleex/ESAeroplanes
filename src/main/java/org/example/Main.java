package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        PassagemAerea nacional = new PassagemAerea(100.0, true);
        PassagemAerea internacional = new PassagemAerea(100.0, false);

        System.out.println("Valor final passagem nacional: R$" + nacional.calcularValorFinal());
        System.out.println("Valor final passagem internacional: R$" + internacional.calcularValorFinal());

        }
    }
