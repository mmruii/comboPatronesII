public abstract class ProductoDecorador implements Producto {
    protected final Producto producto;

    protected ProductoDecorador(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String getNombre() {
        return producto.getNombre();
    }

    @Override
    public int stock() {
        return producto.stock();
    }
}
