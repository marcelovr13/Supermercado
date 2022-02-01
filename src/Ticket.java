import java.util.LinkedList;
import java.util.List;

public class Ticket {

    public Ticket(String id) {
        this.id = id;
    }

    private String id;
    public String getId() {
        return id;
    }

    List<LineaTicket> lineas = new LinkedList<>();


    public void addLinea(Articulo articulo, double cantidad) {
        LineaTicket nuevaLinea = new LineaTicket(articulo, cantidad);
        lineas.add(nuevaLinea);

    }

    @Override
    public String toString() {
        String impresion = "Ticket n: " + id + "\n";
        impresion += "------------------------";
        for (LineaTicket linea : lineas)
            impresion += linea;
            return impresion;
    }
}
