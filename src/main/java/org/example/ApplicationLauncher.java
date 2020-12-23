package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;
import org.example.web.MyBankServlet;

public class ApplicationLauncher {
    public static void main(String[] args) throws LifecycleException {
         Integer serverPort = 8080;
/*
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
            serverPort = Integer.parseInt(args[i]);
        }
*/
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(serverPort);
        tomcat.getConnector();


        Context ctx = tomcat.addContext("", null);
        Wrapper servlet = Tomcat.addServlet(ctx, "org.example.web.MyBankServlet", new MyBankServlet());
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/*");

        tomcat.start();
    }
}

