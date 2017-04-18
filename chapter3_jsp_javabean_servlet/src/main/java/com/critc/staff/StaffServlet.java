package com.critc.staff;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class StaffServlet
 */
public class StaffServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public StaffServlet() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action.equals("list")) {//执行列表
            StaffDao staffDao = new StaffDao();
            List<Staff> list = staffDao.list();
            request.setAttribute("list", list);
            RequestDispatcher rd = request.getRequestDispatcher("list.jsp");
            rd.forward(request, response);
        } else if (action.equals("toAdd")) {//进入新增界面
            response.sendRedirect("add.jsp");
        } else if (action.equals("add")) {//执行新增
            StaffDao staffDao = new StaffDao();
            staffDao.add(request.getParameter("name"));
            response.sendRedirect("StaffServlet?action=list");
        }
    }

}
