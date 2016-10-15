package com.gita.recyclerviewtutorial;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by len_i_002 on 10/15/2016.
 */

public class NewContactAdapter extends RecyclerView.Adapter<NewContactAdapter.ContactViewHolder> {

    private ArrayList<Contact> contacts;
    private Context context;
    private RecyclerItemClickListener listener;

    public NewContactAdapter(ArrayList<Contact> contacts, Context context, RecyclerItemClickListener itemClickListener){
        this.contacts = contacts;
        this.context = context;
        listener = itemClickListener;
    }


    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_contact, parent, false);

        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        holder.contactImage.setImageResource(contacts.get(position).getPhoto());
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

    class ContactViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView contactImage;
        TextView age, name, sex;

        public ContactViewHolder(View itemView) {
            super(itemView);

            contactImage = (ImageView) itemView.findViewById(R.id.contact_image);
            age = (TextView) itemView.findViewById(R.id.contact_age);
            name = (TextView) itemView.findViewById(R.id.contact_name);
            sex = (TextView) itemView.findViewById(R.id.contact_sex);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(listener!=null){
                listener.onItemClicked(getAdapterPosition());
            }
        }
    }

}
