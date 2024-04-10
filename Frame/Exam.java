package Frame;

import Frame.problemSolveFrame;
import DB.Database;
import DB.JoinFrame;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam extends JFrame{
	
	private Image screenImage;
	private Graphics screenGraphic;
	
	private ImageIcon exitButtonBasicImage = (new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png")));
	private ImageIcon exitButtonEnteredImage = (new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png")));   
	private ImageIcon answerButtonBasicImage = (new ImageIcon(Main.class.getResource("../images/answerButtonBasic.png")));
	private ImageIcon answerButtonEnteredImage = (new ImageIcon(Main.class.getResource("../images/answerButtonEntered.png")));   
	private ImageIcon understandButtonBasicImage = (new ImageIcon(Main.class.getResource("../images/understandButtonBasic.png")));
	private ImageIcon understandButtonEnteredImage = (new ImageIcon(Main.class.getResource("../images/understandButtonEntered.png")));   
	private ImageIcon retryButtonBasicImage = (new ImageIcon(Main.class.getResource("../images/retryButtonBasic.png")));
	private ImageIcon retryButtonEnteredImage = (new ImageIcon(Main.class.getResource("../images/retryButtonEntered.png")));
	private ImageIcon ExamCoverImage = (new ImageIcon(Main.class.getResource("../images/ExamCover.png")));

	private Image exam_1 = new ImageIcon(Main.class.getResource("../images/exam_1.png")).getImage();	
	private Image exam_2 = new ImageIcon(Main.class.getResource("../images/exam_2.png")).getImage();	
	private Image exam_3 = new ImageIcon(Main.class.getResource("../images/exam_3.png")).getImage();	
	private Image exam_4 = new ImageIcon(Main.class.getResource("../images/exam_4.png")).getImage();	
	private Image exam_5 = new ImageIcon(Main.class.getResource("../images/exam_5.png")).getImage();	
	private Image exam_6 = new ImageIcon(Main.class.getResource("../images/exam_6.png")).getImage();	
	private Image exam_7 = new ImageIcon(Main.class.getResource("../images/exam_7.png")).getImage();	
	private Image exam_8 = new ImageIcon(Main.class.getResource("../images/exam_8.png")).getImage();	
	private Image exam_9 = new ImageIcon(Main.class.getResource("../images/exam_9.png")).getImage();	
	private Image exam_10= new ImageIcon(Main.class.getResource("../images/exam_10.png")).getImage();	
	private Image exam_11= new ImageIcon(Main.class.getResource("../images/exam_11.png")).getImage();	
	private Image exam_12= new ImageIcon(Main.class.getResource("../images/exam_12.png")).getImage();	
	private Image exam_13= new ImageIcon(Main.class.getResource("../images/exam_13.png")).getImage();	
	private Image exam_14= new ImageIcon(Main.class.getResource("../images/exam_14.png")).getImage();	
	private Image exam_15= new ImageIcon(Main.class.getResource("../images/exam_15.png")).getImage();	
	private Image exam_16= new ImageIcon(Main.class.getResource("../images/exam_16.png")).getImage();	
	private Image exam_17= new ImageIcon(Main.class.getResource("../images/exam_17.png")).getImage();	
	private Image exam_18= new ImageIcon(Main.class.getResource("../images/exam_18.png")).getImage();	
	private Image exam_19= new ImageIcon(Main.class.getResource("../images/exam_19.png")).getImage();	
	private Image exam_20= new ImageIcon(Main.class.getResource("../images/exam_20.png")).getImage();	
	private Image exam_21= new ImageIcon(Main.class.getResource("../images/exam_21.png")).getImage();	
	private Image exam_22= new ImageIcon(Main.class.getResource("../images/exam_22.png")).getImage();	
	private Image exam_23= new ImageIcon(Main.class.getResource("../images/exam_23.png")).getImage();	
	private Image exam_24= new ImageIcon(Main.class.getResource("../images/exam_24.png")).getImage();	
	private Image exam_25= new ImageIcon(Main.class.getResource("../images/exam_25.png")).getImage();	
	private Image exam_26= new ImageIcon(Main.class.getResource("../images/exam_26.png")).getImage();	
	private Image exam_27= new ImageIcon(Main.class.getResource("../images/exam_27.png")).getImage();	
	private Image exam_28= new ImageIcon(Main.class.getResource("../images/exam_28.png")).getImage();	
	private Image exam_29= new ImageIcon(Main.class.getResource("../images/exam_29.png")).getImage();	
	private Image exam_30= new ImageIcon(Main.class.getResource("../images/exam_30.png")).getImage();	
	private Image exam_31= new ImageIcon(Main.class.getResource("../images/exam_31.png")).getImage();	
	private Image exam_32= new ImageIcon(Main.class.getResource("../images/exam_32.png")).getImage();	
	private Image exam_33= new ImageIcon(Main.class.getResource("../images/exam_33.png")).getImage();	
	private Image exam_34= new ImageIcon(Main.class.getResource("../images/exam_34.png")).getImage();	
	private Image exam_35= new ImageIcon(Main.class.getResource("../images/exam_35.png")).getImage();	
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));
	//새로운 문제
	public static int randomExam = 0;		//문제 출력 변수
	public static int checkRandomExam = 0;	//문제 출력 여부 확인 변수
	
	private JButton exitButton = new JButton(exitButtonBasicImage);
	private JButton answerButton = new JButton(answerButtonBasicImage);
	private JButton understandButton = new JButton(understandButtonBasicImage);
	private JButton retryButton = new JButton(retryButtonBasicImage);
	private JButton ExamCover = new JButton(ExamCoverImage);		//문제 덮개
	
	private int mouseX, mouseY;								//마우서 커서
	
	public Exam() {
		Database db = new Database();
		setUndecorated(true);								//메뉴바가 나타나지 않음
		setTitle("exam");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);		//Main에서 길이,높이 불러움
		setResizable(false);								//창 크기 조절 금지
		setLocationRelativeTo(null);						//창이 중앙에 뜸
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//창 종료
		setVisible(true);									//창이 나타남(무조건!)
		setBackground(new Color(0,0,0,0));					//하얀색
		setLayout(null);
		
		//랜덤 돌려주기
		boolean result_ = true;
		while(result_) {
			Exam.checkRandomExam = (int)(Math.random()*35+1);	//임의의 숫자를 저장
			result_ = db.checkRandomNum(checkRandomExam);		//checkRandomNum에서 이미지 버튼을 바꿔줌
		}
		
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
		//menuBar 그려주기
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
		//answerButton
		answerButton.setBounds(130,660,120,60);					//exit버튼
		answerButton.setBorderPainted(false);					//아래 3줄은 아이콘의 배경을 제거
		answerButton.setContentAreaFilled(false);
		answerButton.setFocusPainted(false);
		answerButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				answerButton.setIcon(answerButtonEnteredImage);
				answerButton.setCursor(new Cursor(Cursor.HAND_CURSOR));				// 손 모양 커서
			}
			@Override
			public void mouseExited(MouseEvent e) {
				answerButton.setIcon(answerButtonBasicImage);
				answerButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));			//기본 커서
			}
			@Override
			public void mousePressed(MouseEvent e) {
				ExamCover.setVisible(false);
			} 
		});
		add(answerButton);
		
		//understandButton
		understandButton.setBounds(500,660,150,60);					//exit버튼
		understandButton.setBorderPainted(false);					//아래 3줄은 아이콘의 배경을 제거
		understandButton.setContentAreaFilled(false);
		understandButton.setFocusPainted(false);
		understandButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				understandButton.setIcon(understandButtonEnteredImage);
				understandButton.setCursor(new Cursor(Cursor.HAND_CURSOR));				// 손 모양 커서
			}
			@Override
			public void mouseExited(MouseEvent e) {
				understandButton.setIcon(understandButtonBasicImage);
				understandButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));			//기본 커서
			}
			@Override
			public void mousePressed(MouseEvent e) {
				new JavaRandomQuiz();
				db.add_num(Exam.randomExam);
				Database.count++;
				dispose();
			}
		});
		add(understandButton);
		//retryButton
		retryButton.setBounds(850,660,350,60);					//exit버튼
		retryButton.setBorderPainted(false);					//아래 3줄은 아이콘의 배경을 제거
		retryButton.setContentAreaFilled(false);
		retryButton.setFocusPainted(false);
		retryButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				retryButton.setIcon(retryButtonEnteredImage);
				retryButton.setCursor(new Cursor(Cursor.HAND_CURSOR));				// 손 모양 커서
			}
			@Override
			public void mouseExited(MouseEvent e) {
				retryButton.setIcon(retryButtonBasicImage);
				retryButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));			//기본 커서
			}
			@Override
			public void mousePressed(MouseEvent e) {
				new JavaRandomQuiz();
				dispose();
			}
		});
		add(retryButton);
		//ExamCover
		ExamCover.setBounds(0,0,1280,720);					//exit버튼
		ExamCover.setBorderPainted(false);					//아래 3줄은 아이콘의 배경을 제거
		ExamCover.setContentAreaFilled(false);
		ExamCover.setFocusPainted(false);
		add(ExamCover);
	}
	
	//화면을 그려주는 메서드, 꼭 필요함
	public void paint(Graphics g) {		
		switch(Exam.randomExam) {
		case 1:		g.drawImage(exam_1, 0, 0, null);	break;
		case 2:		g.drawImage(exam_2, 0, 0, null);	break;
		case 3:		g.drawImage(exam_3, 0, 0, null);	break;
		case 4:		g.drawImage(exam_4, 0, 0, null);	break;
		case 5:		g.drawImage(exam_5, 0, 0, null);	break;
		case 6:		g.drawImage(exam_6, 0, 0, null);	break;
		case 7:		g.drawImage(exam_7, 0, 0, null);	break;
		case 8:		g.drawImage(exam_8, 0, 0, null);	break;
		case 9:		g.drawImage(exam_9, 0, 0, null);	break;
		case 10:	g.drawImage(exam_10, 0, 0, null);	break;
		case 11:	g.drawImage(exam_11, 0, 0, null);	break;
		case 12:	g.drawImage(exam_12, 0, 0, null);	break;
		case 13:	g.drawImage(exam_13, 0, 0, null);	break;
		case 14:	g.drawImage(exam_14, 0, 0, null);	break;
		case 15:	g.drawImage(exam_15, 0, 0, null);	break;
		case 16:	g.drawImage(exam_16, 0, 0, null);	break;
		case 17:	g.drawImage(exam_17, 0, 0, null);	break;
		case 18:	g.drawImage(exam_18, 0, 0, null);	break;
		case 19:	g.drawImage(exam_19, 0, 0, null);	break;
		case 20:	g.drawImage(exam_20, 0, 0, null);	break;
		case 21:	g.drawImage(exam_21, 0, 0, null);	break;
		case 22:	g.drawImage(exam_22, 0, 0, null);	break;
		case 23:	g.drawImage(exam_23, 0, 0, null);	break;
		case 24:	g.drawImage(exam_24, 0, 0, null);	break;
		case 25:	g.drawImage(exam_25, 0, 0, null);	break;
		case 26:	g.drawImage(exam_26, 0, 0, null);	break;
		case 27:	g.drawImage(exam_27, 0, 0, null);	break;
		case 28:	g.drawImage(exam_28, 0, 0, null);	break;
		case 29:	g.drawImage(exam_29, 0, 0, null);	break;
		case 30:	g.drawImage(exam_30, 0, 0, null);	break;
		case 31:	g.drawImage(exam_31, 0, 0, null);	break;
		case 32:	g.drawImage(exam_32, 0, 0, null);	break;
		case 33:	g.drawImage(exam_33, 0, 0, null);	break;
		case 34:	g.drawImage(exam_34, 0, 0, null);	break;
		case 35:	g.drawImage(exam_35, 0, 0, null);	break;
		}		
		paintComponents(g);							//고정되어있는 이미지
		this.repaint();								//다시 paint함수를 불러옴
	}	
     
}
// image scrollable 검색 후 이미지 스크롤 되는지 확인하기