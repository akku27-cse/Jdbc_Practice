package com.example.readpdf;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lv_pdf;                    //this listview is avalable in activity_main.xml file
    public static ArrayList<File> filelist = new ArrayList<>();  // Creatng a arraylist method where template is file and object is file list...
    PDFAdapter obj_adapter;                                       // Adapter object...
    public static int REQUEST_PERMISSION = 1;
    boolean boolean_permission;
    File dir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_pdf = (ListView) findViewById(R.id.listview_pdf);

        dir = new File (Environment.getExternalStorageDirectory().toString());
        permission_fn();

        lv_pdf.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent =new  Intent(getApplicationContext(),ViewPDFFiles.class);
                intent.putExtra("position",position);
                startActivity(intent);



            }
        });



    }

    private void permission_fn() {
        if ((ActivityCompat.checkSelfPermission(getApplicationContext(),Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED)){
            if ((ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this,Manifest.permission.READ_EXTERNAL_STORAGE))){


            }
            else{
                ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},REQUEST_PERMISSION);
            }

        }else {
            boolean_permission = true;
            getfile(dir);
            obj_adapter = new PDFAdapter(getApplicationContext(),filelist);
            lv_pdf.setAdapter(obj_adapter);

        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions,int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == REQUEST_PERMISSION){
            if(grantResults.length > 0 && grantResults[0]  == PackageManager.PERMISSION_GRANTED){

                boolean_permission = true;
                boolean_permission = true;
                getfile(dir);
                obj_adapter = new PDFAdapter(getApplicationContext(),filelist);
                lv_pdf.setAdapter(obj_adapter);

            }
            else {
                Toast.makeText(this,"Please Allow Acces To Get PDF",Toast.LENGTH_SHORT).show();
            }
        }
    }

    public ArrayList<File> getfile(File dir){
        File listfile[] = dir.listFiles();
        if(listfile!= null && listfile.length>0){
            for(int i=0;i<listfile.length;i++){
                if(listfile[i].isDirectory()){
                    getfile(listfile[i]);
                }
                else{
                    boolean booleanpdf = false;
                    if(listfile[i].getName().endsWith(".pdf")){
                        for(int j=0 ; j<filelist.size();j++){
                            if(filelist.get(j).getName().equals(listfile[i].getName())){
                                booleanpdf = true;

                            }
                            else {

                            }
                        }
                        if (booleanpdf){
                            booleanpdf = false;
                        }
                        else {
                            filelist.add(listfile[i]);
                        }
                    }
                }
            }
        }
        return  filelist;
    }
}