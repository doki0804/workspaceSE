package basic;

import javax.swing.JFrame;

public class ChildJFrameMain {

	public static void main(String[] args) {
		/*
		 * 1.JFrame객체생성
		 */
		ChildJFrame childJFrame= new ChildJFrame();
		
		/*
		 * 2.JFrame객체생성
		 */
		//JFrame jFrame = new JFrame();
		//jFrame.setTitle("난 걍프레임");
		//jFrame.setSize(300, 400);
		/*
		 * 2.JFrame객체 화면에 보여주세요
		 */
		//jFrame.setVisible(true);
		/*
		 * 1.Container[JFrame].setVisible(true);
		 *   - 메인쓰레드가 호출하면 JVM GUI쓰레드를 생성
		 *   - GUI쓰레드는 무한대기하면서 이벤트와 그래픽처리를 담당
		 *   - Container[JFrame]는 계속떠있다.
		 *     (JVM이 종료되지 않는다.)
		 */
		
		
		
		
		
	}
}
