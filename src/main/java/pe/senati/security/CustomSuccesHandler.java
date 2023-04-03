package pe.senati.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class CustomSuccesHandler implements AuthenticationSuccessHandler
{
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException 
	{
		//String targetUrl=determineTargetUrl(authentication);
		
		String targetUrl="/home";
		redirectStrategy.sendRedirect(request,response,targetUrl);
	}
	
	protected String determineTargetUrl(Authentication authentication)
	{
		String url=null;
		
		Collection<String> roles=new ArrayList<>();
		
		for(GrantedAuthority authority:authentication.getAuthorities()) {
			roles.add(authority.getAuthority());
		}
		
		if(roles.contains("ROLE_JEFE")) {
			url="/corredor/borrar/1";
		}
		else if(roles.contains("ROLE_LIDER")) {
			url="/corredor/editar/1";
		}
		else if(roles.contains("ROLE_CORREDOR")) {
			url="/corredor/listar";
		}
		else {
			url="/access_denied";
		}
		
		return url;
	}
}
