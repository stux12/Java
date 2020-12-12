package telinfoDTO;

import java.util.Date;

public class TelinfoDTO { // DTO(VO) - DAO(insert,delete,update,select) - DB
	// DTO = Data Transfer Object
	// VO = Value Object
	// DAO = Data Access Object

	// DTO(VO)
	private int id; // id number
	private String name; // name varchar2
	private String tel; // tel varchar2
	private Date d; // d date

	// get, set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	// 생성자
	public TelinfoDTO(int id, String name, String tel, Date d) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.d = d;
	}

	public TelinfoDTO() {
	}

}
