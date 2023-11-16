package list_m02s03.Ex1;


public class TestaFuncionario {
    public static void main(String[] args) {


        Funcionario funcionario = new Funcionario();
        funcionario.setCpf(1234556789L);
        funcionario.setNomeCompleto("Gustavo Almeida");
        funcionario.setSalario(1_000);

        funcionario.promover(30);

        System.out.printf("O novo salario do funcionario é R$ %.2f",funcionario.getSalario());

    }
}
