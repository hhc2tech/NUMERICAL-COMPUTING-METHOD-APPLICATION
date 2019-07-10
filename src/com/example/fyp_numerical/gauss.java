package com.example.fyp_numerical;


import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class gauss extends Activity implements OnClickListener{
	EditText x1,y1,z1,c1,itr;
	EditText x2,y2,z2,c2;
	EditText x3,y3,z3,c3;
	Button gb;
TextView ttx,er,tty,ttz;

double A11,A12,A13,C1;
double A21,A22,A23,C2;
double A31,A32,A33,C3;
double iter;

@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.gauss);
	gb=(Button)findViewById(R.id.gb);
	x1=(EditText)findViewById(R.id.x1);
	y1=(EditText)findViewById(R.id.y1);
	z1=(EditText)findViewById(R.id.z1);
	c1=(EditText)findViewById(R.id.c1);
	itr=(EditText)findViewById(R.id.itr);
	x2=(EditText)findViewById(R.id.x2);
	y2=(EditText)findViewById(R.id.y2);
	z2=(EditText)findViewById(R.id.z2);
	c2=(EditText)findViewById(R.id.c2);
	x3=(EditText)findViewById(R.id.x3);
	y3=(EditText)findViewById(R.id.y3);
	z3=(EditText)findViewById(R.id.z3);
	c3=(EditText)findViewById(R.id.c3);

	er=(TextView)findViewById(R.id.er);
	ttx=(TextView)findViewById(R.id.ttx);
	tty=(TextView)findViewById(R.id.tty);
	ttz=(TextView)findViewById(R.id.ttz);
	gb.setOnClickListener( this);
	
}

public void onClick(View v) {
	// TODO Auto-generated method stub
	try {
		 iter = Double.parseDouble(itr.getText().toString());
		A11 = Double.parseDouble(x1.getText().toString());
          A12 = Double.parseDouble(y1.getText().toString());
          A13 = Double.parseDouble(z1.getText().toString());
		
          A21 = Double.parseDouble(x2.getText().toString());
          A22 = Double.parseDouble(y2.getText().toString());
          A23 = Double.parseDouble(z2.getText().toString());
		
          A31 = Double.parseDouble(x3.getText().toString());
          A32 = Double.parseDouble(y3.getText().toString());
          A33 = Double.parseDouble(z3.getText().toString());
       
           C1 = Double.parseDouble(c1.getText().toString());
           C2 = Double.parseDouble(c2.getText().toString());
           C3 = Double.parseDouble(c3.getText().toString());
		   
           double x=0,y=0,z=0;
           for (int i = 0; i < iter; i++)
        	          {
        	   x = ((C1) - (A12 * y) - (A13 * z)) / A11;
               y = (C2 - A21 * x - A23 * z) / A22;
               z = (C3 - A31 * x - A32 * y) / A33;
          ttx.setText(Double.toString(x));
           tty.setText(Double.toString(y));
           ttz.setText(Double.toString(z));
        	          }
		}
	catch (Exception e) {
		// TODO: handle exception
	
	//Toast.makeText(
	
		er.setText(e.getMessage());
	}
}

}
