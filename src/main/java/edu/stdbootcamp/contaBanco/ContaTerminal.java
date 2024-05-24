package edu.stdbootcamp.contaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da Agência: ");
        conta.setAgencia(sc.next());
        System.out.println("Digite o Numero da Conta: ");
        conta.setNumero(sc.nextInt());
        System.out.println("Digite o nome do Cliente: ");
        conta.setNomeCliente(sc.next());
        System.out.println("Digite o saldo da Conta: ");
        conta.setSaldo(sc.nextDouble());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque%n",conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());
    }
}