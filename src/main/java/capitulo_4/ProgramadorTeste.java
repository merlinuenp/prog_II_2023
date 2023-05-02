
package capitulo_4;


public class ProgramadorTeste {
    public static void main(String[] args) {
        Programador p = new Programador("Juninho", 15_000.00, 10.0);
        System.out.println(p.calcularSalario(120.0));
    }
}
