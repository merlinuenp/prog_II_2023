
package capitulo_4;


public class Carro {

 
    public String marca;
    private String modelo;
    private Integer ano;
    private Integer velocidade; 

    public Carro() {    }
   
    public Carro(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0; 
    }
    
    void acelerar(){
        if (getVelocidade() < 200){
            setVelocidade((Integer) (getVelocidade() + 1)); 
        }
    }
    
    void frear(){
        if (getVelocidade() > 0){
            setVelocidade((Integer) (getVelocidade() - 1)); 
        }
    }
    
       public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the ano
     */
    public Integer getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(Integer ano) {
        this.ano = ano;
    }

   
    public Integer getVelocidade() {
        return velocidade;
    }

   
    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }
    
    
    
}
