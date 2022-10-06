package ConInterfaces;

import SinInterfaces.Empleado;

import java.util.List;

/**
 * Interface
 * Declaramos métodos, no se implementan
 * Actúa como un contrato, dice lo que hay que hacer pero no lo hace
 */
public interface EmpleadoCRUD {

	void save(Empleado empleado);

	List<Empleado> findAll();

	void delete(Empleado empleado);

}
