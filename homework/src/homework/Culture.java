package homework;

public abstract class Culture {
	//필드
	protected String title;
	protected int directorCnt;
	protected int actorCnt;
	protected int audienceCnt;
	protected int totalScore;
	
	//생성자
	public Culture (String title, int directorCnt, int actorCnt) {
		this.title = title;
		this.directorCnt = directorCnt;
		this.actorCnt = actorCnt;
	}
	
	//메소드
	public void setTotalScore(int score) {
		audienceCnt++;
		totalScore += score;
	}
	
	public abstract String getGrade();
	

	public abstract void getInformation();
}
