package Usuario;

import java.util.Scanner;

public class Login  {

    public void login(){

        Scanner scanner = new Scanner(System.in);


        System.out.println("===== LOGIN =====");
        System.out.println("Digite o seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        String password = scanner.nextLine();

        Usuario userLogin = new Usuario();

        String msg = userLogin.Fazerlogin(cpf,password);

        System.out.println(msg);

    }


}
