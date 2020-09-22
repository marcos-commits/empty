package lhc.controller.bean;

public class EmptyBean {
	package lhc.controller.bean;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;

	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpSession;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpRequest;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.RequestMapping;

	import lhc.model.dao.LhcPcDAOImpl;
	import lhc.model.dao.LhcSeatsDAOImpl;
	import lhc.model.vo.LhcMemberVO;
	import lhc.model.vo.LhcPcVO;
	import lhc.model.vo.LhcSeatsVO;

	@Controller
	@RequestMapping("")
	public class  {

		@Autowired
		private 
		
		@RequestMapping("")
		public String (Model model) throws Exception {
		
			model.addAttribute("", );
			model.addAttribute("", );
			model.addAttribute("", );
			model.addAttribute("", );
			model.addAttribute("", );
			
			return "";
		}
		
		@RequestMapping("")
		public String (HttpSession session, HttpServletRequest request, Model model) throws Exception {
			
				
			model.addAttribute("", );
			return "";
		}
	}

}
