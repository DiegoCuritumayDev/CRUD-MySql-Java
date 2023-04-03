package pe.senati;

import java.util.HashMap;
import java.util.Map;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ProyectoCarreraApplication /*implements CommandLineRunner*/
{
	/*@Autowired
	private PasswordEncoder passwordEncoder;*/
	
	public static void main(String[] args) 
	{
		SpringApplication application=new SpringApplication(ProyectoCarreraApplication.class);
		
		Map<String,Object> map=new HashMap<>();
		
		map.put("server.port","8090");
		map.put("server.servlet.context-path","/senati");
		
		application.setDefaultProperties(map);		
		application.run(args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		System.out.println("carlos123: "+passwordEncoder.encode("carlos123"));
		System.out.println("roberto123: "+passwordEncoder.encode("roberto123"));
		System.out.println("paola123: "+passwordEncoder.encode("paola123"));
	}*/
}
