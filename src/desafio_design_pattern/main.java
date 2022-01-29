package desafio_design_pattern;

/**
 *
 * @author LucasEPO
 */
public class main {

    public static void main(String[] args) {
        
        Clima clima = new Clima();
        clima.adicionarObserver(new Humanos());
        clima.adicionarObserver(new Ursos());
        
        clima.passarTempo();
        clima.passarTempo();
        clima.passarTempo();
        clima.passarTempo();
    }

}
