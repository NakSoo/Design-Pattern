package observer_homework;

import javax.swing.JFrame;
import java.awt.*;

public class Client {
	
	public static void main(String [] args) {
		Battery battery = new Battery();
		JFrame jframe = new JFrame();
		
		BatteryLevelDisplay batteryDisplay = new BatteryLevelDisplay(battery);
		LowBatteryWarning lowBatteryWarning = new LowBatteryWarning(battery);
		GraphicBatteryLevelDisplay graphic = new GraphicBatteryLevelDisplay(battery, jframe);
		GraphicLowBatteryWarning warningGraphic = new GraphicLowBatteryWarning(battery, jframe);
		//옵서버 등록
		battery.addObserver(batteryDisplay);
		battery.addObserver(lowBatteryWarning);
		battery.addObserver(graphic);
		battery.addObserver(warningGraphic);
	}
}
