class parcial1{
  private String nombre;
  private double precio;
  private int stock;

  public parcial1(String nombre,double precio , int stock){
    this.nombre = nombre;
    this.precio = Math.max(0,precio);
    this.stock = Math.max(0 , stock);


  }
  public void acrualizarstock(int cantidad){
    if (this.stock + cantidad >=0){
        this.stock += cantidad;
    }else{
        System.out.println("error estock insuficiente");
    }
  }
  public void mostrar(){
    System.out.println(nombre + " | Precio: $" + precio + " | Stock: " + stock);

  }
  public static void main(String[]args){
    parcial1 p = new parcial1("teclado" ,45.00 ,50);
    p.acrualizarstock(5);
    p.acrualizarstock(-3);
    p.acrualizarstock(-20);
    p.mostrar();
  }
}

//metodos
public void mostrare(){

  System.out.println("aprobe la materia ");
}
    if (calificacion<=6) {

      System.out.println("aprobe ");
    }
    else(calificacion >=6){

      System.out("no pude aprobar ");
    }

    public paciente(){
      
    }

