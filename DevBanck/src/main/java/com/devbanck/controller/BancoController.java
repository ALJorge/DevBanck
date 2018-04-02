/**
 * 
 */
package com.devbanck.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.devbanck.constant.ViewConstant;
import com.devbanck.model.BancoModel;
import com.devbanck.service.BancoService;

/**
 * @author JorgeLuna
 *
 */

@Controller
@RequestMapping("/banco")
public class BancoController {


	
	
	private static final Log LOG =LogFactory.getLog(BancoController.class);
	
	@Autowired
	@Qualifier("BancoServiceImpl")
	private BancoService banserv;
	
	
	@GetMapping("/listban")
	public ModelAndView listBanco(Model model) {
		ModelAndView mvn =new ModelAndView(ViewConstant.BANCOS);
		model.addAttribute("bancomodel",new BancoModel());
		mvn.addObject("ban",banserv.listBanco());
		mvn.addObject("banupdate",banserv.listBanco());
		LOG.info("Success en "+"listBanco()");
		return mvn;
	}
	
	@GetMapping("/addbanco")
	public String addBanco(@ModelAttribute("bancomodel") BancoModel ban, Model mod) {
		LOG.info("Error en "+"addBanco()" +"Param: "+ban.toString());
		banserv.agregaBanco(ban);
		mod.addAttribute("result", 1);
		return "redirect:/banco/listban";
	}
	
	@GetMapping("/deleteBanco")
	public String deleteBanco(@RequestParam(name="id", required=true) int id) {
		
		banserv.deleteBanco(id);
		return "redirect:/banco/listban";
	}
	
	@GetMapping("/updateBanco")
	public String updateBanco(@ModelAttribute("${bancomodelUpdate}") BancoModel ban) {
		return "redirect:/banco/listban";
	}
}
