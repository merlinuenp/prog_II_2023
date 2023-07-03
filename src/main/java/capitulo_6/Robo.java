package capitulo_6;

public class Robo {

    private String nome;
    private Ponto ponto;

    public Robo() {
        nome = "";
        ponto = new Ponto();
    }

    public Robo(String nome, Ponto ponto) {
        this.nome = nome;
        this.ponto = ponto;
    }

    public void andarDireita() {
        // incrementa x
        ponto.setX(ponto.getX() + 1);
    }

    public void andarEsquerda() {
        ponto.setX(ponto.getX() - 1);
    }

    public void teletransportar(int x, int y) {
        ponto.setX(x);
        ponto.setY(y);
    }

    public String mostrarPosicao() {
        return "x = " + ponto.getX()
                + " y = " + ponto.getY();
    }

    public boolean colidiu(Robo outroRobo) {
        if (this.getPonto().getX() == outroRobo.getPonto().getX()
                && this.getPonto().getY() == outroRobo.getPonto().getY()) {
            return true;
        }
        return false;
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private Ponto getPonto() {
        return ponto;
    }

    private void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

}
