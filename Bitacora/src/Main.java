import com.trabajo.clases.operaciones.Operacionesdiagnostico;
import com.trabajo.clases.operaciones.OperacionesCliente;
import com.trabajo.clases.operaciones.Operacionestecnico;


import java.time.LocalDate;

public class Main {
    static OperacionesCliente operacionesCliente = new OperacionesCliente();
    static Operacionesdiagnostico operacionesdiagnostico = new Operacionesdiagnostico();

    static Operacionestecnico operacionestecnico = new Operacionestecnico();
    public static void main(String[] args) {
    //OperacionesTecnico();
       // OperacionesDiagnostico();
        OperacionesCliente();
    }


    public static void obtenerFecha() {
        LocalDate localTime = LocalDate.now();

        System.out.println(localTime);

    }


    public static void OperacionesCliente() {
        operacionesCliente.menu();


    }
    public static void OperacionesDiagnostico() {
        operacionesdiagnostico.menu();
    }
    public  static  void OperacionesTecnico(){
        operacionestecnico.menu();
    }


}