package com.springmicrouser.VO;
import com.springmicrouser.entity.Users;

public class ResponseTemplateVO {

	private Users user;
	private Department department;
	
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "ResponseTemplateVO [user=" + user + ", department=" + department + "]";
	}
	
}
