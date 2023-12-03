package br.senai.jandira.sp.model;

public class Animal {

    public String nome, genero, identificacao;
    public int idade;

    public Animal(String nome, int idade, String genero, String identificacao) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.identificacao = identificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
}

}
