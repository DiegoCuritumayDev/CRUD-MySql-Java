package pe.senati.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import pe.senati.service.UserServiceImpl;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Autowired
	private CustomSuccesHandler customSuccesHandler;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		/*
		auth.inMemoryAuthentication().withUser("carlos").password("$2a$10$b2cE/OGbONqNs41A8Pb6gew7tz3aa6ifUwMg36TCo5oWg7PtVlRUu").roles("CORREDOR");
		auth.inMemoryAuthentication().withUser("roberto").password("$2a$10$qFRGFUg2lOP43HW5frkViuewwhwg0DIWyzi3wNFvsLKXMEpE2dSHm").roles("LIDER");
		auth.inMemoryAuthentication().withUser("paola").password("$2a$10$cwjlrqLD9LTEb2ykIqLYUeswTjd9bvNKA/e0NPmN9Cx61cGYXuT9G").roles("JEFE","LIDER");
		*/
		
		auth.userDetailsService(userServiceImpl);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		http.authorizeRequests()
			.antMatchers("/home").permitAll()
			.antMatchers("/corredor/listar").access("hasRole('CORREDOR') or hasRole('LIDER') or hasRole('JEFE')")
			.antMatchers("/corredor/registrar","/corredor/editar/*").access("hasRole('LIDER')")
			.antMatchers("/corredor/borrar/*").access("hasRole('JEFE')")
			.antMatchers("/conyuge/listar").access("hasRole('CORREDOR') or hasRole('LIDER') or hasRole('JEFE')")
			.antMatchers("/conyuge/registrar","/conyuge/editar/*").access("hasRole('LIDER')")
			.antMatchers("/conyuge/borrar/*").access("hasRole('JEFE')")
			.antMatchers("/auto/listar").access("hasRole('CORREDOR') or hasRole('LIDER') or hasRole('JEFE')")
			.antMatchers("/auto/registrar","/auto/editar/*").access("hasRole('LIDER')")
			.antMatchers("/auto/borrar/*").access("hasRole('JEFE')")
			.antMatchers("/copa/listar").access("hasRole('CORREDOR') or hasRole('LIDER') or hasRole('JEFE')")
			.antMatchers("/copa/registrar","/copa/editar/*").access("hasRole('LIDER')")
			.antMatchers("/copa/borrar/*").access("hasRole('JEFE')")
			.antMatchers("/equipo/listar").access("hasRole('CORREDOR') or hasRole('LIDER') or hasRole('JEFE')")
			.antMatchers("/equipo/registrar","/equipo/editar/*").access("hasRole('LIDER')")
			.antMatchers("/equipo/borrar/*").access("hasRole('JEFE')");
		
		http.authorizeRequests().and()
			.formLogin()
			.loginPage("/login")
			.usernameParameter("txtUsername")
			.passwordParameter("txtPassword")
			.successHandler(customSuccesHandler);
		
		http.authorizeRequests().and()
			.exceptionHandling().accessDeniedPage("/access_denied");
		
		//proteccion de ataques maliciosos
		http.authorizeRequests().and()
			.csrf();
	}
	
	@Bean
	public PasswordEncoder passwordencoder()
	{
		return new BCryptPasswordEncoder();
	}
}
