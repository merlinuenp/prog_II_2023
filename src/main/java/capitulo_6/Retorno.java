
package capitulo_6;


public class Retorno {
    
    public static void main(String[] args) {
        Caixa c;
        c = criarCaixa(); 
        System.out.println(c.calcularVolume());
    }
    
    
    static public Caixa criarCaixa(){
        return new Caixa( 4.0, 6.0, 8.0); 
    }
    
}
