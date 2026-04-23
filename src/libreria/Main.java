package libreria;

public class Main {
    public static void main(String[] args) {
        CLibro libro1 = new CLibro();
        operativa_libro(libro1, 10); // <-- Error 1 corregido (añadido el 10)
    }

    // <-- Error 2 corregido (añadida la llave { al final)
    private static void operativa_libro(CLibro libro1, int dias_prestamo) { 
        libro1.setTitulo("El Quijote");
        
        // <-- Error 3 corregido (usando setters y getters)
        libro1.setStock(5); 
        System.out.println("Libro actual: " + libro1.getTitulo());
        System.out.println("Stock disponible: " + libro1.getStock());
    }
}