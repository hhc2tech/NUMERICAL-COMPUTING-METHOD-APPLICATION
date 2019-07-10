package com.example.fyp_numerical;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class secant extends Activity{

	
	
	  EditText x3_tb,x2_tb,x_tb,const_tb,itr_tb,err_tb,a_tb,b_tb;
	  TextView ans_lb,fail_lb;
	  
	  Button calc_bt;
	  double x=0;
	  double y=0;
	  double z=0;
	  /** Called when the activity is first created. */
	  @Override
	  public void onCreate(Bundle savedInstanceState)
	  {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.secant);
	      initControls();
	  }
	  private void initControls()
	  {
	      x3_tb=(EditText)findViewById(R.id.x3_tb);
	      x2_tb=(EditText)findViewById(R.id.x2_tb);
	      x_tb=(EditText)findViewById(R.id.x_tb);
	      const_tb=(EditText)findViewById(R.id.const_tb);
	      a_tb=(EditText)findViewById(R.id.a_tb);
	      b_tb=(EditText)findViewById(R.id.b_tb);
	      itr_tb=(EditText)findViewById(R.id.itr_tb);
	      err_tb=(EditText)findViewById(R.id.err_tb);
	      ans_lb=(TextView)findViewById(R.id.ans_lb);
	      fail_lb=(TextView)findViewById(R.id.fail_lb);
	      calc_bt=(Button)findViewById(R.id.calc_bt);
	      calc_bt.setOnClickListener(new Button.OnClickListener()
	      {public void onClick
	      (View  v) { calculate();}});
	  }
	  @SuppressWarnings("null")
	private void calculate()
	  {
		  fail_lb.setText(" ");
		  ans_lb.setText (" ");
	     double  a=Double.parseDouble(a_tb.getText().toString());
	     double  b=Double.parseDouble(b_tb.getText().toString());
	     double  c;
	     double  error=Double.parseDouble(err_tb.getText().toString());
	     
	     int count = 1, n =Integer.parseInt(itr_tb.getText().toString());
         do
         {
             if (f(a) == f(b))
             {
    
                 fail_lb.setText("Solution cannot be found as the values of a and b are same."); 
                 return;
             }
             c = (a * f(b) - b * f(a)) / (f(b) - f(a));
             a = b;
             b = c;
    
             count++;
             if (count == n)
             {
                 break;
             }
             ans_lb.setText (ans_lb.getText () + "\n" + Double.toString(c));
             
         } while (Math.abs(f(c)) > error);
    
     }
	    		 //tt2.setText(Double.toString(ans));
	  
	  
	  double f(double x)
      {
          double x3,x2, x11, con, x2_val,x3_val ;

          x3=Double.parseDouble(x3_tb.getText().toString());
          x2=Double.parseDouble(x2_tb.getText().toString());
          x11=Double.parseDouble(x_tb.getText().toString());
          con=Double.parseDouble(const_tb.getText().toString());
          

          x3_val = x * x * x;
          x3 = x3 * x3_val;

          x2_val = x * x ;
          x2 = x2 * x2_val;

          x11 = x11 * x;

          return (x3 + x2 + x11 + con);
         
      }
}
