package me.polovinskycode;

import com.google.gson.Gson;
import me.polovinskycode.domain.builder.TransactionBuilder;
import me.polovinskycode.domain.model.Transaction;
import me.polovinskycode.domain.repository.TransactionRepository;

import java.util.Date;

import static java.lang.System.getenv;
import static spark.Spark.*;

public class API {

    public static void main(String... args ) {
        port(Integer.valueOf(getenv("PORT") == null ? "4568" : getenv("PORT")));

        path("/api", () -> {
            TransactionRepository repository = new TransactionRepository();

            before("/*", (q, a) -> a.header("Access-Control-Allow-Origin", "*"));

            post("/v1/transaction", "application/json", (q, a) -> {
                Transaction transaction = new Gson().fromJson(q.body(), Transaction.class);
                repository.save(new TransactionBuilder()
                        .idAccount(transaction.getIdAccount())
                        .idOperation(transaction.getIdOperation())
                        .amount(transaction.getAmount())
                        .balance(transaction.getBalance())
                        .event(new Date())
                        .due(new Date())
                        .build());
                return "created";
            });

            post("/v1/payments", "application/json", (q, a) -> {
                
                return "created";
            });
        });
    }
}
