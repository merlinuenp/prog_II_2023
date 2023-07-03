package capitulo_6;

import capitulo_4.Carro;

public class Main {

    public static void main(String[] args) {
        Carro c; 
        c = criarCarro(); 
        
        Carro x = c; // apelido 
        
        x.setMarca("Fiat");
        
        System.out.println(c.getMarca());
        
                
    }
    
    public static Carro criarCarro(){
        return new Carro(); 
    }
    
    

    public static void mudar(Carro carro) {
        carro.setMarca("Volvo");
    }
}
