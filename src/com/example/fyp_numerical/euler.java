package com.example.fyp_numerical;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class euler extends Activity implements OnClickListener{
	
EditText xv_tb,x2v_tb,ev_tb,Conv_tb,yv_tb,x_tb,y_tb,h_tb,xn_tb;
	
	Button button1;
	TextView x_lb,y_lb;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.euler);
		button1=(Button)findViewById(R.id.button1);
		xv_tb=(EditText)findViewById(R.id.xv_tb);
		x2v_tb=(EditText)findViewById(R.id.x2v_tb);
		ev_tb=(EditText)findViewById(R.id.ev_tb);
		Conv_tb=(EditText)findViewById(R.id.Conv_tb);
		yv_tb=(EditText)findViewById(R.id.yv_tb);
		x_tb=(EditText)findViewById(R.id.x_tb);
		y_tb=(EditText)findViewById(R.id.y_tb);
		h_tb=(EditText)findViewById(R.id.h_tb);
		xn_tb=(EditText)findViewById(R.id.xn_tb);
		
		
		
		
		x_lb=(TextView)findViewById(R.id.x_lb);
		y_lb=(TextView)findViewById(R.id.y_lb);
		
	
		
		button1.setOnClickListener(this);
		
	}
	
	 double fun(double x, double y)
     {
         //double f;
         //f = x + y;
         //return f;
         double solve;
         double x2, x11, x_e, cons, y11;
         double x2_val, x11_val, x_e_val, y11_val;

         x2 = Double.parseDouble(x2v_tb.getText().toString());
        x11 = Double.parseDouble(xv_tb.getText().toString());
        x_e = Double.parseDouble(ev_tb.getText().toString());
         cons = Double.parseDouble(Conv_tb.getText().toString());
         y11 = Double.parseDouble(yv_tb.getText().toString());
         

         x2_val = x * x;
         x2_val = x2 * x2_val;

         x11_val = x11 * x;

         x_e_val = x_e * Math.exp(-(x));

         y11_val = y * y11;

         solve = x2_val + x11_val + x_e_val + y11_val + cons;
         return solve;
     }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		try {
			
			x_lb.setText (" ");
			y_lb.setText (" ");
			 double a , b, x, y,h, t, k;
			
			
			 a = Double.parseDouble(x_tb.getText().toString());
			b = Double.parseDouble(y_tb.getText().toString());
	         //x= Double.parseDouble(y1.getText().toString());
	          //y= Double.parseDouble(z1.getText().toString());
			
	          h= Double.parseDouble(h_tb.getText().toString());
	          t= Double.parseDouble(xn_tb.getText().toString());
	          //k= Double.parseDouble(z2.getText().toString());
			
	         
	          //z=x+y;
	          x = a;
	            y = b;
	          
			 
	            while (x < t)
	            {
	                k = h * fun(x, y);
	                y = y + k;
	                x = x + h;
	               
	                
	             //   x_lb.Text += Convert.ToString(x)+"\n";
	              //  y_lb.Text += Convert.ToString(y) + "\n";
	                
	                //x_lb.setText(Double.toString(x));
	              //  x_lb.setText("  " + Double.toString(x) + "\n");
	               // x_lb.setT
	                x_lb.setText (x_lb.getText () + "\n" + Double.toString(x)+"\n");
	                y_lb.setText (y_lb.getText () + "\n" + Double.toString(y)+"\n");
	  	        //  	y_lb.setText(Double.toString(y));
	                
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
