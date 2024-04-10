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

public class ExamButtonFrame extends JFrame{
	
	static int examNum;	//랜덤 뽑기 변수
	
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image explainFrame = new ImageIcon(Main.class.getResource("../images/examButtonFrame.png")).getImage();	//배경 이미지
	
	private ImageIcon exitButtonBasicImage = (new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png")));
	private ImageIcon exitButtonEnteredImage = (new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png")));     
	private ImageIcon backButtonBasicImage = (new ImageIcon(Main.class.getResource("../images/backButtonBasic.png")));      
	private ImageIcon backButtonEnteredImage = (new ImageIcon(Main.class.getResource("../images/backButtonEntered.png")));
	private ImageIcon examButton_1Image = (new ImageIcon(Main.class.getResource("../images/examButton_1.png")));
	private ImageIcon examButton_2Image = (new ImageIcon(Main.class.getResource("../images/examButton_2.png")));
	private ImageIcon examButton_3Image = (new ImageIcon(Main.class.getResource("../images/examButton_3.png")));
	private ImageIcon examButton_4Image = (new ImageIcon(Main.class.getResource("../images/examButton_4.png")));
	private ImageIcon examButton_5Image = (new ImageIcon(Main.class.getResource("../images/examButton_5.png")));
	private ImageIcon examButton_6Image = (new ImageIcon(Main.class.getResource("../images/examButton_6.png")));
	private ImageIcon examButton_7Image = (new ImageIcon(Main.class.getResource("../images/examButton_7.png")));
	private ImageIcon examButton_8Image = (new ImageIcon(Main.class.getResource("../images/examButton_8.png")));
	private ImageIcon examButton_9Image = (new ImageIcon(Main.class.getResource("../images/examButton_9.png")));
	private ImageIcon examButton_10Image = (new ImageIcon(Main.class.getResource("../images/examButton_10.png")));
	private ImageIcon examButton_11Image = (new ImageIcon(Main.class.getResource("../images/examButton_11.png")));
	private ImageIcon examButton_12Image = (new ImageIcon(Main.class.getResource("../images/examButton_12.png")));
	private ImageIcon examButton_13Image = (new ImageIcon(Main.class.getResource("../images/examButton_13.png")));
	private ImageIcon examButton_14Image = (new ImageIcon(Main.class.getResource("../images/examButton_14.png")));
	private ImageIcon examButton_15Image = (new ImageIcon(Main.class.getResource("../images/examButton_15.png")));
	private ImageIcon examButton_16Image = (new ImageIcon(Main.class.getResource("../images/examButton_16.png")));
	private ImageIcon examButton_17Image = (new ImageIcon(Main.class.getResource("../images/examButton_17.png")));
	private ImageIcon examButton_18Image = (new ImageIcon(Main.class.getResource("../images/examButton_18.png")));
	private ImageIcon examButton_19Image = (new ImageIcon(Main.class.getResource("../images/examButton_19.png")));
	private ImageIcon examButton_20Image = (new ImageIcon(Main.class.getResource("../images/examButton_20.png")));
	private ImageIcon examButton_21Image = (new ImageIcon(Main.class.getResource("../images/examButton_21.png")));
	private ImageIcon examButton_22Image = (new ImageIcon(Main.class.getResource("../images/examButton_22.png")));
	private ImageIcon examButton_23Image = (new ImageIcon(Main.class.getResource("../images/examButton_23.png")));
	private ImageIcon examButton_24Image = (new ImageIcon(Main.class.getResource("../images/examButton_24.png")));
	private ImageIcon examButton_25Image = (new ImageIcon(Main.class.getResource("../images/examButton_25.png")));
	private ImageIcon examButton_26Image = (new ImageIcon(Main.class.getResource("../images/examButton_26.png")));
	private ImageIcon examButton_27Image = (new ImageIcon(Main.class.getResource("../images/examButton_27.png")));
	private ImageIcon examButton_28Image = (new ImageIcon(Main.class.getResource("../images/examButton_28.png")));
	private ImageIcon examButton_29Image = (new ImageIcon(Main.class.getResource("../images/examButton_29.png")));
	private ImageIcon examButton_30Image = (new ImageIcon(Main.class.getResource("../images/examButton_30.png")));
	private ImageIcon examButton_31Image = (new ImageIcon(Main.class.getResource("../images/examButton_31.png")));
	private ImageIcon examButton_32Image = (new ImageIcon(Main.class.getResource("../images/examButton_32.png")));
	private ImageIcon examButton_33Image = (new ImageIcon(Main.class.getResource("../images/examButton_33.png")));
	private ImageIcon examButton_34Image = (new ImageIcon(Main.class.getResource("../images/examButton_34.png")));
	private ImageIcon examButton_35Image = (new ImageIcon(Main.class.getResource("../images/examButton_35.png")));
	//checkButton
	private ImageIcon checkButton_1Image = (new ImageIcon(Main.class.getResource("../images/checkButton_1.png")));
	private ImageIcon checkButton_2Image = (new ImageIcon(Main.class.getResource("../images/checkButton_2.png")));
	private ImageIcon checkButton_3Image = (new ImageIcon(Main.class.getResource("../images/checkButton_3.png")));
	private ImageIcon checkButton_4Image = (new ImageIcon(Main.class.getResource("../images/checkButton_4.png")));
	private ImageIcon checkButton_5Image = (new ImageIcon(Main.class.getResource("../images/checkButton_5.png")));
	private ImageIcon checkButton_6Image = (new ImageIcon(Main.class.getResource("../images/checkButton_6.png")));
	private ImageIcon checkButton_7Image = (new ImageIcon(Main.class.getResource("../images/checkButton_7.png")));
	private ImageIcon checkButton_8Image = (new ImageIcon(Main.class.getResource("../images/checkButton_8.png")));
	private ImageIcon checkButton_9Image = (new ImageIcon(Main.class.getResource("../images/checkButton_9.png")));
	private ImageIcon checkButton_10Image = (new ImageIcon(Main.class.getResource("../images/checkButton_10.png")));
	private ImageIcon checkButton_11Image = (new ImageIcon(Main.class.getResource("../images/checkButton_11.png")));
	private ImageIcon checkButton_12Image = (new ImageIcon(Main.class.getResource("../images/checkButton_12.png")));
	private ImageIcon checkButton_13Image = (new ImageIcon(Main.class.getResource("../images/checkButton_13.png")));
	private ImageIcon checkButton_14Image = (new ImageIcon(Main.class.getResource("../images/checkButton_14.png")));
	private ImageIcon checkButton_15Image = (new ImageIcon(Main.class.getResource("../images/checkButton_15.png")));
	private ImageIcon checkButton_16Image = (new ImageIcon(Main.class.getResource("../images/checkButton_16.png")));
	private ImageIcon checkButton_17Image = (new ImageIcon(Main.class.getResource("../images/checkButton_17.png")));
	private ImageIcon checkButton_18Image = (new ImageIcon(Main.class.getResource("../images/checkButton_18.png")));
	private ImageIcon checkButton_19Image = (new ImageIcon(Main.class.getResource("../images/checkButton_19.png")));
	private ImageIcon checkButton_20Image = (new ImageIcon(Main.class.getResource("../images/checkButton_20.png")));
	private ImageIcon checkButton_21Image = (new ImageIcon(Main.class.getResource("../images/checkButton_21.png")));
	private ImageIcon checkButton_22Image = (new ImageIcon(Main.class.getResource("../images/checkButton_22.png")));
	private ImageIcon checkButton_23Image = (new ImageIcon(Main.class.getResource("../images/checkButton_23.png")));
	private ImageIcon checkButton_24Image = (new ImageIcon(Main.class.getResource("../images/checkButton_24.png")));
	private ImageIcon checkButton_25Image = (new ImageIcon(Main.class.getResource("../images/checkButton_25.png")));
	private ImageIcon checkButton_26Image = (new ImageIcon(Main.class.getResource("../images/checkButton_26.png")));
	private ImageIcon checkButton_27Image = (new ImageIcon(Main.class.getResource("../images/checkButton_27.png")));
	private ImageIcon checkButton_28Image = (new ImageIcon(Main.class.getResource("../images/checkButton_28.png")));
	private ImageIcon checkButton_29Image = (new ImageIcon(Main.class.getResource("../images/checkButton_29.png")));
	private ImageIcon checkButton_30Image = (new ImageIcon(Main.class.getResource("../images/checkButton_30.png")));
	private ImageIcon checkButton_31Image = (new ImageIcon(Main.class.getResource("../images/checkButton_31.png")));
	private ImageIcon checkButton_32Image = (new ImageIcon(Main.class.getResource("../images/checkButton_32.png")));
	private ImageIcon checkButton_33Image = (new ImageIcon(Main.class.getResource("../images/checkButton_33.png")));
	private ImageIcon checkButton_34Image = (new ImageIcon(Main.class.getResource("../images/checkButton_34.png")));
	private ImageIcon checkButton_35Image = (new ImageIcon(Main.class.getResource("../images/checkButton_35.png")));
		
	private JButton backButton = new JButton(backButtonBasicImage);	
	private JButton exitButton = new JButton(exitButtonBasicImage);
	private JButton examButton_1 = new JButton(examButton_1Image);
	private JButton examButton_2 = new JButton(examButton_2Image);
	private JButton examButton_3 = new JButton(examButton_3Image);
	private JButton examButton_4 = new JButton(examButton_4Image);
	private JButton examButton_5 = new JButton(examButton_5Image);
	private JButton examButton_6 = new JButton(examButton_6Image);
	private JButton examButton_7 = new JButton(examButton_7Image);
	private JButton examButton_8 = new JButton(examButton_8Image);
	private JButton examButton_9 = new JButton(examButton_9Image);
	private JButton examButton_10 = new JButton(examButton_10Image);
	private JButton examButton_11 = new JButton(examButton_11Image);
	private JButton examButton_12 = new JButton(examButton_12Image);
	private JButton examButton_13 = new JButton(examButton_13Image);
	private JButton examButton_14 = new JButton(examButton_14Image);
	private JButton examButton_15 = new JButton(examButton_15Image);
	private JButton examButton_16 = new JButton(examButton_16Image);
	private JButton examButton_17 = new JButton(examButton_17Image);
	private JButton examButton_18 = new JButton(examButton_18Image);
	private JButton examButton_19 = new JButton(examButton_19Image);
	private JButton examButton_20 = new JButton(examButton_20Image);
	private JButton examButton_21 = new JButton(examButton_21Image);
	private JButton examButton_22 = new JButton(examButton_22Image);
	private JButton examButton_23 = new JButton(examButton_23Image);
	private JButton examButton_24 = new JButton(examButton_24Image);
	private JButton examButton_25 = new JButton(examButton_25Image);
	private JButton examButton_26 = new JButton(examButton_26Image);
	private JButton examButton_27 = new JButton(examButton_27Image);
	private JButton examButton_28 = new JButton(examButton_28Image);
	private JButton examButton_29 = new JButton(examButton_29Image);
	private JButton examButton_30 = new JButton(examButton_30Image);
	private JButton examButton_31 = new JButton(examButton_31Image);
	private JButton examButton_32 = new JButton(examButton_32Image);
	private JButton examButton_33 = new JButton(examButton_33Image);
	private JButton examButton_34 = new JButton(examButton_34Image);
	private JButton examButton_35 = new JButton(examButton_35Image);
	
	private JButton checkButton_1 = new JButton(checkButton_1Image);
	private JButton checkButton_2 = new JButton(checkButton_2Image);
	private JButton checkButton_3 = new JButton(checkButton_3Image);
	private JButton checkButton_4 = new JButton(checkButton_4Image);
	private JButton checkButton_5 = new JButton(checkButton_5Image);
	private JButton checkButton_6 = new JButton(checkButton_6Image);
	private JButton checkButton_7 = new JButton(checkButton_7Image);
	private JButton checkButton_8 = new JButton(checkButton_8Image);
	private JButton checkButton_9 = new JButton(checkButton_9Image);
	private JButton checkButton_10 = new JButton(checkButton_10Image);
	private JButton checkButton_11 = new JButton(checkButton_11Image);
	private JButton checkButton_12 = new JButton(checkButton_12Image);
	private JButton checkButton_13 = new JButton(checkButton_13Image);
	private JButton checkButton_14 = new JButton(checkButton_14Image);
	private JButton checkButton_15 = new JButton(checkButton_15Image);
	private JButton checkButton_16 = new JButton(checkButton_16Image);
	private JButton checkButton_17 = new JButton(checkButton_17Image);
	private JButton checkButton_18 = new JButton(checkButton_18Image);
	private JButton checkButton_19 = new JButton(checkButton_19Image);
	private JButton checkButton_20 = new JButton(checkButton_20Image);
	private JButton checkButton_21 = new JButton(checkButton_21Image);
	private JButton checkButton_22 = new JButton(checkButton_22Image);
	private JButton checkButton_23 = new JButton(checkButton_23Image);
	private JButton checkButton_24 = new JButton(checkButton_24Image);
	private JButton checkButton_25 = new JButton(checkButton_25Image);
	private JButton checkButton_26 = new JButton(checkButton_26Image);
	private JButton checkButton_27 = new JButton(checkButton_27Image);
	private JButton checkButton_28 = new JButton(checkButton_28Image);
	private JButton checkButton_29 = new JButton(checkButton_29Image);
	private JButton checkButton_30 = new JButton(checkButton_30Image);
	private JButton checkButton_31 = new JButton(checkButton_31Image);
	private JButton checkButton_32 = new JButton(checkButton_32Image);
	private JButton checkButton_33 = new JButton(checkButton_33Image);
	private JButton checkButton_34 = new JButton(checkButton_34Image);
	private JButton checkButton_35 = new JButton(checkButton_35Image);
	
	public static boolean Exam_1 = false;
	public static boolean Exam_2 = false;
	public static boolean Exam_3 = false;
	public static boolean Exam_4 = false;
	public static boolean Exam_5 = false;
	public static boolean Exam_6 = false;
	public static boolean Exam_7 = false;
	public static boolean Exam_8 = false;
	public static boolean Exam_9 = false;
	public static boolean Exam_10 = false;
	public static boolean Exam_11= false;
	public static boolean Exam_12= false;
	public static boolean Exam_13= false;
	public static boolean Exam_14= false;
	public static boolean Exam_15= false;
	public static boolean Exam_16= false;
	public static boolean Exam_17= false;
	public static boolean Exam_18= false;
	public static boolean Exam_19= false;
	public static boolean Exam_20= false;
	public static boolean Exam_21= false;
	public static boolean Exam_22= false;
	public static boolean Exam_23= false;
	public static boolean Exam_24= false;
	public static boolean Exam_25 =false;
	public static boolean Exam_26= false;
	public static boolean Exam_27= false;
	public static boolean Exam_28= false;
	public static boolean Exam_29= false;
	public static boolean Exam_30= false;
	public static boolean Exam_31= false;
	public static boolean Exam_32= false;
	public static boolean Exam_33= false;
	public static boolean Exam_34 = false;
	public static boolean Exam_35= false;
	
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));	//메뉴바 없애기
	
	private int mouseX, mouseY;								//마우서 커서
	
	public ExamButtonFrame() {
		
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
				dispose();
			}
		});
		add(backButton);
		
		//examButton_1
		examButton_1.setBounds(60,180,80,80);					
		examButton_1.setBorderPainted(false);					
		examButton_1.setContentAreaFilled(false);
		examButton_1.setFocusPainted(false);
		examButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=1;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_1);
		
		if(Exam_1==true) {
			//checkButton_1
			examButton_1.setVisible(false);
			checkButton_1.setBounds(60,180,80,80);					
			checkButton_1.setBorderPainted(false);					
			checkButton_1.setContentAreaFilled(false);
			checkButton_1.setFocusPainted(false);
			checkButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=1;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_1);
		}
		
		//examButton_2
		examButton_2.setBounds(240,180,80,80);					
		examButton_2.setBorderPainted(false);					
		examButton_2.setContentAreaFilled(false);
		examButton_2.setFocusPainted(false);
		examButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=2;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_2);
		
		if(Exam_2==true) {
			examButton_2.setVisible(false);
			checkButton_2.setBounds(240,180,80,80);					
			checkButton_2.setBorderPainted(false);					
			checkButton_2.setContentAreaFilled(false);
			checkButton_2.setFocusPainted(false);
			checkButton_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=2;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_2);
		}
		
		//examButton_3
		examButton_3.setBounds(420,180,80,80);					
		examButton_3.setBorderPainted(false);					
		examButton_3.setContentAreaFilled(false);
		examButton_3.setFocusPainted(false);
		examButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=3;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_3);
		
		if(Exam_3==true) {
			examButton_3.setVisible(false);
			checkButton_3.setBounds(420,180,80,80);					
			checkButton_3.setBorderPainted(false);					
			checkButton_3.setContentAreaFilled(false);
			checkButton_3.setFocusPainted(false);
			checkButton_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=3;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_3);
		}
		
		//examButton_4
		examButton_4.setBounds(600,180,80,80);					
		examButton_4.setBorderPainted(false);					
		examButton_4.setContentAreaFilled(false);
		examButton_4.setFocusPainted(false);
		examButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=4;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_4);
		
		if(Exam_4==true) {
			examButton_4.setVisible(false);
			checkButton_4.setBounds(600,180,80,80);					
			checkButton_4.setBorderPainted(false);					
			checkButton_4.setContentAreaFilled(false);
			checkButton_4.setFocusPainted(false);
			checkButton_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=4;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_4);
		}
		
		//examButton_5
		examButton_5.setBounds(780,180,80,80);					
		examButton_5.setBorderPainted(false);					
		examButton_5.setContentAreaFilled(false);
		examButton_5.setFocusPainted(false);
		examButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=5;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_5);
		
		if(Exam_5==true) {
			examButton_5.setVisible(false);
			checkButton_5.setBounds(780,180,80,80);					
			checkButton_5.setBorderPainted(false);					
			checkButton_5.setContentAreaFilled(false);
			checkButton_5.setFocusPainted(false);
			checkButton_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=5;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_5);
		}
		
		//examButton_6
		examButton_6.setBounds(960,180,80,80);					
		examButton_6.setBorderPainted(false);					
		examButton_6.setContentAreaFilled(false);
		examButton_6.setFocusPainted(false);
		examButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=6;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_6);
		
		if(Exam_6) {
			examButton_6.setVisible(false);
			checkButton_6.setBounds(960,180,80,80);					
			checkButton_6.setBorderPainted(false);					
			checkButton_6.setContentAreaFilled(false);
			checkButton_6.setFocusPainted(false);
			checkButton_6.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=6;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_6);
		}
		
		//examButton_7
		examButton_7.setBounds(1140,180,80,80);					
		examButton_7.setBorderPainted(false);					
		examButton_7.setContentAreaFilled(false);
		examButton_7.setFocusPainted(false);
		examButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=7;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_7);
		
		if(Exam_7==true) {
			examButton_7.setVisible(false);
			checkButton_7.setBounds(1140,180,80,80);					
			checkButton_7.setBorderPainted(false);					
			checkButton_7.setContentAreaFilled(false);
			checkButton_7.setFocusPainted(false);
			checkButton_7.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=7;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_7);
		}
		
		//examButton_8
		examButton_8.setBounds(60,287,80,80);					
		examButton_8.setBorderPainted(false);					
		examButton_8.setContentAreaFilled(false);
		examButton_8.setFocusPainted(false);
		examButton_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=8;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_8);
		
		if(Exam_8==true) {
			//checkButton_1
			examButton_8.setVisible(false);
			checkButton_8.setBounds(60,287,80,80);					
			checkButton_8.setBorderPainted(false);					
			checkButton_8.setContentAreaFilled(false);
			checkButton_8.setFocusPainted(false);
			checkButton_8.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=8;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_8);
		}
		
		//examButton_9
		examButton_9.setBounds(240,287,80,80);					
		examButton_9.setBorderPainted(false);					
		examButton_9.setContentAreaFilled(false);
		examButton_9.setFocusPainted(false);
		examButton_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=9;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_9);
		
		if(Exam_9==true) {
			examButton_9.setVisible(false);
			checkButton_9.setBounds(240,287,80,80);					
			checkButton_9.setBorderPainted(false);					
			checkButton_9.setContentAreaFilled(false);
			checkButton_9.setFocusPainted(false);
			checkButton_9.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=9;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_9);
		}
		
		//examButton_10
		examButton_10.setBounds(420,287,80,80);					
		examButton_10.setBorderPainted(false);					
		examButton_10.setContentAreaFilled(false);
		examButton_10.setFocusPainted(false);
		examButton_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=10;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_10);
		
		if(Exam_10==true) {
			examButton_10.setVisible(false);
			checkButton_10.setBounds(420,287,80,80);					
			checkButton_10.setBorderPainted(false);					
			checkButton_10.setContentAreaFilled(false);
			checkButton_10.setFocusPainted(false);
			checkButton_10.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=10;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_10);
		}
		
		//examButton_11
		examButton_11.setBounds(600,287,80,80);					
		examButton_11.setBorderPainted(false);					
		examButton_11.setContentAreaFilled(false);
		examButton_11.setFocusPainted(false);
		examButton_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=11;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_11);
		
		if(Exam_11==true) {
			examButton_11.setVisible(false);
			checkButton_11.setBounds(600,287,80,80);					
			checkButton_11.setBorderPainted(false);					
			checkButton_11.setContentAreaFilled(false);
			checkButton_11.setFocusPainted(false);
			checkButton_11.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=11;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_11);
		}
		
		
		//examButton_12
		examButton_12.setBounds(780,287,80,80);					
		examButton_12.setBorderPainted(false);					
		examButton_12.setContentAreaFilled(false);
		examButton_12.setFocusPainted(false);
		examButton_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=12;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_12);
		
		if(Exam_12==true) {
			examButton_12.setVisible(false);
			checkButton_12.setBounds(780,287,80,80);					
			checkButton_12.setBorderPainted(false);					
			checkButton_12.setContentAreaFilled(false);
			checkButton_12.setFocusPainted(false);
			checkButton_12.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=12;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_12);
		}
		
		//examButton_13
		examButton_13.setBounds(960,287,80,80);					
		examButton_13.setBorderPainted(false);					
		examButton_13.setContentAreaFilled(false);
		examButton_13.setFocusPainted(false);
		examButton_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=13;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_13);
		
		if(Exam_13==true) {
			examButton_13.setVisible(false);
			checkButton_13.setBounds(960,287,80,80);					
			checkButton_13.setBorderPainted(false);					
			checkButton_13.setContentAreaFilled(false);
			checkButton_13.setFocusPainted(false);
			checkButton_13.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=13;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_13);
		}
		
		//examButton_14
		examButton_14.setBounds(1140,287,80,80);					
		examButton_14.setBorderPainted(false);					
		examButton_14.setContentAreaFilled(false);
		examButton_14.setFocusPainted(false);
		examButton_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=14;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_14);
		
		if(Exam_14==true) {
			examButton_14.setVisible(false);
			checkButton_14.setBounds(1140,287,80,80);					
			checkButton_14.setBorderPainted(false);					
			checkButton_14.setContentAreaFilled(false);
			checkButton_14.setFocusPainted(false);
			checkButton_14.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=14;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_14);
		}
		
		//examButton_15
		examButton_15.setBounds(60,394,80,80);					
		examButton_15.setBorderPainted(false);					
		examButton_15.setContentAreaFilled(false);
		examButton_15.setFocusPainted(false);
		examButton_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=15;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_15);
		
		if(Exam_15==true) {
			examButton_15.setVisible(false);
			checkButton_15.setBounds(60,394,80,80);					
			checkButton_15.setBorderPainted(false);					
			checkButton_15.setContentAreaFilled(false);
			checkButton_15.setFocusPainted(false);
			checkButton_15.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=15;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_15);
		}
		
		//examButton_16
		examButton_16.setBounds(240,394,80,80);					
		examButton_16.setBorderPainted(false);					
		examButton_16.setContentAreaFilled(false);
		examButton_16.setFocusPainted(false);
		examButton_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=16;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_16);
		
		if(Exam_16==true) {
			examButton_16.setVisible(false);
			checkButton_16.setBounds(240,394,80,80);					
			checkButton_16.setBorderPainted(false);					
			checkButton_16.setContentAreaFilled(false);
			checkButton_16.setFocusPainted(false);
			checkButton_16.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=16;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_16);
		}
		
		//examButton_17
		examButton_17.setBounds(420,394,80,80);					
		examButton_17.setBorderPainted(false);					
		examButton_17.setContentAreaFilled(false);
		examButton_17.setFocusPainted(false);
		examButton_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=17;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_17);
		
		if(Exam_17==true) {
			examButton_17.setVisible(false);
			checkButton_17.setBounds(420,394,80,80);					
			checkButton_17.setBorderPainted(false);					
			checkButton_17.setContentAreaFilled(false);
			checkButton_17.setFocusPainted(false);
			checkButton_17.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=17;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_17);
		}
		
		//examButton_18
		examButton_18.setBounds(600,394,80,80);					
		examButton_18.setBorderPainted(false);					
		examButton_18.setContentAreaFilled(false);
		examButton_18.setFocusPainted(false);
		examButton_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=18;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_18);
		
		if(Exam_18==true) {
			examButton_18.setVisible(false);
			checkButton_18.setBounds(600,394,80,80);					
			checkButton_18.setBorderPainted(false);					
			checkButton_18.setContentAreaFilled(false);
			checkButton_18.setFocusPainted(false);
			checkButton_18.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=18;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_18);
		}
		
		//examButton_19
		examButton_19.setBounds(780,394,80,80);					
		examButton_19.setBorderPainted(false);					
		examButton_19.setContentAreaFilled(false);
		examButton_19.setFocusPainted(false);
		examButton_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=19;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_19);
		
		if(Exam_19==true) {
			examButton_19.setVisible(false);
			checkButton_19.setBounds(780,394,80,80);					
			checkButton_19.setBorderPainted(false);					
			checkButton_19.setContentAreaFilled(false);
			checkButton_19.setFocusPainted(false);
			checkButton_19.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=19;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_19);
		}
		
		//examButton_20
		examButton_20.setBounds(960,394,80,80);					
		examButton_20.setBorderPainted(false);					
		examButton_20.setContentAreaFilled(false);
		examButton_20.setFocusPainted(false);
		examButton_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=20;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_20);
		
		if(Exam_20==true) {
			examButton_20.setVisible(false);
			checkButton_20.setBounds(960,394,80,80);					
			checkButton_20.setBorderPainted(false);					
			checkButton_20.setContentAreaFilled(false);
			checkButton_20.setFocusPainted(false);
			checkButton_20.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=20;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_20);
		}
		
		//examButton_21
		examButton_21.setBounds(1140,394,80,80);					
		examButton_21.setBorderPainted(false);					
		examButton_21.setContentAreaFilled(false);
		examButton_21.setFocusPainted(false);
		examButton_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=21;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_21);
		
		if(Exam_21==true) {
			examButton_21.setVisible(false);
			checkButton_21.setBounds(1140,394,80,80);					
			checkButton_21.setBorderPainted(false);					
			checkButton_21.setContentAreaFilled(false);
			checkButton_21.setFocusPainted(false);
			checkButton_21.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=21;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_21);
		}
		
		//examButton_22
		examButton_22.setBounds(60,501,80,80);					
		examButton_22.setBorderPainted(false);					
		examButton_22.setContentAreaFilled(false);
		examButton_22.setFocusPainted(false);
		examButton_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=22;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_22);
		
		if(Exam_22==true) {
			examButton_22.setVisible(false);
			checkButton_22.setBounds(60,501,80,80);					
			checkButton_22.setBorderPainted(false);					
			checkButton_22.setContentAreaFilled(false);
			checkButton_22.setFocusPainted(false);
			checkButton_22.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=22;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_22);
		}
		
		//examButton_23
		examButton_23.setBounds(240,501,80,80);					
		examButton_23.setBorderPainted(false);					
		examButton_23.setContentAreaFilled(false);
		examButton_23.setFocusPainted(false);
		examButton_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=23;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_23);
		
		if(Exam_23==true) {
			examButton_23.setVisible(false);
			checkButton_23.setBounds(240,501,80,80);					
			checkButton_23.setBorderPainted(false);					
			checkButton_23.setContentAreaFilled(false);
			checkButton_23.setFocusPainted(false);
			checkButton_23.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=23;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_23);
		}
		
		//examButton_24
		examButton_24.setBounds(420,501,80,80);					
		examButton_24.setBorderPainted(false);					
		examButton_24.setContentAreaFilled(false);
		examButton_24.setFocusPainted(false);
		examButton_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=24;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_24);
		
		if(Exam_24==true) {
			examButton_24.setVisible(false);
			checkButton_24.setBounds(420,501,80,80);					
			checkButton_24.setBorderPainted(false);					
			checkButton_24.setContentAreaFilled(false);
			checkButton_24.setFocusPainted(false);
			checkButton_24.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=24;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_24);
		}
		
		//examButton_25
		examButton_25.setBounds(600,501,80,80);					
		examButton_25.setBorderPainted(false);					
		examButton_25.setContentAreaFilled(false);
		examButton_25.setFocusPainted(false);
		examButton_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=25;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_25);
		
		if(Exam_25==true) {
			examButton_25.setVisible(false);
			checkButton_25.setBounds(600,501,80,80);					
			checkButton_25.setBorderPainted(false);					
			checkButton_25.setContentAreaFilled(false);
			checkButton_25.setFocusPainted(false);
			checkButton_25.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=25;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_25);
		}
		
		//examButton_26
		examButton_26.setBounds(780,501,80,80);					
		examButton_26.setBorderPainted(false);					
		examButton_26.setContentAreaFilled(false);
		examButton_26.setFocusPainted(false);
		examButton_26.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=26;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_26);
		
		if(Exam_26==true) {
			examButton_26.setVisible(false);
			checkButton_26.setBounds(780,501,80,80);					
			checkButton_26.setBorderPainted(false);					
			checkButton_26.setContentAreaFilled(false);
			checkButton_26.setFocusPainted(false);
			checkButton_26.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=26;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_26);
		}
		
		//examButton_27
		examButton_27.setBounds(960,501,80,80);					
		examButton_27.setBorderPainted(false);					
		examButton_27.setContentAreaFilled(false);
		examButton_27.setFocusPainted(false);
		examButton_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=27;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_27);
		
		if(Exam_27==true) {
			examButton_27.setVisible(false);
			checkButton_27.setBounds(960,501,80,80);					
			checkButton_27.setBorderPainted(false);					
			checkButton_27.setContentAreaFilled(false);
			checkButton_27.setFocusPainted(false);
			checkButton_27.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=27;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_27);
		}	
		
		//examButton_28
		examButton_28.setBounds(1140,501,80,80);					
		examButton_28.setBorderPainted(false);					
		examButton_28.setContentAreaFilled(false);
		examButton_28.setFocusPainted(false);
		examButton_28.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=28;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_28);
		
		if(Exam_28==true) {
			examButton_28.setVisible(false);
			checkButton_28.setBounds(1140,501,80,80);					
			checkButton_28.setBorderPainted(false);					
			checkButton_28.setContentAreaFilled(false);
			checkButton_28.setFocusPainted(false);
			checkButton_28.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=28;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_28);
		}
		
		//examButton_29
		examButton_29.setBounds(60,608,80,80);					
		examButton_29.setBorderPainted(false);					
		examButton_29.setContentAreaFilled(false);
		examButton_29.setFocusPainted(false);
		examButton_29.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=29;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_29);
		
		if(Exam_29==true) {
			examButton_29.setVisible(false);
			checkButton_29.setBounds(60,608,80,80);					
			checkButton_29.setBorderPainted(false);					
			checkButton_29.setContentAreaFilled(false);
			checkButton_29.setFocusPainted(false);
			checkButton_29.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=29;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_29);
		}
		
		//examButton_30
		examButton_30.setBounds(240,608,80,80);					
		examButton_30.setBorderPainted(false);					
		examButton_30.setContentAreaFilled(false);
		examButton_30.setFocusPainted(false);
		examButton_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=30;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_30);
		
		if(Exam_30==true) {
			examButton_30.setVisible(false);
			checkButton_30.setBounds(240,608,80,80);					
			checkButton_30.setBorderPainted(false);					
			checkButton_30.setContentAreaFilled(false);
			checkButton_30.setFocusPainted(false);
			checkButton_30.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=30;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_30);
		}
		
		//examButton_31
		examButton_31.setBounds(420,608,80,80);					
		examButton_31.setBorderPainted(false);					
		examButton_31.setContentAreaFilled(false);
		examButton_31.setFocusPainted(false);
		examButton_31.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=31;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_31);
		
		if(Exam_31==true) {
			examButton_31.setVisible(false);
			checkButton_31.setBounds(420,608,80,80);					
			checkButton_31.setBorderPainted(false);					
			checkButton_31.setContentAreaFilled(false);
			checkButton_31.setFocusPainted(false);
			checkButton_31.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=31;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_31);
		}
		
		//examButton_32
		examButton_32.setBounds(600,608,80,80);					
		examButton_32.setBorderPainted(false);					
		examButton_32.setContentAreaFilled(false);
		examButton_32.setFocusPainted(false);
		examButton_32.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=32;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_32);
		
		if(Exam_32==true) {
			examButton_32.setVisible(false);
			checkButton_32.setBounds(600,608,80,80);					
			checkButton_32.setBorderPainted(false);					
			checkButton_32.setContentAreaFilled(false);
			checkButton_32.setFocusPainted(false);
			checkButton_32.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=32;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_32);
		}
		
		//examButton_33
		examButton_33.setBounds(780,608,80,80);					
		examButton_33.setBorderPainted(false);					
		examButton_33.setContentAreaFilled(false);
		examButton_33.setFocusPainted(false);
		examButton_33.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=33;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_33);
		
		if(Exam_33==true) {
			examButton_33.setVisible(false);
			checkButton_33.setBounds(780,608,80,80);					
			checkButton_33.setBorderPainted(false);					
			checkButton_33.setContentAreaFilled(false);
			checkButton_33.setFocusPainted(false);
			checkButton_33.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=33;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_33);
		}
		
		//examButton_34
		examButton_34.setBounds(960,608,80,80);					
		examButton_34.setBorderPainted(false);					
		examButton_34.setContentAreaFilled(false);
		examButton_34.setFocusPainted(false);
		examButton_34.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=34;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_34);
		
		if(Exam_34==true) {
			examButton_34.setVisible(false);
			checkButton_34.setBounds(960,608,80,80);					
			checkButton_34.setBorderPainted(false);					
			checkButton_34.setContentAreaFilled(false);
			checkButton_34.setFocusPainted(false);
			checkButton_34.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=34;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_34);
		}
		else {}
		
		//examButton_35
		examButton_35.setBounds(1140,608,80,80);					
		examButton_35.setBorderPainted(false);					
		examButton_35.setContentAreaFilled(false);
		examButton_35.setFocusPainted(false);
		examButton_35.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ExamButtonFrame.examNum=35;
				new ExamCheckFrame();
				dispose();
			}
		});
		add(examButton_35);
		
		if(Exam_35==true) {
			examButton_35.setVisible(false);
			checkButton_35.setBounds(1140,608,80,80);					
			checkButton_35.setBorderPainted(false);					
			checkButton_35.setContentAreaFilled(false);
			checkButton_35.setFocusPainted(false);
			checkButton_35.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					ExamButtonFrame.examNum=35;
					new ExamCheckFrame();
					dispose();
				}
			});
			add(checkButton_35);
		}
		
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
		g.drawImage(explainFrame,0,0,null);			//단순하게 그려주는 함수
		paintComponents(g);							//고정되어있는 이미지
		this.repaint();								//다시 paint함수를 불러옴
	}
		
}
