package weekend;

import java.text.SimpleDateFormat;
import java.util.Date;
import weekendfile.WeekendFile;

public class Weekend {
	
	public static void main(String []agrs) {
		
		WeekendFile wf = new WeekendFile ();
		
		wf.weekendFile();
		
		Date dt = new Date ();
		SimpleDateFormat formatter = new SimpleDateFormat("YYYY/MM/dd");
		System.out.println(formatter.format(dt));
		
				
	}

}

