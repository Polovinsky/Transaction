package me.polovinskycode;

import static java.lang.System.getenv;
import static spark.Spark.*;

public class API {

    public static void main(String... args ) {
        port(Integer.valueOf(getenv("PORT") == null ? "4567" : getenv("PORT")));

        path("/api", () -> {

            before("/*", (q, a) -> a.header("Access-Control-Allow-Origin", "*"));


        });
    }
}
