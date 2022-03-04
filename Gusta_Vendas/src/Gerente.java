import java.util.ArrayList;

public class Gerente extends  Funcionario{

    static ArrayList<Gerente> listaGerentes = new ArrayList<Gerente>();

    public Gerente(String nome, String cpf, String email, String telefone, String genero, int idade) {
        super(nome, cpf, email, telefone, genero, idade);
    }

    public Gerente() {
        super();
    }


    public void cadastrarFuncionario(){

    }
}
