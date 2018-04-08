package co.pixelbeard.multielementrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        List<Content> contents = new ArrayList<>();
        contents.add(new Content(0));
        contents.add(new Content(1));
        contents.add(new Content(1));
        contents.add(new Content(2));
        contents.add(new Content(2));
        contents.add(new Content(3));
        contents.add(new Content(3));
        contents.add(new Content(2));
        contents.add(new Content(1));

        MultiElementAdapter adapter = new MultiElementAdapter(contents);
        recyclerView.setAdapter(adapter);
    }


}
