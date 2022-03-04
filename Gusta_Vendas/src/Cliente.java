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

    public Cliente(String nome, String cpf, String email, String telefone, String genero, int idade, int cadastro) {
        super(nome, cpf, email, telefone, genero, idade);
        this.cadastro = cadastro;
    }
}
