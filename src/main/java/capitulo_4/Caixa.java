
package capitulo_4;

public class Caixa {
    Double comprimento;
    Double altura;
    Double largura; 
    
    Caixa(){
        comprimento = 0.0;
        altura = 0.0;
        largura = 0.0; 
    }
    
    Caixa(Double comprimento, Double altura, Double largura){
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura; 
    }
    
    
    Double calcularVolume(){
        Double volume = comprimento * altura * largura; 
        return volume; 
    }
    
}
