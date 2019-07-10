package com.example.fyp_numerical;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class inter_eq extends Activity {
	

	Button ndd;
	Button lag;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		
		
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.inter_eq);
		
	ndd = (Button) findViewById(R.id.ndd);
	
		lag=(Button) findViewById(R.id.lag);
		
		
	ndd();
	lag();

		
	}
	
	
	private void ndd(){
		ndd.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(inter_eq.this, ndd.class));
			}
		});
		
	
	}

	
	private void lag(){
		lag.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(inter_eq.this, lag.class));
			}
		});
		
	
	}
	
	
}

