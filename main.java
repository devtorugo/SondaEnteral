import Usuario.Usuario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> usuario = new ArrayList<>();
        Usuario novocadastro = new Usuario();

        boolean rodando = true;

        while (rodando) {

            System.out.println("===== MENU INICIAL =====");
            System.out.println("[1] Cadastrar");
            System.out.println("[2] Fazer login");
            System.out.println("[3] Atualizar dados do usuário");
            System.out.println("[4] Sair");
            System.out.print("Digite a opção desejada: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1": {
                    System.out.println("===== CADASTRO DE CLIENTE =====");
                    System.out.println("Digite o seu nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o seu sexo: ");
                    String sexo = scanner.nextLine();
                    System.out.println("Telefone:");
                    String telefone = scanner.nextLine();
                    System.out.println("Digite sua data de nascimento: ");
                    String dataNasc = scanner.nextLine();
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    Date data = null;
                    try {
                        data = formato.parse(dataNasc);
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Digite seu cpf: ");
                    String cpf = scanner.nextLine();
                    System.out.println("Condição clínica:");
                    String condicao = scanner.nextLine();
                    System.out.println("Digite sua senha:");
                    String senha = scanner.nextLine();
                    System.out.println("Nome do médico: ");
                    String medico = scanner.nextLine();

                    String MSG = novocadastro.fazerCadastro(nome, sexo, telefone, data, cpf, condicao, senha, medico);
                    System.out.println(MSG);
                    break;

                }
                case "2": {

                        System.out.println("Digite seu cpf: ");
                        String cpf = scanner.nextLine();
                        System.out.println("Digite sua senha:");
                        String password = scanner.nextLine();

                        if (novocadastro.getCpf().equals(cpf) && novocadastro.getSenha().equals(password)) {
                           System.out.println("Login realizado com sucesso!");
                    } else {
                            System.out.println("Erro ao fazer login");
                    }

                    break;
               }

                case "3": {
                    System.out.println("===== ATUALIZAÇÃO DE USUÁRIO =====");

                    System.out.println("Digite seu cpf: ");
                    String novocpf = scanner.nextLine();
                    System.out.println("Digite sua nova senha: ");
                    String novasenha = scanner.nextLine();


                    novocadastro.setCpf(novocpf);
                    novocadastro.setSenha(novasenha);

                    System.out.println("Atualização realizada!");

               }

                case "4": {
                    rodando = false;
                    System.out.println("Programa finalizado!");
                    break;
                }
            }
        }
    }
}
