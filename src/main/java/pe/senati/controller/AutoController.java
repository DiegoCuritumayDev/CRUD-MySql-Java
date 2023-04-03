package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Auto;
import pe.senati.service.AutoService;

@Controller
@RequestMapping("/auto")
public class AutoController 
{
	@Autowired
	private AutoService autoService;
	
	public AutoController() {
	}
	
	@GetMapping("/listar")
	public String listar_GET(Map map)
	{
		map.put("bAutos",autoService.findAll());
		return "Auto/listar";
	}
	
	@GetMapping("/registrar")
	public String registrar_GET(Model model)
	{
		Auto autoNull=new Auto();
		model.addAttribute("auto",autoNull);
		
		return "Auto/registrar";
	}
	
	@PostMapping("/registrar")
	public String registrar_POST(Auto auto)
	{
		autoService.insert(auto);
		return "redirect:/auto/listar";
	}
	
	@GetMapping("/editar/{autoId}")
	public String editar_GET(Model model,@PathVariable Integer autoId)
	{
		Auto autoDb=autoService.findById(autoId);
		
		model.addAttribute("auto",autoDb);
		
		return "Auto/editar";
	}
	
	@PostMapping("/editar/{autoId}")
	public String editar_POST(Auto auto)
	{
		autoService.update(auto);
		
		return "redirect:/auto/listar";
	}
	
	@GetMapping("/borrar/{autoId}")
	public String borrar_GET(Model model,@PathVariable Integer autoId)
	{
		Auto autoDb=autoService.findById(autoId);
		
		model.addAttribute("auto",autoDb);
		
		return "Auto/borrar";
	}
	
	@PostMapping("/borrar/{autoId}")
	public String borrar_GET(Auto auto)
	{
		autoService.delete(auto.getAutoId());
		
		return "redirect:/auto/listar";
	}
}
