package spring_web07_controller_anno_hw;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewMenuController  {

	
	@RequestMapping(value = "viewData.do")
	public String show(HttpServletRequest req) {

		//return  new ModelAndView("view", "msg", "메시지메시지");
		
		
		String msg = "model2";
		req.setAttribute("msg", msg);
		
		return "view";
		
		
		
		
	}
	
	@RequestMapping(value = "viewData2.do")
	public ModelAndView show2(HttpServletRequest req) {

		
		
		return  new ModelAndView("view", "msg", "메시지메시지");
		

		
	}
	
	
}
