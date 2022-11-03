package sooper;

public interface IProducto {

		String getReferencia();

		int getVolumen();

		int getPeso();

		String getCategoria();

		boolean esCompatible(IProducto producto);

		boolean tengoEspacio(IContenedor contenedor);
}
