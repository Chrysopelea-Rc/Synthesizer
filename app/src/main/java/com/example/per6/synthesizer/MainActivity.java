package com.example.per6.synthesizer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private final int WHOLE_NOTE = 1000;


    private Button aButton, asButton, bButton, cButton, csButton, dButton,dsButton,eButton,fButton,fsButton,gButton,eScaleButton,miiMusicButton;
    private MediaPlayer aNote,asNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote,fsNote,gNote, haNote, hasNote, hbNote,hcNote,hcsNote,hdNote,hdsNote,heNote,hfNote,hfsNote,hgNote,gsNote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        wireWidgets();
        setListeners();
        createMediaPlayers();
    }
    //HI MAde it on thescree

    private void createMediaPlayers() {
        aNote = MediaPlayer.create(this,R.raw.scalea);
        asNote = MediaPlayer.create(this,R.raw.scalebb);

        bNote = MediaPlayer.create(this,R.raw.scaleb);
        cNote = MediaPlayer.create(this,R.raw.scalec);
        csNote = MediaPlayer.create(this,R.raw.scalecs);
        dNote = MediaPlayer.create(this,R.raw.scaled);
        dsNote = MediaPlayer.create(this,R.raw.scaleds);
        eNote = MediaPlayer.create(this,R.raw.scalee);
        fNote = MediaPlayer.create(this,R.raw.scalef);
        fsNote = MediaPlayer.create(this,R.raw.scalefs);
        gNote = MediaPlayer.create(this,R.raw.scaleg);
        gsNote=MediaPlayer.create(this,R.raw.scalegs);
        haNote = MediaPlayer.create(this,R.raw.scalea);
        hasNote = MediaPlayer.create(this,R.raw.scalebb);

        hbNote = MediaPlayer.create(this,R.raw.scalehighb);
        hcNote = MediaPlayer.create(this,R.raw.scalehighc);
        hcsNote = MediaPlayer.create(this,R.raw.scalehighcs);
        hdNote = MediaPlayer.create(this,R.raw.scalehighd);
        hdsNote = MediaPlayer.create(this,R.raw.scalehighds);
        heNote = MediaPlayer.create(this,R.raw.scalehighe);
        hfNote = MediaPlayer.create(this,R.raw.scalehighf);
        hfsNote = MediaPlayer.create(this,R.raw.scalehighfs);
        hgNote = MediaPlayer.create(this,R.raw.scalehighg);

    }

    private void setListeners() {
        aButton.setOnClickListener(this);
        asButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        csButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dsButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fsButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        eScaleButton.setOnClickListener(this);
        miiMusicButton.setOnClickListener(this);

    }

    private void wireWidgets() {
        aButton = (Button) findViewById(R.id.button_a);
        asButton = (Button) findViewById(R.id.button_as);
        bButton = (Button) findViewById(R.id.button_b);
        cButton = (Button) findViewById(R.id.button_c);
        csButton = (Button) findViewById(R.id.button_cs);
        dButton = (Button) findViewById(R.id.button_d);
        dsButton = (Button) findViewById(R.id.button_ds);
        eButton = (Button) findViewById(R.id.button_e);
        fButton = (Button) findViewById(R.id.button_f);
        fsButton = (Button) findViewById(R.id.button_fs);
        gButton = (Button) findViewById(R.id.button_g);
        eScaleButton = (Button) findViewById(R.id.e_scale);
        miiMusicButton=(Button) findViewById(R.id.mii);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_a:
                Toast.makeText(this, "A Clicked!", Toast.LENGTH_SHORT).show();
                aNote.seekTo(0);
                aNote.start();
                break;
            case R.id.button_b:
                Toast.makeText(this, "B Clicked!", Toast.LENGTH_SHORT).show();
                bNote.seekTo(0);
                bNote.start();
                break;
            case R.id.button_as:
                Toast.makeText(this, "A# Clicked!", Toast.LENGTH_SHORT).show();
                asNote.seekTo(0);
                asNote.start();
                break;
            case R.id.button_c:
                Toast.makeText(this, "C Clicked!", Toast.LENGTH_SHORT).show();
                cNote.seekTo(0);
                cNote.start();
                break;
            case R.id.button_cs:
                Toast.makeText(this, "C# Clicked!", Toast.LENGTH_SHORT).show();
                csNote.seekTo(0);
                csNote.start();
                break;
            case R.id.button_d:
                Toast.makeText(this, "D Clicked!", Toast.LENGTH_SHORT).show();
                dNote.seekTo(0);
                dNote.start();
                break;
            case R.id.button_ds:
                Toast.makeText(this, "D# Clicked!", Toast.LENGTH_SHORT).show();
                dsNote.seekTo(0);
                dsNote.start();
                break;
            case R.id.button_e:
                Toast.makeText(this, "E Clicked!", Toast.LENGTH_SHORT).show();
                eNote.seekTo(0);
                eNote.start();
                break;
            case R.id.button_f:
                Toast.makeText(this, "F Clicked!", Toast.LENGTH_SHORT).show();
                fNote.seekTo(0);
                fNote.start();
                break;
            case R.id.button_fs:
                Toast.makeText(this, "F# Clicked!", Toast.LENGTH_SHORT).show();
                fsNote.seekTo(0);
                fsNote.start();
                break;
            case R.id.button_g:
                Toast.makeText(this, "G Clicked!", Toast.LENGTH_SHORT).show();
                gNote.seekTo(0);
                gNote.start();
                break;
            //Below is Challenge 1
            case R.id.e_scale:
                //E, F Sharp, G, A, B, C Sharp, D, E
                eNote.seekTo(0);
                eNote.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fsNote.seekTo(0);
                fsNote.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gNote.seekTo(0);
                gNote.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                haNote.seekTo(0);
                haNote.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hbNote.seekTo(0);
                hbNote.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hcsNote.seekTo(0);
                hcsNote.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hdNote.seekTo(0);
                hdNote.start();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                heNote.seekTo(0);
                heNote.start();
                break;
            case R.id.mii:

                play(dNote,fsNote);
                try {
                    Thread.sleep(650);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(haNote,fsNote);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(haNote,hcsNote);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(haNote,fsNote);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(dNote,fsNote);
                try {
                    Thread.sleep(350);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(dNote);
                try {
                    Thread.sleep(220);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(dNote);
                try {
                    Thread.sleep(220);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(dNote);
                try {
                    Thread.sleep(220);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(cNote);
                try {
                    Thread.sleep(320);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(csNote);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(dNote,fsNote);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(fsNote,aNote);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(csNote,aNote);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(fsNote,aNote);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(dNote,fsNote);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(eNote,gsNote);
                try {
                    Thread.sleep(550);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(dsNote,gNote);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(fsNote,dNote);
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(gsNote);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(hcsNote);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(fsNote);
                try {
                    Thread.sleep(330);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(hcsNote);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(gsNote);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(hcsNote);
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(gNote);
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(fsNote);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(csNote,eNote);
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(cNote,eNote);
                try {
                    Thread.sleep(220);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(cNote,eNote);
                try {
                    Thread.sleep(220);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(cNote,eNote);
                try {
                    Thread.sleep(220);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(cNote,eNote);
                try {
                    Thread.sleep(220);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(cNote,eNote);
                try {
                    Thread.sleep(220);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(cNote,eNote);
                try {
                    Thread.sleep(220);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(dsNote,bNote);
                try {
                    Thread.sleep(220);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                play(asNote,dNote);
                try {
                    Thread.sleep(220);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            default:
                Toast.makeText(this, "Nothin Happening", Toast.LENGTH_SHORT).show();
        }
    }
    public void play(MediaPlayer...notes){
        for (MediaPlayer note:notes)
        {
            note.seekTo(0);
            note.start();

        }
    }

}
