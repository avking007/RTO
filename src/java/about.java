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
public class about extends HttpServlet {

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
"        <li ><a href=\"userlogin\">Home</a></li>\n" +
"        <li class=\"active\"><a href=\"about\">About-Us</a></li>\n" +
"        <li class=\"dropdown\">\n" +
"          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Online Services<span class=\"caret\"></span></a>\n" +
"              <ul class=\"dropdown-menu\">\n" +
" 	     	 	<li><a href=\"licence\">License Application</a></li>\n" +
"            	<li><a href=\"vehicle\">Vehicle Registration</a></li>\n" +
"            	<li><a href=\"complaint\">Complaint Registration</a></li>          	   \n" +
"            </ul>\n" +
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
"      <input type=\"text\" name=\"search\"><button><span style=\"color: black;\" class=\"glyphicon glyphicon-search\"></span></button>\n" +
"      </form>\n" +
"  </li>\n" +
"    </ul>\n" +
"    </div>\n" +
"  </div>\n" +
"</nav>\n" +
"	<div class=\"container-fluid\" style=\"background-color: lightblue;\">\n" +
"		<h3>About Us</h3>\n" +
"	</div>\n" +
"	<div style=\"margin-top: 40px;margin-left: 30px;\" class=\"container-fluid\">\n" +
"\n" +
"		<p>The Ministry of Road Transport & Highways (MoRTH) has been facilitating computerization of over 1100 Road Transport Offices (RTOs) across the country. RTOs issue Registration Certificate (RC) & Driving License (DL) that are mandatory requirements and are valid across the country, subject to certain provisions and permissions.</p>\n" +
"		\n" +
"		<br>\n" +
"		<p>With wide variations in state policies and manual/ system based procedures being followed across the country, it had become necessary to define same standards for these documents on a pan-India level to ensure interoperability, correctness and timely availability of information. SCOSTA committee setup for this purpose had recommended a uniform standardized software across the country. The Ministry thus entrusted National Informatics Centre (NIC) with the task of standardizing & deploying two softwares - VAHAN for Vehicle Registration and SARATHI for Driving Licenses and of compiling the data with respect to Vehicle Registration and Driving Licenses of all the states in State Register and National Register.The applications VAHAN & SARATHI were conceptualized to capture the functionalities as mandated by Central Motor Vehicle Act, 1988 as well as State motor vehicle Rules with customization in the core product to suit the requirements of 36 States and UTs.</p>\n" +
"		<h4>Our Vision</h4>\n" +
"		<p>To improve the quality of service delivery to the citizen and the quality of work environment of the RTOs.</p>\n" +
"		<h4>our Mission</h4>\n" +
"		<p>To automate all Vehicle Registration and Driving License related activities in transport authorities of country with introduction of smart card technology to handle issues like inter state transport vehicle movement and to create state and national level registers of vehicles/DL information</p>\n" +
"		<h4>Our Objectives</h4>\n" +
"		<p>To provide :</p>\n" +
"		<ul>\n" +
"			<li>Better services to Transport Department as well as citizen</li>\n" +
"			<li>Quick implementation of government policies from time to time</li>\n" +
"			<li>Improved image of Government & Department</li>\n" +
"			<li>Instant access of Vehicle/DL information to other government departments</li>\n" +
"		</ul>\n" +
"		<p>The latest initiative has been to centralize both these applications for ensuring higher tranparency, security and reliability of operations through a countrywide unified database and provision of a highly citizen and trade centric web enabled environment. The new application being developed would provide for a multi-user environment wherein the end customers (citizens) may be empowered to perform most of the RTO related transactions (including payments) either from the comfort of home or from authorized third party service provider/s in their vicinity. This will also help, to a large extent, in removing the hassles and queues faced by citizens currently (in visiting RTOs for elementary types of transactions),minimizing the extensive paperwork currently being done on the ground and reducing the possibility of middlemen exploiting the uneducated/uninformed citizens. Going forward, mobile based applications would be developed and systems utilizing the Aadhar Based identification would also be integrated with the Unified RTO database for higher security and ease of operations.</p>\n" +
"		<p>With steady steps in direction of achievement of its Vision, Mission and objectives , the ministry is progressing towards provision of improved service access to citizens with quality and efficiency in service delivery, transparency in the system and reduced workload for RTO staff.</p>\n" +
"\n" +
"	</div>\n" +
"	<div class=\"container-fluid\" style=\"background-color: lightblue; height: 80px;\">\n" +
"\n" +
"	</div>\n" +
"\n" +
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
