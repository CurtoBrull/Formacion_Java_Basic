package dao;

public class DAOExeption extends Exception {
	public DAOExeption(String message) {
		super(message);
	}

	public DAOExeption(String message, Throwable cause) {
		super(message, cause);
	}

	public DAOExeption(Throwable cause) {
		super(cause);
	}
}
