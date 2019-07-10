package com.example.fyp_numerical;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class cramer extends Activity implements OnClickListener{
	
	
EditText tb_x11,tb_x12,tb_x13,tb_c1,tb_x21,tb_x22,tb_x23,tb_c2,tb_x31,tb_x32,tb_x33,tb_c3;
	
	Button btn;
	TextView lb_det,lb_x,lb_y,lb_z,lb_dxd,lb_dyd,lb_dzd;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cramer);
		btn=(Button)findViewById(R.id.btn);
		tb_x11=(EditText)findViewById(R.id.tb_x11);
		tb_x12=(EditText)findViewById(R.id.tb_x12);
		tb_x13=(EditText)findViewById(R.id.tb_x13);
		tb_c1=(EditText)findViewById(R.id.tb_c1);
		tb_x21=(EditText)findViewById(R.id.tb_x21);
		tb_x22=(EditText)findViewById(R.id.tb_x22);
		tb_x23=(EditText)findViewById(R.id.tb_x23);
		tb_c2=(EditText)findViewById(R.id.tb_c2);
		tb_x31=(EditText)findViewById(R.id.tb_x31);
		tb_x32=(EditText)findViewById(R.id.tb_x32);
		tb_x33=(EditText)findViewById(R.id.tb_x33);
		tb_c3=(EditText)findViewById(R.id.tb_c3);
			
		
		
		lb_x=(TextView)findViewById(R.id.lb_x);
		lb_y=(TextView)findViewById(R.id.lb_y);
		lb_z=(TextView)findViewById(R.id.lb_z);
		lb_dxd=(TextView)findViewById(R.id.lb_dxd);
		lb_dyd=(TextView)findViewById(R.id.lb_dyd);
		lb_dzd=(TextView)findViewById(R.id.lb_dzd);
		lb_det=(TextView)findViewById(R.id.lb_det);
		
		btn.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	
		try {
			
		       
			double x11, x12, x13;
            double x21, x22, x23;
            double x31, x32, x33;
            double c1, c2, c3;
            double x, y, z;
            double solve_det, solve_detx, solve_dety, solve_detz;
            double solve_detxd, solve_detyd, solve_detzd;
			
			
			 x11 = Double.parseDouble(tb_x11.getText().toString());
			x12 = Double.parseDouble(tb_x12.getText().toString());
			x13 = Double.parseDouble(tb_x13.getText().toString());
			c1 = Double.parseDouble(tb_c1.getText().toString());
			

			 x21 = Double.parseDouble(tb_x21.getText().toString());
			x22 = Double.parseDouble(tb_x22.getText().toString());
			x23 = Double.parseDouble(tb_x23.getText().toString());
			c2 = Double.parseDouble(tb_c2.getText().toString());
			

			 x31 = Double.parseDouble(tb_x31.getText().toString());
			x32 = Double.parseDouble(tb_x32.getText().toString());
			x33 = Double.parseDouble(tb_x33.getText().toString());
			c3 = Double.parseDouble(tb_c3.getText().toString());
			solve_det = det(x11, x12, x13, x21, x22, x23, x31, x32, x33);
            solve_detx = det(c1, x12, x13, c2, x22, x23, c3, x32, x33);
            solve_dety = det(x11, c1, x13, x21, c2, x23, x31, c3, x33);
            solve_detz = det(x11, x12, c1, x21, x22, c2, x31, x32, c3);
            solve_detxd = solve_detx / solve_det;
            solve_detyd = solve_dety / solve_det;
            solve_detzd = solve_detz / solve_det;
            
            
            lb_det.setText(Double.toString(solve_det));
            lb_x.setText(Double.toString(solve_detx));
            lb_y.setText(Double.toString(solve_dety));
            lb_z.setText(Double.toString(solve_detz));
            lb_dxd.setText(Double.toString(solve_detxd));
            lb_dyd.setText(Double.toString(solve_detyd));
            lb_dzd.setText(Double.toString(solve_detzd));

	                
	            
	            
	            
	            
	        
	} catch (Exception e) {
			// TODO: handle exception
		
		}
}

	public double det(double x11, double x12, double x13,
            double x21, double x22, double x23,
            double x31, double x32, double x33)
{
double det;
double x, y, z;
x = x11 * ((x22 * x33) - (x23 * x32));
y = x12 * ((x21 * x33) - (x23 * x31));
z = x13 * ((x21 * x32) - (x22 * x31));
det = x - y + z;
return det;
}

	}

	


