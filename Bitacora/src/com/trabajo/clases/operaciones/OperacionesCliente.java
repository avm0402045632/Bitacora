package com.trabajo.clases.operaciones;

import com.trabajo.clases.info.Cliente;

import java.util.Scanner;

public class OperacionesCliente {

    private static Cliente cliente = new Cliente();
    private static Scanner scanner = new Scanner(System.in);

    public static void menu(){
      System.out.println("Eligir una opcion del menu del cliente" +
              "\n\t1. Registrar cliente" +
              "\n\t2. Listar clientes registrados" +
              "\n\t3. Ver informacion del cliente"+
              "\n\t4. Editar informacion del cliente seleccionado" +
              "\n\t5. Eliminar el cliente selecccionado");
      byte opcion = scanner.nextByte();

      do {
          switch (opcion) {
              case 1:
                  registrarCliente();
                  break;
              case 2:
                  mostrarInformacion();
                  break;
              case 3:
                  verCliente();
                  break;
              case 4:
                  editarCliente();
                  break;

              default:
                  System.out.println("Seleccione una opcion valida");

          }
      } while(opcion != 0);
    }
    public static void registrarCliente() {

        System.out.println("Ingrese su nombre");
        cliente.setNombre(scanner.next());
        System.out.println("Ingrese su apellido");
        cliente.setApellidos(scanner.next());
        System.out.println("Ingrese el tipo de cliente");
        cliente.setTipoCilente(scanner.next());
        System.out.println("Ingrese su correo");
        cliente.setCorreo(scanner.next());
        System.out.println("Ingrese RFC");
        cliente.setRfc(scanner.next());
        System.out.println("Ingrese Telefono");
        cliente.setTelefono(scanner.next());
        System.out.println("Ingrese Domicilio");
        cliente.setDireccion(scanner.next());



    }

    public static void mostrarInformacion() {
        System.out.println(" Nombre del cliente: " + cliente.getNombre() +
                cliente.getApellidos() +
                "\nEl tipo de cliente es: " + cliente.getTipoCilente() +
                "\nCorreo electronico: " + cliente.getCorreo() +
                "\nClave rfc:" + cliente.getRfc() +
                "\nTelefono" + cliente.getTelefono() +
                "\nDireccion:" + cliente.getDireccion());
        System.out.println("Presiona enter para continuar");
    }


        public static void EnterParaContinuar () {
            Scanner t = new Scanner(System.in);
            String enter = t.nextLine();
            if (enter.isEmpty()) ;

            menu();

        }

    public static void listarCliente () {






    }

    public static void verCliente () {
        System.out.println("Metodo para ver informacion del cliente");
        Cliente cliente = new Cliente();

        cliente.setNombre("Iracema");
        cliente.setApellidos("Manzano");
        cliente.setTelefono("226780911");
        System.out.println("Nombre:" + cliente.getNombre() +  cliente.getApellidos()
                + "\n\t" + "Telefono a comunicarse " + cliente.getTelefono());


    }
    public static void editarCliente () {

        System.out.println("Metodo para editar la informacion del cliente seleccionado");

    }
    public static void eliminarcliente () {
        System.out.println("Metodo para eliminar al cliente seleccionado");
    }
}
