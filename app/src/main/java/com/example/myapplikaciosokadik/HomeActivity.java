package com.example.myapplikaciosokadik;

import androidx.appcompat.app.*;
import androidx.appcompat.widget.*;
import androidx.recyclerview.widget.*;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.*;

import com.google.android.material.floatingactionbutton.*;
import com.google.firebase.auth.*;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.*;

public class HomeActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private FloatingActionButton floatingActionButton;


    private DatabaseReference reference;
    private FirebaseAuth mAuth;
    private FirebaseUser mUser;
    private String onlineUserID;

    private ProgressDialog loader;

    private String key = "";
    private String task;
    private String description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toolbar = findViewById(R.id.homeToolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Jegyzet Készítő App");

        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setReverseLayout(true);
        linearLayoutManager.setStackFromEnd(true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);


        loader = new ProgressDialog(this);

        mAuth = FirebaseAuth.getInstance();

        mUser = mAuth.getCurrentUser();
        onlineUserID = Objects.requireNonNull(mUser).getUid();
        reference = FirebaseDatabase.getInstance().getReference().child("tasks").child(onlineUserID);

        floatingActionButton = findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTask();
            }
        });
    }

    private void addTask() {
        AlertDialog.Builder myDialog = new AlertDialog.Builder(this);
        LayoutInflater inflater = LayoutInflater.from(this);

        View myView = inflater.inflate(R.layout.input_file, null);
        myDialog.setView(myView);

        AlertDialog dialog = myDialog.create();
        dialog.setCancelable(false);
        dialog.show();
    }
}