package pe.edu.upeu.enums;

enum EstadoPedido {
    PENDIENTE("Esperando confirmación", "#FFA500"),
    CONFIRMADO("Pedido confirmado", "#2196F3"),
    ENVIADO("En camino", "#4CAF50"),
    ENTREGADO("Entregado", "#00BCD4");

    private String descripcion;
    private String color;

    EstadoPedido(String desc, String color) {
        this.descripcion = desc;
        this.color = color;
    }

    public String getDescripcion() { return descripcion; }
}

public class ejercicio33 {
    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 33: ENUMS (PEDIDOS) ---");
        EstadoPedido miPedido = EstadoPedido.ENVIADO;

        System.out.println("Estado actual: " + miPedido);
        System.out.println("Detalle: " + miPedido.getDescripcion());
    }
}