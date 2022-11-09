package unalm.edu.ar.Clases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Alarma {
	
	private Integer idAlarma;
	private CodigoActivacion codigoActDes;
	private String codigoConfiguracion;
	private String nombre;
	private ArrayList<Sensor> sensores;
	private ArrayList<Usuario> usuariosValidos;
	private ArrayList<Accione> accionesRealizadas;
	
	
	public Alarma() {
		this.sensores =  new ArrayList<Sensor>();
		this.usuariosValidos = new ArrayList<Usuario>();
		this.accionesRealizadas = new ArrayList<Accione>();
	}
	
	public Alarma(Integer idAlarma, CodigoActivacion codigoActDes, String codigoConfiguracion, String nombre) {
		this.idAlarma = idAlarma;
		this.codigoActDes = codigoActDes;
		this.codigoConfiguracion = codigoConfiguracion;
		this.nombre = nombre;
		this.usuariosValidos = new ArrayList<Usuario>();
		this.accionesRealizadas = new ArrayList<Accione>();
		this.sensores =  new ArrayList<Sensor>();
	}

	
	
	
	
	
	public void agregarUsuario(Usuario usuario) {
		usuariosValidos.add(usuario);
	}
	
	public Integer getIdAlarma() {
		return idAlarma;
	}

	public void setIdAlarma(Integer idAlarma) {
		this.idAlarma = idAlarma;
	}

	public CodigoActivacion getCodigoActDes() {
		return codigoActDes;
	}

	public void setCodigoActDes(CodigoActivacion codigoActDes) {
		this.codigoActDes = codigoActDes;
	}

	public String getCodigoConfiguracion() {
		return codigoConfiguracion;
	}

	public void setCodigoConfiguracion(String codigoConfiguracion) {
		this.codigoConfiguracion = codigoConfiguracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Usuario> getUsuariosValidos() {
		return usuariosValidos;
	}

	public void setUsuariosValidos(ArrayList<Usuario> usuariosValidos) {
		this.usuariosValidos = usuariosValidos;
	}

	public ArrayList<Accione> getAccionesRealizadas() {
		return accionesRealizadas;
	}

	public void setAccionesRealizadas(ArrayList<Accione> accionesRealizadas) {
		this.accionesRealizadas = accionesRealizadas;
	}

	public void agregarSensor(Sensor sensor) {
		sensores.add(sensor);
		
	}

	public ArrayList<Sensor> getSensores() {
		return sensores;
	}

	public void setSensores(ArrayList<Sensor> sensores) {
		this.sensores = sensores;
	}

	
	
	
	
	
	
	
	
	
}
