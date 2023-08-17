package com.example.roomlibrary;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DataAccessObject {

    @Query("select * from expense")
    List<ExpenseEntity> getAllExpense();

    @Insert
    void addTx(ExpenseEntity expense);

    @Update
    void updateTx(ExpenseEntity expense);

    @Delete
    void deleteTx(ExpenseEntity expense);


}
