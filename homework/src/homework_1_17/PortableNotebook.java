package homework_1_17;

public class PortableNotebook implements Notebook, Tablet {
	// 필드
	private int mode = NOTEBOOK_MODE;
	private String docProgram;
	private String internet;
	private String kindOfVideo;
	private String kindOfApp;

	// 생성자
	public PortableNotebook(String docProgram, String internet, String kindOfVideo, String kindOfApp) {
		this.docProgram = docProgram;
		this.internet = internet;
		this.kindOfVideo = kindOfVideo;
		this.kindOfApp = kindOfApp;
		System.out.println("NOTEBOOK_MODE");
	}

	// 메소드
	@Override
	public void watchVideo() {
		System.out.printf("%s을(를) 시청\n", kindOfVideo);
	}

	@Override
	public void useApp() {
		if (mode == 1) {
			this.mode = TABLET_MODE;
			System.out.println("TABLET_MODE");
			System.out.printf("%s을(를) 실행\n", kindOfApp);
		}
	}

	@Override
	public void writeDocumentaion() {
		System.out.printf("%s을(를) 통해 문서를 작성\n", docProgram);
	}

	@Override
	public void searchInternet() {
		System.out.printf("%s을(를) 통해 인터넷을 검색\n", internet);
	}
	
	public void changeMode() {
		if (mode == 1) {
			this.mode = TABLET_MODE;
			System.out.println("현재 모드 : TABLET_MODE");
		} else {
			this.mode = NOTEBOOK_MODE;
			System.out.println("현재 모드 : NOTEBOOK_MODE");
		}
	}

}
