package com.example.assigment2;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MovieListActivity extends AppCompatActivity {

    RecyclerView moviesList_rv;
    MovieAdapter movieAdapter;

    List<Movie> movieList  = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);


        movieList.add(new Movie("Fast1","Van Disel"," Action","11/8/2012"));//
        movieList.add(new Movie("Fast2","Van Disel"," Action","11/8/2013"));//
        movieList.add(new Movie("Fast3","Van Disel"," Action","11/8/2014"));//
        movieList.add(new Movie("Fast4","Van Disel"," Action","11/8/2015"));//
        movieList.add(new Movie("Fast5","Van Disel"," Action","11/8/2016"));//
        movieList.add(new Movie("Fast6","Van Disel"," Action","11/8/2017"));//
        movieList.add(new Movie("Fast7","Van Disel"," Action","11/8/2018"));//
        movieList.add(new Movie("Fast8","Van Disel"," Action","11/8/2019"));//


        moviesList_rv = findViewById(R.id.moviesList_rv);
        moviesList_rv.setLayoutManager(new LinearLayoutManager(this));
        movieAdapter = new MovieAdapter(this ,movieList);
        moviesList_rv.setAdapter(movieAdapter);
    }
}
