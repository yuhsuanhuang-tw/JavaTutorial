/**
 * @author Yu-Hsuan Huang
 * 
 * Create the File with BOM UTF-8 Header
 * 
 */
package pers.sample.tutorial.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class FileWriterWithBomUtf8Example {

	public static void main(String[] args) {
		
		String array[] = {"1", "2"};
		System.out.println(array.length);
		byte[] BOM_UTF8 = { (byte) 0xEF, (byte) 0xBB, (byte) 0xBF };

		String filePath = "/Users/hsuanhuang/Documents/GitHub/JavaTutorial/JavaBasicTutorial/src/pers/sample/tutorial/files/Test-Log.csv";
		String context = "id,user_id,source_id,destination_id,procedure_name,schema_name,table_name,action_type,sql_script,sql_status,sql_rows,sql_result,ss_seq,created_at\n"+
				"6738,999999,10.112.215.118,10.1.9.49,null,BOTIMA_DEV,null,L,null,101,null,IMALOAD - Login successful : 測試員,0,2017/11/02 10:51:27\n"+
				"6739,999999,10.112.215.118,10.1.9.49,null,BOTIMA_DEV,null,L,null,101,null,IMALOAD - Login successful : 測試員,0,2017/11/02 10:53:34\n"+
				"7716,admin,10.112.215.234,10.1.9.49,null,BOTIMA,null,L,null,101,null,Login successful:admin,0,2017/11/02 10:05:29\n"+
				"7723,116717,10.112.215.118,10.1.9.49,null,BOTIMA,null,L,null,101,null,Login successful:116717,0,2017/11/02 10:44:50\n";
		try {
			File file = new File(filePath);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8));
			bw.write(BOM_UTF8.toString());
			bw.write(context);
			bw.flush();
			bw.close();

			FileOutputStream wrFile = new FileOutputStream(filePath,false);
			wrFile.write(BOM_UTF8);
			wrFile.write(context.getBytes("utf8"));
			wrFile.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//TODO close
		}
		System.out.println(context.replaceAll(",|\n", " "));
	}
	
}
