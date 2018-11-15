package observer_homework;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GraphicLowBatteryWarning implements Observer {
	private JFrame jframe;
	private Battery battery;
	private ColorChanger colorChanger;
	
	public GraphicLowBatteryWarning(Battery battery, JFrame jframe) {
		this.battery = battery;
		this.jframe = jframe;
		colorChanger = new ColorChanger(battery, jframe);
	}

	@Override
	public void update() {
		int level = battery.getLevel();
		if(level <= 40 && !colorChanger.isAlive() ) { //배터리 용량이 40이하, 실행중인 스레드 없을시 스레드 생성	
			colorChanger = new ColorChanger(battery, jframe);
			colorChanger.start();
		}
	}			
}