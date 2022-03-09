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
        Funcionario.listaFuncionarios.add(c2);


        login();
    }

    public static void login(){
        System.out.println("--- Login ---");

        System.out.print("Insira a sua matricula: ");
        int matricula = tec.nextInt();

        System.out.print("Insira a sua senha: ");
        String senha = tec.next();

        int v = 0;
        for(int i =0; i<Funcionario.listaFuncionarios.size(); i++){
            if(Funcionario.listaFuncionarios.get(i).getMatricula() == matricula){
                if (Funcionario.listaFuncionarios.get(i).getSenha().equals(senha)){
                    menuPrincipal(i);
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

    public static void menuPrincipal(int i){
        System.out.println("--- MENU PRINCIPAL ---" +
                "\n1- Cadastrar Cliente" +
                "\n2- Cadastrar produto" +
                "\n3- Verificar estoque");

        if(Funcionario.listaFuncionarios.get(i) instanceof Gerente){
            System.out.println("4- Cadastrar funcionário" +
                    "\n5- Vender" +
                    "\n6- Voltar" +
                    "\n0- Encerrar");
        }else{
            System.out.println("5- Voltar" +
                    "\n0- Encerrar");
        }

        int opcao = tec.nextInt();

        switch(opcao){
            case 0:
                System.exit(0);
                break;
            case 1:
                Funcionario.listaFuncionarios.get(i).cadastrarCliente();
                menuPrincipal(i);
                break;
            case 2:
                Funcionario.listaFuncionarios.get(i).cadastrarProduto();
                menuPrincipal(i);
                break;
            case 3:
                Funcionario.listaFuncionarios.get(i).verificarEstoque();
                menuPrincipal(i);
                break;
            case 4:
                Gerente g = (Gerente) Funcionario.listaFuncionarios.get(i);
                g.cadastrarFuncionario();
                menuPrincipal(i);
                break;
            case 5:
                Funcionario.listaFuncionarios.get(i).vender();
                menuPrincipal(i);
                break;

            case 6:
                login();
                break;

        }

//            if (Funcionario.listaFuncionarios.get(i) instanceof Gerente){
//                System.out.println("5- Cadastrar funcionário");
//                Gerente g = new Gerente();
//                Funcionario.listaFuncionarios.add(g);
//            }
    }



}
