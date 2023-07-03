
package capitulo_6;

public class CampoEstatico {
    private static int quantidadeObjetos = 0;  
    private int campoNaoEstatico; 
    
    public CampoEstatico(int campoNaoEstatico){
        quantidadeObjetos++; 
        this.campoNaoEstatico = campoNaoEstatico; 
    }

    public static int getQuantidadeObjetos() {
        return quantidadeObjetos;
    }

    public int getCampoNaoEstatico() {
        return campoNaoEstatico;
    }

    public void setCampoNaoEstatico(int campoNaoEstatico) {
        this.campoNaoEstatico = campoNaoEstatico;
    }
    
    
    
    public static void main(String[] args) {
        CampoEstatico c1 = new CampoEstatico(9); 
        CampoEstatico c2 = new CampoEstatico(4); 
        CampoEstatico c3 = new CampoEstatico(11); 
        CampoEstatico c4 = new CampoEstatico(0); 
        System.out.println(c1.getQuantidadeObjetos());
        System.out.println(c1.getCampoNaoEstatico());
        System.out.println(c3.getQuantidadeObjetos());
        System.out.println(c3.getCampoNaoEstatico());
    }
    
    
}
