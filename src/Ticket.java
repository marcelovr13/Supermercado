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

    public double totalTicket(){
        double total = 0;
        for (LineaTicket linea:lineas){
         total += linea.precioLinea();
        }
        return total;
    }

    @Override
    public String toString() {
        String impresion = "Ticket n: " + id + "\n";
        impresion += "------------------------";
        impresion += "\n" + "Articulo\t\tQty\t\t\tPrecio\n";
        impresion += "-------------------------\n";
        for (LineaTicket linea : lineas)
            impresion += linea;
        impresion += "\nTotal\t\t\t\t\t\t\t " + totalTicket();
            return impresion;
    }
}
