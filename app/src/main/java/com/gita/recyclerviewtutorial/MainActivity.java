package com.gita.recyclerviewtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements RecyclerItemClickListener {

    private RecyclerView recyclerView;
    private ArrayList<Contact> contacts = new ArrayList<>();
    private Button addItemButton;
    private NewContactAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        fillContacts();
         adapter = new NewContactAdapter(contacts, this, this);
        recyclerView.setAdapter(adapter);

        addItemButton = (Button) findViewById(R.id.addItemBtn);
        addItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random = Math.abs(new Random().nextInt()%contacts.size());
                Contact contact = contacts.get(random);
                contacts.add(0, new Contact(contact.getName(), contact.getAge(), contact.getPhoto(), contact.getSex()));
                adapter.notifyItemInserted(0);
                recyclerView.scrollToPosition(0);
            }
        });
    }


    private void fillContacts() {
        contacts.add(new Contact("ლევან ბერიანიძე", 33, R.mipmap.m1, Consts.SEX_MALE));
        contacts.add(new Contact("ნინო ჯოჯუა", 21, R.mipmap.f1, Consts.SEX_FEMALE));
        contacts.add(new Contact("კოტე უჯმაჯურიძე", 40, R.mipmap.m2, Consts.SEX_MALE));
        contacts.add(new Contact("ანა ბაღდავაძე", 24, R.mipmap.f2, Consts.SEX_FEMALE));
        contacts.add(new Contact("გიორგი ტყემალაძე", 33, R.mipmap.m3, Consts.SEX_MALE));
        contacts.add(new Contact("თეონა მანჯავიძე", 45, R.mipmap.f3, Consts.SEX_FEMALE));
        contacts.add(new Contact("ლევან ბერიანიძე", 33, R.mipmap.m1, Consts.SEX_MALE));
        contacts.add(new Contact("ნინო ჯოჯუა", 21, R.mipmap.f1, Consts.SEX_FEMALE));
        contacts.add(new Contact("კოტე უჯმაჯურიძე", 40, R.mipmap.m2, Consts.SEX_MALE));
        contacts.add(new Contact("ანა ბაღდავაძე", 24, R.mipmap.f2, Consts.SEX_FEMALE));
        contacts.add(new Contact("გიორგი ტყემალაძე", 33, R.mipmap.m3, Consts.SEX_MALE));
        contacts.add(new Contact("თეონა მანჯავიძე", 45, R.mipmap.f3, Consts.SEX_FEMALE));
        contacts.add(new Contact("ლევან ბერიანიძე", 33, R.mipmap.m1, Consts.SEX_MALE));
        contacts.add(new Contact("ნინო ჯოჯუა", 21, R.mipmap.f1, Consts.SEX_FEMALE));
        contacts.add(new Contact("კოტე უჯმაჯურიძე", 40, R.mipmap.m2, Consts.SEX_MALE));
        contacts.add(new Contact("ანა ბაღდავაძე", 24, R.mipmap.f2, Consts.SEX_FEMALE));
        contacts.add(new Contact("გიორგი ტყემალაძე", 33, R.mipmap.m3, Consts.SEX_MALE));
        contacts.add(new Contact("თეონა მანჯავიძე", 45, R.mipmap.f3, Consts.SEX_FEMALE));
        contacts.add(new Contact("ლევან ბერიანიძე", 33, R.mipmap.m1, Consts.SEX_MALE));
        contacts.add(new Contact("ნინო ჯოჯუა", 21, R.mipmap.f1, Consts.SEX_FEMALE));
        contacts.add(new Contact("კოტე უჯმაჯურიძე", 40, R.mipmap.m2, Consts.SEX_MALE));
        contacts.add(new Contact("ანა ბაღდავაძე", 24, R.mipmap.f2, Consts.SEX_FEMALE));
        contacts.add(new Contact("გიორგი ტყემალაძე", 33, R.mipmap.m3, Consts.SEX_MALE));
        contacts.add(new Contact("თეონა მანჯავიძე", 45, R.mipmap.f3, Consts.SEX_FEMALE));
        contacts.add(new Contact("ლევან ბერიანიძე", 33, R.mipmap.m1, Consts.SEX_MALE));
        contacts.add(new Contact("ნინო ჯოჯუა", 21, R.mipmap.f1, Consts.SEX_FEMALE));
        contacts.add(new Contact("კოტე უჯმაჯურიძე", 40, R.mipmap.m2, Consts.SEX_MALE));
        contacts.add(new Contact("ანა ბაღდავაძე", 24, R.mipmap.f2, Consts.SEX_FEMALE));
        contacts.add(new Contact("გიორგი ტყემალაძე", 33, R.mipmap.m3, Consts.SEX_MALE));
        contacts.add(new Contact("თეონა მანჯავიძე", 45, R.mipmap.f3, Consts.SEX_FEMALE));
        contacts.add(new Contact("ლევან ბერიანიძე", 33, R.mipmap.m1, Consts.SEX_MALE));
        contacts.add(new Contact("ნინო ჯოჯუა", 21, R.mipmap.f1, Consts.SEX_FEMALE));
        contacts.add(new Contact("კოტე უჯმაჯურიძე", 40, R.mipmap.m2, Consts.SEX_MALE));
        contacts.add(new Contact("ანა ბაღდავაძე", 24, R.mipmap.f2, Consts.SEX_FEMALE));
        contacts.add(new Contact("გიორგი ტყემალაძე", 33, R.mipmap.m3, Consts.SEX_MALE));
        contacts.add(new Contact("თეონა მანჯავიძე", 45, R.mipmap.f3, Consts.SEX_FEMALE));
        contacts.add(new Contact("ლევან ბერიანიძე", 33, R.mipmap.m1, Consts.SEX_MALE));
        contacts.add(new Contact("ნინო ჯოჯუა", 21, R.mipmap.f1, Consts.SEX_FEMALE));
        contacts.add(new Contact("კოტე უჯმაჯურიძე", 40, R.mipmap.m2, Consts.SEX_MALE));
        contacts.add(new Contact("ანა ბაღდავაძე", 24, R.mipmap.f2, Consts.SEX_FEMALE));
        contacts.add(new Contact("გიორგი ტყემალაძე", 33, R.mipmap.m3, Consts.SEX_MALE));
        contacts.add(new Contact("თეონა მანჯავიძე", 45, R.mipmap.f3, Consts.SEX_FEMALE));
    }

    @Override
    public void onItemClicked(int position) {
        Toast.makeText(this, contacts.get(position).getName(), Toast.LENGTH_SHORT).show();
    }
}
