package desafio_design_pattern;

/**
 * Enumeracao do tipos de climas
 * 
 */
public enum TiposClimas {
    
    ENSOLARADO("Ensolarado"),
    CHUVOSO("Chuvoso"),
    VENTANIA("Ventania"),
    FRIO("Frio");
    
    private final String description;

    private TiposClimas(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }

}
