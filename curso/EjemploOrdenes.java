package telcel.curso;

import java.util.Date;

public class EjemploOrdenes {

	public static void main(String[] args) {
		
		Date fecha = new Date();
		
		Cliente cliente1 = new Cliente();		
		cliente1.setNombre("Nahum");
		cliente1.setApellido("Badillo");
		
		Cliente cliente2 = new Cliente();		
		cliente2.setNombre("Arturo");
		cliente2.setApellido("Torres");
		
		Cliente cliente3 = new Cliente();		
		cliente3.setNombre("Abi");
		cliente3.setApellido("Bias");
					
		OrdenCompra orden1 = new OrdenCompra();
		Integer count = 0;
		OrdenCompra orden2 = new OrdenCompra();
		OrdenCompra orden3 = new OrdenCompra();
		
		orden1.addProducto();
		
		orden1.setDescripcion("Compra Lunes");
		orden1.setFecha(fecha);
		count = orden1.autoincrementable(count);
		orden1.setIdentificador(count);
		orden1.setTipoCliente(cliente1);
		orden1.setListProductos(orden1.getListProductos());
		
		
		orden2.setDescripcion("Compra Lunes Mañana");
		orden2.setFecha(fecha);
		count = orden2.autoincrementable(count);
		orden2.setIdentificador(count);
		orden1.setTipoCliente(cliente2);
		orden1.setListProductos(orden2.getListProductos());
		
		orden3.setDescripcion("Compra Lunes Tarde");
		orden3.setFecha(fecha);
		count = orden3.autoincrementable(count);
		orden3.setIdentificador(count);
		orden1.setTipoCliente(cliente3);
		orden1.setListProductos(orden3.getListProductos());
		
		System.out.println("Desc Orden" + orden1.getDescripcion());
		System.out.println("Fecha Orden" + orden1.getFecha());
		System.out.println("Identificador Orden" + orden1.getIdentificador());
		System.out.println("Nombre Cliente" + orden1.getTipoCliente().getNombre());
		System.out.println("Apellido Cliente" + orden1.getTipoCliente().getApellido());
		for(int i=0;i<4;i++) {
			System.out.println("Fabricante" + orden1.getListProductos()[i]);				
		}
		
		System.out.println("Total" + orden1.sumaTotal(orden1.getListProductos()));
		
		System.out.println("Desc Orden" + orden2.getDescripcion());
		System.out.println("Fecha Orden" + orden2.getFecha());
		System.out.println("Identificador Orden" + orden2.getIdentificador());
		System.out.println("Nombre Cliente" + orden2.getTipoCliente().getNombre());
		System.out.println("Apellido Cliente" + orden2.getTipoCliente().getApellido());
		for(int i=0;i<4;i++) {
			System.out.println("Fabricante" + orden2.getListProductos()[i].getFabricante());
			System.out.println("Nombre" + orden2.getListProductos()[i].getNombre());
			System.out.println("Precio" + orden2.getListProductos()[i].getPrecio());			
		}
		
		System.out.println("Total" + orden2.sumaTotal(orden2.getListProductos()));
		
		System.out.println("Desc Orden" + orden3.getDescripcion());
		System.out.println("Fecha Orden" + orden3.getFecha());
		System.out.println("Identificador Orden" + orden3.getIdentificador());
		System.out.println("Nombre Cliente" + orden3.getTipoCliente().getNombre());
		System.out.println("Apellido Cliente" + orden3.getTipoCliente().getApellido());
		for(int i=0;i<4;i++) {
			System.out.println("Fabricante" + orden3.getListProductos()[i].getFabricante());
			System.out.println("Nombre" + orden3.getListProductos()[i].getNombre());
			System.out.println("Precio" + orden3.getListProductos()[i].getPrecio());			
		}
		
		System.out.println("Total" + orden3.sumaTotal(orden3.getListProductos()));
		

	}

}
