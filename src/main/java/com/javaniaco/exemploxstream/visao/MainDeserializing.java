package com.javaniaco.exemploxstream.visao;
  
import com.javaniaco.exemploxstream.controle.PessoaXML;
  
public class MainDeserializing {
  
    public static void main(String[] args) {
  
String xml = "<pessoa>" +
                        "<nome>Marco</nome>" +
                        "<telefone>88997766</telefone>" +
                        "<email>email@dominio.com</email>" +
                        "<endereco>" +
                          "<rua>Rua do Passeio</rua>" +
                          "<numero>130</numero>" +
                          "<complemento>apto 205</complemento>" +
                          "<bairro>Centro</bairro>" +
                          "<cidade>Rio de Janeiro</cidade>" +
                          "<uf>RJ</uf>" +
                          "<pais>Brasil</pais>" +
                          "<cep>12455334</cep>" +
                        "</endereco>" +
                      "</pessoa>";
  
        PessoaXML pessoa = new PessoaXML();
        System.out.println(pessoa.fromXML(xml).toString());
  
    }
  
}