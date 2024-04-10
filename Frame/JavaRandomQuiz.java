package Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.sound.midi.Track;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.Document;
import javax.swing.undo.UndoManager;
import DB.*;

public class JavaRandomQuiz extends JFrame{//StartFrame
	private Image screenImage;		//더블 버퍼링을 위해 전체 이미지를 담는 인스턴스
	private Graphics screenGraphic;
	
	private ImageIcon img1 = new ImageIcon("src/images/startButtonBasic.png");
	private ImageIcon img2 = new ImageIcon("src/images/startButtoEntered.png");
	
	private ImageIcon exitButtonBasicImage = (new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png")));
	private ImageIcon exitButtonEnteredImage = (new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png")));
	private ImageIcon startButtonBasicImage = (new ImageIcon(Main.class.getResource("../images/startButtonBasic.png")));
	private ImageIcon startButtonEnteredImage = (new ImageIcon(Main.class.getResource("../images/startButtonEntered.png")));
	private ImageIcon explainButtonBasicImage = (new ImageIcon(Main.class.getResource("../images/explainButtonBasic.png")));
	private ImageIcon explainButtonEnteredImage = (new ImageIcon(Main.class.getResource("../images/explainButtonEntered.png"))); 
	private ImageIcon menuButtonBasicImage = (new ImageIcon(Main.class.getResource("../images/menuButtonBasic.png")));
	private ImageIcon menuButtonEnteredImage = (new ImageIcon(Main.class.getResource("../images/menuButtonEntered.png")));
	private ImageIcon backButtonBasicImage = (new ImageIcon(Main.class.getResource("../images/backButtonBasic.png")));      
	private ImageIcon backButtonEnteredImage = (new ImageIcon(Main.class.getResource("../images/backButtonEntered.png"))); 
	private ImageIcon loginButtonBasicImage = (new ImageIcon(Main.class.getResource("../images/loginButtonBasic.png")));
	private ImageIcon loginButtonEnteredImage = (new ImageIcon(Main.class.getResource("../images/loginButtonEntered.png")));
	
	private Image background = new ImageIcon(Main.class.getResource("../images/startFrame.png")).getImage();	//초기화
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));
	
	private JButton exitButton = new JButton(exitButtonBasicImage);
	private JButton startButton = new JButton(startButtonBasicImage);
	private JButton explainButton = new JButton(explainButtonBasicImage);
	private JButton menuButton = new JButton(menuButtonBasicImage);
	private JButton loginButton = new JButton(loginButtonBasicImage);
	
	
	private int mouseX, mouseY;								//마우서 커서

	//ArrayList<Track> examList = new ArrayList<Track>();	// 문제 리스트
	
	public JavaRandomQuiz() {
		setUndecorated(true);								//메뉴바가 나타나지 않음
		setTitle("JavaRandomQuiz");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);		//Main에서 길이,높이 불러움
		setResizable(false);								//창 크기 조절 금지
		setLocationRelativeTo(null);						//창이 중앙에 뜸
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//창 종료
		setVisible(true);									//창이 나타남(무조건!)
		setBackground(new Color(0,0,0,0));					//하얀색
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
		
		//startButton
		startButton.setBounds(500,235,750,200);					//exit버튼
		startButton.setBorderPainted(false);					//아래 3줄은 아이콘의 배경을 제거
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				startButton.setIcon(startButtonEnteredImage);
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));				// 손 모양 커서
			}
			@Override
			public void mouseExited(MouseEvent e) {
				startButton.setIcon(startButtonBasicImage);
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));			//기본 커서
			}
			
			@Override
			public void mousePressed(MouseEvent e) {//시작 이벤트
				startButton.setVisible(false); 
				explainButton.setVisible(false); 
				if(MainFrame.loginCheck==1) {
					new randomPickFrame();
				}
				else {
					JOptionPane.showMessageDialog(null, "로그인을 한 후에 게임을 시작해주세요","게임 시작 실패", JOptionPane.ERROR_MESSAGE);
					new JavaRandomQuiz();
				}
				dispose();
			}
		});
		add(startButton);
		
		//explainButton
		explainButton.setBounds(240,478,100,60);					//exit버튼
		explainButton.setBorderPainted(false);					//아래 2줄은 아이콘의 배경을 제거
		explainButton.setContentAreaFilled(false);
		explainButton.setFocusPainted(false);
		explainButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				explainButton.setIcon(explainButtonEnteredImage);
				explainButton.setCursor(new Cursor(Cursor.HAND_CURSOR));				// 손 모양 커서
			}
			@Override
			public void mouseExited(MouseEvent e) {
				explainButton.setIcon(explainButtonBasicImage);
				explainButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));			//기본 커서
			}
			@Override
			public void mousePressed(MouseEvent e) {
				new ExplainFrame();
				dispose();
			}
		});
		add(explainButton);
		//menuButton
		menuButton.setBounds(345,480,90,54);					//exit버튼
		menuButton.setBorderPainted(false);					//아래 3줄은 아이콘의 배경을 제거
		menuButton.setContentAreaFilled(false);
		menuButton.setFocusPainted(false);
		menuButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menuButton.setIcon(menuButtonEnteredImage);
				menuButton.setCursor(new Cursor(Cursor.HAND_CURSOR));				// 손 모양 커서
			}
			@Override
			public void mouseExited(MouseEvent e) {
				menuButton.setIcon(menuButtonBasicImage);
				menuButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));			//기본 커서
			}
			@Override
			public void mousePressed(MouseEvent e) {
				new ExamButtonFrame();
				dispose();
			}
		});
		add(menuButton);
		
		//loginButton
		loginButton.setBounds(790,440,170,60);					//exit버튼
		loginButton.setBorderPainted(false);					//아래 3줄은 아이콘의 배경을 제거
		loginButton.setContentAreaFilled(false);
		loginButton.setFocusPainted(false);
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				loginButton.setIcon(loginButtonEnteredImage);
				loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));				// 손 모양 커서
			}
			@Override
			public void mouseExited(MouseEvent e) {
				loginButton.setIcon(loginButtonBasicImage);
				loginButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));			//기본 커서
			}
			@Override
			public void mousePressed(MouseEvent e) {
				new Operator();	//로그인 기능을 불러옴
			}
		});
		add(loginButton);
		
		//메뉴바 없애기
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
		
		//System.out.println("아이디 : " + JavaRandomQuiz.member_info[0][JavaRandomQuiz.member_num]);
	}
	//화면을 그려주는 메서드, 꼭 필요함
	public void paint(Graphics g) {	//약속된 메서드
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);	
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);					//함수를 이용하여 이미지를 그림
		g.drawImage(screenImage, 0, 0, null);		//screenImage출력
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(background,0,0,null);			//단순하게 그려주는 함수
		paintComponents(g);							//고정되어있는 이미지
		this.repaint();								//다시 paint함수를 불러옴
	}    
}