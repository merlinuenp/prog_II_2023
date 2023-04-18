package capitulo_4;

public class TestaCaixa {
    public static void main(String[] args) {
        Caixa c = new Caixa();
        c.comprimento = 10.0;
        c.largura = 10.0;
        c.altura = 10.0;
        Double volume = c.calcularVolume();
        System.out.println(volume);
        
        Caixa caixa = new Caixa(2.0, 3.5, 6.0);
        System.out.println(caixa.calcularVolume());
        
    }
}
