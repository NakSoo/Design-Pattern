package observer_homework;

import java.awt.Color;

import javax.swing.JFrame;

//Thread를 이용하여 배경색을 바꿔주는 클래스
public class ColorChanger extends Thread {
	private JFrame jframe;
	private Battery battery;
	private Color [] colorList = {Color.WHITE, Color.BLUE, Color.CYAN, Color.YELLOW, Color.RED, 
			Color.ORANGE, Color.PINK }; //배경색 리스트
	
	public ColorChanger(Battery battery, JFrame jframe) {
		this.battery = battery;
		this.jframe = jframe;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				int level = battery.getLevel();
				//배터리 40% 넘으면 배경 하얀색으로 바꾸고 스레드 종료
				if(level > 40) { 
					jframe.getContentPane().setBackground(colorList[0]); 
					jframe.setVisible(true);
					break;
				}
				//배경색 바꾸기
				for(int i=0; i<colorList.length; i++) {
					jframe.getContentPane().setBackground(colorList[i]);
					jframe.setVisible(true);
					sleep(100);					
				}
			} catch(InterruptedException e) {return; }
		}
	}
}