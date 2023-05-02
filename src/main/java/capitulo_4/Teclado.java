package capitulo_4;

import java.util.Locale;
import java.util.Scanner;

public class Teclado {
    public static void main(String[] args) {
        double d = 0.0;
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        int i = teclado.nextInt();
        teclado.nextLine();
        String s = teclado.nextLine();
        try{
            d = teclado.nextDouble(); 
        }
        catch(Exception e){
            System.out.println("Erro: " + e);
        }
        System.out.println("Valor de i: " + i);
        System.out.println("Valor de s: " + s);
        System.out.println("Valor de d: " + d);
    }
    
}
