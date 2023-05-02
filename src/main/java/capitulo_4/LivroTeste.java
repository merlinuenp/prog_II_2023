/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo_4;

/**
 *
 * @author Usuário
 */
public class LivroTeste {
    public static void main(String[] args) {
        Livro livro = new Livro(); 
        livro.titulo = "Java como programar";
        livro.paginas = 120; 
        livro.editora = "London Press"; 
        livro.autor = new Autor("Schild", "Programação"); 
        
        
        Livro livro2 = new Livro("C Como Programar", 200, "Elsevier",
            new Autor("Mordekay", "Programação"));
        
        Autor autor = new Autor("Rigby", "Ficção");
        Livro livro3 = new Livro("Aliens", 110, "Ovni", autor); 
    }
    
}
