public class Empregado {

    private String codigo;

    private String nome;

    private String endereco;

    private int idade;

    public int getIdade(){
        return idade;
    }
    public void setIdade (int idade){
        this.idade = idade;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco (String endereco){
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }

    public String getCodigo(){
        return codigo;
    }
    public void setCodigo (String codigo){
        this.codigo = codigo;
    }

}
