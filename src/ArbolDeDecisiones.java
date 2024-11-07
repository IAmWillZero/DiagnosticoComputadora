public class ArbolDeDecisiones {
    private Nodo raiz;

    public ArbolDeDecisiones() {
        // Crear el árbol de decisiones según el esquema dado
        Nodo raiz = new Nodo("¿La computadora enciende?");

        Nodo preguntaPantalla = new Nodo("¿La pantalla muestra algo?");
        Nodo preguntaSistemaOperativo = new Nodo("¿El sistema operativo carga?");

        Nodo problemaFuentePoder = new Nodo("Problema con la fuente de poder", true);
        Nodo problemaPantalla = new Nodo("Problema con la pantalla", true);
        Nodo problemaHardware = new Nodo("Problema con el hardware", true);
        Nodo problemaSO = new Nodo("Problema con el sistema operativo", true);

        Nodo problemaHardwareFinal = new Nodo("Problema con el hardware", true);
        Nodo problemaSOFinal = new Nodo("Problema con el sistema operativo", true);

        // Establecer relaciones entre preguntas
        raiz.setSi(preguntaPantalla);
        raiz.setNo(problemaFuentePoder);

        preguntaPantalla.setSi(preguntaSistemaOperativo);
        preguntaPantalla.setNo(problemaPantalla);

        preguntaSistemaOperativo.setSi(problemaHardware);
        preguntaSistemaOperativo.setNo(problemaSO);

        // Establecer la estructura del árbol
        this.raiz = raiz;
    }

    public void iniciarDiagnostico() {
        diagnosticar(raiz);
    }

    private void diagnosticar(Nodo nodo) {
        if (nodo.esSolucion()) {
            System.out.println(nodo.getPregunta());
            return;
        }

        System.out.println(nodo.getPregunta() + " (Sí/No): ");
        String respuesta = new java.util.Scanner(System.in).nextLine().toLowerCase();

        if (respuesta.equals("sí") || respuesta.equals("si")) {
            diagnosticar(nodo.getSi());
        } else if (respuesta.equals("no")) {
            diagnosticar(nodo.getNo());
        } else {
            System.out.println("Respuesta no válida. Por favor ingresa 'Sí' o 'No'.");
            diagnosticar(nodo);
        }
    }
}
