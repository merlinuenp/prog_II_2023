
package capitulo_4;


public class Ponto {
    Integer x;
    Integer y;
    
    Ponto(){
        x = 0;
        y = 0; 
    }
    
    Ponto(Integer x, Integer y){
        this.x = x;
        this.y = y; 
    }
     
    void plotar(){
        // está mostrando no método porque o exercício pede assim 
        System.out.println("x="+x+", y="+y);
    }
    
    void setarXY(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }
    
    public static void main(String[] args) {
        Ponto p = new Ponto(3, 12);
        p.plotar();
        p.setarXY(10, 10);
        p.plotar();
    }
    
}
