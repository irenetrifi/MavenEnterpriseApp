/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author irene
 */
@Local
public interface BookManagerLocal {

    void addBook(String title, String author);

    List<Book> getBooks();
    
}
