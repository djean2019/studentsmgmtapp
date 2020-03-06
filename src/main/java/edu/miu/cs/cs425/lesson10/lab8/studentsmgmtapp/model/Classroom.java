package edu.miu.cs.cs425.lesson10.lab8.studentsmgmtapp.model;

public class Classroom{
	
}
//
//import java.util.List;
//import java.util.Set;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import org.springframework.data.annotation.Id;
//
//@Entity
//@Table(name="classroms")
//public class Classroom {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private long classroomId;
//	
//	@Column(name="building_name", nullable=false)
//	private String buildingName;
//	
//	@Column(name="room_number", nullable=false)
//	private String roomNumber;
//	
//	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "classroom")//cascade = CascadeType.ALL)
//    //@JoinColumn(name="jnd_clr_stud")
//	//private Set<Student> student;
//	@OneToOne(mappedBy = "classroom")
//	private Set<Student> student;
//	
//	public Classroom(String buildingName, String roomNumber) {
//		this.buildingName = buildingName;
//		this.roomNumber = roomNumber;
//	}
//	
//	public long getClassroomId() {
//		return classroomId;
//	}
//
//	public void setClassroomId(long classroomId) {
//		this.classroomId = classroomId;
//	}
//
//	public String getBuildingName() {
//		return buildingName;
//	}
//	
//	public Set<Student> getStudent(){
//		return student;
//	}
//	
//	public void setBuildingName(String buildingName) {
//		this.buildingName = buildingName;
//	}
//
//	public String getRoomNumber() {
//		return roomNumber;
//	}
//
//	public void setRoomNumber(String roomNumber) {
//		this.roomNumber = roomNumber;
//	}
//	
//	public void setStudent(Set<Student> student) {
//		this.student=student;
//	}
//
//
//	@Override
//	public String toString() {
//		return String.format("Classroom [classroomId=%s, buildingName=%s, roomNumber=%s]", classroomId, buildingName,
//				roomNumber);
//	}
//
//}
