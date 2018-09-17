package com.cice.maven.test.java;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CicloVidaServlet extends HttpServlet{

    private String nombreServlet;

    @Override
    public void init() throws ServletException {
        super.init();
        this.nombreServlet = this.getClass().getCanonicalName();
        System.out.println("INICIANDO SERVLET "+nombreServlet+"...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("LLAMANDO AL SERVICE DEL SERVLET "+nombreServlet+"...");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("DESTRUYENDO SERVLET...");
    }


}
