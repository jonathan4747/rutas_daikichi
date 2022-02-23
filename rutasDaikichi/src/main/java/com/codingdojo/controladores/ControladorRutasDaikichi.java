package com.codingdojo.controladores;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRutasDaikichi {
	@RequestMapping( value="/daikichi/{accion}/{ciudad}", method=RequestMethod.GET)
	public String Daikichi(@PathVariable("accion") String accion, @PathVariable("ciudad") String ciudad) {
		return "¡Felicitaciones!¡Pronto vas a "+accion+" a "+ciudad+"!";
	}
	
	@RequestMapping( value="/daikichi/lotto/{numero}", method=RequestMethod.GET)
	public String Daikichi (@PathVariable("numero") int numero) {
		if (numero%2==0 ) {
			return "Harás un gran viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras";
		}
		else {
		return "Has disfrutado de los frutos de tu trabajo, pero ahora es un buen momento para pasar tiempo con familiares y amigos";
		}
		
	}


}
