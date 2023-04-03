package pe.senati.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.senati.entity.Corredor;
import pe.senati.service.AutoService;
import pe.senati.service.CopaService;
import pe.senati.service.CorredorService;
import pe.senati.service.EquipoService;

@Controller
@RequestMapping("/corredor")
public class CorredorController 
{
	@Autowired
	private CorredorService corredorService;
	
	@Autowired
	private AutoService autoService;
	
	@Autowired
	private EquipoService equipoService;
	
	@Autowired
	private CopaService copaService;
	
	public CorredorController() {		
	}
	
	@GetMapping("/listar")
	public String listar_GET(Map map)
	{
		map.put("participes",corredorService.findAll());		
		return "Corredor/listar";
	}
	
	@GetMapping("/registrar")
	public String registrar_GET(Map map1,Map map2,Map map3,Model model)
	{
		//corredor vacío
		Corredor corredorNull=new Corredor();
		
		model.addAttribute("corredor",corredorNull);
		map1.put("bAutos",autoService.findAll());
		map2.put("bEquipos",equipoService.findAll());
		map3.put("bCopas",copaService.findAll());
		
		return "Corredor/registrar";
	}
	
	@PostMapping("/registrar")
	public String registrar_POST(Corredor corredor)
	{
		//guardar en la base de datos
		corredorService.insert(corredor);
		
		return "redirect:/corredor/listar";
	}
	
	@GetMapping("/editar/{corredorId}")
	public String editar_GET(Map map1,Map map2,Map map3,Model model,@PathVariable Integer corredorId)
	{
		//corredor cargado
		Corredor corredorDb=corredorService.findById(corredorId);
		
		model.addAttribute("corredor",corredorDb);
		map1.put("bAutos",autoService.findAll());
		map2.put("bEquipos",equipoService.findAll());
		map3.put("bCopas",copaService.findAll());
		
		return "Corredor/editar";
	}
	
	@PostMapping("/editar/{corredorId}")
	public String editar_POST(Corredor corredor)
	{
		//actualizar en la base de datos
		corredorService.update(corredor);
		
		return "redirect:/corredor/listar";
	}
	
	@GetMapping("/borrar/{corredorId}")
	public String borrar_GET(Model model,@PathVariable Integer corredorId)
	{
		//corredor cargado
		Corredor corredorDb=corredorService.findById(corredorId);
		
		model.addAttribute("corredor",corredorDb);
		
		return "Corredor/borrar";
	}
	
	@PostMapping("/borrar/{corredorId}")
	public String borrar_POST(Corredor corredor)
	{
		//eliminar de la base de datos
		corredorService.delete(corredor.getCorredorId());
		
		return "redirect:/corredor/listar";
	}
}
