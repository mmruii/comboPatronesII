import java.util.ArrayList;
import java.util.List;

public class Combo implements Producto {
    private final String nombre;
    private final List<Producto> productos;

    public Combo(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void quitarProducto(Producto producto) {
        productos.remove(producto);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double precio() {
        double precioTotal = 0;

        for (Producto producto : productos) {
            precioTotal += producto.precio();
        }

        return precioTotal;
    }

    @Override
    public int stock() {
        if (productos.isEmpty()) {
            return 0;
        }

        int stockMinimo = productos.get(0).stock();

        for (Producto producto : productos) {
            if (producto.stock() < stockMinimo) {
                stockMinimo = producto.stock();
            }
        }

        return stockMinimo;
    }
}
