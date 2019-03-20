/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Anish
 */
public class contact extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
       HttpSession session = request.getSession();
        String name = (String)session.getAttribute("un");
            out.println("<!DOCTYPE html>\n" +
"<html>\n" +
"<head>\n" +
"	<title>About Us | Parivahan Sewa | Lucknow</title>\n" +
"	<meta charset=\"utf-8\">\n" +
"	  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"	  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n" +
"	  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n" +
"	  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n" +
"</head>\n" +
"<body>\n" +
"	<nav class=\"navbar navbar-default\" style=\"font-size: 20px;\">\n" +
"	  <div class=\"container-fluid\">\n" +
"    <div class=\"navbar-header\">\n" +
"      <button type=\"button\"  class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n" +
"        <span class=\"icon-bar\" ></span>\n" +
"        <span class=\"icon-bar\"></span>\n" +
"        <span class=\"icon-bar\"></span>                        \n" +
"      </button>\n" +
"	<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n" +
"      <ul class=\"nav navbar-nav\">\n" +
"        <li ><a href=\"userlogin.html\">Home</a></li>\n" +
"        <li ><a href=\"about\">About-Us</a></li>\n" +
"        <li class=\"dropdown\">\n" +
"          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Online Services<span class=\"caret\"></span></a>\n" +
"              <ul class=\"dropdown-menu\">\n" +
" 	     	 	<li><a href=\"#\">License Application</a></li>\n" +
"            	<li><a href=\"vehicle\">Vehicle Registration</a></li>\n" +
"            	<li><a href=\"complaint\">Complaint Registration</a></li>          	   \n" +
"            </ul>\n" +
"        </li>\n" +
"      \n" +
"        <li class=\"active\">\n" +
"          <a  href=\"contact\">Contact Us</a>\n" +
"            </li>\n" +
"      <li class=\"dropdown\">\n" +
"          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">"+name+"<span class=\"caret\"></span></a>\n" +
"              <ul class=\"dropdown-menu\">\n" +

"            	<li><a href=\"logout\">Logout</a></li>\n" +
"\n" +
"          	   </ul>\n" +
"\n" +
"        </li>\n" +
"\n" +
"         <form action=\"search.jsp\" method=\"post\" class=\"nav navbar-nav navbar-right\" style=\"margin-top: 10px;\">\n" +
"      \n" +
"      <input type=\"text\" name=\"search\"><button><span style=\"color: black;\" class=\"glyphicon glyphicon-search\"></span></button>\n" +
"      </form>\n" +
"  </li>\n" +
"    </ul>\n" +
"    </div>\n" +
"  </div>\n" +
"</nav>\n" +
"<div style=\"background-color: lightblue; color: white;\" class=\"container-fluid\">\n" +
"<h3 style=\"margin-left: 30px;\" >Contact Us</h3>	\n" +
"</div>\n" +
"	<div class=\"container-fluid\" style=\"margin-top: 30px; margin-left: 40px;\">\n" +
"		<img src=\"msg.png\">\n" +
"		<h4>Write To Us: </h4>\n" +
"		<p style=\"font-size: 17px;\">For any query regarding this website, please contact the Web Information Manager.:- </p>\n" +
"		<div class=\"container-fluid\">\n" +
"			<p style=\"font-size: 17px;margin-left: -18px;\"><strong>Name:</strong> Ms Dharkat R. Luikang<br> \n" +
"										<strong>Designation:</strong> Under Secretary (MVL) <br>\n" +
"										<strong>Email:</strong> wim[dot]rth[at]nic[dot]in</p>\n" +
"		</div>\n" +
"		<div class =\"container-fluid\" style=\"font-size: 15px; margin-left: -20px;\">\n" +
"			<div class=\"container-fluid\" style=\"width: 30%;float: left; margin-left: -16px;\">\n" +
"				<p>For any technical problems related to Vehicle registration, fitness, Tax, Permit, Fancy, Dealer etc you may contact:- <br>\n" +
"				<strong>Email :</strong> helpdesk-vahan[at]gov[dot]in <br>\n" +
"				<strong>Phone:</strong> +91-120-2459168 (Timings: 6:00 AM - 10:00 PM)</p>\n" +
"\n" +
"			</div>\n" +
"			<div class=\"container-fluid\" style=\"width: 40%;float: left;\">\n" +
"				For any technical problems related to Learner License, Driving Licence etc you may contact:- <br>\n" +
"				<strong>Email:</strong> helpdesk-sarathi[at]gov[dot]in \n" +
"				<strong>Phone:</strong> +91-120-2459169 (Timings: 6:00 AM - 10:00 PM)\n" +
"			</div>\n" +
"			<div class=\"container-fluid\" style=\"width: 30%;float: left;\">\n" +
"				For any technical problems related to mParivahan you may contact:- <br>\n" +
"				<strong>Email:</strong> helpdesk-mparivahan[at]gov[dot]in\n" +
"			</div>\n" +
"\n" +
"		</div>\n" +
"	</div>\n" +
"	<div class=\"container-fluid\" style=\"background-color: lightblue;height: 60px;\"></div>");
  
       
       
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
