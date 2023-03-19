package com.example.rcvandroid50;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView view;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.rcv_user);
        userAdapter = new UserAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        view.setLayoutManager(linearLayoutManager);
        userAdapter.setData(getData());
        view.setAdapter(userAdapter);
    }

    private List<User> getData() {
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.img_1,"User name 1"));
        list.add(new User(R.drawable.img_2,"User name 2"));
        list.add(new User(R.drawable.img_3,"User name 3"));
        list.add(new User(R.drawable.img_4,"User name 4"));

        list.add(new User(R.drawable.img_1,"User name 1"));
        list.add(new User(R.drawable.img_2,"User name 2"));
        list.add(new User(R.drawable.img_3,"User name 3"));
        list.add(new User(R.drawable.img_4,"User name 4"));

        list.add(new User(R.drawable.img_1,"User name 1"));
        list.add(new User(R.drawable.img_2,"User name 2"));
        list.add(new User(R.drawable.img_3,"User name 3"));
        list.add(new User(R.drawable.img_4,"User name 4"));

        return list;
    }
}