package app;

import dominio.*;

public class app {
    public static void main(String[]args){
        Empleado directo1 = new Directo("juan", 4840000);
        Empleado vendedor1= new Vendedor("julian", 2050000, 45510000);
        Empleado vendedor2 = new Vendedor(" Carolina", 98000, 35989000);
        Empleado freelance1 = new Freelance("Johanna",7100, 89);
        Empleado directo2 = new Directo("David", 3975000);
        Empleado freelance2 = new Freelance("GUSTAVO", 42500, 65);
        Nomina sistemaNomina = new Nomina ();

        sistemaNomina.agregarEmpleado(directo1);
        sistemaNomina.agregarEmpleado(vendedor1);
        sistemaNomina.agregarEmpleado(vendedor2);
        sistemaNomina.agregarEmpleado(freelance1);
        sistemaNomina.agregarEmpleado(freelance2);
        sistemaNomina.agregarEmpleado(directo2);
        System.out.println(sistemaNomina.calcularNomina());
        System.out.println(sistemaNomina.listarDirectos());
        System.out.println(sistemaNomina.listarFreelancers());
        System.out.println(sistemaNomina.calcularSoloComision());

    }
}
 