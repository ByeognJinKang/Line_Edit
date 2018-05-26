package original;

import java.io.*;

public class Help
/****************************************************************************
*  AUTH:  Truly, Yours                    DATE:  Oct. 1999                  *
*  DEPT:  Computer Science, CS-200        ORG.:  Colorado State University  *
*****************************************************************************
*                                                                           *
*  FILE:  Help.java                                                         *
*                                                                           *
*  DESC:  Contains the member functions for the Help Class.        .        *
*                                                                           *
****************************************************************************/
{

  //***************************************************************************
  public static void General()
  {
	  Msg.wLMsg("Line Editer program : csued!");
  }

  //***************************************************************************
  public static void Command(char cmd)
  {
	  switch(cmd)
	  { 
	  	case 'Q':  
	  		Msg.wLMsg("QUIT (& Update File) Command");

	  	case 'X':  
	  		Msg.wLMsg("EXIT (& DO NOT Update File) Command");
          

	  	case 'H': 
	  		Msg.wLMsg("HELP (with optional command argument) Command");
	  		
	  	case 'T':
	  		Msg.wLMsg("TOP (Move CLN to Top of File) Command");


	  	case 'E': 
		  Msg.wLMsg("END (Move CLN to End of File) Command");

		  case 'N': 
			  Msg.wLMsg("NEXT Lines (Move CLN forward) Command");
			  
		  case 'B': 
			  Msg.wLMsg(" BACK Lines (Move CLN backward) Command");
	
		  case 'W': 
			  Msg.wLMsg("// WHERE (Print CLN) Command");
	
		  case 'C': // 
			  Msg.wLMsg("COUNT (Print Total File Lines) Command");
	
		  case 'L': 
			  Msg.wLMsg("// LIST (Move CLN) Lines Command");
	
		  case 'S': 
			  Msg.wLMsg("// SHOW (DO NOT Move CLN) Lines Command");
	
		  case 'D':
			  Msg.wLMsg("// DELETE Lines Command");
			  
		  case 'A': 
			  Msg.wLMsg("// ADD Lines Command");
	
		  case 'F': 
			  Msg.wLMsg("// FIND String In Lines Command");
			  
		  case 'R': 
			  Msg.wLMsg("// REPLACE String In Lines Command");
	
		  case 'Y': 
			  Msg.wLMsg("// YANK (to Yank Buffer) Lines Command");
	          
		  case 'Z': 
			  Msg.wLMsg("// YANK DELETE (to Yank Buffer) Lines Command");
	          
		  case 'P': 
			  Msg.wLMsg("// PUT (Yank Buffer) Lines Command");
	          
		  case 'I': 
			  Msg.wLMsg("// INDEX Keywords Command");
	
		  case 'K': 
			  Msg.wLMsg("// Print KEYWORD In Which Lines Command");
	
	
		  case 'O': 
			  Msg.wLMsg("// ORDER (Sort L-H) Lines Command");
	
		  case 'M': 
			  Msg.wLMsg("// MARGIN (Set Margins/Window) Command");
	          
	  }
	  
  }

} // EndClass Help
