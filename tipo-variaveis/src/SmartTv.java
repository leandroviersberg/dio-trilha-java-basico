/*Trabalhar com metodos
 * Exemplo de uma classe para representar uma smartTv onde:
 * Ela tenha caracteristicas: ligada(boolean),  canal (int) e volume(int)
 * A TV poderá ligar e desligar e assim mudar o estado ligada
 * A TV aumentará e diminuirá  o volume sempre em +1 ou -1
 * A TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente
*/
    
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Mudando o canal para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Mudando o canal para: " + canal);
    }    


    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

}
