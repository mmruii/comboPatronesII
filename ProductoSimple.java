public class ProductoSimple implements Producto {
    private final String nombre;
    private final double precio;
    private int stock;

    public ProductoSimple(String nombre, double precio, int stock) {
        if (precio < 0 || stock < 0) {
            throw new IllegalArgumentException(
                    "El precio y el stock no pueden ser negativos"
            );
        }

        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double precio() {
        return precio;
    }

    @Override
    public int stock() {
        return stock;
    }

    public void reducirStock(int cantidad) {
        if (cantidad < 0 || cantidad > stock) {
            throw new IllegalArgumentException("Cantidad de stock invalida");
        }

        stock -= cantidad;
    }
}
