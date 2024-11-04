import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class menu {


    public void utilidades()throws IOException{       
        BufferedReader cp = new BufferedReader (new InputStreamReader (System.in)); 

        
        metodos m = new metodos();
        LinkedList<estudiante_ing> lista_ing = new LinkedList<>();
        LinkedList<estudiante_dis> lista_dis = new LinkedList<>();
        LinkedList<equipo_computo> lista_computo = new LinkedList<>();
        LinkedList<equipo_tableta> lista_tabletas = new LinkedList<>();
        ExportarArchivo ex = new ExportarArchivo();
        ImportarArchivoTxt im = new ImportarArchivoTxt();

        lista_ing = im.importarArchivoIngnieria(); 
        lista_computo = im.importarArchivoComputadores();
        lista_dis = im.importarArchivoDiseño();
        lista_tabletas = im.importarArchivoTableta();
        int opc = 0;
        String buscar;
        do {
            
            System.out.println("\t-------Gestion De Prestamos-------\n"
            +"1. Estudiante De Ingenieria\n"
            +"2. Estudiante De Diseño\n"
            +"3. Imprimir Inventario\n" 
            +"0. Salir Del Programa\n\n"
            +"Digite La Opcion Deseada: ");
            
            try {
                opc = Integer.parseInt(cp.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese una opcion valida: ");
                continue;
            }   

            switch (opc) {
                case 1:
                    
                    do {
                        System.out.println("\t-------Estudiante De Ingenieria-------\n"
                    +"1. Registrar Prestamo De Equipo\n"
                    +"2. Modificar Prestamo De Equipo\n"
                    +"3. Devolucion De Equipo\n" 
                    +"4. Buscar Equipo\n"
                    +"5. Volver Al Menu Anterior\n\n"
                    +"Digite La Opcion Deseada: ");                     
                    
                    try {
                        opc = Integer.parseInt(cp.readLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Ingrese una opcion valida: ");
                        continue;
                    }
                    
                    switch (opc) {

                        case 1:  
                            lista_ing = m.LlenarListaIng(lista_ing);   
                            lista_computo = m.llenar_equipo_computo(lista_computo, lista_ing);                 
                            ex.exportarArchivo_ing(lista_ing);
                            ex.exportarArchivo_computador(lista_computo);   
                            break;

                        case 2:   
                            System.out.println("Ingrese el serial o la cedula para modificar el equipo");
                            buscar = cp.readLine();
                            m.modificar_Equipo_computo(lista_computo, buscar, lista_ing);
                            ex.exportarArchivo_computador(lista_computo);
                            break;

                        case 3:    
                            System.out.println("Ingrese el serial o cedula a buscar: ");
                            buscar = cp.readLine();    
                            m.eliminar_Equipo_computo(lista_computo, buscar, lista_ing);  
                            ex.exportarArchivo_computador(lista_computo);              
                            break;

                        case 4:  
                            System.out.println("Ingrese el serial o cedula a buscar: ");
                            buscar = cp.readLine();
                            m.buscar_equipo_computo(lista_computo, buscar, lista_ing);
                            break;

                        case 5:                           
                            break;
                    
                        default:
                            System.out.println("Ingrese una opcion valida");
                            break;
                    }
                    } while (opc != 5);
                    break;
                

                case 2:
                    do {
                        System.out.println("\t-------Estudiante De Diseño-------\n"
                    +"1. Registrar Prestamo De Equipo\n"
                    +"2. Modificar Prestamo De Equipo\n"
                    +"3. Devolucion De Equipo\n" 
                    +"4. Buscar Equipo\n"
                    +"5. Volver Al Menu Anterior\n\n"
                    +"Digite La Opcion Deseada: "); 
                    
                    try {
                        opc = Integer.parseInt(cp.readLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Ingrese una opcion valida: ");
                        continue;
                    }
                    
                    switch (opc) {
                        case 1:    
                            lista_dis = m.LlenarListaDis(lista_dis);   
                            lista_tabletas = m.llenar_equipo_tableta(lista_tabletas, lista_dis); 
                            ex.exportarArchivo_Dis(lista_dis);
                            ex.exportarArchivo_tableta(lista_tabletas);
                            break; 

                        case 2:
                            System.out.println("Ingrese el serial o la cedula para modificar el equipo");
                            buscar = cp.readLine(); 
                            m.modificar_Equipo_tableta(lista_tabletas, buscar, lista_dis); 
                            break;

                        case 3:     
                            System.out.println("Ingrese el serial o cedula a buscar: ");
                            buscar = cp.readLine();         
                            m.eliminar_Equipo_tableta(lista_tabletas, buscar, lista_dis);
                            break;

                        case 4:   
                            System.out.println("Ingrese el serial o cedula a buscar: ");
                            buscar = cp.readLine();
                            m.buscar_equipo_tableta(lista_tabletas, buscar, lista_dis);                  
                            break;

                        case 5:                           
                            break;
                    
                        default:
                            System.out.println("Ingrese una opcion valida:");
                            break;
                        } 
                    } while (opc!= 5);
                    break;

                case 3:
                    System.out.println("\t----Lista estudiantes Ingenieria----");
                    m.Mostrar_lista_estudiante_ing(lista_ing); 

                    System.out.println("\t----Lista Equipos Computo----");
                    m.Mostrar_lista_computador(lista_computo);

                    System.out.println("\t----Lista estudiantes Diseño----");
                    m.Mostrar_lista_estudiante_dis(lista_dis);

                    System.out.println("\t----Lista Equipos Tableta----");
                    m.Mostrar_lista_tableta(lista_tabletas);
                                    
                    break;
                    
                case 0:
                    break;

                default:
                    System.out.println("Operacion invalida intente nuevamente");
                    break;
            }
        } while (opc != 0);
    }

}
