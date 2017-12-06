package com.example.android.footballstatisticscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int golosA = 0;
    int faltasA = 0;
    int forasDeJogoA = 0;
    int cartoesAmarelosA = 0;
    int expulsoesA = 0;
    int golosB = 0;
    int faltasB = 0;
    int forasDeJogoB = 0;
    int cartoesAmarelosB = 0;
    int expulsoesB = 0;
    int cantosA = 0 ;
    int cantosB = 0 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayGolosButtonA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.golos_equipa_a);
        scoreView.setText(String.valueOf(score));
    }

    public void golosTeamA(View view) {
        golosA = golosA + 1;
        displayGolosButtonA(golosA);
    }

    public void displayFaltasEquipaA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltas_equipa_a);
        scoreView.setText(String.valueOf(score));
    }

    public void faltasTeamA(View view) {
        faltasA = faltasA + 1;
        displayFaltasEquipaA(faltasA);
    }
    public void displayCantosA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cantos_teamA);
        scoreView.setText(String.valueOf(score));
    }

    public void cantosA(View view) {
      cantosA  = cantosA + 1;
        displayCantosA(cantosA);
    }
    public void displayCantosB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cantos_teamB);
        scoreView.setText(String.valueOf(score));
    }

    public void cantosB(View view) {
        cantosB  = cantosB + 1;
        displayCantosB(cantosB);
    }

    public void displayForasJogoA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foras_equipa_a);
        scoreView.setText(String.valueOf(score));
    }

    public void forasEquipaA(View view) {
        forasDeJogoA = forasDeJogoA + 1;
        displayForasJogoA(forasDeJogoA + 1);
    }

    public void displayCartoesA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.c_amarelos_a);
        scoreView.setText(String.valueOf(score));
    }

    public void amarelosTeamA(View view) {
        cartoesAmarelosA = cartoesAmarelosA + 1;
        displayCartoesA(cartoesAmarelosA);
    }

    public void displayExpulsoes(int score) {
        TextView scoreView = (TextView) findViewById(R.id.expulsoes_a);
        scoreView.setText(String.valueOf(score));
    }

    public void expulsoesTeamA(View view) {
        expulsoesA = expulsoesA + 1;
        displayExpulsoes(expulsoesA);
    }

    public void displayGolosButtonB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.golos_equipa_b);
        scoreView.setText(String.valueOf(score));
    }

    public void golosTeamB(View view) {
        golosB = golosB + 1;
        displayGolosButtonB(golosB);
    }

    public void displayFaltasEquipaB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltas_equipa_b);
        scoreView.setText(String.valueOf(score));
    }

    public void faltasTeamB(View view) {
        faltasB = faltasB + 1;
        displayFaltasEquipaB(faltasB);
    }

    public void displayForasJogoB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foras_equipa_b);
        scoreView.setText(String.valueOf(score));
    }

    public void forasJogoB(View view) {
        forasDeJogoB = forasDeJogoB + 1;
        displayForasJogoB(forasDeJogoB + 1);
    }

    public void displayCartoesB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.c_amarelos_b);
        scoreView.setText(String.valueOf(score));
    }

    public void amarelosTeamB(View view) {
        cartoesAmarelosB = cartoesAmarelosB + 1;
        displayCartoesB(cartoesAmarelosB);
    }

    public void displayExpulsoesB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.expulsoes_b);
        scoreView.setText(String.valueOf(score));
    }

    public void expulsoesB(View v) {
        expulsoesB = expulsoesB + 1;
        displayExpulsoesB(expulsoesB);
    }

    public void resetScore(View v) {
        golosA=0;
        faltasA=0;
        expulsoesA=0;
        cartoesAmarelosA = 0;
        forasDeJogoA = 0 ;
        golosB=0;
        faltasB=0;
        expulsoesB=0;
        cartoesAmarelosB = 0;
        forasDeJogoB = 0 ;
        cantosA = 0 ;
        cantosB = 0 ;

        displayFaltasEquipaA(0);
        displayGolosButtonA(0);
        displayExpulsoes(0);
        displayCartoesA(0);
        displayForasJogoA(0);
        displayCartoesB(0);
        displayExpulsoesB(0);
        displayForasJogoB(0);
        displayGolosButtonB(0);
        displayFaltasEquipaB(0);
        displayCantosA(0);
        displayCantosB(0);
    }
}
