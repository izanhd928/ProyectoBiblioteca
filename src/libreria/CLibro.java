package libreria;
public class CLibro {
    String titulo;
    String autor;
    int stock;
    float precioPrestamo;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public float getPrecioPrestamo() {
        return precioPrestamo;
    }
    public void setPrecioPrestamo(float precioPrestamo) {
        this.precioPrestamo = precioPrestamo;
    }
}