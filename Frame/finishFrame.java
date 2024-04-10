package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class finishFrame extends JFrame{
	
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image explainFrame = new ImageIcon(Main.class.getResource("../images/finishFrame.png")).getImage();	//배경 이미지
	
	private ImageIcon exitButtonBasicImage = (new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png")));
	private ImageIcon exitButtonEnteredImage = (new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png")));     
	private ImageIcon backButtonBasicImage = (new ImageIcon(Main.class.getResource("../images/backButtonBasic.png")));      
	private ImageIcon backButtonEnteredImage = (new ImageIcon(Main.class.getResource("../images/backButtonEntered.png")));
	private ImageIcon finishButtonBasicImage = (new ImageIcon(Main.class.getResource("../images/finishButtonBasic.png")));
	private ImageIcon finishButtonEnteredImage = (new ImageIcon(Main.class.getResource("../images/finishButtonEntered.png")));
	
	private JButton backButton = new JButton(backButtonBasicImage);	
	private JButton exitButton = new JButton(exitButtonBasicImage);
	private JButton finishButton = new JButton(finishButtonBasicImage);
	
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));	//메뉴바 없애기
	
	private int mouseX, mouseY;								//마우서 커서
	
	public finishFrame() {
		
		setUndecorated(true);								//메뉴바가 나타나지 않음
		setTitle("explainFrame");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);		//Main에서 길이,높이 불러움
		setResizable(false);								//창 크기 조절 금지
		setLocationRelativeTo(null);						//창이 중앙에 뜸
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//창 종료
		setVisible(true);									//창이 나타남(무조건!)
		setBackground(new Color(0,0,0,0));					//이걸 해야지 배경화면이 나타남
		setLayout(null);
		
		//exitButton
		exitButton.setBounds(1245,0,30,30);					//exit버튼
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
				System.exit(0);
			}
		});
		add(exitButton);
		
		//backButton
		backButton.setBounds(60,75,320,70);					//exit버튼
		backButton.setBorderPainted(false);					//아래 3줄은 아이콘의 배경을 제거
		backButton.setContentAreaFilled(false);
		backButton.setFocusPainted(false);
		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				backButton.setIcon(backButtonEnteredImage);
				backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));				// 손 모양 커서
			}
			@Override
			public void mouseExited(MouseEvent e) {
				backButton.setIcon(backButtonBasicImage);
				backButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));			//기본 커서
			}
			@Override
			public void mousePressed(MouseEvent e) {
				new JavaRandomQuiz();
				setVisible(false);
			}
		});
		add(backButton);
		
		//finishButton
		finishButton.setBounds(480,280,320,320);					//exit버튼
		finishButton.setBorderPainted(false);					//아래 3줄은 아이콘의 배경을 제거
		finishButton.setContentAreaFilled(false);
		finishButton.setFocusPainted(false);
		finishButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				finishButton.setIcon(finishButtonEnteredImage);
				finishButton.setCursor(new Cursor(Cursor.HAND_CURSOR));				// 손 모양 커서
			}
			@Override
			public void mouseExited(MouseEvent e) {
				finishButton.setIcon(finishButtonBasicImage);
				backButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));			//기본 커서
			}
			@Override
			public void mousePressed(MouseEvent e) {
				new JavaRandomQuiz();
				setVisible(false);
			}
		});
		add(finishButton);
		
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
		
	}
	//화면을 그려주는 메서드, 꼭 필요함
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);	
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);					//함수를 이용하여 이미지를 그림
		g.drawImage(screenImage, 0, 0, null);		//screenImage출력
	}
		
	public void screenDraw(Graphics g) {
		g.drawImage(explainFrame,0,0,null);			//단순하게 그려주는 함수
		paintComponents(g);							//고정되어있는 이미지
		this.repaint();								//다시 paint함수를 불러옴
	}
		
}
