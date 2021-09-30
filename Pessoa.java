public class Pessoa{
    Pessoa(int idade, String nome){
        setIdade(idade);
        setNome(nome);
    }
    private int idade;
    private String nome;

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}