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

import com.newidea.oficina.model.Orcamento;
import com.newidea.oficina.repository.Orcamentos;

@Controller
public class OrcamentoController {
	
	@RequestMapping("/orcamento/novo")
	public String novo(){
		return "Orcamento";
	}
	
}//fim da classe 