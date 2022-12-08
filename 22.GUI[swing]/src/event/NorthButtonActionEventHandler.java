package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * ActionEvent를 처리하기위한 핸들러는 반드시 ActionListener인터페이스를 상속해야한다.
 */
public class NorthButtonActionEventHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("실행쓰레드 이름 : "+Thread.currentThread().getName());
		System.out.println("이벤트쏘스:"+e.getSource());
		System.out.println("north button click!!!");
		
		/*
		 * 프레임의 타이틀변경
		 * contentPane(프레임의 멤버필드)의 배경색변경
		 *  
		 */
		
		
		
	}
	
}
