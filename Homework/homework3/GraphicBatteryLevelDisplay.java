package observer_homework;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class GraphicBatteryLevelDisplay implements Observer {
	private static final int USING_UNIT = 10; //���͸� �Һ�/���� ����
	private JFrame jframe;
	private Battery battery;
	private JLabel [] labels;
	private JLabel endLabel;
	private JButton consumeButton;
	private JButton chargeButton;
	private JLabel percentageLabel;
	
	public GraphicBatteryLevelDisplay(Battery battery, JFrame jframe) {
		this.jframe =  jframe;
		this.battery = battery;
		makeComponent(); // ���͸� �ٹ̱�
	}

	private void makeComponent() {
		jframe.setTitle("Battery");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = jframe.getContentPane();
		container.setLayout(null);
		//���͸� ��ü �����
		labels = new JLabel[5];
		for(int i=0; i<labels.length; i++ ) {
			labels[i] = new JLabel();
			labels[i].setLocation(160*i +50, 50);
			labels[i].setSize(150, 300);
			labels[i].setBackground(Color.GREEN);
			labels[i].setOpaque(true);
			labels[i].setBorder(new LineBorder(Color.BLACK,1));
			container.add(labels[i]);
		}
		//���͸� �� �����
		endLabel = new JLabel();
		endLabel.setLocation(850, 130);
		endLabel.setSize(70, 150);
		endLabel.setBackground(Color.GREEN);
		endLabel.setBorder(new LineBorder(Color.BLACK,1));
		endLabel.setOpaque(true);
		container.add(endLabel);
		//�̺�Ʈ ������ ����
		MyActionListener listener = new MyActionListener();
		//��ư ����
		consumeButton = new JButton("Consume");
		consumeButton.setLocation(300, 400);
		consumeButton.setSize(100,20);
		consumeButton.addActionListener(listener);
		container.add(consumeButton);
		
		chargeButton = new JButton("Charge");
		chargeButton.setLocation(600, 400);
		chargeButton.setSize(100,20);
		chargeButton.addActionListener(listener);
		container.add(chargeButton);
		//���͸� �뷮 �� �����
		percentageLabel = new JLabel();
		percentageLabel.setLocation(450, 400);
		percentageLabel.setSize(100,20);
		percentageLabel.setVerticalAlignment(SwingConstants.CENTER);
		percentageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		percentageLabel.setText(String.valueOf(battery.getLevel())+ "%");
		container.add(percentageLabel);
		
		jframe.setSize(1000, 500);
		jframe.setVisible(true);
	}

	public void update() {
		int level = battery.getLevel();
		percentageLabel.setText(level + "%");
		checkLevel();
		jframe.setVisible(true);
	}
	//���͸� �뷮�� ���� ��ĥ�ϱ�(20����)
	private void checkLevel() {
		int level = battery.getLevel();
		if(level == 0) {
			paintBatteryBody(5);
			paintBatteryHead(false);
		} else if(level <= 20) {
			paintBatteryBody(4);
			paintBatteryHead(false);
		} else if(level <= 40) {
			paintBatteryBody(3);
			paintBatteryHead(false);
		} else if(level <= 60) {
			paintBatteryBody(2);
			paintBatteryHead(false);
		} else if(level <= 80) {
			paintBatteryBody(1);
			paintBatteryHead(false);
		} else if(level < 100){
			paintBatteryBody(0);
			paintBatteryHead(false);
		} else if(level == 100){
			paintBatteryBody(0);
			paintBatteryHead(true);
		}
		
	}
	//���͸� ��ü ��ĥ�ϱ�
	private void paintBatteryBody(int consume) {
		for(int i=0; i<labels.length - consume; i++)
			if(consume >= 2)
				labels[i].setBackground(Color.RED);
			else
				labels[i].setBackground(Color.GREEN);
		
		for(int i=labels.length - consume; i<labels.length; i++)
			labels[i].setBackground(Color.WHITE);
	}
	//���͸� ���� ��ĥ�ϱ�
	private void paintBatteryHead(boolean how) {
			if (how) 
				endLabel.setBackground(Color.GREEN);
			else 
				endLabel.setBackground(Color.WHITE);			
	}
	//�̺�Ʈ ������(Consume, Charge ��ư)
	class MyActionListener implements  ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton)e.getSource();
			if(button.getText().equals("Consume"))
				battery.consume(USING_UNIT);
			else if(button.getText().equals("Charge"))
				battery.charge(USING_UNIT);
		}
	}
}