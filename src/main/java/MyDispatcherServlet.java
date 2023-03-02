public class MyDispatcherServlet extends org.springframework.web.servlet.DispatcherServlet {
    public MyDispatcherServlet() {
        super();
        setContextConfigLocation("classpath:/WEB-INF/Config.xml");
    }
}
