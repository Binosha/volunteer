package com.example.volunteer;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.RelativeLayout;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private void RunAnimation() 
	{
	    Animation a = AnimationUtils.loadAnimation(this, R.anim.scale);
	    a.reset();
	    TextView tv = (TextView) findViewById(R.id.textView2);
	    tv.clearAnimation();
	    tv.startAnimation(a);
	}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        RelativeLayout   layout = (RelativeLayout) findViewById(R.id.layerOne);//In your xml file, main xml  layout android:id="@+id/layout" 
		layout.setOnTouchListener(new OnTouchListener() {

		        @Override
		        public boolean onTouch(View v, MotionEvent event) {
		            // TODO Auto-generated method stub
		            Intent i=new Intent(MainActivity.this,Login.class);  
		            startActivity(i);
		            finish();
					return false;
		           }
		 });
		
		RunAnimation();
		RunAnimation();
		
       
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		  this.finish();
	}
    
    
    
}
