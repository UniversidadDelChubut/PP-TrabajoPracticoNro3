package mercado.facturacion;

import java.util.LinkedList;
import java.util.List;

import mercado.ventas.Producto;

public class Promocion {
	
	private static List <Promocion> promociones = new LinkedList<>();
	
	static {
		Promocion p = null;
		
		p = new Promocion();
		p.cantidadMinima = 2;
		p.cantidadMaxima = 6;
		p.porcentajeDescuento = 0.1;
		p.productosIncluidos.add( Producto.getProducto("457892501") ); // Leche
		p.productosIncluidos.add( Producto.getProducto("457892502") ); // Vino
		promociones.add(p);
		
		
		p = new Promocion();
		p.cantidadMinima = 1;
		p.cantidadMaxima = 5;
		p.porcentajeDescuento = 0.15;
		p.productosIncluidos.add( Producto.getProducto("457892502") ); // Vino
		p.productosIncluidos.add( Producto.getProducto("785216698") ); // Tomate
		promociones.add(p);


		p = new Promocion();
		p.cantidadMinima = 5;
		p.cantidadMaxima = 10;
		p.porcentajeDescuento = 0.20;
		p.productosIncluidos.add( Producto.getProducto("457845678") ); // Vacío
		p.productosIncluidos.add( Producto.getProducto("785488503") ); // Osobuco
		p.productosIncluidos.add( Producto.getProducto("785216698") ); // Tomate
		promociones.add(p);
		
	}
	
	public static List <Promocion> getPromociones(String codigoBarras) {
		//TODO 
		return new LinkedList<>();
	}
	
	public static List <Promocion> getPromociones() {
		return Promocion.promociones;
	}
	
	private double cantidadMinima;
	private double cantidadMaxima;
	private double porcentajeDescuento;
	private List<Producto> productosIncluidos = new LinkedList<>();
	
	private Promocion() {
		
	}
	
	public double getCantidadMaxima() {
		return cantidadMaxima;
	}
	
	public double getCantidadMinima() {
		return cantidadMinima;
	}
	
	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}
	
	public List<Producto> getProductosIncluidos() {
		return productosIncluidos;
	}
	
}
