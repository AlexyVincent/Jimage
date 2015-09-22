package com.vincent.jimage;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity {
    ImageView img,img2,img3,img4,img5,img6,img7,img8,img9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img=(ImageView) findViewById(R.id.imageView);
        img2=(ImageView) findViewById(R.id.imageView2);
        img3=(ImageView) findViewById(R.id.imageView3);
        img4=(ImageView) findViewById(R.id.imageView4);
        img5=(ImageView) findViewById(R.id.imageView5);
        img6=(ImageView) findViewById(R.id.imageView6);
        img7=(ImageView) findViewById(R.id.imageView7);
        img8=(ImageView) findViewById(R.id.imageView8);
        img9=(ImageView) findViewById(R.id.imageView9);

        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setImageResource(R.drawable.noir);
        ImageView img2 = (ImageView) findViewById(R.id.imageView2);
        img2.setImageResource(R.drawable.noir);
        ImageView img3 = (ImageView) findViewById(R.id.imageView3);
        img3.setImageResource(R.drawable.noir);
        ImageView img4 = (ImageView) findViewById(R.id.imageView4);
        img4.setImageResource(R.drawable.noir);
        ImageView img5 = (ImageView) findViewById(R.id.imageView5);
        img5.setImageResource(R.drawable.noir);
        ImageView img6 = (ImageView) findViewById(R.id.imageView6);
        img6.setImageResource(R.drawable.noir);
        ImageView img7 = (ImageView) findViewById(R.id.imageView7);
        img7.setImageResource(R.drawable.noir);
        ImageView img8 = (ImageView) findViewById(R.id.imageView8);
        img8.setImageResource(R.drawable.noir);
        ImageView img9 = (ImageView) findViewById(R.id.imageView9);
        img9.setImageResource(R.drawable.noir);

       rand();

    }


    public void rand(){
        int r = 0;
        int b = 0;
        int v = 0;
        for (int i = 0; i <= 8; ++i) {
            int y = (int) (Math.random() * 3);
            if (y==0){
                if(r<3){

                }
                if(r>=3 && b!=3){
                    ++y;
                    ++b;
                }else{
                    if(r>=3 && v!=3) {
                        y=y+2;
                        ++v;
                    }else{
                        ++r;
                    }
                }
            }else {
                if (y == 1) {

                    if(b>=3 && v!=3){
                            ++y;
                            ++v;
                    }else{
                        if(b>=3 && r!=3) {
                            --y;
                            ++r;
                        }else{
                            ++b;

                        }
                    }
                }else{
                    if(v>=3 && b!=3){
                            --y;
                            ++b;
                    }else{
                        if(v>=3 && r!=3) {
                            y = y - 2;
                            ++r;
                        }else{
                            ++v;
                        }
                    }
                }
            }
            Log.d("",Integer.toString(y));
            clr(i,y);
        }
    }


   public void clr(int i, int y){
       int tab [][];


        switch (i)
        {
            case 0:
                ImageView img = (ImageView) findViewById(R.id.imageView);
                switch (y)
                {
                    case 0:
                        img.setImageResource(R.drawable.rouge);
                        tab=new int[0][0];

                        break;
                    case 1:
                        img.setImageResource(R.drawable.bleu);
                        tab=new int[0][1];

                        break;
                    case 2:
                        img.setImageResource(R.drawable.vert);
                        tab=new int[0][2];
                        break;
                }

                break;
            case 1:
                ImageView img2 = (ImageView) findViewById(R.id.imageView2);
                switch (y)
                {
                    case 0:
                        img2.setImageResource(R.drawable.rouge);
                        tab=new int[1][0];

                        break;
                    case 1:
                        img2.setImageResource(R.drawable.bleu);
                        tab=new int[1][1];

                        break;
                    case 2:
                        img2.setImageResource(R.drawable.vert);
                        tab=new int[1][2];

                        break;
                }



                break;
            case 2:
                ImageView img3 = (ImageView) findViewById(R.id.imageView3);
                switch (y)
                {
                    case 0:
                        img3.setImageResource(R.drawable.rouge);
                        tab=new int[2][0];

                        break;
                    case 1:
                        img3.setImageResource(R.drawable.bleu);
                        tab=new int[2][1];

                        break;
                    case 2:
                        img3.setImageResource(R.drawable.vert);
                        tab=new int[2][2];

                        break;
                }



                break;
            case 3:
                ImageView img4 = (ImageView) findViewById(R.id.imageView4);
                switch (y)
                {
                    case 0:
                        img4.setImageResource(R.drawable.rouge);
                        tab=new int[3][0];

                        break;
                    case 1:
                        img4.setImageResource(R.drawable.bleu);
                        tab=new int[3][1];

                        break;
                    case 2:
                        img4.setImageResource(R.drawable.vert);
                        tab=new int[3][2];

                        break;
                }



                break;
            case 4:
                ImageView img5 = (ImageView) findViewById(R.id.imageView5);
                switch (y)
                {
                    case 0:
                        img5.setImageResource(R.drawable.rouge);
                        tab=new int[4][0];

                        break;
                    case 1:
                        img5.setImageResource(R.drawable.bleu);
                        tab=new int[4][1];

                        break;
                    case 2:
                        img5.setImageResource(R.drawable.vert);
                        tab=new int[4][2];

                        break;
                }



                break;
            case 5:
                ImageView img6 = (ImageView) findViewById(R.id.imageView6);
                switch (y)
                {
                    case 0:
                        img6.setImageResource(R.drawable.rouge);
                        tab=new int[5][0];

                        break;
                    case 1:
                        img6.setImageResource(R.drawable.bleu);
                        tab=new int[5][1];

                        break;
                    case 2:
                        img6.setImageResource(R.drawable.vert);
                        tab=new int[5][2];

                        break;
                }



                break;
            case 6:
                ImageView img7 = (ImageView) findViewById(R.id.imageView7);
                switch (y)
                {
                    case 0:
                        img7.setImageResource(R.drawable.rouge);
                        tab=new int[6][0];

                        break;
                    case 1:
                        img7.setImageResource(R.drawable.bleu);
                        tab=new int[6][1];

                        break;
                    case 2:
                        img7.setImageResource(R.drawable.vert);
                        tab=new int[6][2];

                        break;
                }



                break;
            case 7:
                ImageView img8 = (ImageView) findViewById(R.id.imageView8);
                switch (y)
                {
                    case 0:
                        img8.setImageResource(R.drawable.rouge);
                        tab=new int[7][0];

                        break;
                    case 1:
                        img8.setImageResource(R.drawable.bleu);
                        tab=new int[7][1];

                        break;
                    case 2:
                        img8.setImageResource(R.drawable.vert);
                        tab=new int[7][2];

                        break;
                }



                break;
            case 8:
                ImageView img9 = (ImageView) findViewById(R.id.imageView9);
                switch (y)
                {
                    case 0:
                        img9.setImageResource(R.drawable.rouge);
                        tab=new int[8][0];

                        break;
                    case 1:
                        img9.setImageResource(R.drawable.bleu);
                        tab=new int[8][1];

                        break;
                    case 2:
                        img9.setImageResource(R.drawable.vert);
                        tab=new int[8][2];

                        break;
                }


                break;

        }




    }

    public void reload(View v){
        rand();
    }



    public void clic1(View v){

    }

    public void clic2(View v){

    }

    public void clic3(View v){

    }

    public void clic4(View v){

    }

    public void clic5(View v){

    }

    public void clic6(View v){

    }

    public void clic7(View v){

    }

    public void clic8(View v){

    }

    public void clic9(View v){

    }



}
