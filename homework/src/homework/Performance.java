package homework;

public class Performance extends Culture{
	//필드
	private String genre;
	
	//생성자
	public Performance(String title, int directorCnt, int actorCnt, String genre) {
		super(title, directorCnt, actorCnt);
		this.genre = genre;
	}
	
	//메소드
	@Override
	public String getGrade() {
		String str = "";
		for (int i = 0; i < totalScore / audienceCnt; i++) {
			str += "☆";
		}
		return str;
	}
	
	@Override
	public void getInformation() {
		System.out.println("공연제목 : " + title);
		System.out.println("감독 : " + directorCnt);
		System.out.println("배우 : " + actorCnt);
		System.out.println("공연총점 : " + totalScore);
		System.out.println("공연평점 : " + getGrade());
	}
}
