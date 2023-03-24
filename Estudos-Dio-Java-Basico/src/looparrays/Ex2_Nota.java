package looparrays;

/*
Faça um programa que peça uma nota, entre zero e 10.
Mostre uma mensagem caso o valor seja invalido e continue pedindo ate que o usuário informe um valor válido
  */

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {

        // Leitura e escrita de arquivos e dados.
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        //se eu digitar a nota maior que 10 entrara em while, irá imprimir a mensagem, caso contrario o programa é finalizado
        while(nota < 0 | nota > 10){
            System.out.println("Nota Inválida! Digite novamente: ");
            nota = scan.nextInt();
        }

    }

}
