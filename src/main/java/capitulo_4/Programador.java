package capitulo_4;

public class Programador {
    String nome;
    Double salario;
    Double horasExtras; 
    
    Programador(){
        nome = "";
        salario = 0.0;
        horasExtras = 0.0; 
    }

    Programador (String nome, Double salario, Double horasExtras){
        this.nome = nome;
        this.salario = salario;
        this.horasExtras = horasExtras; 
    }
    
    // sobrecarga 
    Double calcularSalario(){
        return salario; 
    }
    
    Double calcularSalario(Double valorHoraExtra){
        Double valor = salario + (horasExtras * valorHoraExtra);
        return valor; 
    }
    

}
