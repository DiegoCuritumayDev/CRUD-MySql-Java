package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Conyuge;
import pe.senati.service.ConyugeService;
import pe.senati.service.CorredorService;

@Controller
@RequestMapping("/conyuge")
public class ConyugeController 
{
	@Autowired
	private ConyugeService conyugeService;
	
	@Autowired
	private CorredorService corredorService;
	
	public ConyugeController() {
	}
	
	@GetMapping("/listar")
	public String listar_GET(Map map)
	{
		map.put("bConyuges",conyugeService.findAll());
		return "Conyuge/listar";
	}
	
	@GetMapping("/registrar")
	public String registrar_GET(Map map,Model model)
	{
		Conyuge conyugeNull=new Conyuge();
		model.addAttribute("conyuge",conyugeNull);

		map.put("bCorredores",corredorService.findAll());
		
		return "Conyuge/registrar";
	}
	
	@PostMapping("/registrar")
	public String registrar_POST(Conyuge conyuge)
	{
		conyugeService.insert(conyuge);
		return "redirect:/conyuge/listar";
	}
	
	@GetMapping("/editar/{conyugeId}")
	public String editar_GET(Map map,Model model,@PathVariable Integer conyugeId) 
	{
		Conyuge conyugeDb=conyugeService.findById(conyugeId);
		
		model.addAttribute("conyuge",conyugeDb);
		map.put("bCorredores",corredorService.findAll());
		
		return "Conyuge/editar";
	}
	
	@PostMapping("/editar/{conyugeId}")
	public String editar_POST(Conyuge conyuge) 
	{
		conyugeService.update(conyuge);
		
		return "redirect:/conyuge/listar";
	}
	
	@GetMapping("/borrar/{conyugeId}")
	public String borrar_GET(Model model,@PathVariable Integer conyugeId)
	{
		Conyuge conyugeDb=conyugeService.findById(conyugeId);
		
		model.addAttribute("conyuge",conyugeDb);
		
		return "Conyuge/borrar";
	}
	
	@PostMapping("/borrar/{conyugeId}")
	public String borrar_POST(Conyuge conyuge)
	{
		conyugeService.delete(conyuge.getConyugeId());
		
		return "redirect:/conyuge/listar";
	}
}
