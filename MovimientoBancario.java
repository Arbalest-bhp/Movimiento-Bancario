import.java.util.Date;

//Listas Enlazadas Doubles
//The structure of the Node class must change as it will support 2 nodes instead of one.
public class MovimientoBancario{  //Node
    //Campos de Datos
    Date FechaHora;
    byte tipo;  //0 = Cargo, 1 = Abono
    String descripcion;
    double monto;
    double saldo; //A guide to simplify showing movement

    //Campo de enlace
    MovimientoBancario next; 

    public MovimientoBancario(Date fechaHora, byte tipo, 
        String descripcion, double monto, double saldo){
        
        this.FechaHora = fechaHora;
        this.tipo = tipo;  
        this.descripcion = descripcion;
        this.monto = monto;
        this.saldo = saldo;
    }