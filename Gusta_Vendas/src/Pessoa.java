import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa extends Endereco{
    static Scanner tec = new Scanner(System.in);
    String nome, cpf, email, telefone, genero;
    int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, String cpf, String email, String telefone, String genero, int idade,
                  String pais, String estado, String cidade, String bairro, String rua, String complemento,
                  int cep, int numeroCasa) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.genero = genero;
        this.idade = idade;
    }

    public Pessoa() {
        super();
    }

    public void comprar(){
        int cont =0;
        System.out.print("Informe o código do cliente ou sua matricula: ");
        int codCF = tec.nextInt();
        for (int i =0; i < (Cliente.listaClientes.size() + Funcionario.listaFuncionarios.size());i++){
            if(codCF == Cliente.listaClientes.get(i).getCadastro() ||
                codCF == Funcionario.listaFuncionarios.get(i).getMatricula()){
                
                    System.out.print("Informe o código do produto: ");
                    int codP = tec.nextInt();
                    for(int i2 =0; i2<Produto.listaProdutos.size();i2++){
                        if(codP == Produto.listaProdutos.get(i2).getCodigo()){
                            cont =1;
                            System.out.print("Informe a quantidade desejada: ");
                            int qtdDesej = tec.nextInt();
                            Produto.listaProdutos.get(i2).setQuantidade(Produto.listaProdutos.get(i2).getQuantidade() - qtdDesej);
                        }
                    }if(cont==0){
                        System.out.println("Produto inválido!");
                }
            }
        }



    }

    public void cadastroPessoa(){
        System.out.print("Nome: ");
        this.nome = tec.next();
        System.out.print("Cpf: ");
        this.cpf = tec.next();
        System.out.print("E-mail: ");
        this.email = tec.next();
        System.out.print("Telefone: ");
        this.telefone = tec.next();
        System.out.print("Gênero: ");
        this.genero = tec.next();
        System.out.print("Idade: ");
        this.idade = tec.nextInt();
        System.out.print("País: ");
        this.pais = tec.next();
        System.out.print("Estado: ");
        this.estado = tec.next();
        System.out.print("Cidade: ");
        this.cidade = tec.next();
        System.out.print("Bairro: ");
        this.bairro = tec.next();
        System.out.print("Rua: ");
        this.rua = tec.next();
        System.out.print("Complemento: ");
        this.complemento = tec.next();
        System.out.print("Cep: ");
        this.cep = tec.nextInt();
        System.out.print("Número casa (apto): ");
        this.numeroCasa = tec.nextInt();
    }

}
