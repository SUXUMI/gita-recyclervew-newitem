package com.gita.recyclerviewtutorial;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alex on 10/15/2016.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    private ArrayList<Contact> contacts;

    public ContactAdapter(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.photo.setImageResource(contacts.get(position).getPhoto());
        holder.name.setText(contacts.get(position).getName());
        holder.age.setText("ასაკი არის " + String.valueOf(contacts.get(position).getAge()));

        switch (contacts.get(position).getSex()) {
            case Consts.SEX_FEMALE:
                holder.sex.setText("ქალი");
                Drawable female = ContextCompat.getDrawable(holder.sex.getContext(), R.mipmap.ic_female_logo);
                holder.sex.setCompoundDrawablesWithIntrinsicBounds(null, null, female, null);
                break;
            case Consts.SEX_MALE:
                holder.sex.setText("კაცი");
                Drawable male = ContextCompat.getDrawable(holder.sex.getContext(), R.mipmap.ic_male_logo);
                holder.sex.setCompoundDrawablesWithIntrinsicBounds(null, null, male, null);
                break;
        }

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView photo;
        TextView name, age, sex;

        public ViewHolder(View itemView) {
            super(itemView);
            photo = (ImageView) itemView.findViewById(R.id.contact_image);
            name = (TextView) itemView.findViewById(R.id.contact_name);
            age = (TextView) itemView.findViewById(R.id.contact_age);
            sex = (TextView) itemView.findViewById(R.id.contact_sex);
        }
    }
}
