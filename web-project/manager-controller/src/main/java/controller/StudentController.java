package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	private StudentService studentService;

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	} 
	@RequestMapping("/login")
public String login(Integer student_id,Integer password,Model model){
		
		System.out.println("用户登录："+student_id+password);
		
		/*Map<String, String> map=new LinkedHashMap<String,String>();
		
		map.put("name", user.getName());
		map.put("password", user.getPassword());*/
		
		studentService.login(student_id,password);
		
		model.addAttribute("msg", "登录成功");
		
		return "success";
	}
}
