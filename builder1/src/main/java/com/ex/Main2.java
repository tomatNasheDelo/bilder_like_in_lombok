package com.ex;

import java.util.Date;

public class Main2 {

    public static void main(String[] args) {
        
        Book2 book1 = Book2.getBuilder()
                      .name("Karim")
                      .author("Bonch")
                      .create(new Date())
                      .page(89898989)
                      .build();
        System.out.println(book1.toString());

    }
    
}
