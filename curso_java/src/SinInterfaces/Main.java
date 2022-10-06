package SinInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUDV1 empleadoCRUD = new EmpleadoCRUDV1();

        Empleado javier = new Empleado("Javier", 43, 12000d, true);
        Empleado antonio = new Empleado("Antonio", 43, 12000d, true);
        Empleado izhan = new Empleado("Izhan", 43, 12000d, true);

        empleadoCRUD.save(javier);
        empleadoCRUD.save(antonio);
        empleadoCRUD.save(izhan);

//        Consultar
        List<Empleado> empleados = empleadoCRUD.findAll();

        System.out.println(empleados.toString());

    }
}
