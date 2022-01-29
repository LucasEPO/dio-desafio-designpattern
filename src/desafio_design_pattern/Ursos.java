package desafio_design_pattern;

/**
 *
 * @author lucas
 */
public class Ursos implements IClima{

    @Override
    public void atualizar(TiposClimas climaAtual) {
        System.out.print("Os Ursos estão enfrentando o clima " + climaAtual);
        
        switch (climaAtual) {
            case CHUVOSO:
                System.out.println(", estão procurando um abrigo.");
                break;
            case ENSOLARADO:
                System.out.println(", é um bom periodo para caça.");
                break;
            case VENTANIA:
                System.out.println(", o vento não atrapalha o grande urso.");
                break;
            default:
                System.out.println(", estão indo hibernar.");
                break;
        }
    }

}
