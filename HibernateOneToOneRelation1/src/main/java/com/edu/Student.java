package com.edu;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="StudentInfo")
public class Student {
	@Id
private int StuId;
private String StuName, Course;

public int getStuId() {
	return StuId;
}
public void setStuId(int stuId) {
	StuId = stuId;
}
public String getStuName() {
	return StuName;
}
public void setStuName(String stuName) {
	StuName = stuName;
}
public String getCourse() {
	return Course;
}
public void setCourse(String course) {
	Course = course;
}
@Override
public String toString() {
	return "Student [StuId=" + StuId + ", StuName=" + StuName + ", Course=" + Course + "]";
}

}
