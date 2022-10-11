package dao;

import java.util.List;

public interface DAO<T, ID> {

	void insertar(T t) throws DAOExeption;

	void modificar(T t) throws DAOExeption;

	void eliminar(T t) throws DAOExeption;

	T obtener(ID id) throws DAOExeption;

	List<T> obtenerTodos() throws DAOExeption;

}

