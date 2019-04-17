package com.example.user.alphafile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class examRoutinepdf extends AppCompatActivity {

    PDFView xmroutine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_routinepdf);

        xmroutine=(PDFView)findViewById(R.id.pdfviewxm);
        xmroutine.fromAsset("ex_routine_final.pdf").load();
    }
}
