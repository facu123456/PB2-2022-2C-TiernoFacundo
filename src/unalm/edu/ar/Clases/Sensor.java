package unalm.edu.ar.Clases;

import java.util.Objects;

public class Sensor {
	private Integer identificador;
	private boolean estado;
	
	
	
	
	public Sensor(Integer identificador, boolean estado) {
		
		this.identificador = identificador;
		this.estado = estado;
	}




	public Integer getIdentificador() {
		return identificador;
	}




	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}




	public boolean isEstado() {
		return estado;
	}




	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
	

//	@Override
//	public int hashCode() {
//		return Objects.hashCode(identificador);
//	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(this==obj)
//			return true;
//		if(obj==null)
//			return false;
//		Sensor other = (Sensor)obj;
//		return Objects.equals(other, other.identificador);
//	}
	
	
}
