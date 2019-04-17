package com.example.user.alphafile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Routinepdf extends AppCompatActivity {

    PDFView classroutine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routinepdf);

        classroutine=(PDFView)findViewById(R.id.pdfviewclass);
        classroutine.fromAsset("class_routine_cse.pdf").load();
    }
}
