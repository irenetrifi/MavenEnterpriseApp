/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author irene
 */
@WebService(serviceName = "WebServiceVideo")
@Stateless()
public class WebServiceVideo {

    @EJB
    private BookManagerLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    @WebMethod(operationName = "addBook")
    @Oneway
    public void addBook(@WebParam(name = "title") String title, @WebParam(name = "author") String author) {
        ejbRef.addBook(title, author);
    }

    @WebMethod(operationName = "getBooks")
    public List<Book> getBooks() {
        return ejbRef.getBooks();
    }
    
}
