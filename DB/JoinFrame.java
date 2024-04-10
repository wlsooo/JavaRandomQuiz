package DB;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Frame.JavaRandomQuiz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JoinFrame extends JDialog{	
	public static String member_id = "";
	
	//Panel
	JPanel panel = new JPanel();
	
	//Label
	JLabel idL = new JLabel("아이디");
	JLabel pwL = new JLabel("비밀번호");
	
	//TextField
	 JTextField id = new JTextField();
	 JPasswordField pw = new JPasswordField();
	 
	 //Button
	 JButton joinBtn = new JButton("가입하기");
	 JButton cancelBtn = new JButton("가입취소");
	 
	 Operator o = null;
	 
	 JoinFrame(Operator _o){
		 o = _o;
		 
		 setTitle("회원가입");
		 
		 //Label 크기 작업
		 idL.setPreferredSize(new Dimension(50,30));
		 pwL.setPreferredSize(new Dimension(50,30));
		 
		 //TextField 크기 작업
		 id.setPreferredSize(new Dimension(140,30));
		 pw.setPreferredSize(new Dimension(140,30));
		 
		 //Button 크기 작업
		 joinBtn.setPreferredSize(new Dimension(95,25));
		 cancelBtn.setPreferredSize(new Dimension(95,25));
		 
		 //Panel 추가 작업
		 setContentPane(panel);	//JPanel을 추가
		 
		 panel.add(idL);
		 panel.add(id);
		 
		 panel.add(pwL);
		 panel.add(pw);
		 
		 panel.add(cancelBtn);
		 panel.add(joinBtn);
		 
		 //Button 이벤트 리스너 추가
		 ButtonListener bl = new ButtonListener();
		 
		 cancelBtn.addActionListener(bl);
		 joinBtn.addActionListener(bl);
	
		 setSize(250,150);	//회원가입 창 사이즈
		 setLocationRelativeTo(null);
		 setResizable(false);
	 }
	 
	 //Button 이벤트 리스너
	 class ButtonListener implements ActionListener{	//implements 부모의 것을 제정의해서 사용
		 @Override
		 public void actionPerformed(ActionEvent e) {
			 JButton b = (JButton)e.getSource();	//이벤트 소스를 알아내서 어떤 버튼을 눌렀는지 확인
			 
			 //TextField에 입력된 회원 정보들을 변수에 초기화
			 String uid = id.getText();
			 String upass = "";
			 for(int i=0; i<pw.getPassword().length; i++) {	//getPassword는 char을 반환
				 upass = upass + pw.getPassword()[i];
			 }
			 
			 //가입취소 버튼 이벤트
			 if(b.getText().equals("가입취소")) {	//가입취소 버튼을 눌렀을 때
				 dispose();
			 }			 
			 //가입하기 버튼 이벤트
			 else if(b.getText().equals("가입하기")) {	//가입하기 버튼을 눌렀을 때
				 if(uid.equals("") || upass.equals("")) { //id와 password칸 중 하나라도 비어있으면 회원가입 실패
					 JOptionPane.showMessageDialog(null, "모든 정보를 가입해주세요", "회원가입 실패", JOptionPane.ERROR_MESSAGE);
					 System.out.println("회원가입 실패 > 회원정보 미입력");
				 }
				 else if(!uid.equals("") && !upass.equals("")) { //둘 다 비어있지 않을 때
					 if(o.db.joinCheck(uid, upass)) {	//Operator에서 joinCheck메서드로 이동, 반환값이 true이면 if안의 문장들을 실행, false이면 else문으로 넘어감
						 System.out.println("회원가입 성공");
						 JOptionPane.showMessageDialog(null, "회원가입에 성공하였습니다");
						 Database db_1 = new Database();
						 db_1.createTable(uid);
						 dispose();
					 }
					 else {
						 System.out.println("회원가입 실패");
						 JOptionPane.showMessageDialog(null, "회원가입에 실패하였습니다");
						 id.setText("");	//id, password 초기화
						 pw.setText("");
					 }
				 }
			 }
		 }
	 }
}
