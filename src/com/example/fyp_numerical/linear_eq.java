package com.example.fyp_numerical;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class linear_eq extends Activity{
	
	Button cramer;
	Button gauss;
	Button elimination;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		
		
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.linear_eq);
		
	cramer = (Button) findViewById(R.id.cramer);
	
		gauss =(Button) findViewById(R.id.gauss);

		elimination=(Button) findViewById(R.id.elimination);
		
		cramer();
	gauss();
	elimination();
	}
	
	
	
	private void gauss(){
		gauss.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(linear_eq.this, gauss.class));
			}
		});
		
	
	}
	
	  private void cramer(){
	 
		cramer.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(linear_eq.this, cramer.class));
			}
		});
		
	
	}

	
	  private void elimination(){
			elimination.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					startActivity(new Intent(linear_eq.this, elimination.class));
				}
			});
			
		
		}
		

}
