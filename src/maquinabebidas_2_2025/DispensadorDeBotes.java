/**
 * Autora: Claudia
 * Fecha: 09/04/2025
 * Descripción: Implementación del dispensador de botes de la máquina expendedora.
 * 
 */
public class DispensadorDeBotes {

    private int botes; 

    public DispensadorDeBotes(int i) {
        this.botes = i;
    }

    public boolean pulsarBoton() {
        boolean hayBote = (botes > 0);
        if (hayBote) {
            botes--;
        }
        return hayBote;
    }

    public int botesDisponibles() {
        return botes;
    }
}
