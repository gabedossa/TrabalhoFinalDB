package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ActionWeb {
    public void Executa(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException;
}
