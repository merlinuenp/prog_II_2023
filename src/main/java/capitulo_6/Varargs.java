
package capitulo_6;

public class Varargs {
    public int calcular(String operacao, int ... v){
        int total =0; 
        if (operacao.equals("SOM")){
            total = 0;
            for(int i=0; i < v.length; i++){
                total += v[i];             
            }
        }
        else if (operacao.equals("MULT")){
            total = 1;
            for(int i=0; i < v.length; i++){
                total *= v[i];             
            }         
        }
        return total; 
    }
    
}
