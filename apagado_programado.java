import java.util.Scanner;
public class apagado_programado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] equipos = new String[10];
        String[] fechas = new String[10];
        String[] horas = new String[10];
        String[] motivos = new String[10];
        String[] tipos = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //---------------------------------------//
        //--|menu_principal_apagado_programado|--//
        //---------------------------------------//
        do {
            System.out.println("menu principal de apagado programado");
            System.out.println("1) Registrar apagado");
            System.out.println("2) Editar apagado");
            System.out.println("3) Listar apagados");
            System.out.println("4) Buscar apagado");
            System.out.println("5) Eliminar apagado");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-----------------------//
                //--|registrar_apagado|--//
                //-----------------------//
                case 1:
                    int id = total + 1;
                    System.out.println("registro del apagado");
                    System.out.println("id del apagado a registrar: " + id);
                    System.out.print("nombre del equipo: ");
                    equipos[total] = entrada.nextLine();
                    System.out.print("fecha del apagado: ");
                    fechas[total] = entrada.nextLine();
                    System.out.print("hora del apagado: ");
                    horas[total] = entrada.nextLine();
                    System.out.print("motivo del apagado: ");
                    motivos[total] = entrada.nextLine();
                    System.out.print("tipo de apagado: ");
                    tipos[total] = entrada.nextLine();
                    System.out.print("estado de la programacion: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Apagado programado correctamente.");
                    total++;
                    break;
                //--------------------//
                //--|editar_apagado|--//
                //--------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen apagados programados.");
                        break;
                    }
                    System.out.println("Datos de los apagados");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Equipo: " + equipos[i] + " | Fecha: " + fechas[i] + " | Hora: " + horas[i] + " | Motivo: " + motivos[i] + " | Tipo: " + tipos[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del apagado: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato del apagado");
                        System.out.print("Nuevo nombre del equipo: ");
                        equipos[posicion] = entrada.nextLine();
                        System.out.print("Nueva fecha del apagado: ");
                        fechas[posicion] = entrada.nextLine();
                        System.out.print("Nueva hora del apagado: ");
                        horas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo motivo del apagado: ");
                        motivos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de apagado: ");
                        tipos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado de la programacion: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Apagado actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|listar_apagados|--//
                //---------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen apagados programados.");
                    } else {
                        System.out.println("Lista de apagados");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Equipo: " + equipos[i] + " | Fecha: " + fechas[i] + " | Hora: " + horas[i] + " | Motivo: " + motivos[i] + " | Tipo: " + tipos[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //--------------------//
                //--|buscar_apagado|--//
                //--------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen apagados programados.");
                        break;
                    }
                    System.out.println("busqueda de apagado");
                    System.out.print("ingresa la id para buscar apagado: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del apagado encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Equipo: " + equipos[posicion] + " | Fecha: " + fechas[posicion] + " | Hora: " + horas[posicion] + " | Motivo: " + motivos[posicion] + " | Tipo: " + tipos[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|eliminar_apagado|--//
                //----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen apagados programados.");
                        break;
                    }
                    System.out.println("Datos de los apagados");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Equipo: " + equipos[i] + " | Fecha: " + fechas[i] + " | Hora: " + horas[i] + " | Motivo: " + motivos[i] + " | Tipo: " + tipos[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del apagado a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            equipos[i] = equipos[i + 1];
                            fechas[i] = fechas[i + 1];
                            horas[i] = horas[i + 1];
                            motivos[i] = motivos[i + 1];
                            tipos[i] = tipos[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Apagado eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 6:
                    System.out.println("Gracias por utilizar Apagado Programado.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
        entrada.close();
    }
}