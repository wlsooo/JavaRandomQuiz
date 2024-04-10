package DB;
import java.sql.*;	//sql의 정보를 모두 불러옴
	
public class Database {
	public static int count = 0;	//35문제를 다 풀었는지 확인하는 변수	
	ResultSet rs;	//database에 값 옮기기
	ResultSet rs_1;
	Connection con = null;	//Database와 연결하기 위해 필요함
	Statement stmt = null;	//Statement (java.sql.Statement)는 Connection으로 연결한 객체에게, Query 작업을 실행하기 위한 객체, Statement를 사용하려면 Connection을 해야함
	String url = "jdbc:mysql://localhost/randomquiz_login?serverTimezone=Asia/Seoul";
	String user = "root";
	String passwd = "0000";	//자신의 비밀번호
	
	public Database(){	//데이터 베이스에 연걸
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,passwd);
			stmt = con.createStatement();
			System.out.println("MySQL 서버 연동 성공");
		} catch(Exception e) {
			System.out.println("MySQL 서버 연동 실패 > " + e.toString());
		}
	}
	//회원가입
	boolean joinCheck(String _i, String _p) {	//아이디와 패스워드를 매개변수로 받는다
		boolean flag = false;	//false로 초기화
		
		String id = _i;
		String pw = _p;
		
		try {
			String insertStr = "INSERT INTO member VALUES('" + id + "','" + pw + "')";
			stmt.executeUpdate(insertStr);	//데이터베이스에서 데이터를 추가(Insert), 삭제(Delete), 수정(Update)하는 SQL 문을 실행
			
			flag = true;	//이 메서드를 호출한 곳에 true값을 돌려줌
			System.out.println("회원가입 성공");
		}catch(Exception e) {
			flag = false;
			System.out.println("회원가입 실패 > " + e.toString());
		}
		return flag;
	}
	
	//로그인 정보를 확인
	//id를 기본키로 설정해놓았기 때문에 중복 아이디를 입력하면 로그인에 실패한다
	boolean logincheck(String _i, String _p) {
		boolean flag = false;		
		String id = _i;
		String pw = _p;
		try {
			String checkingStr = "SELECT password FROM member WHERE id='" + id + "'";	//아이디로 비밀번호가 맞는지 확인
			ResultSet result = stmt.executeQuery(checkingStr);	//비밀번호를 저장
	
			while(result.next()) {	//문자열 리턴
				if(pw.equals(result.getString("password"))) {	//mysql에서 password에 해당하는 값을 가져옴
					flag = true;
					System.out.println("로그인 성공");
				}
				else {
					flag = false;
					System.out.println("로그인 실패");
				}
			}
		}catch(Exception e) {
			flag = false;
			System.out.println("로그인 실패 > " + e.toString());
		}
		return flag;
	}
	
	//overlapCheck
	public void add_num(int num) {
		try {
			String insertNum = "INSERT INTO " + JoinFrame.member_id + " VALUES(" + num + ")"; 	
			stmt.executeUpdate(insertNum);
			examSolveCheck();
			System.out.println("랜덤 숫자 삽입 성공");
		} catch(Exception e) {
			System.out.println("랜덤 숫자 삽입 실패 이유 : " + e.toString());
			Frame.Exam.randomExam -= (Frame.Exam.randomExam*2);
			System.out.println("중복 : " +  Frame.Exam.randomExam);			
		}
	}
	//create table
	public void createTable(String id) {
		try {
			String createStr = "CREATE TABLE " + id + " (num varchar(5) not null, PRIMARY KEY (num))";
			stmt.execute(createStr);
			System.out.println("테이블 생성 성공!");
		} catch(Exception e) {
			System.out.println("테이블 생성 실패 이유 : " + e.toString());
		}
	}
	//checkRandomNum
	public boolean checkRandomNum(int num) {
		boolean result = true;
		try {
			//데이터베이스에 랜덤으로 출력한 숫자가 있는지 확인하는 문장
			String checkNum = "select exists(select * from " + JoinFrame.member_id + " where num=" + num + ")As tf";
			rs = stmt.executeQuery(checkNum); 
			while(rs.next()) {	//true false 값을 반환함
				if(rs.getInt("tf")==0) {	//만약 데이터베이스에 없는 숫자라면(반환값:0) 데이터베이스에 숫자를 넣어주고 문제를 출력함
					if(Database.count != 35) {
						Frame.Exam.randomExam=num;
					}
					result = false;
				}
				else {
					result = true;	//만약 데이터베이스에 있는 숫자라면 true를 반환함
				}
			}
		}
		catch (SQLException e) {
			System.out.println("DB연결 실패하거나, SQL문이 틀렸습니다.");
			System.out.print("사유 : " + e.getMessage());
		}
		return result;
	}
	
	//푼 문제는 회색으로 표시해주는 메서드
	public void examSolveCheck() {
		try {
			for(int i=1; i<=35; i++) {	//로그인을 할 때 이 메서드가 호출되며, 35문제의 품/안품 여부를 확인하여 버튼을 바꿔줌
				String solveCheck = "select exists(select * from " + JoinFrame.member_id + " where num=" + i + ")As tf";
				rs = stmt.executeQuery(solveCheck);
				while(rs.next()) {
					if(rs.getInt("tf")==1) {
						ExamButtonCheck(i);
					}
				}
			}
		}catch(SQLException e){
			System.out.print("실패");
		}
		
	}
	//ExamButtonCheck
	public void ExamButtonCheck(int num) {
		switch(num) {
		case 1: Frame.ExamButtonFrame.Exam_1 = true;	break;
		case 2: Frame.ExamButtonFrame.Exam_2 = true;	break;
		case 3: Frame.ExamButtonFrame.Exam_3 = true;	break;
		case 4: Frame.ExamButtonFrame.Exam_4 = true;	break;
		case 5: Frame.ExamButtonFrame.Exam_5 = true;	break;
		case 6: Frame.ExamButtonFrame.Exam_6 = true;	break;
		case 7: Frame.ExamButtonFrame.Exam_7 = true;	break;
		case 8: Frame.ExamButtonFrame.Exam_8 = true;	break;
		case 9: Frame.ExamButtonFrame.Exam_9 = true;	break;
		case 10: Frame.ExamButtonFrame.Exam_10 = true;	break;
		case 11: Frame.ExamButtonFrame.Exam_11 = true;	break;
		case 12: Frame.ExamButtonFrame.Exam_12 = true;	break;
		case 13: Frame.ExamButtonFrame.Exam_13 = true;	break;
		case 14: Frame.ExamButtonFrame.Exam_14 = true;	break;	
		case 15: Frame.ExamButtonFrame.Exam_15 = true;	break;
		case 16: Frame.ExamButtonFrame.Exam_16 = true;	break;
		case 17: Frame.ExamButtonFrame.Exam_17 = true;	break;
		case 18: Frame.ExamButtonFrame.Exam_18 = true;	break;
		case 19: Frame.ExamButtonFrame.Exam_19 = true;	break;
		case 20: Frame.ExamButtonFrame.Exam_20 = true;	break;
		case 21: Frame.ExamButtonFrame.Exam_21 = true;	break;
		case 22: Frame.ExamButtonFrame.Exam_22 = true;	break;
		case 23: Frame.ExamButtonFrame.Exam_23 = true;	break;
		case 24: Frame.ExamButtonFrame.Exam_24 = true;	break;
		case 25: Frame.ExamButtonFrame.Exam_25 = true;	break;
		case 26: Frame.ExamButtonFrame.Exam_26 = true;	break;
		case 27: Frame.ExamButtonFrame.Exam_27 = true;	break;
		case 28: Frame.ExamButtonFrame.Exam_28 = true;	break;
		case 29: Frame.ExamButtonFrame.Exam_29 = true;	break;
		case 30: Frame.ExamButtonFrame.Exam_30 = true;	break;	
		case 31: Frame.ExamButtonFrame.Exam_31 = true;	break;
		case 32: Frame.ExamButtonFrame.Exam_32 = true;	break;
		case 33: Frame.ExamButtonFrame.Exam_33 = true;	break;
		case 34: Frame.ExamButtonFrame.Exam_34 = true;	break;
		case 35: Frame.ExamButtonFrame.Exam_35 = true;	break;
		}
	}
}