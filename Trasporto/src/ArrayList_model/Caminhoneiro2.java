package ArrayList_model;

public class Caminhoneiro2 {
    private String nome;
    private String cnpj;
    private String cpf;
    private double salario;

    public Caminhoneiro2(String nome, String cnpj, String cpf, double salario) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
