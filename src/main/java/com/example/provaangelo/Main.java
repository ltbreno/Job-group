package com.example.provaangelo;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("João", 30, 30000.0, "Analista");

        double salarioLiquidoFuncionario = funcionario.calcularSalarioLiquido();
        System.out.println("Salário líquido do funcionário: " + salarioLiquidoFuncionario);

        Gerente gerente = new Gerente("Maria", 35, 10000.0, "Gerente", "TI");

        double salarioLiquidoGerente = gerente.calcularSalarioLiquido();
        System.out.println("Salário líquido do gerente: " + salarioLiquidoGerente);
    }
}
