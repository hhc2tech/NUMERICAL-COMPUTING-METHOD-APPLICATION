package com.example.fyp_numerical;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class falsep extends Activity implements OnClickListener{
	
	EditText x3_tb,x2_tb,x_tb,conts_tb,a_tb,b_tb,n_tb;
	Button btn;
	TextView x_lb,itr_lb,error_lb;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.falsep);
		btn=(Button)findViewById(R.id.btn);
		x3_tb=(EditText)findViewById(R.id.x3_tb);
		x2_tb=(EditText)findViewById(R.id.x2_tb);
		x_tb=(EditText)findViewById(R.id.x_tb);
		conts_tb=(EditText)findViewById(R.id.conts_tb);
		a_tb=(EditText)findViewById(R.id.a_tb);
		b_tb=(EditText)findViewById(R.id.b_tb);
		n_tb=(EditText)findViewById(R.id.n_tb);
		x_lb=(TextView)findViewById(R.id.x_lb);
		itr_lb=(TextView)findViewById(R.id.itr_lb);
		error_lb=(TextView)findViewById(R.id.error_lb);
		
		btn.setOnClickListener(this);
		
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		try {
			error_lb.setText(" ");
			 itr_lb.setText (" ");
					 x_lb.setText (" ");
			 double x, x1,err = 0.00005,a,b;
	                int itr = 1, n ;
	           
	                
			  a=Double.parseDouble(a_tb.getText().toString());
			  b=Double.parseDouble(b_tb.getText().toString());
			  n=Integer.parseInt(n_tb.getText().toString()); 
			     
			  x = a - (((b - a) / (f(b) - f(a))) * f(a));
	               
			  itr_lb.setText (itr_lb.getText () + "\n" + Double.toString(itr));
			  
			  x_lb.setText (x_lb.getText () + "\n" + Double.toString(x));
	                
	                itr++;
	                
	                while (itr < n)
	                {
	                    if (f(a) * f(x) < 0)
	                        b = x;
	                    else
	                        a = x;
	                    x1 = x;
	                    x = a - (((b - a) / (f(b) - f(a))) * f(a));
	                    itr_lb.setText (itr_lb.getText () + "\n" + Double.toString(itr));
	                    x_lb.setText (x_lb.getText () + "\n" + Double.toString(x));
	                    
	                   
	                        itr++;
	                    x1 = x;

	                }
	                if (itr == n)
	                	
	               error_lb.setText (error_lb.getText () + "\n" + "solution does not exist as iterations are not sufficient");
	} catch (Exception e) {
			// TODO: handle exception
		
	
	}
		
	}
	
	double f(double x)
    {
        double x33, x22, x11, con, x_val3 = x, x_val2 = x, x_val = x, solve;

        x33=Double.parseDouble(x3_tb.getText().toString());
        x22=Double.parseDouble(x2_tb.getText().toString());
        x11=Double.parseDouble(x_tb.getText().toString());
        con=Double.parseDouble(conts_tb.getText().toString());
        


        x_val3 = x_val3 * x_val3 * x_val3;
        x33 = x33 * x_val3;

        x_val2 = x_val2 * x_val2;
        x22 = x22 * x_val2;

        x11 = x11 * x_val;

        solve = x33 + x22 + x11 + con;
        return solve;
    }
	}

