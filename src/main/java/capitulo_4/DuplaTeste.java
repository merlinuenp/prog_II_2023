
package capitulo_4;

public class DuplaTeste {
    public static void main(String[] args) {
        Dupla dupla = new Dupla(new Aluno(1, "Benson"), 
                                new Aluno(2, "Saltitão"));
        
        dupla.mostrarAlunos();
    }
    
}
