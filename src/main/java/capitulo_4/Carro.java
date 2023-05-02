
package capitulo_4;


public class Carro {
    String marca;
    String modelo;
    Integer ano;
    Integer velocidade; 

    public Carro() {    }
   
    public Carro(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0; 
    }
    
    void acelerar(){
        if (velocidade < 200){
            velocidade++; 
        }
    }
    
    void frear(){
        if (velocidade > 0){
            velocidade--; 
        }
    }
    
}
