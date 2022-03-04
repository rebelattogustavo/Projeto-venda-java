import java.util.ArrayList;

public class Funcionario extends Pessoa {

    static ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

    int matricula;
    String senha;

    public Funcionario() {
        super();
    }

    public ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Funcionario(String nome, String cpf, String email, String telefone, String genero, int idade) {
        super(nome, cpf, email, telefone, genero, idade);
    }

    public static void verificarFuncionario(int matricula, String senha){
        int v = 0;
        for(int i =0; i<listaFuncionarios.size(); i++){
            if(Funcionario.listaFuncionarios.get(i).getMatricula() == matricula){
                if (Funcionario.listaFuncionarios.get(i).getSenha().equals(senha)){
                    Main.menuPrincipal(matricula, senha);
                }else{
                    System.out.println("Senha incorreta!");
                    Main.login();
                }
            }else{
                v = -2;
            }
        }
       if(v == -2){
            System.out.println("Matricula incorreta!");
            Main.login();
        }
    }

    public static void vender(){

    }

    public static void cadasstrarCliente(){

    }

    public static void verificarEstoque(){

    }

    public static void cadastrarProduto(){

    }

}
