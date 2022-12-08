package com.example;
import io.javalin.Javalin;

//All Maven projects have their code stored in a src/main/java directory
//com package and example package come from groupId from set up
//packages let maven know where code is when building an app

public class App 
{
    public static void main( String[] args )
    {
        Javalin app = Javalin.create();

        app.get("/hello", ctx -> ctx.result("yo"));

        app.start();
    }
}
