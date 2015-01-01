package com.javaniaco.exemploxstream.visao;
  
import com.javaniaco.exemploxstream.controle.PessoaXML;
import com.javaniaco.exemploxstream.modelo.Pessoa;
  
public class Main {
  
    public static void main(String[] args) {
  
        Pessoa pessoa = new Pessoa("Marco",
                                   "88997766",
                                   "email@dominio.com",
                                   "Rua do Passeio",
                                   130,
                                   "apto 205",
                                   "Centro",
                                   "Rio de Janeiro",
                                   "RJ",
                                   "Brasil",
                                   "12455334");
  
        PessoaXML xml = new PessoaXML();
        System.out.println(xml.toXML(pessoa));
  
    }
  
}