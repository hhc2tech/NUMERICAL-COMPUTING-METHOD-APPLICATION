package com.example.fyp_numerical;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class order_eq extends Activity{
	
	Button euler,runge;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		
		
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.order_eq);
		
		euler = (Button) findViewById(R.id.euler);
		runge =(Button) findViewById(R.id.runge);
		
		Euler();
		Runge();
		

	}
	
	private void Euler(){
		euler.setOnClickListener(new OnClickListener(){
	@Override
	public void onClick(View v){
		
		startActivity(new Intent(order_eq.this, euler.class));
	}
	
			});
	

		}
	
	
	private void Runge(){
		runge.setOnClickListener(new OnClickListener(){
	@Override
	public void onClick(View v){
		
		startActivity(new Intent(order_eq.this, runge_kutta.class));
	}
	
			});
	

		}
}
