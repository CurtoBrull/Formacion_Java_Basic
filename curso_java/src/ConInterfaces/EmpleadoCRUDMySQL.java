package ConInterfaces;

import SinInterfaces.Empleado;

import java.util.List;

public class EmpleadoCRUDMySQL implements EmpleadoCRUD, EmpleadoReader{
	@Override
	public void save(Empleado empleado) {

	}

	@Override
	public List<Empleado> findAll() {
		return null;
	}

	@Override
	public void delete(Empleado empleado) {

	}
}
