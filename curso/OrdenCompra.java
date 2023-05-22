package telcel.curso;


import java.util.Date;

public class OrdenCompra {
	
	private Integer identificador = 0;
	private String descripcion = null; 
	private Date fecha = null; 
	private Cliente tipoCliente = null; 
	public Producto[] listProductos = null;
	
	
	public Integer autoincrementable(Integer numOrden) {
		this.identificador = numOrden + 1;
		return identificador;
	}
	
	
	public Integer sumaTotal (Producto[] listProductos) {
		Integer total = 0; 			
		for(int i=0;i<4;i++) {
			total = total + listProductos[i].getPrecio();
		}					
		return total; 
	}
	
	public void addProducto() {
		listProductos = new Producto[4];
		Producto producto1 = new Producto();
		producto1.setFabricante("Gamesa");
		producto1.setNombre("Galletas");
		producto1.setPrecio(12);
		listProductos[0] = producto1;	
		
		Producto producto2 = new Producto();
		producto2.setFabricante("Bimbo");
		producto2.setNombre("Donas");
		producto2.setPrecio(20);
		listProductos[1] = producto2;	
		
		Producto producto3 = new Producto();
		producto3.setFabricante("P&G");
		producto3.setNombre("Shampoo");
		producto3.setPrecio(16);
		listProductos[2] = producto3;	
		
		Producto producto4 = new Producto();
		producto4.setFabricante("Famsa");
		producto4.setNombre("Leche");
		producto4.setPrecio(30);
		listProductos[3] = producto4;					
	}
	
	
	public Integer getIdentificador() {
		return identificador;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public Cliente getTipoCliente() {
		return tipoCliente;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public void setTipoCliente(Cliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}


	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Producto[] getListProductos() {
		return listProductos;
	}


	public void setListProductos(Producto[] listProductos) {
		this.listProductos = listProductos;
	}	
	
	
	

}
