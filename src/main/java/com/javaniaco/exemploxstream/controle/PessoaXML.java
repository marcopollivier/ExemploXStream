package com.javaniaco.exemploxstream.controle;
  
import com.javaniaco.exemploxstream.modelo.Endereco;
import com.javaniaco.exemploxstream.modelo.Pessoa;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
  
public class PessoaXML {
  
    XStream xstream = new XStream(new DomDriver());
  
    public PessoaXML() {
        xstream.alias("pessoa", Pessoa.class);
        xstream.alias("endereco", Endereco.class);
    }
  
    public String toXML(Pessoa pessoa){
        return xstream.toXML(pessoa);
    }
    
    public Pessoa fromXML(String xml){
        return (Pessoa)xstream.fromXML(xml);
    }
     
}