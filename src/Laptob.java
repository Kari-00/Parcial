 class Laptob extends Producto implements Vendible{

    public String procesador;
    public int  memoriaRAM;

    public Laptob (String nombre,String marca,double precio,int cantidadStock,String procesador, int memoriaRAM){
       super(nombre,marca,precio,cantidadStock);
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
    }
     public double calcularPrecioVenta(int cantidad) {
         return this.precio;

     }


     @Override
     public void mostrarDetalles() {
        System.out.println("laptob:" +nombre+" marca:" + marca +"procesador:"+procesador+"memoria RAM:"+memoriaRAM+"stock:"+cantidadStock);

     }
 }
