
package capitulo_4;

public class Dupla {
    Aluno aluno1;
    Aluno aluno2; 
    
    Dupla(){
        aluno1 = new Aluno();
        aluno2 = new Aluno(); 
    }
    
    Dupla(Aluno aluno1, Aluno aluno2){
        this.aluno1 = aluno1;
        this.aluno2 = aluno2; 
    }
    
    void mostrarAlunos(){
        System.out.println(aluno1.nome);
        System.out.println(aluno2.nome);
    }
        
}
