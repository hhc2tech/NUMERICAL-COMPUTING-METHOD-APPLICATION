package com.example.fyp_numerical;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class start_main extends Activity{
	
	
	Button linear,root;
	Button inter;
	Button order;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		
		
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start_main);
		
		root = (Button) findViewById(R.id.root);
		linear =(Button) findViewById(R.id.linear);
		inter = (Button) findViewById(R.id.inter);
		order = (Button) findViewById(R.id.order);
		Linear();
		Root();
		Inter();
		Order();

	}
	

	private void Root(){
		root.setOnClickListener(new OnClickListener(){
	@Override
	public void onClick(View v){
		
		startActivity(new Intent(start_main.this, root_eq.class));
	}
	
});
	
	
	
	
		}
	
	
	private void Linear(){
		linear.setOnClickListener(new OnClickListener(){
	@Override
	public void onClick(View v){
		
		startActivity(new Intent(start_main.this, linear_eq.class));
	}
	
});

	}
	private void Inter(){
		inter.setOnClickListener(new OnClickListener(){
	@Override
	public void onClick(View v){
		
		startActivity(new Intent(start_main.this, inter_eq.class));
	}
	
});
}
	private void Order(){
		order.setOnClickListener(new OnClickListener(){
	@Override
	public void onClick(View v){
		
		startActivity(new Intent(start_main.this, order_eq.class));
	}
	
});
}
}
