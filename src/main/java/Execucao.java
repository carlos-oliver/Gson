import model.Endereco;
import model.Pessoa;
import model.Telefone;

import java.util.ArrayList;
import java.util.List;

public class Execucao {
        public static void main (String args[]){
        Pessoa pessoa = new Pessoa();
        pessoa.setCodigo(0);
        pessoa.setNome("Rafael Santos");
        pessoa.setCpf("123456789");

        Endereco endereco = new Endereco();
        endereco.setBairro("Ipiranga");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");
        endereco.setLogradouro("Av Dom Pedro");
        endereco.setComplemento("Comercial");
        endereco.setNumero("520");

        List<Endereco> enderecos = new ArrayList<Endereco>();
        enderecos.add(endereco);

        Telefone telefone = new Telefone();
        telefone.setDdd("11");
        telefone.setNumero("2541-5484");

        List<Telefone> telefones = new ArrayList<Telefone>();
        telefones.add(telefone);

        pessoa.setEnderecos(enderecos);
        pessoa.setTelefones(telefones);

        Objjson.getJsonPessoa(pessoa);
        System.out.print(Objjson.getJsonPessoa(pessoa));
    }

}
