package original;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import junit.framework.TestCase;

public class csuedTestCase extends TestCase {

	@Test
	public void testCommandD() throws IOException {
		
		File_Buffer File = new File_Buffer();
		String args[] = {"a"};
		Init_Exit start = new Init_Exit(args, File);
		UserCmd temp = new UserCmd();
		Cmd_Driver cmd_D = new Cmd_Driver();
		
		String save[] = new String[4];
		save[0] = "efgh";
		save[1] = "1234";
		save[2] = "5678";
		save[3] = "qwer";
		
		temp.setCmdName('D');
		temp.setIntArgs(1, 1);
		temp.setOkSyntax();
		cmd_D.RunCmd(File, temp);
		
		String check[] = new String [4];
		for(int i = 0; i < 4; i++)
		{
			check[i] = File.GetLine(i+1);
			assertEquals(check[i], save[i]);
		}
	}
	
	@Test
	public void testCommandAandQ() throws IOException {
		
		File_Buffer FILE = new File_Buffer();
		String args[] = {"b"};
		Init_Exit start = new Init_Exit(args, FILE);
		UserCmd temp = new UserCmd();
		Cmd_Driver cmd_D = new Cmd_Driver();
		
		String save[] = new String[6];
		for(int i = 0; i < 5; i++)
		{
			save[i] = FILE.GetLine(i + 1);
		}
		save[4] = "hello";
		save[5] = "qwer";
		FILE.AddLine(4, "hello");
		FILE.setUpdateFlag(true);
		cmd_D.RunCmd(FILE, temp);
		start.Do_Update(FILE);
		
		String check[] = new String [6];
		for (int i = 0; i < 6; i++)
		{
			check[i] = FILE.GetLine(i + 1);
			assertEquals(check[i], save[i]);
		}
	}
	
	@Test
	public void testCommandM() throws IOException {
		File_Buffer File = new File_Buffer();
		String args[] = {"a"};
		Init_Exit start = new Init_Exit(args, File);
		UserCmd temp = new UserCmd();
		Cmd_Driver cmd_D = new Cmd_Driver();
		
		String save[] = new String [5];
		for(int i = 0; i < 5; i++)
			save[i] = File.GetLine(i);
		
		temp.setCmdName('m');
		temp.setIntArgs(1, 1);
		temp.setIntArgs(5, 2);
		temp.getOkSyntax();
		cmd_D.RunCmd(File, temp);
		start.Do_Update(File);
		
		assertEquals(cmd_D.Margin_Left, 1);
		assertEquals(cmd_D.Margin_Right, 5);
		
	}
	
	@Test
	public void testCommandR() throws IOException {
		File_Buffer File = new File_Buffer();
		String args[] = {"a"};
		Init_Exit start = new Init_Exit(args, File);
		UserCmd temp = new UserCmd();
		Cmd_Driver cmd_D = new Cmd_Driver();
		
		String save[] = new String [5];
		for(int i = 0; i < 5; i++)
			save[i] = File.GetLine(i + 1);
		save[2] = "happy";
		
		temp.setCmdName('r');
		temp.setIntArgs(5, 1);
		temp.setStrArgs("1234", 1);
		temp.setStrArgs("happy", 2);
		temp.getOkSyntax();
		cmd_D.RunCmd(File, temp);
		
		String check[] = new String [5];
		for(int i =0; i < 5; i++)
		{
			check[i] = File.GetLine(i + 1);
			assertEquals(save[i], check[i]);
		}
	}
	@Test
	public void testCommandF() throws IOException {
		File_Buffer File = new File_Buffer();
		String args[] = {"a"};
		Init_Exit start = new Init_Exit(args, File);
		UserCmd temp = new UserCmd();
		Cmd_Driver cmd_D = new Cmd_Driver();
		
		String save[] = new String [5];
		for(int i = 0; i < 5; i++)
			save[i] = File.GetLine(i + 1);
		
		temp.setCmdName('f');
		temp.setIntArgs(5, 1);
		temp.setStrArgs("1234", 1);
		temp.setOkSyntax();
		cmd_D.RunCmd(File, temp);
		
		int whereCLN = File.GetCLN();
		assertEquals(whereCLN, 3);
	}

	@Test
	public void testCommandO() throws IOException {
		File_Buffer File = new File_Buffer();
		String args[] = {"d"};
		Init_Exit start = new Init_Exit(args, File);
		UserCmd temp = new UserCmd();
		Cmd_Driver cmd_D = new Cmd_Driver();
		
		String save[] = new String [5];
		save[0] = "a";
		save[1] = "b";
		save[2] = "c";
		save[3] = "d";
		save[4] = "e";
		
		temp.setCmdName('o');
		temp.setIntArgs(5, 1);
		temp.setOkSyntax();
		cmd_D.RunCmd(File, temp);
		
		String check[] = new String [5];
		for(int i= 0; i < 5; i++)
		{
			check[i] = File.GetLine(i+1);
			assertEquals(save[i], check[i]);
		}
		

	}
	
	@Test
	public void testCommandMandF() throws IOException {
		
		File_Buffer File = new File_Buffer();
		String args[] = {"a"};
		Init_Exit start = new Init_Exit(args, File);
		UserCmd temp = new UserCmd();
		Cmd_Driver cmd_D = new Cmd_Driver();
		
		String save[] = new String [5];
		for(int i = 0; i < 5; i++)
			save[i] = File.GetLine(i + 1);
		
		temp.setCmdName('m');
		temp.setIntArgs(3, 1);
		temp.setIntArgs(5, 2);
		temp.getOkSyntax();
		cmd_D.RunCmd(File, temp);
		
		temp.setCmdName('f');
		temp.setIntArgs(5, 1);
		temp.setStrArgs("qwer", 1);
		temp.setOkSyntax();
		cmd_D.RunCmd(File, temp);
		
		int whereCLN = File.GetCLN();
		assertEquals(whereCLN, 5);
	}
	
	@Test
	public void testCommandMandR() throws IOException {
		
		File_Buffer File = new File_Buffer();
		String args[] = {"a"};
		Init_Exit start = new Init_Exit(args, File);
		UserCmd temp = new UserCmd();
		Cmd_Driver cmd_D = new Cmd_Driver();
		
		String save[] = new String [5];
		for(int i = 0; i < 5; i++)
			save[i] = File.GetLine(i + 1);
		save[3] = "happy";
		
		temp.setCmdName('m');
		temp.setIntArgs(3, 1);
		temp.setIntArgs(5, 2);
		temp.getOkSyntax();
		cmd_D.RunCmd(File, temp);
		
		temp.setCmdName('r');
		temp.setIntArgs(5, 1);
		temp.setStrArgs("5678", 1);
		temp.setStrArgs("happy", 2);
		temp.getOkSyntax();
		cmd_D.RunCmd(File, temp);
		
		String check[] = new String [5];
		for(int i =0; i < 5; i++)
		{
			check[i] = File.GetLine(i + 1);
			assertEquals(save[i], check[i]);
		}
	}
	
	@Test
	public void testCommandMandO() throws IOException {
		
		File_Buffer File = new File_Buffer();
		String args[] = {"d"};
		Init_Exit start = new Init_Exit(args, File);
		UserCmd temp = new UserCmd();
		Cmd_Driver cmd_D = new Cmd_Driver();
		
		String save[] = new String [5];
		save[0] = "a";
		save[1] = "c";
		save[2] = "d";
		save[3] = "e";
		save[4] = "b";
		
		temp.setCmdName('m');
		temp.setIntArgs(1, 1);
		temp.setIntArgs(3, 2);
		temp.getOkSyntax();
		cmd_D.RunCmd(File, temp);
		
		temp.setCmdName('o');
		temp.setIntArgs(5, 1);
		temp.setOkSyntax();
		cmd_D.RunCmd(File, temp);
		
		String check[] = new String [5];
		for(int i= 0; i < 5; i++)
		{
			check[i] = File.GetLine(i+1);
			assertEquals(save[i], check[i]);
		}
	}
	
}
