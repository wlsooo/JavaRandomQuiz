package DB;
public class Operator {
	Database db = null;	
	MainFrame mf = null;
	JoinFrame jf = null;
	public Operator(){
		this.db = new Database();
		this.mf = new MainFrame(this);
		this.jf = new JoinFrame(this);
	}
}
