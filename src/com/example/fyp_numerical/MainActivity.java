package com.example.fyp_numerical;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends Activity {
Button about,help;
Button start,exit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 
		setContentView(R.layout.main_activity);
		about = (Button) findViewById(R.id.about);
		help = (Button) findViewById(R.id.help);
		start = (Button) findViewById(R.id.start);
		exit = (Button) findViewById(R.id.exit);
		Start();
		About();
		Help();
	Exit();
	}
	
	
		private void About(){
	about.setOnClickListener(new OnClickListener(){
		@Override
		public void onClick(View v){
			
			startActivity(new Intent(MainActivity.this,about.class));
		}
		
	});
	//		help.setOnClickListener(new OnClickListener() {
			
		//	@Override
		//	public void onClick(View v) {
			//	startActivity(new Intent(MainActivity.this, about.class));
			
				
	//					}
//	});

}
		
		
private void Help()
{
	

	help.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			startActivity(new Intent(MainActivity.this, help.class));	
			
		
			
					}
});


}


private void Exit()
{
	
exit.setOnClickListener(new View.OnClickListener(){
	
	public void onClick(View v) {
		//startActivity(new Intent(MainActivity.this, help.class));	
	System.exit(0);
	
		}
			});
		

	}


private void Start()
{
	

	start.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			startActivity(new Intent(MainActivity.this, start_main.class));	
			
		
			
					}
});


}
}