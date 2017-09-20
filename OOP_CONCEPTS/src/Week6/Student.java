package Week6;

public class Student {
	
	public static final int currentYear = 60;
	
	public static enum GradeLevel {
		FRESHMAN , SOPHOMORE , JUNIOR , SENIOR , OTHER
	}
	
	private String id;
	private String name;
	private GradeLevel level;
	
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		setLevel(currentYear - Integer.parseInt(id.substring(0,2)));
	}
	
	

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public GradeLevel getLevel() {
		return level;
	}



	public void setLevel(GradeLevel level) {
		this.level = level;
	}



	public void setLevel(int level) {

		switch (level) {
		case 0:
			this.level = GradeLevel.FRESHMAN;
			break;
		case 1:
			this.level = GradeLevel.SOPHOMORE;
			break;
		case 2:
			this.level = GradeLevel.JUNIOR;
			break;
		case 3:
			this.level = GradeLevel.SENIOR;
			break;
		default:
			this.level = GradeLevel.OTHER;
			break;
		}
		
	}
	
	public String getStringLevel(){
		
		switch (level) {
		case FRESHMAN:
			return "1st year student";
		case SOPHOMORE:
			return "2st year student";
		case JUNIOR:
			return "3st year student";
		case SENIOR:
			return "4st year student";
		default:
			return "5st year student";
		}
	}
	
	

}
