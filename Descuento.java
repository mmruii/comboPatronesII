public class Descuento extends ProductoDecorador {
    private final double porcentaje;

    public Descuento(Producto producto, double porcentaje) {
        super(producto);

        if (porcentaje < 0 || porcentaje > 100) {
            throw new IllegalArgumentException(
                    "El descuento debe estar entre 0 y 100"
            );
        }

        this.porcentaje = porcentaje;
    }

    @Override
    public double precio() {
        return producto.precio() * (1 - porcentaje / 100.0);
    }
}
