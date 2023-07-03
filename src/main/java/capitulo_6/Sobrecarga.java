package capitulo_6;


public class Sobrecarga {
    
//    public static void imprimir(int i){
//        System.out.println("Imprimiu int");
//    }
    
    public static void imprimir(float f){
        System.out.println("Imprimiu float");
    }
    
    public static void imprimir(double d){
        System.out.println("Imprimiu double");
    }
    
    
    public static void main(String[] args) {
        Sobrecarga.testaStatic();
    }
    
    public static void testaStatic(){
        System.out.println(Integer.MAX_VALUE);
    }
    
}
