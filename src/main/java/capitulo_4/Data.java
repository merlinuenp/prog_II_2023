
package capitulo_4;

class Data {
    Integer dia;  // atributos, campos 
    Integer mes;
    Integer ano; 
    
    Data(){
        dia = 0;
        mes = 0;
        ano = 0;
    }
    
    Data(Integer ano){
        this.dia = 1;
        this.mes = 1;
        this.ano = ano; 
    }
    
    
    Data(Integer dia, Integer mes, Integer ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano; 
    }
            
    String formatarData(Character separador){
        String retorno = ""+dia+separador+mes+separador+ano;
        return retorno; 
    } 
    
}
