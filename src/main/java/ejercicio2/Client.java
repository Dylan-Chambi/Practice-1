package ejercicio2;

public class Client {

    public static void main(String[] args) {
        System.out.println("-------------------Docente 1-------------------");
        Docente docente1 = new Docente();
        docente1.setNombre("Jorge");
        docente1.setApellido("Zaldivar");
        docente1.setSueldo(5000);
        docente1.setCargaHoraria(80);
        docente1.setCursoEducacionSuperior(true);
        docente1.setAccesoPlataforma(true);
        docente1.setMarcadoBiometrico(false);
        docente1.setMarcadoHoraEntrada("08:00");
        docente1.setMarcadoHoraSalida("18:00");
        docente1.showInfo();

        System.out.println("-------------------Docente 2-------------------");
        Docente docente2 = docente1.clone();
        docente2.setNombre("Carlos");
        docente2.setApellido("Hernandez");
        docente2.showInfo();

        System.out.println("-------------------Docente 3-------------------");
        Docente docente3 = docente1.clone();
        docente3.setNombre("Juan");
        docente3.setApellido("Perez");
        docente3.showInfo();

        System.out.println("-------------------Docente 4-------------------");
        Docente docente4 = docente1.clone();
        docente4.setNombre("Carlos4");
        docente4.setApellido("Ramirez4");
        docente4.showInfo();

        System.out.println("-------------------Docente 5-------------------");
        Docente docente5 = docente1.clone();
        docente5.setNombre("Carlos5");
        docente5.setApellido("Ramirez5");
        docente5.showInfo();

        System.out.println("-------------------Docente 6-------------------");
        Docente docente6 = docente1.clone();
        docente6.setNombre("Carlos6");
        docente6.setApellido("Ramirez6");
        docente6.showInfo();

        System.out.println("-------------------Docente 7-------------------");
        Docente docente7 = docente1.clone();
        docente7.setNombre("Carlos7");
        docente7.setApellido("Ramirez7");
        docente7.showInfo();

        System.out.println("-------------------Docente 8-------------------");
        Docente docente8 = docente1.clone();
        docente8.setNombre("Carlos8");
        docente8.setApellido("Ramirez8");
        docente8.showInfo();

        System.out.println("-------------------Docente 9-------------------");
        Docente docente9 = docente1.clone();
        docente9.setNombre("Carlos9");
        docente9.setApellido("Ramirez9");
        docente9.showInfo();

        System.out.println("-------------------Docente 10-------------------");
        Docente docente10 = docente1.clone();
        docente10.setNombre("Carlos10");
        docente10.setApellido("Ramirez10");
        docente10.showInfo();

        System.out.println("-------------------Docente 11-------------------");
        Docente docente11 = docente1.clone();
        docente11.setNombre("Carlos11");
        docente11.setApellido("Ramirez11");
        docente11.showInfo();

        System.out.println("-------------------Docente 12-------------------");
        Docente docente12 = docente1.clone();
        docente12.setNombre("Carlos12");
        docente12.setApellido("Ramirez12");
        docente12.showInfo();

        System.out.println("-------------------Docente 13-------------------");
        Docente docente13 = docente1.clone();
        docente13.setNombre("Carlos13");
        docente13.setApellido("Ramirez13");
        docente13.showInfo();

        System.out.println("-------------------Docente 14-------------------");
        Docente docente14 = docente1.clone();
        docente14.setNombre("Carlos14");
        docente14.setApellido("Ramirez14");
        docente14.showInfo();

        System.out.println("-------------------Docente 15-------------------");
        Docente docente15 = docente1.clone();
        docente15.setNombre("Carlos15");
        docente15.setApellido("Ramirez15");
        docente15.showInfo();


    }
}
