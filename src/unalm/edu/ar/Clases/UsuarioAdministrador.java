package unalm.edu.ar.Clases;

public class UsuarioAdministrador extends Usuario implements Configurable {
	
	

	public UsuarioAdministrador (Integer dni, String nombre) {
		super(dni, nombre);
	}
	
	
	
	
	
	
	public void agregarUsuarioAUnaListaDeUsuario(Integer dniUsuario, Integer idAlarma, CodigoActivacion codigoact) {
		
	}

	
	
	
	
	public boolean activarDesactivarUnaAlarma(Integer idAlarma, CodigoActivacion codigoActivacionAlarma, UsuarioAdministrador usuario,Central central) {
		boolean exito = true;
		
		if(central.BuscarAlarma(idAlarma).getCodigoActDes().equals(codigoActivacionAlarma)){
			
			for(Sensor buscar : central.BuscarAlarma(idAlarma).getSensores()) {
				if(buscar.isEstado()==false) {
					central.BuscarAlarma(idAlarma).setCodigoActDes(codigoActivacionAlarma);
					exito = false;
				}
			
		else {
			for(Sensor buscar2 : central.BuscarAlarma(idAlarma).getSensores()) {
				if(buscar2.isEstado()==false) {
					exito = false;
				}
			}
			central.BuscarAlarma(idAlarma).setCodigoActDes(CodigoActivacion.ACTIVADO);
			exito = true;
		}
		
		
			}
		/*switch(central.BuscarAlarma(idAlarma).getCodigoActDes()) {
		
		case DESACTIVADO:
			
			for(Sensor buscar : central.BuscarAlarma(idAlarma).getSensores()) {
				if(buscar.isEstado()==false) {
					return false;
				}
			}
			central.BuscarAlarma(idAlarma).setCodigoActDes(CodigoActivacion.ACTIVADO);
			return true;
		
		case ACTIVADO:
			for(Sensor buscar : central.BuscarAlarma(idAlarma).getSensores()) {
				if(buscar.isEstado()==false) {
					central.BuscarAlarma(idAlarma).setCodigoActDes(CodigoActivacion.DESACTIVADO);
					return false;
				}
		}
		central.BuscarAlarma(idAlarma).setCodigoActDes(CodigoActivacion.DESACTIVADO);	
		return true;
		}
		return false;*/
	}
		return exito;
		}
	
	
	
	public boolean agregarAlarma(Alarma alarma, Central central) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean agregarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	@Override
	public boolean agregarUsuarioAUnaAlarma(Usuario UsuarioAAgregar, Integer idAlarma, String codigoConfiguracionAlarma, Central central) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean agregarSensorAAlarma(Integer idAlarma, String codigoConfiguracionAlarma, Sensor sensor,
			Integer idUsuarioConfigurador, Central central) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean activarSensorDeAlarma(Integer idSensor, Integer idAlarma, CodigoActivacion codigoActivacionAlarma, Central central) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	
}
