package com.bassbosster.slider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.bassbosster.slider.autoimageslider.IndicatorAnimations;
import com.bassbosster.slider.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.bassbosster.slider.autoimageslider.SliderAnimations;
import com.bassbosster.slider.autoimageslider.SliderPager;
import com.bassbosster.slider.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity implements PageCountInterface {

    SliderView sliderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sliderView = findViewById(R.id.imageSlider);

        final SliderAdapterExample adapter = new SliderAdapterExample(this);
        adapter.setCount(3);


        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimations.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
//        sliderView.setSliderTransformAnimation(SliderAnimations.CUBEINROTATIONTRANSFORMATION);
//       sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_RIGHT);
//        sliderView.setIndicatorSelectedColor(Color.WHITE);
//        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.startAutoCycle(this);



      //  Log.e( "onCreate: " ,""+ sliderView.() );        //finish();


        sliderView.setOnIndicatorClickListener(new DrawController.ClickListener() {
            @Override
            public void onIndicatorClicked(int position) {
                sliderView.setCurrentPagePosition(position);
                if(position==2){
                    Toast.makeText(MainActivity.this, "next page ", Toast.LENGTH_SHORT).show();
                }
            }
        });






    }

    @Override
    public void pageCount(int Pageno, boolean status) {

        Log.e("page ", "pageCount: " + Pageno );

        if(Pageno==2) {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
        }
    }
}