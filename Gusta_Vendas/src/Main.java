import java.util.Scanner;

public class Main {
    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        Funcionario cc = new Funcionario();
        cc.setMatricula(123);
        cc.setSenha("321");
        Funcionario.listaFuncionarios.add(cc);

        Gerente c2 = new Gerente();
        c2.setMatricula(321);
        c2.setSenha("123");
        Gerente.listaGerentes.add(c2);

        login();
    }

    public static void login(){
        System.out.print("Insira a sua matricula: ");
        int matricula = tec.nextInt();

        System.out.print("Insira a sua senha: ");
        String senha = tec.next();

        Funcionario.verificarFuncionario(matricula, senha);

    }

    public static void menuPrincipal(int matricula, String senha){
        System.out.println("--- MENU PRINCIPAL ---" +
                "\n1- Cadastrar Cliente" +
                "\n2- Verificar estoque" +
                "\n3- Cadastrar produto" +
                "\n4- Encerrar");
        int opcao = tec.nextInt();

        switch(opcao){
            case 1:
            System.out.println("sd");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }

        for(int i =0; i<Funcionario.listaFuncionarios.size(); i++){
            if(Funcionario.listaFuncionarios.get(i).getMatricula() == matricula){
                if (Funcionario.listaFuncionarios.get(i).getSenha() == senha){
                    System.out.println("5- Cadastrar funcionário");
                }else{
                    System.out.println("Senha incorreta!");
                }
            }
        }


    }

}
