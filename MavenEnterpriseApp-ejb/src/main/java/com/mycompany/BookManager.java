/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author irene
 */
@Stateless
public class BookManager implements BookManagerLocal {

    @EJB
    private BookFacadeLocal bookFacade;
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void addBook(String title, String author) {
        Book b = new Book();
        b.setTitle(title);
        b.setAuthor(author);
        bookFacade.create(b);
    }

    @Override
    public List<Book> getBooks() {
        List<Book> books = bookFacade.findAll();
        return books;
    }
        
}
