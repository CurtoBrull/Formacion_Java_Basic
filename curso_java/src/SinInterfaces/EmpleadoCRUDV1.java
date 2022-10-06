package SinInterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDV1 {
        private List<Empleado> empleados = new ArrayList<>();

//        Guardar empleado
        public void save(Empleado empleado) {

                empleados.add(empleado);
        }

        public List<Empleado> findAll() {
                return empleados;
        }

}
