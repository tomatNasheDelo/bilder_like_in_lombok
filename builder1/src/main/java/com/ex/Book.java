package com.ex;

import java.util.Date;

public class Book {


    private String name;
    private String author;
   private  int page;
    private Date create;

    public Book(BookBuilder builder){

        this.name = builder.name;
        this.author = builder.author;
        this.page = builder.page;
        this.create = builder.create;

    }


    

    @Override
    public String toString() {
        return "Book [name=" + name + ", author=" + author + ", page=" + page + ", create=" + create + "]";
    }




    public static BookBuilder getBuilder(){
        return new Book.BookBuilder();
    }

    public static class BookBuilder(){

        String name;
        String author;
        int page;
        Date create;

        BookBuilder(){

        }
            
         public BookBuilder name(String name){
            this.name  = name;

            return this;
         }

         public BookBuilder author(String author){

            this.author = author;

            return this;
         }

         public BookBuilder page(int page){
            this.page = page;
         }

         public BookBuilder create(Date create){
            this.create = create;
         }

           public Book build(){
           return new Book(this);

           }
    }
}
