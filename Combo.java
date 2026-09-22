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
        return productos.stream()
                .mapToDouble(Producto::precio)
                .sum();
    }

    @Override
    public int stock() {
        return productos.stream()
                .mapToInt(Producto::stock)
                .min()
                .orElse(0);
    }
}
