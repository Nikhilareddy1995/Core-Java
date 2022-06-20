
package com.example.demo;

public class Department implements Cloneable {
	int deptId;

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public Department(int deptId) {
		super();
		this.deptId = deptId;
	}

}
