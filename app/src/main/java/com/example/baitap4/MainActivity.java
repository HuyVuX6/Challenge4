package com.example.baitap4;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter sportAdapter;
    private List<Sqort> sportList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView); // Fixed typo here
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        sportList = new ArrayList<>();
        sportList.add(new Sqort("Football", R.drawable.football_image));
        sportList.add(new Sqort("Basketball", R.drawable.basketball_image));
        sportList.add(new Sqort("Tennis", R.drawable.tennis_image));
        sportList.add(new Sqort("Baseball", R.drawable.baseball_image));
        sportList.add(new Sqort("Soccer", R.drawable.running_image));
        sportList.add(new Sqort("Rugby", R.drawable.rugby_image));
        sportList.add(new Sqort("Badminton", R.drawable.badminton_image));

        sportAdapter = new Adapter(sportList);
        recyclerView.setAdapter(sportAdapter);
    }
}