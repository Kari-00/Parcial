class Celular extends Producto implements Vendible {

    public Celular(String nombre, String marca, double precio, int cantidadStock) {
        super(nombre, marca, precio, cantidadStock);
    }

    public int capacidadBateria () {
        return  0;
    }
    public int camaraResolucion (){
        return 0;
    }

public void mostrarDetalles(){
        System.out.println();

}

    @Override
    public double calcularPrecioVenta(int cantidad) {
        return 0;
    }
}

