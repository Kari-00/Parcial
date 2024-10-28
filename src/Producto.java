public abstract class Producto {


    protected String nombre;
    protected String marca;
    protected double precio;
    protected int cantidadStock;


    public Producto( String nombre,String marca,double precio, int cantidadStock){
        this.precio = precio;
        this.marca = marca;
        this.cantidadStock = cantidadStock;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }


    public abstract void mostrarDetalles();




}
