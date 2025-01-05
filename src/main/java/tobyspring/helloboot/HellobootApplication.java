package tobyspring.helloboot;

import org.apache.catalina.LifecycleException;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServer;

public class HellobootApplication {

    public static void main(String[] args) throws LifecycleException {
        TomcatServletWebServerFactory serverFactory = new TomcatServletWebServerFactory();//boot에서 제공하는 tomcat 실행 도우미클래스
        WebServer webServer = serverFactory.getWebServer();
        webServer.start();
    }
}