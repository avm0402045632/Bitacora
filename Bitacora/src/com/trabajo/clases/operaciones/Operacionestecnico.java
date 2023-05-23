package com.trabajo.clases.operaciones;


import com.trabajo.clases.info.tecnico;

import java.util.Scanner;


public class Operacionestecnico {

    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        System.out.println("Eligir una opcion del menu del tecnico" +
                "\n\t1. Registrar tecnico" +
                "\n\t2. Listar tecnicos registrados" +
                "\n\t3. Ver informacion del tecnico" +
                "\n\t4. Editar informacion del tecnico seleccionado" +
                "\n\t5. Eliminar el teccnico selecccionado");
        byte opcion = scanner.nextByte();

        switch (opcion) {
            case 1:
                registrartecnico();
                break;

            case 2:
                listartecnico();
                break;
            case 3:
                vertecnico();
                break;
            case 4:
                editartecnico();
                break;
            case 5:
                eliminartecnico();
                break;
            default:
                System.out.println( "Seleccione una opcion valida");
        }

        }
        public static void registrartecnico(){
        tecnico tecnico = new tecnico();
        tecnico.setNombre("serkan");
        tecnico.setApellidos("bolat");
        tecnico.setArea("Sistemas");
        tecnico.setRfc("SKBL200120");
        tecnico.setCorreo("serkan.bolaat@gmail.com");
        tecnico.setId(5677890);
        tecnico.setDireccion("turquia,234");
        tecnico.setTelefono("2251036279");
            System.out.println(" Nombre del tecnico: " + tecnico.getNombre() +
                    tecnico.getApellidos() +
                    "\nArea" + tecnico.getArea() +
                    "\nClave rfc:" + tecnico.getRfc() +
                    "\nCorreo:" + tecnico.getCorreo() +
                    "\nId :" + tecnico.getId() +
                    "\nDireccion:" + tecnico.getDireccion() +
                    "\nTelefono" + tecnico.getTelefono());


        }
    public static void listartecnico() {
        System.out.println("Metodo para listar tecnicos");
    }
    public static void vertecnico (){
        System.out.println("Metodo para ver informacion del tecnico");
    }
    public static void editartecnico (){
        System.out.println("Metodo para editar la informacion del tecnico");
    }
    public static void eliminartecnico (){
        System.out.println("Metodo para eliminar tecnico seleccionado");
    }


    }


