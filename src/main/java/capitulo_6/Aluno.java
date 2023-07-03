package capitulo_6;

public class Aluno {
    private String nome;
    private Long cpf;
    private int matricula; 
    
    public Aluno(){
        nome = ""; 
    } 
    
    public void setMatricula(int matricula){
        if (matricula > 0){
            this.matricula = matricula; 
        }
    }
    
    
    public void setNome(String nome){
        this.nome = nome; 
    }
    
    public String getNome(){
        return nome; 
    }
    
}
