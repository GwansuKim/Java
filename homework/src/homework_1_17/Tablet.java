package homework_1_17;

public interface Tablet {
	//상수
	public static final int TABLET_MODE = 2;
	
	//추상 메소드
	public abstract void watchVideo();	//영상을 출력하는 기능
	public abstract void useApp();		//앱을 사용하는 기능
}
