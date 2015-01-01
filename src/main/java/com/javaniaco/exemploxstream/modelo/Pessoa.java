package com.javaniaco.exemploxstream.modelo;
  
public class Pessoa {
  
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;
  
    public Pessoa() {
        endereco = new Endereco();
    }
  
    public Pessoa(String nome, String telefone, String email, String rua, int numero, String complemento,
            String bairro, String cidade, String uf, String pais, String cep) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = new Endereco(rua, numero, complemento, bairro, cidade, uf, pais, cep);
    }
  
    public String getNome() {
        return nome;
    }
  
    public void setNome(String nome) {
        this.nome = nome;
    }
  
    //Escreva aqui os outros métodos Gets e Sets
  
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", telefone=" + telefone + ", email="
                + email + ", endereco=" + endereco.toString() + "]";
    }
  
}