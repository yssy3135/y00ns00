package ko.co.goott.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ko.co.goott.dao.DAO;
import ko.co.goott.dto.EmpDTO;

@Controller
public class EmpController {

	@Autowired
	DAO dao;
	
	
	public void setDao(DAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value = "/empList/*")
	public String list(Model model) {
		List<EmpDTO> list = dao.selectAll();
		
		model.addAttribute("list",list);
		
		return "list";
		
		
	}
	
	
	@RequestMapping(value = "/insert")
	public String processStemp2() {
		
		return "insertForm";
	}
	
	@RequestMapping(value = "/insertOk")
	public String processStemp3(@ModelAttribute EmpDTO empdto) {
		
		dao.insertOne(empdto);
		
		return "redirect:/empList";
	}
	
	
	
	
	
	
	
}
