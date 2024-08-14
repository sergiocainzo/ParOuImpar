/*
 * Par ou Ímpar
 * Como saber se um determinado número é Par ou Ímpar??
 * 
 * Aplicação para fiz de determinar se o número informado pelo usuário é PAR ou Ímpar.
 */


import java.util.Scanner;
import java.util.Locale;


public class ParouImpar {
    
    public static void main(String[] args) {
        
        MetodosParouImpar metodosParouImpar = new MetodosParouImpar();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        

        System.out.println("");
        System.out.println("*******************************************************************************");
        System.out.println("Aplicação para verificar se o número é 'Par ou Ímpar'");
        System.out.println("");
        System.out.print("Por favor digite um número qualquer: ");
        int numero = scanner.nextInt();

        System.out.print("O número " + numero + " é: ");
        metodosParouImpar.Resultado(numero);

        System.out.println("");
        System.out.println("*******************************************************************************");
        System.out.println("");


    }


}
