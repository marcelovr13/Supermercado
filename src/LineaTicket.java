public class LineaTicket {

    private Articulo articulo;
    private double cantidad;

    public LineaTicket(Articulo articulo, double cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "\n" + articulo.getNombre() + " \t\t\t\t " + cantidad + "\n";
    }
}
