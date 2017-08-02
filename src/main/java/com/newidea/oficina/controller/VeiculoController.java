package com.newidea.oficina.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.newidea.oficina.model.StatusCliente;
import com.newidea.oficina.model.Veiculo;
import com.newidea.oficina.repository.Veiculos;

@Controller
public class VeiculoController {
	
	@RequestMapping("/veiculos/novo")
	public String novo(){
		return "CadastroVeiculo";
	}
	
}//fim da classe 