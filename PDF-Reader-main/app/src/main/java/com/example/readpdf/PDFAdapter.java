// Creating a adapter after listview
package com.example.readpdf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PDFAdapter extends ArrayAdapter<File> {

    Context context;
   ViewHoder viewHolder;
   ArrayList<File> al_pdf;

    public PDFAdapter(Context context,ArrayList<File> al_pdf) {
        super(context, R.layout.adapter_pdf,al_pdf);
        this.context = context;
        this.al_pdf = al_pdf;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        if (al_pdf.size()>0){
            return al_pdf.size();
        }
        else  return 1;
    }


    @Override
    public View getView(final int position, View convertView,  ViewGroup parent) {
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_pdf,parent,false);
            viewHolder = new ViewHoder();

            viewHolder.tv_filename = (TextView)convertView.findViewById(R.id.tv_name);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHoder)convertView.getTag();
        }

        viewHolder.tv_filename.setText(al_pdf.get(position).getName());
        return  convertView;

    }

    public class ViewHoder{
        TextView tv_filename;
    }
}
