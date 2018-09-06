package br.com.fiap.retrofit;

import java.io.Serializable;

public class Contato implements Serializable{
    private String nome;
    private String telefone;
    private String imagem;
    private String status;

    public Contato() {
    }

    public Contato(String nome, String telefone, String imagem, String status) {
        this.nome = nome;
        this.telefone = telefone;
        this.imagem = imagem;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
