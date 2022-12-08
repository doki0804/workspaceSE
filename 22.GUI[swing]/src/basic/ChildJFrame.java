package basic;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
 * GUI프로그래밍 방법
 *   1.  컨테이너클래스준비(JFrame)상속
 *   2.  컨테이너클래스(JFrame)객체생성
 *   3.  컨테이너(JFrame)객체의 크기설정
 *   4.  컴포넌트생성(컨테이너(JFrame)의 멤버필드)
 *   5.  컨테이너(JFrame)에 컴포넌트 부치기(add) 
 *   6.  컨테이너객체 보여주기
 */
public class ChildJFrame extends JFrame{
	private JPanel contentPane;
	/*
	 * 컴포넌트를 멤버필드로 선언
	 */
	private JButton okBtn;
	private JButton cancleBtn;
	
	
	
	
	public ChildJFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("나의첫번째프레임");
		this.contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		this.setContentPane(contentPane);
		/*
		 * 컴포넌트객체생성
		 */
		okBtn = new JButton("확인");
		cancleBtn = new JButton("취소");
		/*
		 * 컨테이너에 컴포넌트를 붙인다.
		 */
		contentPane.setLayout(null);
		okBtn.setBounds(40, 40, 80, 40);
		cancleBtn.setBounds(130, 40, 80, 40);
		
		contentPane.add(okBtn);
		contentPane.add(cancleBtn);
		
		
		
		
		this.setSize(300,400);
		/*
		 * 1.JFrame객체 화면에 보여주세요
		 */
		this.setVisible(true);
		/*
		 * 1.Container[JFrame].setVisible(true);
		 *   - 메인쓰레드가 호출하면 JVM GUI쓰레드를 생성
		 *   - GUI쓰레드는 무한대기하면서 이벤트와 그래픽처리를 담당
		 *   - Container[JFrame]는 계속떠있다.
		 *     (JVM이 종료되지 않는다.)
		 */
	}
	public static void main(String[] args) {
		new ChildJFrame();
	}
	
}
