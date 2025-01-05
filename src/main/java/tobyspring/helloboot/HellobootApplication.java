package tobyspring.helloboot;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;

import javax.net.ServerSocketFactory;

public class HellobootApplication {

    public static void main(String[] args) throws LifecycleException {
        System.out.println("Hello Containerless Standalone Application");
//        new Tomcat().start();//Tomcat 라이브러리의 tomcat을 실행
        TomcatServletWebServerFactory serverFactory = new TomcatServletWebServerFactory();//boot에서 제공하는 tomcat 실행 도우미클래스
        WebServer webServer = serverFactory.getWebServer();
        webServer.start();

/*        //tomcat 외 다른 서버를 위한 추상화 구조
        ServletWebServerFactory jettyServerFactory = new JettyServletWebServerFactory();//boot에서 제공하는 tomcat 실행 도우미클래스
        WebServer jettyServer = jettyServerFactory.getWebServer();
*/
    }
}
/*
오후 9:18:40: Executing ':tobyspring.helloboot.HellobootApplication.main()'…

> Task :compileJava
> Task :processResources UP-TO-DATE
> Task :classes

> Task :tobyspring.helloboot.HellobootApplication.main()
Hello Containerless Standalone Application
21:18:41.972 [main] INFO org.springframework.boot.web.embedded.tomcat.TomcatWebServer -- Tomcat initialized with port 8080 (http)
1�� 05, 2025 9:18:41 ���� org.apache.coyote.AbstractProtocol init
INFO: Initializing ProtocolHandler ["http-nio-8080"]
1�� 05, 2025 9:18:42 ���� org.apache.catalina.core.StandardService startInternal
INFO: Starting service [Tomcat]
1�� 05, 2025 9:18:42 ���� org.apache.catalina.core.StandardEngine startInternal
INFO: Starting Servlet engine: [Apache Tomcat/10.1.34]
1�� 05, 2025 9:23:38 ���� org.apache.coyote.AbstractProtocol start
INFO: Starting ProtocolHandler ["http-nio-8080"]

테스트
http -v ":8080/hello?name=Spring"

* */