package com.javaniaco.exemploxstream.modelo;
  
public class Endereco {
  
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String pais;
    private String cep;
  
    public Endereco() {
    }
  
    public Endereco(String rua, int numero, String complemento,
            String bairro, String cidade, String uf, String pais, String cep) {
        super();
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.pais = pais;
        this.cep = cep;
    }
  
    public String getRua() {
        return rua;
    }
  
    public void setRua(String rua) {
        this.rua = rua;
    }
  
    //Escreva aqui os outros métodos Gets e Sets
  
    @Override
    public String toString() {
        return "Endereco [rua=" + rua + ", numero=" + numero + ", complemento="
                + complemento + ", bairro=" + bairro + ", cidade=" + cidade
                + ", uf=" + uf + ", pais=" + pais + ", cep=" + cep + "]";
    }
  
}