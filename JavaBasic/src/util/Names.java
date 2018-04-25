package util;

public enum Names {

	GILDONG("개발자"){
		public String salary(){
			return "추가급여";
		}
	},
	GILJA("웹디자이너"),
	GILSOOK("관리자"),
	GILJIN("개발자");
	
	//-----------
	
	private String job;

	Names(String job) {
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	//-----------
	public String salary(){
		return "고정급여";
	}
	
}
