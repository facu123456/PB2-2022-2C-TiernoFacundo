package unalm.edu.ar.Clases;

public interface Configurable {
	public boolean agregarUsuarioAUnaAlarma (Usuario UsuarioAAgregar, Integer idAlarma, String codigoConfiguracionAlarma, Central central) throws CodigoAlarmaIncorrecto;
	public boolean agregarSensorAAlarma (Integer idAlarma, String codigoConfiguracionAlarma, Sensor sensor, Integer idUsuarioConfigurador, Central central) throws SensorDuplicado, CodigoAlarmaIncorrecto;
	public boolean activarSensorDeAlarma (Integer idSensor, Integer idAlarma, CodigoActivacion codigoActivacionAlarma, Central central);
	
	}

