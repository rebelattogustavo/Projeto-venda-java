import java.util.ArrayList;

public class Cliente extends Pessoa{
    int cadastro;

    static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

    public int getCadastro() {
        return cadastro;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public Cliente() {
        super();
    }

    public Cliente(String nome, String cpf, String email, String telefone, String genero, int idade,
                   String pais, String estado, String cidade, String bairro, String rua, String complemento,
                   int cep, int numeroCasa, int cadastro) {
        super(nome, cpf, email, telefone, genero, idade, pais, estado, cidade, bairro, rua, complemento, cep,
                numeroCasa);
        this.cadastro = cadastro;
    }
}
