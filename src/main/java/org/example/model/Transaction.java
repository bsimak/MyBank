package org.example.model;

//  import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;
import java.time.Clock;
import java.time.ZonedDateTime;

public class Transaction {
    private String id;
    private String reference;
    private ZonedDateTime timestamp;
    private Integer amount;

    public Transaction(){
    }
    public Transaction(Integer amount,String reference){


        this.id = UUID.randomUUID().toString();
        this.timestamp = ZonedDateTime.now(Clock.systemUTC());
        this.reference = reference;
        this.amount = amount;
        System.out.println("now: "+this.timestamp);
    }
    // Transaction Id
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getReference() { return reference; }
    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
