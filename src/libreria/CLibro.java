package libreria;

/**
 * Clase que representa un libro dentro del inventario de la biblioteca.
 */
public class CLibro {
    
    // 1. Los atributos ahora son privados
    private String titulo;
    private String autor;
    private int stock;
    private float precioPrestamo;

    // --------------------------------------------------------
    // 2. MÉTODOS "GET" Y "SET" (Puestos directamente a mano)
    // --------------------------------------------------------

    /**
     * Obtiene el título del libro.
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Modifica el título del libro.
     * @param titulo El nuevo título que le queremos poner.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro.
     * @return El nombre del autor.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Modifica el autor del libro.
     * @param autor El nuevo autor.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el stock disponible del libro.
     * @return El número de unidades en stock.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Modifica el stock del libro.
     * @param stock La nueva cantidad de libros disponibles.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Obtiene el precio del préstamo.
     * @return El precio en euros/dólares.
     */
    public float getPrecioPrestamo() {
        return precioPrestamo;
    }

    /**
     * Modifica el precio del préstamo del libro.
     * @param precioPrestamo El nuevo precio de préstamo.
     */
    public void setPrecioPrestamo(float precioPrestamo) {
        this.precioPrestamo = precioPrestamo;
    }
}