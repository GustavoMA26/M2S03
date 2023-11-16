package list_m02s03.Ex2;

import list_m02s03.Ex2.Funcionario;

public class TestaFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Gustavo");

        funcionario.setSalario(1000F);

        funcionario.aumentar(100);

        funcionario.aumentar(300,400);

        System.out.printf("O novo salario do funcionario é R$ %.2f", funcionario.getSalario());
    }
}
