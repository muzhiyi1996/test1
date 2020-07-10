package python.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PythonInvoke {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		String[] para=new String[] {"python","C:\\Users\\asus\\Desktop\\java_invoked.py"};
        PythonInvoke.invokePy(para);
	}
	
	
	/**
     * java项目调用python脚本 
     */
    public static void invokePy(String[] para) {
        System.out.println("执行....");
        try {
        	Process process = Runtime.getRuntime().exec(para);
        	
        	BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
        	
        	String line = null;
        	while((line = reader.readLine()) != null) {
        		System.out.println(line);
        	}
        	reader.close();
        	process.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("结束....");
    }
}
