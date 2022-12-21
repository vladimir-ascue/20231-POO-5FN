public class PrincipalSwitch {
    public static void main(String[] args) {
        int dia = 6;
        switch ( dia ) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Lunes"); break;
            case 3: System.out.println("Martes"); break;
            case 4: System.out.println("Miercoles"); break;
            case 5: System.out.println("Jueves"); break;
            case 6: System.out.println("Viernes"); break;
            case 7: System.out.println("Sabado"); break;
            default:
                System.out.println("El numero ingresado no corresponde a ningún día");
                break;
        }

        String mes = "Enero";
        switch ( mes ) {
            case "Enero": System.out.println("Enero es el mes mas chvr porque me quede misio"); break;
            case "Febrero": System.out.println(2); break;
            case "Marzo": System.out.println(3); break;
            case "Abril": System.out.println(4); break;
            default:
                System.out.println("El mes ingresado no existe");
                break;
        }
        int a=0;

    }
}
