package akanshi.com.mobiquity;



import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int height, width;
    Integer toggle = 0;

    ImageView imageView1, imageView2, imageView3;
    LinearLayout layout1, layout2;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            NestedScrollView scrollView = (NestedScrollView)findViewById(R.id.scrollmain);
            imageView1 = (ImageView)findViewById(R.id.image1);
            imageView2 = (ImageView)findViewById(R.id.image2);
            imageView3 = (ImageView)findViewById(R.id.image3);

            layout1 = (LinearLayout) findViewById(R.id.layout1);
            layout2 = (LinearLayout) findViewById(R.id.layout2);



            layout2.setVisibility(View.INVISIBLE);




            if (scrollView != null) {

                scrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
                    @Override
                    public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {


                        if (scrollY > oldScrollY) {
                            layout1.setVisibility(View.INVISIBLE);
                            layout2.setVisibility(View.VISIBLE);
                        }
                        if (scrollY  == 0) {
                            layout1.setVisibility(View.VISIBLE);
                            layout2.setVisibility(View.INVISIBLE);

                        }



                       /* if (scrollY == (v.getChildAt(0).getMeasuredHeight() - v.getMeasuredHeight())) {
                            Log.i(TAG, "BOTTOM SCROLL");
                        }*/
                    }
                });
            }






            Display display = getWindowManager().getDefaultDisplay();
            Point size = new Point();
            display.getSize(size);
            height = size.y;
            width = size.x;







        }



    @Override
        protected void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);

        }
}



