package unalm.edu.ar.Clases;

public class UsuarioConfigurador extends Usuario implements Configurable {

	public UsuarioConfigurador(Integer dni, String nombre) {
		super(dni, nombre);
		
	}

	@Override
	public boolean agregarUsuarioAUnaAlarma(Usuario UsuarioAAgregar, Integer idAlarma, String codigoConfiguracionAlarma, Central central) throws CodigoAlarmaIncorrecto {
		
			if(central.BuscarAlarma(idAlarma).getCodigoConfiguracion().equals(codigoConfiguracionAlarma)) {
				central.BuscarAlarma(idAlarma).agregarUsuario(UsuarioAAgregar);
				return true;
			}else throw new CodigoAlarmaIncorrecto("Codigo incorrcto");
	}

	@Override
	public boolean agregarSensorAAlarma(Integer idAlarma, String codigoConfiguracionAlarma, Sensor sensor, Integer idUsuarioConfigurador, Central central) throws SensorDuplicado {
		
		if(central.BuscarAlarma(idAlarma).getCodigoConfiguracion().equals(codigoConfiguracionAlarma)) {
			for(Sensor buscar : central.BuscarAlarma(idAlarma).getSensores()) {
				if(buscar.getIdentificador()!=sensor.getIdentificador()) {
					central.BuscarAlarma(idAlarma).agregarSensor(sensor);
				}else throw new SensorDuplicado("Ya existe el Sensor");
			}
			
		}
		
		return true;
		}
	
	
//		if(central.BuscarAlarma(idAlarma).getCodigoConfiguracion().equals(codigoConfiguracionAlarma)) {
//			central.BuscarAlarma(idAlarma).agregarSensor(sensor);
//			return true;
//		}else throw new SensorDuplicado("Ya existe el Sensor");
//}
	

	@Override
	public boolean activarSensorDeAlarma(Integer idSensor, Integer idAlarma, CodigoActivacion codigoActivacionAlarma, Central central) {
		// TODO Auto-generated method stub
		return false;
	}

}
