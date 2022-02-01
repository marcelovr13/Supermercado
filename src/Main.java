public class Main {
    public static void main(String[] args) {

        Articulo cocacola = new Articulo("Coca-cola", 2, "Bebida azucarada de color negro.");
        Articulo manzanas = new Articulo("Manzana", 1, "Manzana verde.");
        Articulo platano = new Articulo("Platano", 2, "Platano de Canarias.");
        Articulo fresa = new Articulo("Fresas", 7, "Fresas rojas.");

        Ticket ticket = new Ticket("1313");
        ticket.addLinea(cocacola, 4);
        ticket.addLinea(manzanas, 3);
        ticket.addLinea(platano, 5);
        ticket.addLinea(fresa, 9);
        System.out.println(ticket);



    }
}
