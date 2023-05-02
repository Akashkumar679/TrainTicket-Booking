package com.ak.ticket.model;

public class TicketBook {

	private int id;
	
	private String coustmername;

	private String departure;

	private String arrival;

	private String age;

	private String gender;

	private String trainclass;

	private String bearth;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCoustmername() {
		return coustmername;
	}

	public void setCoustmername(String coustmername) {
		this.coustmername = coustmername;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTrainclass() {
		return trainclass;
	}

	public void setTrainclass(String trainclas) {
		this.trainclass = trainclas;
	}

	public String getBearth() {
		return bearth;
	}

	public void setBearth(String bearth) {
		this.bearth = bearth;
	}

	public TicketBook( String coustmername, String departure, String arrival, String age, String gender,
			String trainclas, String bearth) {
		
		this.coustmername = coustmername;
		this.departure = departure;
		this.arrival = arrival;
		this.age = age;
		this.gender = gender;
		this.trainclass = trainclas;
		this.bearth = bearth;
	}

	public TicketBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TicketBook [ticketno=" +  ", coustmername=" + coustmername + ", departure=" + departure
				+ ", arrival=" + arrival + ", age=" + age + ", gender=" + gender + ", trainclas=" + trainclass
				+ ", bearth=" + bearth + "]";
	}

	

}
