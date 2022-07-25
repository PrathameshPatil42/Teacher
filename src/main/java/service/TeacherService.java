package service;

import java.util.List;

import dao.TeacherDao;
import dto.Teacher;
import util.AES;

public class TeacherService
{
	static TeacherDao dao = new TeacherDao();
	
	public boolean saveTeacher(Teacher teacher)
	{
		String encEmail = AES.encrypt(teacher.getEmail(), "JAVA");
		String encPhone = AES.encrypt(teacher.getPhone(), "JAVA");
		
		teacher.setEmail(encEmail);
		teacher.setPhone(encPhone);
		
		return dao.saveTeacher(teacher);
	}
	
	public boolean UpdateTeacher(Teacher teacher)
	{
		return dao.UpdateTeacher(teacher);
	}
	
	public Teacher getTeacherbyId(int id)
	{
		Teacher teacher =dao.getTeacherbyId(id);
		String decEmail = AES.decrypt(teacher.getEmail(), "JAVA");
		String decPhone = AES.decrypt(teacher.getEmail(), "JAVA");
		
		teacher.setEmail(decEmail);
		teacher.setPhone(decPhone);
		
		return teacher;
	}
	
	public boolean deleteTeacher(int id)
	{
		return dao.deleteTeacher(id);
	}
	
	public List<Teacher> getAllTeacher()
	{
		return dao.getAllTeacher();
	}
}
