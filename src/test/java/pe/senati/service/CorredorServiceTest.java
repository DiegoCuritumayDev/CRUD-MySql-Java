package pe.senati.service;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.notNullValue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import pe.senati.ProyectoCarreraApplicationTests;
import pe.senati.entity.Corredor;

@SpringJUnitConfig(classes=ProyectoCarreraApplicationTests.class)
public class CorredorServiceTest 
{
	@Autowired
	private CorredorService corredorService;
	
	public CorredorServiceTest() {
	}
	
	@Test
	public void whenInserting()
	{
		Corredor C2=new Corredor("Pedro Julian",'M',LocalDate.of(1996,10,23),3500.0,
				"9963282502","pedro@gmail.com",LocalDate.of(2020,03,10));
		
		assertThat(C2,is(notNullValue()));
		
		corredorService.insert(C2);
	}
	
	@Test
	public void whenUpdating()
	{
		Corredor corredor=corredorService.findById(1);
		
		assertThat(corredor,is(notNullValue()));
		
		corredor.setNombre("Diego Cayo");
		corredor.setCelular("993859021");
		
		corredorService.update(corredor);
	}
	
	@Test
	public void whenDeleting()
	{
		Corredor corredor=corredorService.findById(2);
		
		assertThat(corredor,is(notNullValue()));
		
		corredorService.delete(corredor.getCorredorId());
	}
}
