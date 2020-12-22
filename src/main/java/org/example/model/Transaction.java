package org.example.model;

//  import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

public class Transaction {

    private String id;

    private String reference;
    private String timestamp;
    private Integer amount;

    public Transaction(){
    }
    public Transaction(Integer amount,String reference){
        this.id = UUID.randomUUID().toString();
        this.timestamp = "2020-12-19";
        this.reference = reference;
        this.amount = amount;
    }
    // Transaction Id
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
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
