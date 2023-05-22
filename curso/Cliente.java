package telcel.curso;

public class Cliente {
	
	private String nombre = null;
	private String apellido = null;
	private Integer tipoCliente = null; 
			
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(Integer tipoCliente) {
		this.tipoCliente = tipoCliente;
	} 

	
}
