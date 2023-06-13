package main;

import fetch.ApiViaCep;
import model.Address;
import utility.CreateFile;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner read = new Scanner(System.in);
        String cep = "";
        long number;

        System.out.print("Digite o CEP da residencia: ");
        cep = read.nextLine();
        System.out.print("Digite o número da residencia: ");
        number = read.nextLong();

        try {
            ApiViaCep fetchAddress = new ApiViaCep();
            Address result = fetchAddress.fetch(cep);
            result.setNumero(number);
            new CreateFile().create(result);
            System.out.println("\nDados do CEP pesquisado:");
            System.out.println(result.toString());
            System.out.println("\nEndereço salvo em um arquivo em formato 'JSON'");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Aplicação finalizada");
        }
    }
}
