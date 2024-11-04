import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class metodos {

    BufferedReader cp = new BufferedReader (new InputStreamReader (System.in)); 
    String cedula, serial, nombre, apellido, telefono, marca, mod_estudio;
    int semestre, cant_materias;
    double Promedio_acumulado, tamaño, precio, peso;
    
    public LinkedList<estudiante_ing> LlenarListaIng(LinkedList<estudiante_ing> lista_ing)throws IOException{
        
        boolean continuar = true;

        while(continuar){

            estudiante_ing obj_Estudiante_ing = new estudiante_ing();
            //Ingreso de la cedula
            System.out.println("Ingrese la cedula del estudiante de ingenieria: ");
            while (true) { //Control para que no esta vacio y para que tengo un numero de caracteres entre 8 y 10
                cedula = cp.readLine();
                if ((cedula != null && !cedula.trim().isEmpty()) && (cedula.length()>7 && cedula.length()<11)) {
                    obj_Estudiante_ing.setCedula(cedula);
                    break;
                } else{
                    System.out.println("La cédula debe contener solo números y tener entre 8 y 10 dígitos:");
                }
            }

            //Ingreso de serial
            System.out.println("Ingrese su serial: "); 
            while (true) {
                serial = cp.readLine();
                if (serial != null && !serial.trim().isEmpty()) {
                    obj_Estudiante_ing.setSerial(serial);
                    break;
                } else {
                    System.out.println("El serial no puede estar vacio:");
                }
            }

            //control para evitar cedualas y seriales duplicados 
            if (Duplicado_ing(lista_ing, cedula, serial)) {
                System.out.println("Error: La cédula o el serial ya existen en la lista. Ingrese valores únicos.");
                continue; 
            }

            //Ingreso nombre
            System.out.println("Ingrese el nombre del estudiante de ingenieria: ");
            while (true) { //Control para evitar que esta vacio
                nombre = cp.readLine();
                if (nombre != null && !nombre.trim().isEmpty()) {
                    obj_Estudiante_ing.setNombre(nombre);
                    break;
                } else {
                    System.out.println("El nombre no puede estar vacio:");
                }
            }
            //Ingreso del apellido
            System.out.println("Ingrese el apellido del estudiante de ingenieria: ");
            while (true) {// control para evitar que este vacio
                apellido = cp.readLine();
                if (apellido != null && !apellido.trim().isEmpty()) {
                    obj_Estudiante_ing.setApellido(apellido);
                    break;
                } else {
                    System.out.println("El apellido no puede estar vacio:");
                }
            }
            //Ingreso del telefono
            System.out.println("Ingrese el telefono del estudiante de ingenieria: "); 
            while (true) { //Control para evitar que este vacio y tenga 10 digitos
                telefono = cp.readLine();
                if ((telefono != null && !telefono.trim().isEmpty()) && (telefono.length()>9 && telefono.length()<11)) {
                    obj_Estudiante_ing.setTelefono(telefono);
                    break;
                } else {
                    System.out.println("El telefono no puede estar vacio:");
                }
            }
            //Ingreso del numero de semestre
            System.out.println("Ingrese el número del semestre que esta cursando: ");
            while (true) {
                try {
                    semestre = Integer.parseInt(cp.readLine());
                    if (semestre > 0 && semestre < 20) {
                        obj_Estudiante_ing.setNum_semestre(semestre);
                        break;
                    }else{
                        System.out.println("Ingrese un numero valido: ");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ingrese un numero valido para el numero de semestre cursado: ");
                }            
            }    
            //Ingreso del promedio
            System.out.println("Ingrese el promedio del semestre acumulado: ");
            while (true) {
                try {
                    Promedio_acumulado = Double.parseDouble(cp.readLine());
                    if (Promedio_acumulado <= 5 && Promedio_acumulado>= 0) {
                        obj_Estudiante_ing.setPromedio_acumulado(Promedio_acumulado);
                        break;
                    } else {
                        System.out.println("Ingrese un numero valido");                     
                    }
                } catch (NumberFormatException e) {
                    System.out.println("El promedio de los semestres debe ser un número");
                }
            }
            
            lista_ing.add(obj_Estudiante_ing);
            continuar = false;
        }
        return lista_ing;
    }

    public void Mostrar_lista_estudiante_ing(LinkedList<estudiante_ing>lista_ing){
        for (estudiante_ing estudiante_ing : lista_ing) {
            
            System.out.println("El nombre del estudiante es: " + estudiante_ing.getNombre());
            System.out.println("El apellido del estudiante es: " +estudiante_ing.getApellido());
            System.out.println("La cedula del estudiante es: " +estudiante_ing.getCedula());
            System.out.println("El número del estudiante es: " +estudiante_ing.getTelefono());
            System.out.println("El número del semestre que esta cursando es: " +estudiante_ing.getNum_semestre());
            System.out.println("El promedio actual de los semestres es:" +estudiante_ing.getPromedio_acumulado());
            System.out.println("El serial del estudiante es: " +estudiante_ing.getSerial());
        }
    }


    public void sistema_operativo(equipo_computo obj_ing)throws IOException{
        int opc = 0;   
        boolean continuar = true;
        do {
            System.out.println("\t-------Sistema Operativo-------\n\n"
            + "1.Windows 7\n"
            + "2.Windows 10\n"
            + "3.Windows 11\n\n"
            + "Digite La Opcion Deseada");
            try {
                opc = Integer.parseInt(cp.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese una opcion valida: ");
            } 
            switch (opc) {
                case 1:                    
                    obj_ing.setSistema_operativo("Windows 7");
                    continuar = false;
                    break;
            
                case 2:              
                    obj_ing.setSistema_operativo("Windows 10");
                    continuar = false;
                    break;

                case 3:              
                    obj_ing.setSistema_operativo("Windows 11");
                    continuar = false;
                    break;

                default:
                    break;
            }
        } while (continuar != false);
    }

    public void procesador(equipo_computo obj_ing)throws IOException{
        int opc = 0;   
        boolean continuar = true;
        do {
            System.out.println("\t-------Procesador-------\n\n"
            + "1.AMD Ryzen\n"
            + "2.Intel Core i5\n\n"
            + "Digite La Opcion Deseada");
            try {
                opc = Integer.parseInt(cp.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese una opcion valida: ");
            }           
            switch (opc) {
                case 1:
                    obj_ing.setProcesador("AMD Ryzen");  
                    continuar = false;  
                    break;

                case 2:
                    obj_ing.setProcesador("Intel Core i5");
                    continuar = false;
                    break;    
                default:
                    break;
            }
        } while (continuar != false);
    }

    public LinkedList<equipo_computo> llenar_equipo_computo(LinkedList<equipo_computo> lista_computo,LinkedList<estudiante_ing>lista_ing)throws IOException{
        
        boolean continuar = true;

        while (continuar) {
            equipo_computo obj_Computo = new equipo_computo();
            obj_Computo.setSerial(lista_ing.getLast().getSerial());
            //Ingreso marca
            System.out.println("Ingrese la marca del portatil: ");
            while (true) {//Control para evitar que este vacio
                marca = cp.readLine();
                if (marca != null && !marca.trim().isEmpty()) {
                    obj_Computo.setMarca(marca);
                    break;
                } else {
                    System.out.println("La marca no puede estar vacia:");
                }
            }
            //Ingreso del tamaño
            System.out.println("Ingrese el tamaño (en cm): ");
            while (true) {
                try {
                    tamaño = Double.parseDouble(cp.readLine());
                    if (tamaño <= 50 && tamaño>= 25) {
                        obj_Computo.setTamaño(tamaño);
                        break;
                    } else {
                        System.out.println("Ingrese un numero valido");                     
                    }
                } catch (NumberFormatException e) {
                    System.out.println("El tamaño debe ser un número");
                }
            }
            //Ingreso del precio
            System.out.println("Ingrese el precio del portatil: ");
            while (true) {
                try {
                    precio = Double.parseDouble(cp.readLine());
                    if (precio <= 7000000 && precio>= 900000) {
                        obj_Computo.setPrecio(precio);
                        break;
                    } else {
                        System.out.println("Ingrese un numero valido");                     
                    }
                } catch (NumberFormatException e) {
                    System.out.println("El precio debe ser un número");
                }
            } 
            sistema_operativo(obj_Computo);
            procesador(obj_Computo);

            lista_computo.add(obj_Computo);
            continuar = false;
        }
        return lista_computo;
    }

    public void Mostrar_lista_computador(LinkedList<equipo_computo> lista_computo){
        for (equipo_computo computador: lista_computo) {
            
            System.out.println("El serial asociado al computador es: " + computador.getSerial());
            System.out.println("La marca del computador es: " + computador.getMarca());
            System.out.println("El tamaño del computador es: " + computador.getTamaño());
            System.out.println("El precio del computador es: " + computador.getPrecio());
            System.out.println("El sistema operativo del computador es: " + computador.getSistema_operativo());
            System.out.println("El procesador del computador es: " + computador.getProcesador() );
        }
    }

    public equipo_computo buscar_equipo_computo (LinkedList <equipo_computo> lista_computo , String buscar, LinkedList<estudiante_ing>lista_ing)throws IOException{

        equipo_computo  obj_computo = new equipo_computo();
        for (estudiante_ing estudiante_ing : lista_ing) {
            if (estudiante_ing.getCedula().equalsIgnoreCase(buscar)||estudiante_ing.getSerial().equalsIgnoreCase(buscar)) {
                for (equipo_computo equipo_computo : lista_computo) {
                    if(equipo_computo.getSerial().equalsIgnoreCase(estudiante_ing.getSerial())){
                    Mostrar_lista_estudiante_ing(lista_ing);
                    Mostrar_lista_computador(lista_computo);
                }      
            }
        }else{
            System.out.println("No hay equipo registrado");
        }
    }
        return obj_computo;
    }

    public equipo_computo modificar_Equipo_computo (LinkedList <equipo_computo> lista_computo , String buscar, LinkedList<estudiante_ing>lista_ing)throws IOException{
        
        for (estudiante_ing estudiante_ing : lista_ing) {
            if (estudiante_ing.getCedula().equalsIgnoreCase(buscar)||estudiante_ing.getSerial().equalsIgnoreCase(buscar)) {
                for (equipo_computo equipo_computo : lista_computo) {
                    if(equipo_computo.getSerial().equalsIgnoreCase(estudiante_ing.getSerial())){
                        //Ingreso marca
                        System.out.println("Ingrese la marca del portatil: ");
                        while (true) {//Control para evitar que este vacio
                            marca = cp.readLine();
                            if (marca != null && !marca.trim().isEmpty()) {
                                equipo_computo.setMarca(marca);
                                break;
                            } else {
                            System.out.println("La marca no puede estar vacia:");
                            }
                        }
                        //Ingreso del tamaño
                        System.out.println("Ingrese el tamaño (en cm): ");
                        while (true) {
                            try {
                                tamaño = Double.parseDouble(cp.readLine());
                                if (tamaño <= 50 && tamaño>= 25) {
                                    equipo_computo.setTamaño(tamaño);
                                    break;
                                } else {
                                    System.out.println("Ingrese un numero valido");                     
                                }
                            } catch (NumberFormatException e) {
                            System.out.println("El tamaño debe ser un número");
                            }
                        }
                        //Ingreso del precio
                        System.out.println("Ingrese el precio del portatil: ");
                        while (true) {
                            try {
                                precio = Double.parseDouble(cp.readLine());
                                if (precio <= 7000000 && precio>= 900000) {
                                    equipo_computo.setPrecio(precio);
                                    break;
                                } else {
                                    System.out.println("Ingrese un numero valido");                     
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("El precio debe ser un número");
                            }
                        } 
                        sistema_operativo(equipo_computo);
                        procesador(equipo_computo);
                        System.out.println("El equipo se modifico con exito ");
                        return equipo_computo;
                    }
                }
            }else{
                System.out.println("No hay equipo registrado");
            }
        }
        return null;
    }

    public equipo_computo eliminar_Equipo_computo (LinkedList <equipo_computo> lista_computo , String buscar, LinkedList<estudiante_ing>lista_ing)throws IOException{
        
        for (estudiante_ing estudiante_ing : lista_ing) {
            if (estudiante_ing.getCedula().equalsIgnoreCase(buscar)||estudiante_ing.getSerial().equalsIgnoreCase(buscar)) {
                for (equipo_computo equipo_computo : lista_computo) {
                    if(equipo_computo.getSerial().equalsIgnoreCase(estudiante_ing.getSerial())){
                        equipo_computo.setMarca(null);
                        equipo_computo.setTamaño(0);
                        equipo_computo.setPrecio(0);
                        equipo_computo.setProcesador(null);
                        equipo_computo.setSistema_operativo(null);
                        System.out.println("El equipo se elimino con exito ");
                        return equipo_computo;
                    }
                }
            }else{
                System.out.println("No hay equipo registrado");
            }
        }
        return null;
    }




// Metodos Para los estudiantes de diseño

    public LinkedList<estudiante_dis> LlenarListaDis(LinkedList<estudiante_dis> lista_dis)throws IOException{
        
        boolean continuar = true;

        while(continuar){

            estudiante_dis obj_Estudiante_dis = new estudiante_dis();
            System.out.println("Ingrese la cedula del estudiante de diseño: ");
            while (true) {
                cedula = cp.readLine();
                if (cedula != null && !cedula.trim().isEmpty()) {
                    obj_Estudiante_dis.setCedula(cedula);
                    break;
                } else{
                    System.out.println("La cedula no puede estar vacia:");
                }
            }   
            //Ingreso serial
            System.out.println("Ingrese su serial: ");   
            while (true) {
                serial = cp.readLine();
                if (serial != null && !serial.trim().isEmpty()) {
                    obj_Estudiante_dis.setSerial(serial);
                    break;
                }else{
                    System.out.println("El serial no puede estar vacio: ");
                }
            }
            if (Duplicado_dis(lista_dis, cedula, serial)) {
                System.out.println("Error: La cédula o el serial ya existen en la lista. Ingrese valores únicos.");
                continue; 
            }

            //Ingreso nombre
            System.out.println("Ingrese el nombre del estudiante de diseño: ");
            while (true) {
                nombre = cp.readLine();
                if (nombre != null && !nombre.trim().isEmpty()) {
                    obj_Estudiante_dis.setNombre(nombre);
                    break;
                } else{
                    System.out.println("El nombre no puede estar vacio:");
                }
            }
            //Ingreso apellido
            System.out.println("Ingrese el apellido del estudiante de diseño: ");
            while (true) {
                apellido = cp.readLine();
                if (apellido != null && !apellido.trim().isEmpty()) {
                    obj_Estudiante_dis.setApellido(apellido);
                    break;
                } else{
                    System.out.println("El apellido no puede estar vacio:");
                }
            }
            //Ingreso telefono
            System.out.println("Ingrese el telefono del estudiante de diseño: "); 
            while (true) { //Control para evitar que este vacio y tenga 10 digitos
                telefono = cp.readLine();
                if ((telefono != null && !telefono.trim().isEmpty()) && (telefono.length()>9 && telefono.length()<11)) {
                    obj_Estudiante_dis.setTelefono(telefono);
                    break;
                } else {
                    System.out.println("El telefono no puede estar vacio:");
                }
            } 
            //Ingreso de la modalidad de estudio
            System.out.println("Ingrese la modalidad de estudio: ");
            while (true) {
                mod_estudio = cp.readLine();
                if (mod_estudio.equalsIgnoreCase("Presencial") || mod_estudio.equalsIgnoreCase("Virtual")) {
                    obj_Estudiante_dis.setMod_estudio(mod_estudio);
                    break;
                } else {
                    System.out.println("Ingrese si es Presencial o Virtual");
                }
            }
            //Ingreso de la cantidad de materias
            System.out.println("Ingrese la cantidad de materias que esta viendo: ");
            while (true) {
                try {
                    cant_materias = Integer.parseInt(cp.readLine());
                    if (cant_materias >= 0 && cant_materias <= 8) {
                        obj_Estudiante_dis.setCant_materias(cant_materias);
                        break;
                    } else {
                        System.out.println("Ingrese una cantidad de materias validas: ");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ingrese un numero: ");
                }
            }

            lista_dis.add(obj_Estudiante_dis);
            continuar = false;
        }
        return lista_dis;
    }

    public void Mostrar_lista_estudiante_dis(LinkedList<estudiante_dis>lista_dis){
        for (estudiante_dis estudiante_dis : lista_dis) {
            
            System.out.println("El nombre del estudiante es: " + estudiante_dis.getNombre());
            System.out.println("El apellido del estudiante es: " +estudiante_dis.getApellido());
            System.out.println("La cedula del estudiante es: " +estudiante_dis.getCedula());
            System.out.println("El número del estudainte es: " +estudiante_dis.getTelefono());
            System.out.println("La modalidad de estudio del estudiante es: "+estudiante_dis.getMod_estudio() );
            System.out.println("La cantidad de materias que esta viendo es: "+estudiante_dis.getCant_materias() );
            System.out.println("El serial del estudiante es: " +estudiante_dis.getSerial());
        }
    }

    public void Almacenamiento(equipo_tableta obj_dis)throws IOException{
        int opc = 0;   
        boolean continuar = true;
        do {
            System.out.println("\t-------Almacenamiento-------\n\n"
            + "1.256 GB\n"
            + "2.512 GB\n"
            + "3.1 TB\n\n" 
            + "Digite La Opcion Deseada");
            try {
                opc = Integer.parseInt(cp.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese una opcion valida: ");
            }           
            switch (opc) {
                case 1:
                    obj_dis.setAlmacenamiento("256 GB");
                    continuar = false;  
                    break;

                case 2:
                    obj_dis.setAlmacenamiento("512 GB");
                    continuar = false;
                    break;  
                    
                case 3:
                    obj_dis.setAlmacenamiento("1 TB");
                    continuar = false;
                    break;
                default:
                    break;
            }
        } while (continuar != false);
    }

    public LinkedList<equipo_tableta> llenar_equipo_tableta(LinkedList<equipo_tableta> lista_tabletas, LinkedList<estudiante_dis> lista)throws IOException{

        boolean continuar = true;

        while (continuar) {
            
            equipo_tableta obj_tableta = new equipo_tableta();
            obj_tableta.setSerial(lista.getLast().getSerial());
            System.out.println("Ingrese la marca de la tableta grafica: ");
            while (true) {
                marca= cp.readLine();
                if (marca != null && !marca.trim().isEmpty()) {
                    obj_tableta.setMarca(marca);
                    break;
                } else {
                    System.out.println("Ingrese una marca de tableta digital: ");
                }
            }
            System.out.println("Ingrese el tamaño: ");
            while (true) {
                try {
                    tamaño = Double.parseDouble(cp.readLine());
                    if (tamaño >= 30 && tamaño <= 70) {
                        obj_tableta.setTamaño(tamaño);
                        break;
                    } else {
                        System.out.println("Ingrese un tamaño valido: ");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ingrese un numero valido:");
                }
            }
            System.out.println("Ingrese el precio: ");
            while (true) {
                try {
                    precio = Double.parseDouble(cp.readLine());
                    if (precio >=900000 && precio <= 7000000) {
                        obj_tableta.setPrecio(precio);
                        break;    
                    } else {
                        System.out.println("Ingrese un valor valido:");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ingrese un numero valido: ");
                }
            }
            Almacenamiento(obj_tableta);
            System.out.println("Ingrese el peso de la tableta (en kilogramos): ");
            while (true) {
                try { 
                    peso = Double.parseDouble(cp.readLine());
                    if (peso > 0.2 && peso < 5) {
                        obj_tableta.setPeso(peso);
                        break;
                    } else {
                        System.out.println("Ingrese un peso valido: ");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ingrese un numero valido: ");
                }
            }

            lista_tabletas.add(obj_tableta);
            continuar = false;
        }
        return lista_tabletas;
    }

    public void Mostrar_lista_tableta(LinkedList<equipo_tableta> lista_tabletas){
        for (equipo_tableta tableta: lista_tabletas) {
            
            System.out.println("El serial asociado a la tableta es: " + tableta.getSerial());
            System.out.println("La marca de la tableta es: " + tableta.getMarca());
            System.out.println("El tamaño de la tableta es: " + tableta.getTamaño());
            System.out.println("El precio de la tableta es: " + tableta.getPrecio());
            System.out.println("El almacenamiento de la tableta es: " + tableta.getAlmacenamiento());
            System.out.println("El peso de la tableta es: " + tableta.getPeso());
        }
    }
    
    public equipo_computo buscar_equipo_tableta (LinkedList <equipo_tableta> lista_tableta , String buscar, LinkedList<estudiante_dis>lista_dis)throws IOException{

        equipo_computo  obj_computo = new equipo_computo();
        for (estudiante_dis estudiante_dis : lista_dis) {
            if (estudiante_dis.getCedula().equalsIgnoreCase(buscar)||estudiante_dis.getSerial().equalsIgnoreCase(buscar)) {
                for (equipo_tableta equipo_tableta : lista_tableta) {
                    if(equipo_tableta.getSerial().equalsIgnoreCase(estudiante_dis.getSerial())){
                        Mostrar_lista_estudiante_dis(lista_dis);
                        Mostrar_lista_tableta(lista_tableta);
                    }
                }
            }else{
                System.out.println("No hay equipo registrado");
            }       
        }
        return obj_computo;
    }

    public equipo_tableta modificar_Equipo_tableta (LinkedList <equipo_tableta> lista_tableta , String buscar, LinkedList<estudiante_dis>lista_dis)throws IOException{
        
        for (estudiante_dis estudiante_dis : lista_dis) {
            if (estudiante_dis.getCedula().equalsIgnoreCase(buscar)||estudiante_dis.getSerial().equalsIgnoreCase(buscar)) {
                for (equipo_tableta equipo_tableta : lista_tableta) {
                    if(equipo_tableta.getSerial().equalsIgnoreCase(estudiante_dis.getSerial())){
                        System.out.println("Ingrese la marca de la tableta grafica: ");
                        while (true) {
                            marca= cp.readLine();
                            if (marca != null && !marca.trim().isEmpty()) {
                                equipo_tableta.setMarca(marca);
                                break;
                            } else {
                                System.out.println("Ingrese una marca de tableta digital: ");
                            }
                        }
                        System.out.println("Ingrese el tamaño: ");
                        while (true) {
                            try {
                                tamaño = Double.parseDouble(cp.readLine());
                                if (tamaño >= 30 && tamaño <= 70) {
                                    equipo_tableta.setTamaño(tamaño);
                                    break;
                                } else {
                                    System.out.println("Ingrese un tamaño valido: ");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Ingrese un numero valido:");
                            }
                        }
                        System.out.println("Ingrese el precio: ");
                        while (true) {
                            try {
                                precio = Double.parseDouble(cp.readLine());
                                if (precio >=900000 && precio <= 7000000) {
                                    equipo_tableta.setPrecio(precio);
                                    break;    
                                } else {
                                    System.out.println("Ingrese un valor valido:");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Ingrese un numero valido: ");
                            }
                        }
                        Almacenamiento(equipo_tableta);
                        System.out.println("Ingrese el peso de la tableta (en kilogramos): ");
                        while (true) {
                            try { 
                                peso = Double.parseDouble(cp.readLine());
                                if (peso > 0.2 && peso < 5) {
                                    equipo_tableta.setPeso(peso);
                                    break;
                                } else {
                                    System.out.println("Ingrese un peso valido: ");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Ingrese un numero valido: ");
                            }
                        }
                        return equipo_tableta;
                    }
                }
            }else{
                System.out.println("No hay equipo registrado");
            }
        }
        return null;
    }

    public equipo_tableta eliminar_Equipo_tableta (LinkedList <equipo_tableta> lista_tableta , String buscar, LinkedList<estudiante_dis>lista_dis)throws IOException{
        
        for (estudiante_dis estudiante_dis : lista_dis) {
            if (estudiante_dis.getCedula().equalsIgnoreCase(buscar)||estudiante_dis.getSerial().equalsIgnoreCase(buscar)) {
                for (equipo_tableta equipo_tableta : lista_tableta) {
                    if(equipo_tableta.getSerial().equalsIgnoreCase(estudiante_dis.getSerial())){
                        equipo_tableta.setMarca(null);
                        equipo_tableta.setTamaño(0);
                        equipo_tableta.setPrecio(0);
                        equipo_tableta.setAlmacenamiento(null);
                        equipo_tableta.setPeso(0);
                        System.out.println("El equipo se elimino con exito ");
                        return equipo_tableta;
                    }
                }
            }else{
                System.out.println("No hay equipo registrado");
            }
        }
        return null;
    }

    //Metodo para evitar que se repitan los seriales y las cedulas
    public boolean Duplicado_ing(LinkedList<estudiante_ing> lista, String cedula, String serial) {
        for (estudiante_ing estudiante : lista) {
            if (estudiante.getCedula().equals(cedula) || estudiante.getSerial().equals(serial)) {
                return true; 
            }
        }
        return false; 
    }

    public boolean Duplicado_dis(LinkedList<estudiante_dis> lista, String cedula, String serial) {
        for (estudiante_dis estudiante : lista) {
            if (estudiante.getCedula().equals(cedula) || estudiante.getSerial().equals(serial)) {
                return true; 
            }
        }
        return false; 
    }
}