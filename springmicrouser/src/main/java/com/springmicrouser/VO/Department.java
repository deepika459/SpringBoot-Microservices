package com.springmicrouser.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

	private long departmentid;
	private String departmentname;
	private String departmentaddress;
	private String departmentcode;

	public long getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(long departmentid) {
		this.departmentid = departmentid;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getDepartmentaddress() {
		return departmentaddress;
	}

	public void setDepartmentaddress(String departmentaddress) {
		this.departmentaddress = departmentaddress;
	}

	public String getDepartmentcode() {
		return departmentcode;
	}

	public void setDepartmentcode(String departmentcode) {
		this.departmentcode = departmentcode;
	}

	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", departmentname=" + departmentname
				+ ", departmentaddress=" + departmentaddress + ", departmentcode=" + departmentcode + "]";
	}
}
