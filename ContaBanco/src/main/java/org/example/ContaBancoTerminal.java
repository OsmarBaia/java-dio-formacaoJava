package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaBancoTerminal {
    public static void main(String[] args) {
        boolean exitProgram = false;
        int agencyNum = 0;
        String accountNum  = "", clientName = "";
        double accountBalance = 0.0f;

            System.out.print("Seja Bem-Vindo!\nVamos começar seu cadastro!\nPor favor, digite o numero da agencia: ");

            Scanner sc = new Scanner(System.in);
            try {
                agencyNum = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("\nErro de entrada! Digite apenas números!");
                sc.nextLine();
            }
            sc.nextLine();

            //Conta

            System.out.print("\nPor favor, digite o numero da conta: ");
            try {
                accountNum = sc.nextLine();
            }catch (InputMismatchException e){
                System.out.println("\nErro de entrada em conta! A Entrada não deve possuir espaço!");
                sc.nextLine();
            }

            //Nome

            System.out.print("\nPor favor, digite o nome do cliente: ");
            try {
                clientName = sc.nextLine();
            }
            catch (InputMismatchException e){
                System.out.println("\nErro de entrada em Nome! Digite apenas números!");
                sc.nextLine();
            }

            //Saldo

            System.out.print("\nPor favor, digite o saldo: ");
            try {
                accountBalance = sc.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("\nErro de entrada em Saldo! A Entrada deve ser um decimal separado por ponto Ex: 12.34 ");
                sc.nextLine();
            }

            sc.close();
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo %.2f já está disponível para saque", clientName,agencyNum, accountNum, accountBalance);
    }

}
