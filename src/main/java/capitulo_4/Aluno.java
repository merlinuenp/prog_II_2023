package capitulo_4;

import java.time.LocalDate;


public class Aluno {
    Integer matricula; 
    String nome;


    public Aluno(){
        matricula = 0;
        nome = "";
    }
    
    public Aluno(Integer matricula, String nome){
        this.matricula = matricula;
        this.nome = nome; 
    }
}