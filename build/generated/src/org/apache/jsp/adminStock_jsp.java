package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.gadgethub.dao.impl.*;
import java.util.List;
import in.gadgethub.dao.*;
import in.gadgethub.pojo.*;
import javax.servlet.ServletOutputStream;
import java.io.*;
import java.util.*;

public final class adminStock_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Product Stocks</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"mycss.css\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #E6F9E6;\">\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"text-center text-primary h3 m-3\">Stock Products</div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"table-responsive \">\n");
      out.write("                <table class=\"table table-hover table-sm\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Image</th>\n");
      out.write("                            <th>ProductId</th>\n");
      out.write("                            <th>Name</th>\n");
      out.write("                            <th>Type</th>\n");
      out.write("                            <th>Price</th>\n");
      out.write("                            <th>Sold Qty</th>\n");
      out.write("                            <th>Stock Qty</th>\n");
      out.write("                            <th colspan=\"2\" class=\"text-center\">Actions</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");

                            List<ProductPojo> products = (List<ProductPojo>) request.getAttribute("products");
                            OrderDao orderDao = new OrderDaoImpl();
                            for (ProductPojo product : products) {
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td><img src=\"./ShowImageServlet?pid=");
      out.print(product.getProdId());
      out.write("\"\n");
      out.write("                                     style=\"width: 50px; height: 50px;\"></td>\n");
      out.write("                            <td><a\n");
      out.write("                                    href=\"./UpdateProductByIdServlet?prodid=");
      out.print(product.getProdId());
      out.write('"');
      out.write('>');
      out.print(product.getProdId());
      out.write("</a></td>\n");
      out.write("                                ");

                                    String name = product.getProdName();
                                    name = name.substring(0, Math.min(name.length(), 25));
                                
      out.write("\n");
      out.write("                            <td>");
      out.print(name);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(product.getProdType().toUpperCase());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(product.getProdPrice());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(orderDao.getSoldQuantity(product.getProdId()));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(product.getProdQuantity());
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("                                <form method=\"post\">\n");
      out.write("                                    <button type=\"submit\"\n");
      out.write("                                            formaction=\"./UpdateProductByIdServlet?prodid=");
      out.print(product.getProdId());
      out.write("\"\n");
      out.write("                                            class=\"btn btn-primary\">Update</button>\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <form method=\"post\">\n");
      out.write("                                    <button type=\"submit\"\n");
      out.write("                                            formaction=\"./RemoveProductServlet?prodid=");
      out.print(product.getProdId());
      out.write("\"\n");
      out.write("                                            class=\"btn btn-danger\">Remove</button>\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                        ");

                            if (products.isEmpty()) {
                        
      out.write("\n");
      out.write("                        <tr style=\"background-color: grey; color: white;\">\n");
      out.write("                            <td colspan=\"7\" style=\"text-align: center;\">No Items\n");
      out.write("                                Available</td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <title>Bootstrap demo</title>\n");
      out.write("        <link\n");
      out.write("            href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css\"\n");
      out.write("            integrity=\"sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("            referrerpolicy=\"no-referrer\"\n");
      out.write("            />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid bg-primary text-white pb-3\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h2 class=\"text-center\">Contact</h2>\n");
      out.write("                <p class=\"text-center\">We love our fans!</p>\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4 mt-1\">\n");
      out.write("                        <p><i class=\"fa-solid fa-phone p-2\"></i> Phone : +91 9303890608</p>\n");
      out.write("                        <p>\n");
      out.write("                            <i class=\"fa-solid fa-envelope p-2\"></i> Email :\n");
      out.write("                            rajnishkushwaha3757@gmail.com\n");
      out.write("                        </p>\n");
      out.write("                        <p>\n");
      out.write("                            <i class=\"fa-solid fa-signs-post p-2\"></i> Postal Code : 462022\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-8 mt-1\">\n");
      out.write("                        <form action=\"./ContactInformationServlet\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-6 form-group mt-1\">\n");
      out.write("                                    <input\n");
      out.write("                                        name=\"name\"\n");
      out.write("                                        type=\"text\"\n");
      out.write("                                        class=\"form-control\"\n");
      out.write("                                        placeholder=\"name\"\n");
      out.write("                                        required\n");
      out.write("                                        />\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-sm-6 form-group mt-1\">\n");
      out.write("                                    <input\n");
      out.write("                                        name=\"email\"\n");
      out.write("                                        type=\"email\"\n");
      out.write("                                        class=\"form-control\"\n");
      out.write("                                        placeholder=\"email\"\n");
      out.write("                                        required\n");
      out.write("                                        />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <textarea\n");
      out.write("                                name=\"message\"\n");
      out.write("                                id=\"message\"\n");
      out.write("                                rows=\"5\"\n");
      out.write("                                class=\"form-control mt-1\"\n");
      out.write("                                placeholder=\"Enter your message....\"\n");
      out.write("                                ></textarea>\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-12 form-group mt-1\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-warning\" name=\"send\" value=\"send\">Send</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script\n");
      out.write("            src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("            integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("        ></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
