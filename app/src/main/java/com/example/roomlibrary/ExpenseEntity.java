package com.example.roomlibrary;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "expense")
public class ExpenseEntity {
    @PrimaryKey(autoGenerate = true)
    private int id ;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "amount")
    private String amount;



    ExpenseEntity(int id, String name, String amount){
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    @Ignore
    ExpenseEntity(String name, String amount){

        this.name = name;
        this.amount = amount;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
