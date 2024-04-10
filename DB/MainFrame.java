package DB;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Frame.JavaRandomQuiz;

public class MainFrame extends JDialog{		
	public static int loginCheck=0;	//프로젝트를 시작하는 변수
	// Panel
	JPanel basePanel = new JPanel(new BorderLayout());
	JPanel centerPanel = new JPanel(new BorderLayout());
	JPanel westPanel = new JPanel();
	JPanel eastPanel = new JPanel();
	JPanel southPanel = new JPanel();
	
	//Lable
	JLabel idL = new JLabel("아이디");
	JLabel pwL = new JLabel("비밀번호");
	
	//TextField
	JTextField id = new JTextField();
	JPasswordField pw = new JPasswordField();
	
	//Button
	JButton loginBtn = new JButton("로그인");
	JButton joinBtn = new JButton("회원가입");
	JButton exitBtn = new JButton("프로그램 종료");	//아마 돌아가기 버튼으로 쓰일듯
	
	Operator o = null;	//Operator	
	MainFrame(Operator _o){
		o = _o;
		
		setTitle("로그인");
		
		//Panel 크기 작업
		centerPanel.setPreferredSize(new Dimension(260,80));	//layout에서 panel크기를 지정할 때에는 setSize()가 아닌 setPrefferedSize()를 써야한다
		westPanel.setPreferredSize(new Dimension(210,75));
		eastPanel.setPreferredSize(new Dimension(90,75));
		southPanel.setPreferredSize(new Dimension(290,40));
		
		//Label 크기 작업
		idL.setPreferredSize(new Dimension(50,30));
		pwL.setPreferredSize(new Dimension(50,30));
		
		//TextField 크기 작업
		id.setPreferredSize(new Dimension(140,30));
		pw.setPreferredSize(new Dimension(140,30));
		
		//Button 크기 작업
		loginBtn.setPreferredSize(new Dimension(75,63));
		joinBtn.setPreferredSize(new Dimension(135,25));
		exitBtn.setPreferredSize(new Dimension(135,25));
		
		//Panel 추가 작업
		setContentPane(basePanel);	//panel을 기본 컨테이너로 설정
		
		basePanel.add(centerPanel, BorderLayout.CENTER);
		basePanel.add(southPanel, BorderLayout.SOUTH);
		centerPanel.add(westPanel, BorderLayout.WEST);
		centerPanel.add(eastPanel, BorderLayout.EAST);
		
		westPanel.setLayout(new FlowLayout());	//FlowLayout이란 정렬을 하는 메서드로 기본값은 center입니다.
		eastPanel.setLayout(new FlowLayout());
		southPanel.setLayout(new FlowLayout());
		
		//westPanel 컴포넌트
		westPanel.add(idL);	//Label 추가
		westPanel.add(id);	//TextField 추가
		westPanel.add(pwL);
		westPanel.add(pw);
		
		//eastPanel 컴포넌트
		eastPanel.add(loginBtn);
		
		//southPanel 컴포넌트
		southPanel.add(exitBtn);
		southPanel.add(joinBtn);
		
		//Button 이벤트 리스너 추가
		ButtonListener bl = new ButtonListener();	//클래스 인스턴스 객체

		loginBtn.addActionListener(bl);
		exitBtn.addActionListener(bl);
		joinBtn.addActionListener(bl);
		
		setSize(310,150);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	//Button 이벤트 리스너
	class ButtonListener implements ActionListener{	//implements를 쓰면 부모의 메소드를 반드시 오버라이딩해야 한다
		@Override
		public void actionPerformed(ActionEvent e) {
			Database db = new Database();
			JButton b = (JButton)e.getSource();	//버튼의 텍스트를 읽어옴
			
			//TextField에 입력된 아이디와 비밀번호를 변수에 초기화
			String uid = id.getText();	//id Label의 텍스트를 가져옴
			String upass = "";
			for(int i=0; i<pw.getPassword().length; i++) {//getPassword는 char형식으로 읽어옴
				upass = upass + pw.getPassword()[i];
			}
			
			//게임종료 버튼 이벤트
			if(b.getText().equals("프로그램 종료")) {	//프로그램 종료 버튼을 눌렀을 때
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			//회원가입 버튼 이벤트
			else if(b.getText().equals("회원가입")) {	//회원가입 버튼을 눌렀을 때
				o.jf.setVisible(true);				//회원가입 창이 보이게 한다
			}
			//로그인 버튼 이벤트, 데이터베이스와 연결하여 로그인 확인
			else if(b.getText().equals("로그인")) {
				if(uid.equals("") || upass.equals("")) {	//아이디나 비밀번호를 입력하지 않은 경우
					JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 모두 입력해주세요","로그인 실패", JOptionPane.ERROR_MESSAGE);	//("출력메세지", "창 제목", "아이콘 모양")
					System.out.println("로그인 실패 > 로그인 정보 미입력");
				}
				else if(uid != null && upass != null) {	//id와 password가 입력되었을 때
					if(o.db.logincheck(uid,upass)) { //데이터베이스에 접속해 로그인 정보를 확인하는 부분
						System.out.println("로그인 성공");
						JOptionPane.showMessageDialog(null, "로그인에 성공하였습니다");
						JoinFrame.member_id = uid;	//아이디 저장
						MainFrame.loginCheck = 1;	
						if(Database.count==35) {
							Database.count=0;
						}
						db.examSolveCheck();	//푼 문제 체크 메서드
						System.out.println(JoinFrame.member_id);
						dispose();	//로그인 성공 메세지 출력 후 창이 사라짐
					}
					else{
						System.out.println("로그인 실패 > 로그인 정보 불일치");
						JOptionPane.showMessageDialog(null, "로그인에 실패하였습니다");
					}
				}
			}
		}
	}
}
