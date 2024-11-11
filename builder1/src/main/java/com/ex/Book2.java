package com.ex;

import java.util.Date;

import com.ex.Book.BookBuilder;

public class Book2 {


     String name;
     String author;
       int page;
     Date create;

     
    @Override
    public String toString() {
        return "Book2 [name=" + name + ", author=" + author + ", page=" + page + ", create=" + create + "]";
    }


    public Book2(BookBuilder2 bookbuilder){

               this.name = bookbuilder.name;
               this.author = bookbuilder.author;
               this.page = bookbuilder.page;
               this.create = bookbuilder.create;
    }
    

    public static BookBuilder2 getBuilder(){
        return new Book2.BookBuilder2();
    }

    public static class BookBuilder2{

        String name;
        String author;
        int page;
        Date create;


         BookBuilder2 name(String name){

            this.name = name;
            return this;
         }

         BookBuilder2 author(String author){
            this.author = author;
            return this;
         }
         
         BookBuilder2 page (int page){
            this.page = page;
            return this;
         }

         BookBuilder2 create(Date create){
              this.create = create;
              return this;
         }

         Book2 build(){

            return new Book2(this);
         }


    }
}
