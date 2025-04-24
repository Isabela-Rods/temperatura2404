import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        //Declarando as variáveis
        double cel, fah; //cel - temperatura em graus Celsius; fah - temperatura em graus Fahrenheit;
        
        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação do programa
        System.out.println("\n\t\t\t -- Conversor --\n");

        //Entradas
        System.out.print("Informe a temperatura em ºC: ");
        cel = entrada.nextDouble();

        //Processamento
        fah = cel * 9 / 5 + 32;

        //Saída
        System.out.println("\n" + cel + " ºC = " + fah + "ºF\n");
    }
}