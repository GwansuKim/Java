package homework;

public class Movie extends Culture {
	// 필드
	private String genre;

	// 생성자
	public Movie(String title, int directorCnt, int actorCnt, String genre) {
		super(title, directorCnt, actorCnt);
		this.genre = genre;
	}

	// 메소드
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
		System.out.println("영화제목 : " + title);
		System.out.println("감독 : " + directorCnt);
		System.out.println("배우 : " + actorCnt);
		System.out.println("영화총점 : " + totalScore);
		System.out.println("영화평점 : " + getGrade());
	}
}
