package controller;

import dto.Teacher;
import service.TeacherService;

public class TeacherController
{
	public static void main(String[] args) 
	{
		Teacher teacher = new Teacher();
		teacher.setName("Prathamesh");
		teacher.setEmail("Pp@gmail.com");
		teacher.setSubject("English");
		teacher.setPhone("751151");
		
		TeacherService service = new TeacherService();
		service.saveTeacher(teacher);
		
		Teacher teacher2 = service.getTeacherbyId(1);
		System.out.println(teacher2.getId());
		System.out.println(teacher2.getName());
		System.out.println(teacher2.getEmail());
		System.out.println(teacher2.getPhone());
		System.out.println(teacher2.getSubject());
		
	}

}
