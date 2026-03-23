package pe.edu.upeu.sysasistencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.upeu.sysasistencia.modelo.Persona;

@SpringBootApplication
public class SysAsistenciaApplication extends Persona {

	public static void main(String[] args) {
		SpringApplication.run(SysAsistenciaApplication.class, args);
		SysAsistenciaApplication obj=new SysAsistenciaApplication();
		System.out.println("DNI:"+obj.dni);
	}

}
