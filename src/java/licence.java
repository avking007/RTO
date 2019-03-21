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

/**
 *
 * @author Anish
 */
public class licence extends HttpServlet {

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
        out.println("<!DOCTYPE html>\n" +
"<html>\n" +
"<head>\n" +
"	<title>Vehicle Registration | Parivahan Sewa| Lucknow </title>\n" +
"		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"	  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n" +
"	  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n" +
"	  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n" +
"	<style>\n" +
"		input{\n" +
"			color: black;\n" +
"		}\n" +
"		textarea{\n" +
"			color: black;\n" +
"		}\n" +
"\n" +
"		.the-fieldset\n" +
"		{\n" +
"			border : 3px solid black;\n" +
"			padding: 10px;\n" +
"			font-family: bold;\n" +
"			color: black;\n" +
"			width: 400px;\n" +
"			text-align: left;\n" +
"		}\n" +
"		.the-legend\n" +
"		{\n" +
"			border-width: 0px;\n" +
"			font-size: 20px;\n" +
"			line-height: 20px;\n" +
"			width: auto;\n" +
"			padding: 0 10px;\n" +
"			color: black;\n" +
"			align-self: left;\n" +
"		}\n" +
"	</style>\n" +
"</head>\n" +
"<body style=\"background-image: url(veh.jpg);\">\n" +
"	<nav class=\"navbar navbar-default\" style=\"font-size: 20px;\">\n" +
"	<div class=\"container-fluid\">\n" +
"		<div class=\"navbar-header\">\n" +
"			<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n" +
"				<span class=\"icon-bar\"></span>\n" +
"				<span class=\"icon-bar\"></span>\n" +
"				<span class=\"icon-bar\"></span>\n" +
"			</button>\n" +
"			<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n" +
"				<ul class=\"nav navbar-nav\">\n" +
"					<li ><a href=\"userlogin\">Home</a></li>\n" +
"					<li><a href=\"about\">About Us</a></li>\n" +
"					<li class=\"dropdown\" class=\"active\">\n" +
"						<a href=\"\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Online Services<span class=\"caret\"></span></a>\n" +
"						<ul class=\"dropdown-menu\">\n" +
"							<li><a href=\"licence\">License Application</a></li>\n" +
"        					<li><a href=\"vehicle\">Vehicle Registration</a></li>\n" +
"            				<li><a href=\"complain\">Complaint Registration</a></li>\n" +
"\n" +
"						</ul>\n" +
"					</li>\n" +
"						<li class=\"dropdown\">\n" +
"          <a  href=\"contact\">Contact Us</a>\n" +
"            </li>\n" +
"         <li class=\"dropdown\">\n" +
"          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">name<span class=\"caret\"></span></a>\n" +
"             <ul class=\"dropdown-menu\">\n" +
"\n" +
"            	<li><a href=\"logout\">Logout</a></li>\n" +
"\n" +
"          	   </ul>\n" +
"          </li>\n" +
"      \n" +
"        <li class=\"dropdown\" >\n" +
"\n" +
"         <form action=\"search.jsp\" method=\"post\" class=\"nav navbar-nav navbar-right\" style=\"margin-top: 10px;\">\n" +
"      \n" +
"      <input type=\"text\" name=\"search\"><button><span style=\"color: black;\" class=\"glyphicon glyphicon-search\"></span></button>\n" +
"      </form>\n" +
"  </li>\n" +
"    </ul>\n" +
"    </div>\n" +
"  </div>\n" +
"</div>\n" +
"</nav>\n" +
"<center>\n" +
"<div class=\"container-fluid\">\n" +
"	<fieldset class=\"the-fieldset\">\n" +
"		<legend class=\"the-legend\">Licence</legend>\n" +
"			<form action=\"licence_submit\" method=\"post\">\n" +
"				Name<input type=\"text\" name=\"name\" style=\"margin-left: 10px;\"><br>\n" +
"				<br>\n" +
"				Age<input type=\"number\" name=\"age\"style=\"margin-left: 20px;\">\n" +
"				<br>\n" +
"				<br>\n" +
"				Reg No. <input type=\"number\" name=\"reg\"><br>\n" +
"				<br>\n" +
"				<input type=\"submit\" value=\"Submit\"></button>\n" +
"			</form>\n" +
"	</fieldset>\n" +
"</div>\n" +
"</center>\n" +
"</body>\n" +
"</html>");
    
    

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