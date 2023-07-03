
package capitulo_6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class Util {
 /* [Sobrecarga] Crie três métodos sobrecarregados chamados mudarData( ). 
O primeiro deve receber um objeto LocalDate e um inteiro e setar o ano
    do objeto LocalDate com o inteiro recebido. 
O segundo deve receber um objeto LocalDate e dois inteiros e setar o mês 
    e o ano do objeto LocalDate com os inteiros recebidos. 
O terceiro deve receber um objeto LocalDate e três inteiros e 
    setar o dia, o mês e o ano do objeto LocalDate com os inteiros recebidos. 
*/
    
    public static LocalDate mudarData(LocalDate ld, int ano){
        ld = ld.withYear(ano);
        return ld;
    }
    
    public static LocalDate mudarData(LocalDate ld, int mes, int ano){
        ld = ld.withYear(ano);
        ld = ld.withMonth(ano);
        return ld;       
    }
    
    public LocalDate mudarData(LocalDate ld, int dia, int mes, int ano){
        ld = LocalDate.of(ano, mes, dia);
        return ld;
    }
    
    public static String formatarData(LocalDate data){
        return (data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
        
   
    
    public static void main(String[] args) {     
        LocalDate hoje = LocalDate.now(); 
        hoje = Util.mudarData(hoje, 2026);
        
        System.out.println(Util.formatarData(hoje));
    }
    

}
