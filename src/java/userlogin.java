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
public class userlogin extends HttpServlet {

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
        HttpSession session = request.getSession(false);
        if ( session != null)
        {
           String name= (String)session.getAttribute("un");
          out.print("<!DOCTYPE html>\n" +
"<html>\n" +
"<head>\n" +
"	<title>Home | RTO Office | Lucknow</title>\n" +
"	  <meta charset=\"utf-8\">\n" +
"	  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"	  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n" +
"	  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n" +
"	  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n" +
"	  <style>\n" +
"	   ul li a:hover\n" +
"	  {\n" +
"	  	color: red;	\n" +
"	  }\n" +
"	</style>\n" +
"</head>\n" +
"<body>\n" +
"<nav class=\"navbar navbar-default\" style=\"font-size: 20px;\">\n" +
"	  <div class=\"container-fluid\">\n" +
"    <div class=\"navbar-header\">\n" +
"      <button type=\"button\"  class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n" +
"        <span class=\"icon-bar\" ></span>\n" +
"        <span class=\"icon-bar\"></span>\n" +
"        <span class=\"icon-bar\"></span>                        \n" +
"      </button>\n" +
"	<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n" +
"      <ul class=\"nav navbar-nav\">\n" +
"        <li class=\"active\"><a href=\"userlogin\">Home</a></li>\n" +
"        <li ><a href=\"about\">About-Us</a></li>\n" +
"        <li class=\"dropdown\">\n" +
"          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Online Services<span class=\"caret\"></span></a>\n" +
"              <ul class=\"dropdown-menu\">\n" +
"         	   <li><a href=\"licence\">License Application</a></li>\n" +
"            	<li><a href=\"vehicle\">Vehicle Registration</a></li>\n" +
"            	<li><a href=\"complaint\">Complaint Registration</a></li>\n" +
"          	   </ul>\n" +
"        </li>\n" +
"      \n" +
"        <li class=\"dropdown\">\n" +
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

"         <form action=\"search.jsp\" method=\"post\" class=\"nav navbar-nav navbar-right\" style=\"margin-top: 10px;\">\n" +
"      \n" +
"      <input type=\"text\" name=\"search\"><button><span style=\"color: black; \" class=\"glyphicon glyphicon-search\"></span></button>\n" +
"      </form>\n" +
"  </li>\n" +
"    </ul>\n" +
"    </div>\n" +
"  </div>\n" +
"</nav>\n" +
"<div class=\"container-fluid\">\n" +
"	<div style=\"float: left;margin-left: 60px;margin-top: 10px;\">\n" +
"	<a href=\"userlogin\" title=\"Home\"><img src=\"logo.png\"></a>\n" +
"	</div>\n" +
"	<div style=\"float: left;margin-left: 20px;\">\n" +
"		<h3>Government of India</h3>\n" +
"		<p style=\"font-family: bold;font-size: 30px;\">MINISTRY OF ROAD TRANSPORT & HIGHWAYS</p>\n" +
"	</div>\n" +
"\n" +
"</div>\n" +
"\n" +
"\n" +
"	<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n" +
"  <!-- Indicators -->\n" +
"  <ol class=\"carousel-indicators\">\n" +
"    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n" +
"    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n" +
"    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n" +
"  </ol>\n" +
"\n" +
"  <!-- Wrapper for slides -->\n" +
"  <div class=\"carousel-inner\">\n" +
"    <div class=\"item active\">\n" +
"      <img src=\"img1.png\" alt=\"Los Angeles\">\n" +
"    </div>\n" +
"\n" +
"    <div class=\"item\">\n" +
"      <img src=\"img2.png\" alt=\"Chicago\">\n" +
"    </div>\n" +
"\n" +
"    <div class=\"item\">\n" +
"      <img src=\"img3.png\" alt=\"New York\">\n" +
"    </div>\n" +
"  </div>\n" +
"\n" +
"  <!-- Left and right controls -->\n" +
"  <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n" +
"    <span class=\"glyphicon glyphicon-chevron-left\"></span>\n" +
"    <span class=\"sr-only\">Previous</span>\n" +
"  </a>\n" +
"  <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n" +
"    <span class=\"glyphicon glyphicon-chevron-right\"></span>\n" +
"    <span class=\"sr-only\">Next</span>\n" +
"  </a>\n" +
"</div>\n" +
"<hr>\n" +
"<div class=\"container-fluid\">\n" +
"<footer style=\"color: red;\">@copy 2019 created by Anish </footer>\n" +
"</div>		\n" +
"</body>\n" +
"</html>");
            
            
        
    
        }
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

