
package capitulo_4;

public class Livro {
    String titulo;
    Integer paginas;
    String editora;
    Autor autor; 
    
    Livro(){
        titulo = ""; 
        paginas = 0; 
        editora = "";
        autor = new Autor();      
    }
    
    Livro(String titulo, Integer paginas, String editora,
            Autor autor){
        this.titulo = titulo;
        this.paginas = paginas;
        this.editora = editora;
        this.autor = autor; 
    }
    
    
}
