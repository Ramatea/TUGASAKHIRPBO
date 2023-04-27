package kopi_project;

import java.util.Scanner;

public class login {

    public static void main(String[] args) {
        String username = "admin";
        String password = "password";

        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        String inputUsername = input.nextLine();

        System.out.print("Password: ");
        String inputPassword = input.nextLine();

        try {
            if (username.equals(inputUsername) && password.equals(inputPassword)) {
                System.out.println("Login Berhasil!!!");
            } else {
                throw new Exception("Username Atau Password salah sir!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
