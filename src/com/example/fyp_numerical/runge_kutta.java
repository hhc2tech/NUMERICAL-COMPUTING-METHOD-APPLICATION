package com.example.fyp_numerical;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class runge_kutta extends Activity  implements OnClickListener{
	
EditText xv_tb,x2v_tb,ev_tb,Conv_tb,yv_tb,x_tb,y_tb,y2v_tb,h_tb,xn_tb;
	
	Button btn1;
	TextView k1_lb,y_lb,k2_lb,k3_lb,k4_lb;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.runge_kutta);
		btn1=(Button)findViewById(R.id.btn1);
		xv_tb=(EditText)findViewById(R.id.xv_tb);
		x2v_tb=(EditText)findViewById(R.id.x2v_tb);
		ev_tb=(EditText)findViewById(R.id.ev_tb);
		Conv_tb=(EditText)findViewById(R.id.conv_tb);
		yv_tb=(EditText)findViewById(R.id.yv_tb);
		x_tb=(EditText)findViewById(R.id.x_tb);
		y_tb=(EditText)findViewById(R.id.y_tb);
		h_tb=(EditText)findViewById(R.id.h_tb);
		xn_tb=(EditText)findViewById(R.id.xn_tb);
		y2v_tb=(EditText)findViewById(R.id.y2v_tb);
		
		
		
		k1_lb=(TextView)findViewById(R.id.k1_lb);
		k2_lb=(TextView)findViewById(R.id.k2_lb);
		k3_lb=(TextView)findViewById(R.id.k3_lb);
		k4_lb=(TextView)findViewById(R.id.k4_lb);
		y_lb=(TextView)findViewById(R.id.y_lb);
		
	
		
		btn1.setOnClickListener(this);
		
	}
	
	 double fun(double x, double y)
     {
         //double f;
         //f = x + y;
         //return f;
         double solve;
         double x2, x11, x_e, cons, y11,y2;
         double x2_val, x11_val, x_e_val, y11_val,y2_val;

         x2 = Double.parseDouble(x2v_tb.getText().toString());
        x11 = Double.parseDouble(xv_tb.getText().toString());
        x_e = Double.parseDouble(ev_tb.getText().toString());
         cons = Double.parseDouble(Conv_tb.getText().toString());
         y11 = Double.parseDouble(yv_tb.getText().toString());
         y2 = Double.parseDouble(y2v_tb.getText().toString());


         x2_val = x * x;
         x2_val = x2 * x2_val;

         x11_val = x11 * x;

         x_e_val = x_e * Math.exp(x);

         y11_val = y * y11;

         y2_val = y * y;
         y2_val = y2 * y2_val;

         solve = x2_val + x11_val + x_e_val + y11_val + y2_val + cons;
         return solve;
     }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		try {
			 k1_lb.setText (" ");
			 k2_lb.setText (" ");
			 k3_lb.setText (" ");
			 k4_lb.setText (" ");
			 y_lb.setText (" ");
			 double  y1, f,  k1, k2,k3,k4;
			 double x0,y0,h,n;
			
			
			 x0 = Double.parseDouble(x_tb.getText().toString());
			y0 = Double.parseDouble(y_tb.getText().toString());
	        
			
	          h= Double.parseDouble(h_tb.getText().toString());
	          n= Double.parseDouble(xn_tb.getText().toString());
	        
			
	         
	          for (; x0 < n; x0 = x0 + h)
	            {
	          

	                f = fun(x0, y0);
	                k1 = h * f;
	                
	                f = fun(x0 + h / 2, y0 + k1 / 2);
	                k2 = h * f;
	               
	                f = fun(x0 + h / 2, y0 + k2 / 2);
	                k3 = h * f;
	               
	                f = fun(x0 + h / 2, y0 + k2 / 2);
	                k4 = h * f;
	                
	                y1 = y0 + (k1 + 2 * k2 + 2 * k3 + k4) / 6;
	           
	                
	                k1_lb.setText (k1_lb.getText () + "\n" + Double.toString((k1))+"\n");
	           
	               
	                k2_lb.setText (k2_lb.getText () + "\n" + Double.toString((k2))+"\n");
	                
	                k3_lb.setText (k3_lb.getText () + "\n" + Double.toString((k3))+"\n");
	                
	                k4_lb.setText (k4_lb.getText () + "\n" + Double.toString((k4))+"\n");
	               
	                y_lb.setText (y_lb.getText () + "\n" + Double.toString((y1))+"\n");
	                y0 = y1;
	            } 
	            
	            
	        
	} catch (Exception e) {
			// TODO: handle exception
		
		//Toast.makeText(
			//	"Incorrect Username or Password!",e.getMessage()
				//).show();
		//	er.setText(e.getMessage());
		}
	}

}
