package desafio_design_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe resposavel por saber que sao os observer e atualizar o clima
 * @author LucasEPO
 */
public class Clima {

    private TiposClimas climaAtual;
    private final List<IClima> observers;

    public Clima() {
        observers = new ArrayList<>();
        climaAtual = TiposClimas.ENSOLARADO;
    }
    
    public void adicionarObserver(IClima obs) {
         observers.add(obs);
    }
    
    public void removerObserver(IClima obs) {
         observers.remove(obs);
    }
    
    public void passarTempo() {
        TiposClimas[] enumValues = TiposClimas.values();
        climaAtual = enumValues[(climaAtual.ordinal()+1) % enumValues.length];
        System.out.println("------------------");
        System.out.println("O clima mudou para " + climaAtual);
        notificarObservers();
    }
    
    private void notificarObservers() {
        observers.forEach((obs) -> {
            obs.atualizar(climaAtual);
        });
    }
    
}
