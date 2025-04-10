package maquinabebidas_2_2025;

class MaquinaDeBebidas {
    private ContadorDeMonedas contador; // Contador de monedas de la maquina
    private DispensadorDeBotes cola, // Cinco dispensadores de botes
            limon,
            naranja,
            tonica,
            agua;
    private float precio;// Precio de las bebidas(común para todas)
    /* Inicializa la maquina y todos los elementos asociados */
    /*
     * Entradas: float m, cantidad inicial de monedas para el
     * cambio
     */
    /* int b, cantidad inicial de botes en los dispensadores */
    /* float pvp, precio de las bebidas */
    /* Salidas: Ninguna */

    public MaquinaDeBebidas(float m, int b, float pvp) {
        this.contador = new ContadorDeMonedas(m);
        this.cola = new DispensadorDeBotes(b);
        this.limon = new DispensadorDeBotes(b);
        this.naranja = new DispensadorDeBotes(b);
        this.tonica = new DispensadorDeBotes(b);
        this.agua = new DispensadorDeBotes(b);
        this.precio = pvp;
    }

    /*
     * Responder a una acción del usuario. Discrimina el tipo de
     * accion
     */
    /* y utiliza las operaciones privadas */
    /* Entradas: char o, la orden del usuario */
    /* Salidas: Ninguna */
    public void darOrden(char o) {
        if (o >= '1' && o <= '5') {
            this.ordenSeleccion(o);
        } else if (o >= 'A' && o <= 'E' || o == 'R') {
            this.ordenMonedas(o);
        }
    }

    /* Visualiza la informacion de interes sobre la maquina */
    /*
     * Botes en cada dispensador, precio de las bebidas, saldo
     * del cliente
     */
    /* Entradas: Ninguna */
    /* Salidas: Ninguna */
    public void visualizarMaquina() {
        System.out.println("\nMáquina de bebidas:");
    }

    /*
     * Realiza las acciones relacionadas con la introducción de
     * monedas
     */
    /* Entradas: char o, la orden del usuario */
    /* Salidas: Ninguna */
    private void ordenMonedas(char o) {
        if (o == 'R') {
            this.contador.retornar();
        } else {
            this.contador.insertarMoneda(switch(o) {
                case 'A' -> 0.05f;
                case 'B' -> 0.1f;
                case 'C' -> 0.2f;
                case 'D' -> 0.5f;
                case 'E' -> 1f;
                default -> 0f;
            });
        }
    }

    /*
     * Realiza las acciones relacionadas con la selección de una
     * bebida
     */
    /* Entradas: char o, la orden del usuario */
    /* Salidas: Ninguna */
    private void ordenSeleccion(char o) {
        (switch(o) {
            case 'A' -> cola;
            case 'B' -> limon;
            case 'C' -> naranja;
            case 'D' -> tonica;
            case 'E' -> agua;
        }).pulsarBoton();
    }
}