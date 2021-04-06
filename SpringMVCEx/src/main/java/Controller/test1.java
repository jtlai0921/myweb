package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/T")
public class test1 {
	
	@RequestMapping("/A")
	public ModelAndView getA(HttpServletRequest request,HttpServletResponse response) throws Exception//servlet -->service
	{
		return new ModelAndView("a");
	}
	@RequestMapping("/B")
	public ModelAndView getB(HttpServletRequest request,HttpServletResponse response) throws Exception//servlet -->service
	{
		return new ModelAndView("b");
	}
}