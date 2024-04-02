package com.example.provaangelo;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, int idade, double salario, String cargo, String departamento) {
        super(nome, idade, salario, cargo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double calcularSalarioLiquido() {
        double salarioBruto = getSalario();

        double salarioLiquido = salarioBruto - (salarioBruto * 0.10);

        return salarioLiquido;
    }
}

