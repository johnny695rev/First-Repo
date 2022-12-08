package com.example;
import java.util.ArrayList;
import java.util.List;
import io.javalin.Javalin;

//All Maven projects have their code stored in a src/main/java directory
//com package and example package come from groupId from set up
//packages let maven know where code is when building an app

public class App 
{
    public static List<String> names = new ArrayList<>();

    public static void main( String[] args )
    {
        names.add("Jimmy");
        names.add("Gillian");
        names.add("Michael");

        Javalin app = Javalin.create();

        //localhost:8080/hello in browser 
        app.get("/hello", ctx -> ctx.result("yo"));

        app.post("/add", ctx -> {
            String newName = ctx.body();
            names.add(newName);
            ctx.result("name added");
            ctx.status(201);
        });

        app.get("/person/{num}", ctx -> {
            String numAsString = ctx.pathParam("num");
            int num = Integer.parseInt(numAsString);
            String person = names.get(num);
            ctx.result(person);
            ctx.status(200);
        });

        app.start();
    }
}
