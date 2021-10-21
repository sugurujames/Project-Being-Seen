package com.example.myapplication.DonorUiFrontend;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class DnContentPageActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DnContentPageAdapter adapter;
    DnContentPageHolder holder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dn_content_page);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new DnContentPageAdapter(this, getModels());
        recyclerView.setAdapter(adapter);

//        holder.setOnItemClickListener(new DnContentPageAdapter().OnItemClickListener() {
//            @Override
//            public void onItemClick(int position) {
//                Intent i = new Intent(getApplicationContext(), HyLoginActivity.class);
//                startActivity(i);
//            }
//        });
    }

    private ArrayList<DnContentPageModel> getModels() {
        ArrayList<DnContentPageModel> models = new ArrayList<>();

        DnContentPageModel model = new DnContentPageModel();
        model.setImg(R.drawable.profile);
        model.setName("homeless youth's name");
        model.setTitle("i wanna pay for job training");
        model.setDescription("how i spend the money");
        models.add(model);

        model = new DnContentPageModel();
        model.setImg(R.drawable.profile);
        model.setName("homeless youth's name 2");
        model.setTitle("i wanna pay for job training");
        model.setDescription("how i spend the money");
        models.add(model);

        model = new DnContentPageModel();
        model.setImg(R.drawable.profile);
        model.setName("homeless youth's name 3");
        model.setTitle("i wanna pay for job training");
        model.setDescription("how i spend the money");
        models.add(model);

        return models;
    }
}