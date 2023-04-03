package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Equipo;
import pe.senati.service.EquipoService;

@Controller
@RequestMapping("/equipo")
public class EquipoController 
{
	@Autowired
	private EquipoService equipoService;
	
	public EquipoController() {
	}
	
	@GetMapping("/listar")
	private String listar_GET(Map map)
	{
		map.put("bEquipos",equipoService.findAll());
		return "Equipo/listar";
	}
	
	@GetMapping("/registrar")
	public String registrar_GET(Model model)
	{
		Equipo equipoNull=new Equipo();
		model.addAttribute("equipo",equipoNull);
		
		return "Equipo/registrar";
	}
	
	@PostMapping("/registrar")
	public String registrar_POST(Equipo equipo)
	{
		equipoService.insert(equipo);
		return "redirect:/equipo/listar";
	}
	
	@GetMapping("/editar/{equipoId}")
	public String editar_GET(Model model,@PathVariable Integer equipoId)
	{
		Equipo equipoDb=equipoService.findById(equipoId);
		
		model.addAttribute("equipo",equipoDb);
		
		return "Equipo/editar";
	}
	
	@PostMapping("/editar/{equipoId}")
	public String editar_POST(Equipo equipo)
	{
		equipoService.update(equipo);
		
		return "redirect:/equipo/listar";
	}
	
	@GetMapping("/borrar/{equipoId}")
	public String borrar_GET(Model model,@PathVariable Integer equipoId)
	{
		Equipo equipoDb=equipoService.findById(equipoId);
		
		model.addAttribute("equipo",equipoDb);
		
		return "Equipo/borrar";
	}
	
	@PostMapping("/borrar/{equipoId}")
	public String borrar_GET(Equipo equipo)
	{
		equipoService.delete(equipo.getEquipoId());
		
		return "redirect:/equipo/listar";
	}
}
