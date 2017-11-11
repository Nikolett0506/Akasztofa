package com.example.nikolett.akasztofa;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btn_tipp, btn_plusz, btn_minusz;
    private TextView txtv_tipp, txtv_szo;
    private ImageView imgv_akasztofa;

    private Character[] karakterTomb = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private String[] szoTomb = {"TIGRIS", "CSIGA", "OROSZLAN", "VIZILO", "KUTYA", "MACSKA", "PATKANY", "KECSKE", "POLIP", "ORRSZARVU"};

    private int i;
    private String elozoJatekSzava;
    private String kitalalandoSzo;
    private int probalkozasokSzama;
    private Character[] betukHelyeTomb = {'_', '_', '_', '_', '_', '_', '_', '_', '_'};
    private String szokoz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Letrehoz();
        OnClickListeners();
        UjJatek();
        Tippeles(kitalalandoSzo, txtv_tipp.getText().toString());
    }



    public void Letrehoz() {
        this.btn_tipp = (Button) findViewById(R.id.btn_tipp);
        this.btn_plusz = (Button) findViewById(R.id.btn_plusz);
        this.btn_minusz = (Button) findViewById(R.id.btn_minusz);
        this.imgv_akasztofa = (ImageView) findViewById(R.id.imgv_akasztofa);
        imgv_akasztofa.setImageResource(R.mipmap.akasztofa00);

        i =0;
        this.txtv_tipp = (TextView) findViewById(R.id.txtv_tipp);
        txtv_tipp.setText(karakterTomb[i]);
        this.txtv_szo = (TextView) findViewById(R.id.txtv_szo);

        txtv_tipp.setTextColor(Color.parseColor("#FF8C00"));
    }

    public void OnClickListeners(){

        this.btn_plusz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (karakterTomb[i] == 'Z') {
                    i = 0;
                }
                else{
                    i++;
                }
                txtv_tipp.setText(karakterTomb[i]);
            }
        });

        this.btn_minusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (karakterTomb[i] == 'A') {
                    i = karakterTomb.length -1;
                }else{
                    i--;
                }
                txtv_tipp.setText(karakterTomb[i]);
            }
        });

        this.btn_tipp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tippeles(kitalalandoSzo, txtv_tipp.getText().toString());
            }
        });
    }

    public void UjJatek() {
        Random rand = new Random();
        kitalalandoSzo = szoTomb[rand.nextInt(szoTomb.length)];
        szokoz = "";
        probalkozasokSzama = 0;

        txtv_tipp.setText(String.valueOf(karakterTomb[0]));
        imgv_akasztofa.setImageResource(R.mipmap.akasztofa00);

        if (kitalalandoSzo == elozoJatekSzava)
        {
            kitalalandoSzo = szoTomb[rand.nextInt(szoTomb.length)];
        }
        for (int i = 0; i < kitalalandoSzo.length(); i++) {
            szokoz += " " + betukHelyeTomb[i];
        }
        txtv_szo.setText(szokoz);
        elozoJatekSzava = kitalalandoSzo;
    }

    private char valasztottKarakter;

    public void Tippeles(final String kitalalando, String valasztottChar) {

        valasztottKarakter = valasztottChar.charAt(0);
        for (int i = 0; i< kitalalando.length(); i++) {
                if (kitalalando.charAt(i) == valasztottKarakter) {
                      betukHelyeTomb[i] = valasztottKarakter;
                }

                String kiir = "";
                for (int j = 0; j < betukHelyeTomb.length; j++) {
                    kiir += betukHelyeTomb[j];
                }
                txtv_szo.setText(kiir);



                /*Ha nincs benne a szóban a karakter, akkor növeljük a próbálkozásaink számát és kirajzoljuk az akasztófát*/
                if(kitalalando.charAt(i) != valasztottKarakter)
                {
                        probalkozasokSzama++;
                        switch (probalkozasokSzama) {
                            case 0:
                                imgv_akasztofa.setImageResource(R.mipmap.akasztofa00);
                                break;
                            case 1:
                                imgv_akasztofa.setImageResource(R.mipmap.akasztofa01);
                                break;
                            case 2:
                                imgv_akasztofa.setImageResource(R.mipmap.akasztofa02);
                                break;
                            case 3:
                                imgv_akasztofa.setImageResource(R.mipmap.akasztofa03);
                                break;
                            case 4:
                                imgv_akasztofa.setImageResource(R.mipmap.akasztofa04);
                                break;
                            case 5:
                                imgv_akasztofa.setImageResource(R.mipmap.akasztofa05);
                                break;
                            case 6:
                                imgv_akasztofa.setImageResource(R.mipmap.akasztofa06);
                                break;
                            case 7:
                                imgv_akasztofa.setImageResource(R.mipmap.akasztofa07);
                                break;
                            case 8:
                                imgv_akasztofa.setImageResource(R.mipmap.akasztofa08);
                                break;
                            case 9:
                                imgv_akasztofa.setImageResource(R.mipmap.akasztofa09);
                                break;
                            case 10:
                                imgv_akasztofa.setImageResource(R.mipmap.akasztofa10);
                                break;
                            case 11:
                                imgv_akasztofa.setImageResource(R.mipmap.akasztofa11);
                                break;
                            case 12:
                                imgv_akasztofa.setImageResource(R.mipmap.akasztofa12);
                                break;
                            case 13:
                                imgv_akasztofa.setImageResource(R.mipmap.akasztofa13);
                                break;
                        }
                }

                Uzenetek(kiir);
        }

    }

    public void Uzenetek(String kiir){

        /*Ha kitaláltuk a szót */
        if (!kiir.contains("_"))
        {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setMessage("Gratulálunk!");
            builder1.setCancelable(false);

            builder1.setPositiveButton(
                    "Szeretnék!",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            UjJatek();
                        }
                    });

            builder1.setNegativeButton(
                    "Nem, köszönöm",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            finish();
                        }
                    });

            AlertDialog alert11 = builder1.create();
            alert11.show();
        }

        /*Ha nem találtuk ki a szót */
        if (probalkozasokSzama == 13)
        {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setMessage("Ez most nem jött össze!");
            builder1.setCancelable(false);

            builder1.setPositiveButton(
                    "Megpróbálom..",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            UjJatek();
                        }
                    });

            builder1.setNegativeButton(
                    "Nem! Hagyjál..",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            finish();
                        }
                    });

            AlertDialog alert12 = builder1.create();
            alert12.show();
        }

    }


}


