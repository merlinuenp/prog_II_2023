package capitulo_4;

import java.time.LocalDate;


class Aluno {
    Integer matricula; 
    String nome;


    Aluno(){
        matricula = 0;
        nome = "";
    }
    
    Aluno(Integer matricula, String nome){
        this.matricula = matricula;
        this.nome = nome; 
    }
}