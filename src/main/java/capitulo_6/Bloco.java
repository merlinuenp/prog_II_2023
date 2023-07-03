
package capitulo_6;

public class Bloco {
    private int a;
    private int b;
    private int c;
    private int volume; 
    
    public Bloco(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        volume = a * b * c; 
    }
    
    public void calcularVolume(){
        volume = a * b * c; 
    }
    
    public void setA(int a){
        if (a > 0){
            this.a = a;
        }
        else {
            this.a = 0; 
        }
    }
    
    public int getA(){
        return a; 
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getVolume() {
        return volume;
    }

   
    
    
}
