import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext
                applicationContext = new AnnotationConfigApplicationContext(SpringTest.class);
//        User user = (User)applicationContext.getBean("name");
    }
}
