public class MyDispatcherServlet extends org.springframework.web.servlet.DispatcherServlet {
    public MyDispatcherServlet() {
        super();
        setContextConfigLocation("WEB-INF/Config.xml"); // путь до вашего конфигурационного файла
    }
}
