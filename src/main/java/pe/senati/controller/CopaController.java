package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Copa;
import pe.senati.service.CopaService;

@Controller
@RequestMapping("/copa")
public class CopaController 
{
	@Autowired
	private CopaService copaService;
	
	public CopaController() {
	}
	
	@GetMapping("/listar")
	private String listar_GET(Map map)
	{
		map.put("bCopas",copaService.findAll());
		return "Copa/listar";
	}
	
	@GetMapping("/registrar")
	public String registrar_GET(Model model)
	{
		Copa copaNull=new Copa();
		model.addAttribute("copa",copaNull);
		
		return "Copa/registrar";
	}
	
	@PostMapping("/registrar")
	public String registrar_POST(Copa copa)
	{
		copaService.insert(copa);
		return "redirect:/copa/listar";
	}
	
	@GetMapping("/editar/{copaId}")
	public String editar_GET(Model model,@PathVariable Integer copaId)
	{
		Copa copaDb=copaService.findById(copaId);
		
		model.addAttribute("copa",copaDb);
		
		return "Copa/editar";
	}
	
	@PostMapping("/editar/{copaId}")
	public String editar_POST(Copa copa)
	{
		copaService.update(copa);
		
		return "redirect:/copa/listar";
	}
	
	@GetMapping("/borrar/{copaId}")
	public String borrar_GET(Model model,@PathVariable Integer copaId)
	{
		Copa copaDb=copaService.findById(copaId);
		
		model.addAttribute("copa",copaDb);
		
		return "Copa/borrar";
	}
	
	@PostMapping("/borrar/{copaId}")
	public String borrar_GET(Copa copa)
	{
		copaService.delete(copa.getCopaId());
		
		return "redirect:/copa/listar";
	}
}
