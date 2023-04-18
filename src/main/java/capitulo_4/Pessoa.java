package capitulo_4;


public class Pessoa {
    Integer idade;
    String nome;
    
    // sobrecarga 
    Pessoa(){
        idade = 0;
        nome = ""; 
    }
       
    Pessoa(Integer idade, String nome){
        this.idade = idade;
        this.nome = nome; 
    }
    
}
