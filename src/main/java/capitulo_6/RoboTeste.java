package capitulo_6;

public class RoboTeste {

    public static void main(String[] args) {
        Robo robo1 = new Robo("Bob", new Ponto(10, 10));
        robo1.andarDireita();
        System.out.println(robo1.mostrarPosicao());
        robo1.teletransportar(15, 25);
        System.out.println(robo1.mostrarPosicao());

        Robo robo2 = new Robo("Killer", new Ponto(11, 13));
        System.out.println(robo2.colidiu(robo1));
        robo2.teletransportar(15, 25);
        System.out.println(robo2.colidiu(robo1));
    }
}
