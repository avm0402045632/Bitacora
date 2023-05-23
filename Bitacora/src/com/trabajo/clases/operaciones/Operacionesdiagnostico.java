package com.trabajo.clases.operaciones;

import com.trabajo.clases.proceso.Diagnostico;

import java.time.LocalDate;
import java.util.Scanner;

public class Operacionesdiagnostico {
    private static Scanner scanner = new Scanner(System.in);

    public static void menu (){
        System.out.println("Eligir una opcion del menu de solucion" +
                "\n\t1. Ingresar diagnostico" +
                "\n\t2   Ver información del equipo" +
                "\n\t3   Editar informacion  del equipo" +
                "\n\t4   Eliminar informacion del equipo");
        int opcion = scanner.nextInt();

        switch (opcion) {

            case 1:
                IngresarDiagnostico();
                break;
            case 2:
                VerInformacion();
                break;

            case 3:
                EditarInformacion();
                break;

            case 4:
                EliminarInformacion();
                break;

            default:
                System.out.println("Seleccione una opcion valida");
        }
    }



    public static void IngresarDiagnostico (){
        Diagnostico diagnostico = new Diagnostico();
        // diagnostico.setDia(20/05/01);
        LocalDate localTime = LocalDate.now();
        diagnostico.setDia(localTime.toString());
        diagnostico.setFallo("Pantalla rota");
        diagnostico.setCausa("Accidente");
        diagnostico.setSolucion("Reemplazo de la Pieza");
        diagnostico.setCosto(600);
        diagnostico.setEstadoDelEquipo("fragil");
        diagnostico.setPiezasUtilizadas("Pantalla tactil LCD");

        System.out.println("Fecha de entrega:" + diagnostico.getDia() +
                "\nFallo:" + diagnostico.getFallo() +
                "\nCausa:" + diagnostico.getCausa() +
                "\nSolucion:" + diagnostico.getSolucion()+
                "\nCosto:" + diagnostico.getCosto() +
                "\nEstado del Equipo:" + diagnostico.getEstadoDelEquipo() +
                "\nPiezas a utilizar" + diagnostico.getPiezasUtilizadas());
    }
            public static void VerInformacion(){
                System.out.println("Metodo para ver diagnostico");
            }
    public static void EditarInformacion(){
        System.out.println("Metodo para editar diagnostico");
    }
    public static void EliminarInformacion(){
        System.out.println("Metodo para elimiar diagnostico");
    }
}
