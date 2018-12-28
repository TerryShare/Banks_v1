package org.healthbeauty.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.healthbeauty.pojo.Admin;
import org.healthbeauty.pojo.Ball;
import org.healthbeauty.pojo.Ballmsg;
import org.healthbeauty.service.BallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/admin/ball")
public class BallController {
	
	@Autowired
	private BallService ballService;
	
	
	@RequestMapping("/show")
	public String ballmsg(@RequestParam(value = "page", defaultValue = "1") Integer pn,
			HttpServletResponse response, Model model, HttpSession session) throws IOException {
		Admin admin = (Admin) session.getAttribute("admin");
		if (admin == null) {
			return "redirect:/admin/login";
		}
		return null;
		
	}
	
	@RequestMapping("/showjson")
	public String select(@RequestParam(value = "page", defaultValue = "1") Integer pn,
			HttpServletResponse response, Model model, HttpSession session) throws IOException {
		Admin admin = (Admin) session.getAttribute("admin");
		if (admin == null) {
			return "redirect:/admin/login";
		}
		Ballmsg  ballmsg= new Ballmsg();
		
		
		
		return null;
		
	}

}
