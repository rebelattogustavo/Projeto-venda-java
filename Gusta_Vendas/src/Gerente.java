import java.util.ArrayList;

public class Gerente extends  Funcionario{


    public void cadastrarFuncionario(){
        Pessoa p = new Pessoa();
        p.cadastroPessoa();
        System.out.print("Informe a matrícula: ");
        int matricula = tec.nextInt();
        System.out.println("Informe a senha: ");
        String senha = tec.next();

        Funcionario funcionarioTemp = new Funcionario(p.nome, p.cpf, p.email, p.telefone, p.genero, p.idade, p.pais,
                p.estado, p.cidade, p.bairro, p.rua, p.complemento, p.cep,
                p.numeroCasa, matricula, senha);
        Funcionario.listaFuncionarios.add(funcionarioTemp);
        System.out.println("\nFuncionário cadastrado com sucesso!");
    }
}
