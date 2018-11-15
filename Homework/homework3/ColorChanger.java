package observer_homework;

import java.awt.Color;

import javax.swing.JFrame;

//Thread�� �̿��Ͽ� ������ �ٲ��ִ� Ŭ����
public class ColorChanger extends Thread {
	private JFrame jframe;
	private Battery battery;
	private Color [] colorList = {Color.WHITE, Color.BLUE, Color.CYAN, Color.YELLOW, Color.RED, 
			Color.ORANGE, Color.PINK }; //���� ����Ʈ
	
	public ColorChanger(Battery battery, JFrame jframe) {
		this.battery = battery;
		this.jframe = jframe;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				int level = battery.getLevel();
				//���͸� 40% ������ ��� �Ͼ������ �ٲٰ� ������ ����
				if(level > 40) { 
					jframe.getContentPane().setBackground(colorList[0]); 
					jframe.setVisible(true);
					break;
				}
				//���� �ٲٱ�
				for(int i=0; i<colorList.length; i++) {
					jframe.getContentPane().setBackground(colorList[i]);
					jframe.setVisible(true);
					sleep(100);					
				}
			} catch(InterruptedException e) {return; }
		}
	}
}