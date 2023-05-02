
package capitulo_4;

public class DataTeste {
    public static void main(String[] args) {
        Data d = new Data(18,4,2023);
        Data d1 = new Data(); 
        Data d2 = new Data(2023); 
        
        System.out.println(d.formatarData('-'));
    }
}
