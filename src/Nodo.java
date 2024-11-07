public class Nodo {
    private String pregunta;  // La pregunta o solución
    private Nodo si;          // Nodo hijo en caso de respuesta "Sí"
    private Nodo no;          // Nodo hijo en caso de respuesta "No"
    private boolean esSolucion; // Indica si el nodo es una solución

    // Constructor para pregunta
    public Nodo(String pregunta) {
        this.pregunta = pregunta;
        this.esSolucion = false;
    }

    // Constructor para solución
    public Nodo(String solucion, boolean esSolucion) {
        this.pregunta = solucion;
        this.esSolucion = esSolucion;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setSi(Nodo si) {
        this.si = si;
    }

    public void setNo(Nodo no) {
        this.no = no;
    }

    public Nodo getSi() {
        return si;
    }

    public Nodo getNo() {
        return no;
    }

    public boolean esSolucion() {
        return esSolucion;
    }
}
