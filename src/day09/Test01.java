package day09;

import javax.swing.JOptionPane;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class Test01 {

	public static void main(String[] args) {
		Command cmd = null;
		String msg = JOptionPane.showInputDialog("명령을 입력하세요. 1.delete 2.insert 3.uptate");
		
		switch(msg) {
		case "1":
		case "delete":
			cmd = new DelecteCommand();
			break;
		case "2":
		case "insert":
			cmd = new InsertCommand();
			break;
		case "3":
		case "update":
			cmd = new UpdateCommand();
			break;
		default:
			//System.out.println("명령 선택을 다시하세요");
			cmd = new ListCommand();
			break;
		}
		
		
		if(cmd != null) {
			cmd.exec();
			cmd.base();
		}
	}

}

interface Command {
	void exec();
	default public void base() {
		System.out.println("command inferface의 bass method");
	}
}

class DelecteCommand implements Command {
	@Override
	public void exec() {
		System.out.println("Delecte Commnad 수행");
	}
}

class UpdateCommand implements Command {
	@Override
	public void exec() {
		System.out.println("Update Commnad 수행");
	}
	
	public void base() {
		System.out.println("Update Commnad 기능 재정의");
	}
}

class InsertCommand implements Command {
	@Override
	public void exec() {
		System.out.println("Insert Commnad 수행");
	}
}

class ListCommand implements Command{
	public void exec() {
		System.out.println("List Commnad 수행");
	}
}