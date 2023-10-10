package org.example;

public class PassagemAerea {

    private double valorBase;
    private boolean isNacional;

    public PassagemAerea(double valorBase, boolean isNacional) {
        this.valorBase = valorBase;
        this.isNacional = isNacional;
    }

    public double calcularValorFinal() {
        double taxaEmbarque = isNacional ? 0.05 : 0.10;
        double taxaBagagem = isNacional ? 0.03 : 0.05;

        double valorTotal = valorBase + (valorBase * taxaEmbarque) + (valorBase * taxaBagagem);
        return valorTotal;
    }
}