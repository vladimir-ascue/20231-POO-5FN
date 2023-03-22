import java.util.*;
public class PrincipalClases {
    private static List<Object> flores = new ArrayList<Object>();
    private static List<Object> clientes = new ArrayList<Object>();
    private static List<CVendedor> vendedores = new ArrayList<CVendedor>();
    private static List<CVenta> ventas = new ArrayList<CVenta>();
    private static List<CDetalleVenta> detalleVenta = new ArrayList<CDetalleVenta>();
    public static void mostrarFlores(List<Object> flores){
        System.out.println("NOMBRE\t\tAROMA\t\t\tCOLOR\t\tPRECIO");
        for (Object flor: flores) {
            CFlor fl = (CFlor) flor;
            System.out.println(fl.getNombre()+"\t\t"+
                               fl.getAroma()+"\t\t"+
                               fl.getColor()+"\t\t"+
                               fl.getPrecio());
        }
    }

    public static void mostrarDetalleVenta(int idVenta){
        System.out.println("tID\tIDV\tIDP\tCant\tDes\tPre");
        for (CDetalleVenta dv: detalleVenta) {
            if(dv.getIdVenta()==idVenta)
                dv.mostrarLista();
        }
    }

    public static void mostrarFlor(String nombre, String color, List<Object> objetos){
        Object obj = objetos.get(0);
        if (obj instanceof CFlor)
            for (Object f : objetos) {
                CFlor fl = (CFlor) f; // Casting de datos
                if (fl.getNombre().equals(nombre) && fl.getColor().equals(color)) {
                    fl.mostrar();
                }
            }
        else if (obj instanceof CCliente)
            for (Object f: objetos) {
                CCliente fl = (CCliente) f;
                if(fl.getNombres().equals(nombre) && fl.getApellidos().equals(color)){
                    fl.mostrar();
                }
            }
    }

    public static void mostrarClientes(){
        for (Object obj:clientes) {
            CCliente cc = (CCliente) obj;
            cc.mostrar();
        }
    }

    public static void menuPrincipal(){
        System.out.println("*********** MENU PRINCIPAL ***********");
        System.out.println("0- Salir");
        System.out.println("1- Gestionar Flores.");
        System.out.println("2- Gestionar Clientes.");
        System.out.println("3- Gestionar Vendedores.");
        System.out.println("4- Gestionar Ventas.");
        System.out.println("   Ingrese una opcion>>  ");
    }
    public static void menuFlores(){
        System.out.println("*********** MENU FLORES ***********");
        System.out.println("0- Salir.");
        System.out.println("1- (C) Crear (Create).");
        System.out.println("2- (R) Mostrar (Read).");
        System.out.println("3- (U) Actualizar (update).");
        System.out.println("4- (D) Eliminar (Delete).");
        System.out.println("   Ingrese una opcion>>  ");
    }

    public static int menuVentas(){
        System.out.println("0- Regresar al menu anterior.");
        System.out.println("1- Registrar nueva venta.");
        System.out.println("2- Anular venta.");
        System.out.println("3- Reporte de ventas.");
        System.out.print("   >> Ingrese una opción: ");
        return new Scanner(System.in).nextInt();
    }

    public static Boolean buscarDNI(String dni){
        Boolean flag = false;
        int cont = 0;
        do {
            CCliente c = (CCliente) clientes.get(cont);
            if (c.getNumDocumento().equals(dni))
                flag = true;
            cont++;
        }while (!flag);
        return flag;
    }

    public static String ingresarNumDocVenta(){
        System.out.print("Num Documento: ");
        return new Scanner(System.in).nextLine();
    }

    public static double descuetoGlobal(){
        System.out.print("Ingrese el monto de descuento: ");
        return new Scanner(System.in).nextDouble();
    }

    public static void main(String[] args) {
        CFlor f = new CFlor("Rosa", 25);
        f.setColor("Azul");
        f.setAroma("Dulce");
        flores.add(f);
        flores.add(new CFlor("Clavel", 25));
        flores.add(new CFlor("Orquidea", 45));
//        private String numDocumento;
//        private String tipoDocumento;
//        private String nombres;
//        private String apellidos;
//        private String correo;
//        private String tipo;
//        private String estado;
        clientes.add(new CCliente("00000001", "dni", "Francisco", "Cardenas","pancho@mail.com", "regular", "activo"));
        clientes.add(new CCliente("00000002", "dni", "jose", "Carreño","pepe@mail.com", "regular", "activo"));
        clientes.add(new CCliente("00000003", "C/E", "Carlos", "Bendezu","charly@mail.com", "VIP", "activo"));



        int opcionPrincipal;
        do{
            menuPrincipal();
            opcionPrincipal = new Scanner(System.in).nextInt();
            switch(opcionPrincipal){
                case 0:
                    System.out.println("Adios ...");
                    break;
                case 1:
                    int opcionFlores;
                    do {
                        CFlor flor;
                        menuFlores();
                        opcionFlores = new Scanner(System.in).nextInt();
                        switch (opcionFlores) {
                            case 0:
                                System.out.println("Regresando al menu Principal...");
                                break;
                            case 1:  // Insertar // Crear
                                flor = new CFlor();
                                flores.add(flor);
                                break;
                            case 2: // Mostrar
                                System.out.println("  Menu Mostrar Flor ");
                                System.out.println(" 0- Regresar al menu Flores");
                                System.out.println(" 1- Mostrar por posicion");
                                System.out.println(" 2- Mostrar por nombre y color");
                                System.out.println(" 3- Mostrar todas las flores");
                                System.out.println("   Ingrese una opcion>>  ");
                                int opcionMostrarFlores = new Scanner(System.in).nextInt();
                                switch (opcionMostrarFlores) {
                                    case 0:
                                        System.out.println(" ... Regresando al Menu Flores");
                                        break;
                                    case 1:
                                        System.out.println("Ingrese la posicion de la flor buscada: ");
                                        int posicion = new Scanner(System.in).nextInt();
                                        flores.get(posicion);
                                        break;
                                    case 2:
                                        System.out.println("Nombre: ");
                                        String n = new  Scanner(System.in).nextLine();
                                        System.out.println("Color: ");
                                        String c = new  Scanner(System.in).nextLine();
                                        mostrarFlor(n, c, flores);
                                        break;
                                    case 3:
                                        mostrarFlores(flores);
                                        break;
                                }
                                break;
                            case 3:  // Actualizar
                                System.out.println("  Menu Mostrar Flor ");
                                System.out.println(" 0- Regresar al menu Flores");
                                System.out.println(" 1- Actualizar un campo");
                                System.out.println(" 2- Actualizar todo");
                                System.out.println("   Ingrese una opcion>>  ");
                                int opcionActualizarFlor = new Scanner(System.in).nextInt();
                                switch (opcionActualizarFlor) {
                                    case 0:
                                        System.out.println(" ... Regresando al menu Flores");
                                        break;
                                    case 1:
                                        System.out.println("Ingrese la posicion a actualizar: ");
                                        int pos = new Scanner(System.in).nextInt();
                                        System.out.println("Ingrese campo que desea actualizar: ");
                                        String campo = new Scanner(System.in).nextLine();
                                        flor = (CFlor) flores.get(pos);
                                        switch (campo){
                                            case "nombre":
                                                System.out.println("Nuevo nombre: ");
                                                flor.setNombre(new Scanner(System.in).nextLine());
                                                break;
                                            case "aroma":
                                                System.out.println("Nuevo aroma: ");
                                                flor.setAroma(new Scanner(System.in).nextLine());
                                                break;
                                            case "color":
                                                System.out.println("Nuevo color: ");
                                                flor.setColor(new Scanner(System.in).nextLine());
                                                break;
                                            case "precio":
                                                System.out.println("Nuevo precio: ");
                                                flor.setPrecio(new Scanner(System.in).nextDouble());
                                                break;
                                        }
                                        break;
                                    case 2:

                                        break;
                                }
                                break;
                            case 4: // Eliminar
                                System.out.println("  Menu Mostrar Flor ");
                                System.out.println(" 0- Regresar al menu Flores");
                                System.out.println(" 1- Eliminar por posicion");
                                System.out.println(" 2- Eliminar por nombre y color");
                                System.out.println(" 3- Eliminar todas las flores");
                                System.out.println("   Ingrese una opcion>>  ");
                                break;
                            default:
                                break;
                        }
                        break;
                    } while ( opcionFlores != 0 );
                case 2:
                    // Implementar Cliente
                    break;
                case 3:
                    // Implementar Vendedor
                    break;
                case 4: // Gestionar ventas
                    int opcionVentas;
                    do{
                        opcionVentas = menuVentas();
                        switch (opcionVentas){
                            case 0:
                                System.out.println("... Regresando al menu principal.");
                                opcionVentas = 0;
                                break;
                            case 1: // Resgistrar una venta
                                String tipoDocumento;
                                do{
                                    System.out.println("Seleccione tipo de documento:");
                                    System.out.println("  (F) Factura        (B) Boleta     (*) para salir");
                                    tipoDocumento = new Scanner(System.in).nextLine(); // Factura | Boleta
                                    if(tipoDocumento.equals("F")){
                                        System.out.println("GENERANDO FACTURA");
                                    }else{
                                        if(tipoDocumento.equals("B"))
                                            System.out.println("GENERANDO BOLETA DE VENTA");
                                        else {
                                            System.out.println("Error ...");
                                            opcionVentas = 0;
                                        }
                                    }
                                } while (!tipoDocumento.equals("B") && !tipoDocumento.equals("F"));
                                System.out.println("Ingrse el DNI del clinete:");
                                String dniCliente = new Scanner(System.in).nextLine(); // 00000006

                                // Funcion existe() en cliente

                                if(buscarDNI(dniCliente))
                                    System.out.println("cliente existe");
                                else{
                                    System.out.println("cliente NO existe");
                                    System.out.println(" (N) Nuevo DNI     (A) Agregar cliente   (*) Para salir");
                                    String accion = new Scanner(System.in).nextLine(); // N | A | fjhdlkjh
                                    switch (accion){
                                        case "N":
                                            System.out.println("Ingrese el DNI del cliente:");
                                            dniCliente = new Scanner(System.in).nextLine();
                                            break;
                                        case "A":
                                            System.out.println("Registrando nuevo cliente");
                                            // Se reutiliza el insertar del CRUD
                                            break;
                                    }
                                }

                                CVenta v = new CVenta(0,
                                        tipoDocumento,
                                        ingresarNumDocVenta(),
                                        new Date(),
                                        "",
                                        dniCliente,
                                        0,
                                        0,
                                        0,
                                        "Proceso"
                                );
                                ventas.add(v);
                                mostrarFlores(flores);
                                System.out.println("Agregar flor a la venta:");
                                String agregarFlores;
//                                List<CFlor> floresVendidas = new ArrayList<CFlor>();
                                double pTotal = 0;

                                do{
                                    System.out.println("(A) Agregar flor    (T) terminar");
                                    agregarFlores = new Scanner(System.in).nextLine();
                                    if(agregarFlores.equals("A")) {
                                        System.out.print("Seleccione flor para vender:");
                                        int posFlorVenta = new Scanner(System.in).nextInt();

                                        // Pregunta cuantas quiere
                                        System.out.println("Cantidad: ");
                                        int cantidad = new Scanner(System.in).nextInt();

                                        CFlor f2 = (CFlor) flores.get(posFlorVenta);
//                                    f2.mostrar();
//                                    floresVendidas.add(f2);

                                        pTotal += f2.getPrecio() * cantidad;

                                        CDetalleVenta dv = new CDetalleVenta(
                                            0,
                                            ventas.size() - 1,
                                            flores.indexOf(f2),
                                            cantidad,
                                            0,
                                            f2.getPrecio()
                                        );
                                        detalleVenta.add(dv);
//                                        detalleVenta.get(detalleVenta.size()-1).setIdDetalleVenta(detalleVenta.indexOf(dv));
//                                        detalleVenta.get(detalleVenta.size()-1).setIdDetalleVenta(detalleVenta.size()-1);
                                        dv.setIdDetalleVenta(detalleVenta.size()-1);
                                    }
                                }while(agregarFlores.equals("A"));

//                                for (CDetalleVenta dv1:detalleVenta) {
//                                    if(dv1.getIdVenta()==ventas.size()-1){
//                                        pTotal+=dv1.getPrecio()* dv1.getCantidad();
//                                    }
//                                }

                                v.setIdVenta(ventas.size()-1);
                                v.setPrecioTotal(pTotal);
                                v.setIgv(pTotal/118);
                                v.setDescuento(descuetoGlobal());

                                v.mostrarLista();
                                mostrarDetalleVenta(v.getIdVenta());
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            default:
                                break;
                        }
                    } while( opcionVentas != 0 );
                    break;
                default:
                    break;
            }
        } while (opcionPrincipal != 0);
    }
}
