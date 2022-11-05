
import java.util.Scanner;

public class Main {
    
    static int tope = 0;
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        boolean cerrar = false;
        int menu;
        Musico[] musicos = new Musico[100];
      
        

        while (!cerrar) {  
            System.out.println("GESICAL - Sistema de GEStión musICAL");
            System.out.println("    Menú Principal");
            System.out.println("===============================");
            System.out.println("1.- Registrar Solista");
            System.out.println("2.- Registrar Banda");
            System.out.println("3.- Registrar Canción");
            System.out.println("4.- Registrar Disco");
            System.out.println("5.- Registro Masivo - Datos de Prueba");
            System.out.println("6.- Consultas");
            System.out.println();
            System.out.println("9.- Cerrar la aplicación");
            System.out.println();
            System.out.println("Ingrese una opción:");
            
            menu = scan.nextInt();
            
            switch (menu) {
                case 1 -> CargarMusico(musicos, CargarSolista());
                case 2 -> CargarMusico(musicos,CargarBanda());
                case 3 -> CargarCancion();
                case 4 -> CargarDisco();
                case 5 -> {
                    CargarMusico(musicos, CargarSolista());
                    CargarMusico(musicos, CargarBanda());
                    CargarCancion();
                    CargarDisco();
                }
                case 6 -> MenuConsultar(musicos);
                case 9 -> cerrar = true;
                default -> System.out.println("Seleccione la opcion correcta");
            }
        }
    }
    
    private static Solista CargarSolista()
    {    
        Scanner scan = new Scanner(System.in);    
        System.out.println("Apellido:");
        String apellido = scan.next();        
        System.out.println("Nombre:");
        String nombre = scan.next();        
        System.out.println("Nacionalidad:");
        String nacionalidad = scan.next();   
        System.out.println("Instrumento:");
        String instrumento = scan.next(); 
        System.out.println("Género:");
        String genero = scan.next();
        System.out.println("Año de Inicio:");
        int anioOficial = scan.nextInt();
        System.out.println("Discografica:");
        String discografica = scan.next();

        
        Solista solista;
        solista = new Solista(genero, anioOficial, discografica, apellido, nombre, nacionalidad, instrumento);
        return solista;        
    }  
            
    private static Banda CargarBanda() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Título:");
        String titulo = scan.next();
        System.out.println("Integrantes:");
        String solistas = scan.next();
        System.out.println("Género:");
        String genero = scan.next();
        System.out.println("Año de Inicio:");
        int anioOficial = scan.nextInt();
        System.out.println("Discográfica:");
        String discografica = scan.next();

        Banda banda = new Banda(titulo, genero,anioOficial, discografica);
        return banda;

    }
    
      private static Cancion CargarCancion() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nombre de la Canción:");
        String nombre = scan.next();
        System.out.println("Duración:");
        int duracion = scan.nextInt();

        Cancion cancion = new Cancion(nombre, duracion);
        return cancion;

    }

    private static Disco CargarDisco() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Año de Edición:");
        int anioEdicion = scan.nextInt();
        System.out.println("Titulo:");
        String titulo = scan.next();
        System.out.println("Canciones:");
        String canciones = scan.next();

        Disco disco = new Disco(anioEdicion, titulo, canciones);
        return disco;

    }


    private static void CargarMusico(Musico[] musicos, Musico musico) {
        musicos[tope++] = musico;
        Esperar();
    }

    private static void MenuConsultar(Musico[] musico) {
        Scanner scan = new Scanner(System.in);
        boolean cerrar = false;
        int menu;
        
        while (!cerrar) {              
            System.out.println("GESICAL - Sistema de GEStión musICAL");
            System.out.println("Consultas");
            System.out.println("==================================");
            System.out.println("a.- Discos que duran más de X segundos");
            System.out.println("b.- Playlist por género musical");
            System.out.println("c.- Borrar discos según año de edición");
            System.out.println("d.- Listar discos por banda"); 
            System.out.println();
            System.out.println("z.- Volver al menú anterior");
            System.out.println();
            System.out.println("Ingrese una opción:");            
            menu = scan.nextInt();        
            
            switch (menu) {
                case 1 -> {
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 9 -> cerrar = true;
                default -> System.out.println("Seleccione la opcion correcta");
            }
        }
    }

    private static void Esperar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Presione una tecla para continuar...");
        scan.next();
    }

}    
