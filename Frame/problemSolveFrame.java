package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class problemSolveFrame extends JFrame{
	
	private Image screenImage;
	private Graphics screenGraphic;

	private ImageIcon exitButtonBasicImage = (new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png")));
	private ImageIcon exitButtonEnteredImage = (new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png")));     
	
	private JButton exitButton = new JButton(exitButtonBasicImage);
	
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));	//메뉴바 없애기
	
	private int mouseX, mouseY;								//마우서 커서
	
	public problemSolveFrame() {
		
		setUndecorated(true);								//메뉴바가 나타나지 않음
		setTitle("problemSolveFrame");
		setSize(520,300);		//Main에서 길이,높이 불러움
		setResizable(false);								//창 크기 조절 금지
		setLocationRelativeTo(null);						//창이 중앙에 뜸
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//창 종료
		setVisible(true);									//창이 나타남(무조건!)
		setBackground(new Color(0,0,0,0));					//이걸 해야지 배경화면이 나타남
		setLocation(870,400);	//notebook전용
		//setLocation(1060,510);	//pc전용
		setLayout(null);
		
		//textArea 설정
		JPanel pl = new JPanel();
		JTextArea ta = new JTextArea("여기에서 문제를 풀고 '정답' 버튼을 눌러 정답을 확인해보세요!");
		pl.setSize(520,270);				//textArea의 크기 설정
		pl.setLocation(0,30);				//textArea의 위치 설정
		pl.setLayout(new BorderLayout());	//textArea가 화면에 가득차게 함
		pl.add(new JScrollPane(ta), BorderLayout.CENTER);	//textArea 스크롤 기능
		add(pl);
		//font 설정
		Font font = new Font("나눔고딕", Font.PLAIN, 17);	//글꼴, 글자크기
        ta.setFont(font);
        //textArea를 처음 클릭했을 때 글씨가 초기화되는 기능
        ta.addMouseListener(new MouseAdapter() {
        	int count=0;
        	@Override
			public void mousePressed(MouseEvent e) {
        		if(count==0) {	//처음 설명내용만 없어짐
        			ta.setText(null);
        		}
        		count++;
			}
        });
		
		//exitButton
		exitButton.setBounds(490,0,30,30);					//exit버튼
		exitButton.setBorderPainted(false);					//아래 3줄은 아이콘의 배경을 제거
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitButtonEnteredImage);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));				// 손 모양 커서
			}
			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButtonBasicImage);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));			//기본 커서
			}
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		add(exitButton);
		
		menuBar.setBounds(0,0,1280,30);						//위치와 크기를 정해줌
		add(menuBar);										//menuBar
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {		//마우스가 무언가를 눌렀을 때의 행동
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter(){	//메뉴바 잡고 이동
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});
		add(menuBar);
		
		JTextField tf = new JTextField();
		setTitle(tf.getText());
		add(tf, BorderLayout.CENTER);
		tf.setVisible(true);
		
	}
	//화면을 그려주는 메서드, 꼭 필요함
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);	
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);					//함수를 이용하여 이미지를 그림
		g.drawImage(screenImage, 0, 0, null);		//screenImage출력
	}
		
	public void screenDraw(Graphics g) {
		//g.drawImage(explainFrame,0,0,null);			//단순하게 그려주는 함수
		paintComponents(g);							//고정되어있는 이미지
		this.repaint();								//다시 paint함수를 불러옴
	}
}
