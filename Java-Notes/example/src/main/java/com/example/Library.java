package com.example;

import java.util.ArrayList;
import java.util.List;
import io.javalin.Javalin;

public class Library {
    //
    static List<Book> library = new ArrayList<>();

    public static void main(String[] args) {
        Book startingBook = new Book();
        startingBook.setTitle("Fellows");
        startingBook.setAuthor("Jr");
        startingBook.setGenre("Horror");
        startingBook.setIsbn(123446);

        library.add(startingBook);

        Javalin app = Javalin.create();

        app.get("/book/{index}", ctx -> {
            int index = Integer.parseInt(ctx.pathParam("index"));
            Book book = library.get(index);
            ctx.json(book);
            ctx.status(200);
        });

        app.post("/book", ctx -> {
            //convert book json in http request into Java Book
            Book newBook = ctx.bodyAsClass(Book.class);
            library.add(newBook);
            ctx.result("Book added");
            ctx.status(201);
        });

        app.patch("/book/{index}", ctx ->{
            int index = Integer.parseInt(ctx.pathParam("index"));
            Book updatedBook = ctx.bodyAsClass(Book.class);
            library.get(index).setAuthor(updatedBook.getAuthor());
            library.get(index).setTitle(updatedBook.getTitle());
            library.get(index).setGenre(updatedBook.getGenre());
            ctx.json(library.get(index));
            ctx.status(200);
        });

        app.put("/book/{index}", ctx ->{
            int index = Integer.parseInt(ctx.pathParam("index"));
            Book updatedBook = ctx.bodyAsClass(Book.class);
            library.set(index, updatedBook);
            ctx.json(library.get(index));
            ctx.status(200);
        });

        app.delete("/book/{index}", ctx ->{
            int index = Integer.parseInt(ctx.pathParam("index"));
            library.remove(index);
            ctx.status(200);
        });

        app.start();

    }
    
}
