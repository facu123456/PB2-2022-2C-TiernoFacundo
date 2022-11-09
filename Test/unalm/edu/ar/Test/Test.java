package unalm.edu.ar.Test;

import static org.junit.Assert.*;

import unalm.edu.ar.Clases.Alarma;
import unalm.edu.ar.Clases.Central;
import unalm.edu.ar.Clases.CodigoActivacion;
import unalm.edu.ar.Clases.CodigoAlarmaIncorrecto;
import unalm.edu.ar.Clases.Sensor;
import unalm.edu.ar.Clases.SensorDuplicado;
import unalm.edu.ar.Clases.Usuario;
import unalm.edu.ar.Clases.UsuarioAdministrador;
import unalm.edu.ar.Clases.UsuarioConfigurador;

public class Test {

	@org.junit.Test
	public void queSePuedaRegistrarUnaAlarmaEnLaCentral() {
		Central central = new Central();
		Alarma alarma = new Alarma(1,CodigoActivacion.DESACTIVADO, "12345","alarma1");
		central.agregarAlarma(alarma);
		
		assertNotNull(central.getAlarmas());
		
	}
	@org.junit.Test
	public void queSePuedaAgregarUnUsuarioConfiguradorAUnaAlarma() {
		Central central = new Central();
		Alarma alarma = new Alarma(1,CodigoActivacion.DESACTIVADO, "12345","alarma1");
		central.agregarAlarma(alarma);
		
		Usuario usuarioConfigurador = new UsuarioAdministrador(44824841,"facu");
		
		central.agregarUsuarioConfigurador(usuarioConfigurador);
		
		assertNotNull(alarma.getUsuariosValidos());
	}
	
	@org.junit.Test(expected = CodigoAlarmaIncorrecto.class)
	public void alAgregarUnUsuarioAUnaAlarmaConCodigoDeConfiguracionDeAlarmaInvalidoSeLanceCodigoAlarmaIncorrectoExeptions() throws CodigoAlarmaIncorrecto {
		
		
		Central central = new Central();
		Alarma alarma = new Alarma(1,CodigoActivacion.DESACTIVADO, "12345","alarma1");
		central.agregarAlarma(alarma);
		UsuarioConfigurador usuarioConfigurador = new UsuarioConfigurador(44824841,"facu");
		Usuario usuarioAdministrador = new UsuarioAdministrador(44824841,"facu");
		
		
		central.agregarUsuarioConfigurador(usuarioConfigurador);
		
		
		
		
		assertTrue(usuarioConfigurador.agregarUsuarioAUnaAlarma(usuarioAdministrador, 1, "1234", central));
	}

	@org.junit.Test 
	public void alAgregarUnSensorDuplicadoEnUnaAlarmaSeLanceUnSensorDuplicadoExepions() throws SensorDuplicado {
		
		Central central = new Central();
		Alarma alarma = new Alarma(1,CodigoActivacion.DESACTIVADO, "12345","alarma1");
		central.agregarAlarma(alarma);
		UsuarioConfigurador usuarioConfigurador = new UsuarioConfigurador(44824841,"facu");
		
		central.agregarUsuarioConfigurador(usuarioConfigurador);
		
		Sensor sensor1 = new Sensor (1,true);
		Sensor sensor2 = new Sensor (2,true);
		Sensor sensor3 = new Sensor (1,true);
		
		usuarioConfigurador.agregarSensorAAlarma(1, "12345", sensor1, 44824841, central);
		assertTrue(usuarioConfigurador.agregarSensorAAlarma(1, "12345", sensor2, 44824841, central));
		try {
		usuarioConfigurador.agregarSensorAAlarma(1, "12345", sensor3, 44824841, central);
		}catch(SensorDuplicado e){
			System.out.println(e.getMessage());
		}
		
	}
	
	
	@org.junit.Test
	public void queNoSePuedaActivarUnaAlarmaSiHayAlMenosUnSensorDesactivado() throws CodigoAlarmaIncorrecto, SensorDuplicado {
		Central central = new Central();
		Alarma alarma = new Alarma(1,CodigoActivacion.DESACTIVADO, "12345","alarma1");
		central.agregarAlarma(alarma);
		UsuarioConfigurador usuarioConfigurador = new UsuarioConfigurador(44824841,"facu");
		UsuarioAdministrador usuarioAdministrador = new UsuarioAdministrador(44824841,"facu");
		central.agregarUsuarioConfigurador(usuarioConfigurador);
		
		
		usuarioConfigurador.agregarUsuarioAUnaAlarma(usuarioAdministrador, 1, "12345", central);
		
		Sensor sensor1 = new Sensor (1,false);
		Sensor sensor2 = new Sensor (2,false);
		
		usuarioConfigurador.agregarSensorAAlarma(1, "12345", sensor1, 44824841, central);
		usuarioConfigurador.agregarSensorAAlarma(1, "12345", sensor2, 44824841, central);
		
		assertTrue(usuarioAdministrador.activarDesactivarUnaAlarma(1,CodigoActivacion.DESACTIVADO,usuarioAdministrador, central));
		
	}
}
