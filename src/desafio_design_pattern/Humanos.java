package desafio_design_pattern;

/**
 *
 * @author lucas
 */
public class Humanos implements IClima{

    @Override
    public void atualizar(TiposClimas climaAtual) {
        System.out.print("Os humanos estão enfrentando o clima " + climaAtual);
        
        switch (climaAtual) {
            case CHUVOSO:
                System.out.println(", não esqueça o guarda-chuva.");
                break;
            case ENSOLARADO:
                System.out.println(", não esqueça o protetor solar.");
                break;
            case VENTANIA:
                System.out.println(", não esqueça o agasalho.");
                break;
            default:
                System.out.println(", prepare seus melhores cobertores.");
                break;
        }
    }
    
}
