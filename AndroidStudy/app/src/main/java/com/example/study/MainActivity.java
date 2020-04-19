package com.example.study;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int RowCount = 3;
    int ColumnCount = 3;
    int score = 1;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridLayout gridLayout = findViewById(R.id.grid);
        gridLayout.setRowCount(RowCount);
        gridLayout.setColumnCount(ColumnCount);
        TextView view = findViewById(R.id.score);
        int board = (RowCount * ColumnCount);

        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < board; i++) {
            int randomNum = random.nextInt(board) + 1;
            while (list.contains(randomNum)) {
                randomNum = random.nextInt(board) + 1;
            }
            list.add(randomNum);
        }
        List<Button> btn = new ArrayList<>();
        for (int i = 0; i < board; i++) {
            Button button = new Button(this);
            button.setText(String.valueOf(list.get(i)));
            button.setGravity(Gravity.CENTER);
            btn.add(button);
            gridLayout.addView(button);
        }

        list.sort(null);

        for (int i = 0; i < board; i++) {
            click(list, btn.get(i), view);
        }
    }

    public void click(List<Integer> list, Button btn, TextView view) {

        btn.setOnClickListener(v -> {
            if (btn.getText().toString().equals(String.valueOf(list.get(0)))) {
                btn.setVisibility(View.INVISIBLE);
                list.remove(0);
                view.setText(String.valueOf(score++));
            }
            if (list.isEmpty()){
                Toast.makeText(this,"Clear",Toast.LENGTH_SHORT).show();
            }
            });
        }
    }
