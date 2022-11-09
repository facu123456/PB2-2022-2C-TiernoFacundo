package unalm.edu.ar.Clases;


import java.util.HashSet;
import java.util.Set;

public class Central {
	
	
	private Set<Alarma>alarmas;

	public Central() {
		this.alarmas=new HashSet<Alarma>();
	}
	
	
	public void agregarAlarma(Alarma alarma) {
		
		alarmas.add(alarma);
	}


	
	
	
	public Set<Alarma> getAlarmas() {
		return alarmas;
	}


	public void setAlarmas(Set<Alarma> alarmas) {
		this.alarmas = alarmas;
	}


	public void agregarUsuarioConfigurador(Usuario usuarioConfigurador) {
		for(Alarma buscada : alarmas) {
			if(buscada!=null) {
				buscada.agregarUsuario(usuarioConfigurador);
			}
		}
		
	}
	
	public Alarma BuscarAlarma(Integer idAlarma) {
		for(Alarma buscada: alarmas) {
			if(idAlarma == buscada.getIdAlarma()) {
				return buscada;
			}
		}
		return null;
	}
	
	
}
