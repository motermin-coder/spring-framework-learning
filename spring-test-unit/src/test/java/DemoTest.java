import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

/**
 * @Author :xiaozou
 * @Date : 2022/2/18- 15:09
 **/
public class DemoTest {


	@Test
	public void test01(){
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
		User bean = classPathXmlApplicationContext.getBean(User.class);
		System.out.println("bean = " + bean);


	}
}
