import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario extends Pessoa {
    static Scanner tec = new Scanner(System.in);

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

    public Funcionario(String nome, String cpf, String email, String telefone, String genero, int idade,
                       String pais, String estado, String cidade, String bairro, String rua, String complemento,
                       int cep, int numeroCasa, int matricula, String senha) {
        super(nome, cpf, email, telefone, genero, idade, pais,
                estado, cidade, bairro, rua, complemento, cep,
                numeroCasa);
        this.matricula = matricula;
        this.senha = senha;
    }

    public static void verificarFuncionario(int matricula, String senha){
        int v = 0, indice;
        for(int i =0; i<listaFuncionarios.size(); i++){
            if(Funcionario.listaFuncionarios.get(i).getMatricula() == matricula){
                if (Funcionario.listaFuncionarios.get(i).getSenha().equals(senha)){
                    indice = i;
                    Main.menuPrincipal(indice);
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

    public void vender(){
        System.out.println("--- MENU VENDA --" +
                "\nInforme o código do cliente: ");
        int codigo = tec.nextInt();
        for(int i =0; i<Cliente.listaClientes.size(); i++){
            if(codigo == Cliente.listaClientes.get(i).getCadastro()){
                System.out.println("Informe o código do produto: ");
                int codigoProd = tec.nextInt();
            }
        }

    }

    public void cadastrarCliente(){
        Pessoa p = new Pessoa();
        p.cadastroPessoa();
        System.out.print("Número do cadastro do cliente: ");
        int cadastro = tec.nextInt();
        Cliente clienteTemp = new Cliente(p.nome, p.cpf, p.email, p.telefone, p.genero, p.idade, p.pais,
                p.estado, p.cidade, p.bairro, p.rua, p.complemento, p.cep,
                p.numeroCasa, cadastro);
        Cliente.listaClientes.add(clienteTemp);
        System.out.println("\nCliente cadastrado com sucesso!");
    }

    public void cadastrarProduto(){
        System.out.print("Código do produto: ");
        int codigo = tec.nextInt();
        System.out.print("Quantidade do produto: ");
        int quantidade = tec.nextInt();
        System.out.print("Descricao do produto: ");
        String descricao = tec.next();
        System.out.print("Marca do produto: ");
        String marca = tec.next();
        System.out.print("Modelo do produto: ");
        String modelo = tec.next();
        System.out.print("Valor do produto: ");
        double valor = tec.nextDouble();
        Produto produtoTemp = new Produto(codigo, quantidade, descricao, marca, modelo, valor);
        Produto.listaProdutos.add(produtoTemp);
        System.out.println("\nProduto cadastrado com sucesso!");
    }

    public void verificarEstoque(){
        int v=0;
        System.out.print("Informe o código do produto: ");
        int codigo = tec.nextInt();

        for(int i =0; i<Produto.listaProdutos.size();i++){
            if(Produto.listaProdutos.get(i).getCodigo() == codigo){
                System.out.println("Quantidade do produto: " + Produto.listaProdutos.get(i).getQuantidade());
                v=1;
            }
        }
        if(v==0){
            System.out.println("Código inexistente!");
        }

    }


}
