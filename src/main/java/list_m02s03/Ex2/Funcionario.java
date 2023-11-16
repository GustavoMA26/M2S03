package list_m02s03.Ex2;

public class Funcionario {
    private String nome;
    private Float salario;

    public Funcionario() {
    }
    public Funcionario (String nome) {
        this.nome = nome;
    }

    public Funcionario (String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentar(float valor) {
        this.salario += valor;
    }

    public void aumentar(float valor, float comissao) {
        this.salario += valor + comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
}