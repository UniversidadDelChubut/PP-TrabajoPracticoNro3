package mercado.ventas;

import java.util.LinkedHashMap;
import java.util.Map;

public class Producto {
	
	private static Map<String, Producto> productos = new LinkedHashMap<>();
	
	static {
		productos.put("457892501", new Producto("457892501", "Leche entera x 1 lt", 25.78));
		productos.put("457892502", new Producto("457892502", "Vino blanco x 1 lt",  56.12));
		productos.put("457892503", new Producto("457892503", "Papa blanca x kilo", 26.00));
		productos.put("457892505", new Producto("457892505", "Banana de Ecuador x kilo", 50.00));
		productos.put("457845678", new Producto("457845678", "Vacío x kilo", 210.00));
		productos.put("785488503", new Producto("785488503", "Osobuco x kilo", 140.00));
		productos.put("785216698", new Producto("785216698", "Tomate perita x kilo", 45.00));
	}
	
	private String codigoBarras;
	private String descripcion;
	private double precioUnitario;
	
	public Producto(String codigoBarras, String descripcion, double precioUnitario) {
		super();
		this.codigoBarras = codigoBarras;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
	}

	public static Producto getProducto(String codigoBarras) {
		return productos.get(codigoBarras);
	}
	
	public String getCodigoBarras() {
		return codigoBarras;
	}
	
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
}
