package com.example.fyp_numerical;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class  root_eq  extends  Activity{
	

	Button bisection,secant;
	Button newton,falsep;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		
		
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.root_eq);
		
	bisection = (Button) findViewById(R.id.bisection);
	
		secant =(Button) findViewById(R.id.secant);
		newton = (Button) findViewById(R.id.newton);
		falsep =(Button) findViewById(R.id.falesp);
	bisection();
	secant();
	newton();
	falsep();
	}
	
	private void bisection(){
		bisection.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(root_eq.this, bisection.class));
			}
		});
		
	
	}
	private void secant(){
		secant.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(root_eq.this, secant.class));
			}
		});
		
	
	}
	
	private void newton(){
		newton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(root_eq.this, newton.class));
			}
		});
		
	
	}
	

	private void falsep(){
		falsep.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(root_eq.this, falsep.class));
			}
		});
		
	
	}
	
}
	


