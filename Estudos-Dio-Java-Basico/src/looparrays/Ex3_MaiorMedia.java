package looparrays;
/*
 Faça um programa que leia 5 numeros
 e informe o maior numero e a média desses numeros.
  */

import java.util.Scanner;

public class Ex3_MaiorMedia {
    public static void main(String[] args) {

        // Leitura e escrita de arquivos e dados.
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;
            //System.out.println("Soma: " + soma);

            if(numero > maior) maior = numero;

            count = count + 1;
            //este laço vai  repetir 5 vezes, quando chegar na quinta vez mostra o maior numero 
        } while (count < 5);

        //Aqui mostra qual o maior numero quando encerrar o laço
        System.out.println("maior: " + maior);

        //Agora sera efetuado a média, ou seja, ira dividir somar/5 
        System.out.println("Média: " + (soma/5));

        

    }

}
