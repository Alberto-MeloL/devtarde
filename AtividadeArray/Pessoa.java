package AtividadeArray;

public abstract class Pessoa {
    private String nome;
    private Double altura;
    private int dataNaccimento;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public int getDataNaccimento() {
        return dataNaccimento;
    }
    public void setDataNaccimento(int dataNaccimento) {
        this.dataNaccimento = dataNaccimento;
    }

}

