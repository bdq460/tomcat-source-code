package javax.annotation;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author zhangjun.zyk 
 * @since 2013-7-8 обнГ06:37:14
 * 
 */
public class Test {

	public static void main(String[] args) throws MalformedURLException {
		 new URL("file://D:\\personal\\learn\\tomcat\\apache-tomcat-7.0.42");
		 new URL("/home/admin/build/*.jar");
		 new URL("/home/admin/build/a.jar");
	}
}
