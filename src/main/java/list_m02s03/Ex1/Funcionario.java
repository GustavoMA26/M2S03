package list_m02s03.Ex1;

public class Funcionario {
    private String nomeCompleto;
    private float salario;
    private long cpf;

    public Funcionario() {

    }
    public float promover(float percentual) {
        return this.salario *= (1 + (percentual/100));
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}
