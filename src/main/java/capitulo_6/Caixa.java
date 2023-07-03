
package capitulo_6;

public class Caixa {
    private Double comprimento;
    private Double altura;
    private Double largura; 

    
    public Caixa(){
        comprimento = 0.0;
        altura = 0.0;
        largura = 0.0; 
    }
    
    public Caixa(Double comprimento, Double altura, Double largura){
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura; 
    }
    
    
    public Double calcularVolume(){
        Double volume = comprimento * altura * largura; 
        return volume; 
    }
    
    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }
    
    
}
