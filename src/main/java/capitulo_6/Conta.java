package capitulo_6;

public class Conta {
    public static int ultimoCodigo=0; 
    private int codigo; 
    private String nome; 
    
    public Conta(String nome){
        ultimoCodigo++; 
        this.codigo = ultimoCodigo;    
        this.nome = nome; 
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public static void main(String[] args) {
        Conta c1 = new Conta("Elvis"); 
        Conta c2 = new Conta("Alok");
        
        System.out.println(c1.codigo);
        System.out.println(c2.codigo);
    }
    
    
    
}
