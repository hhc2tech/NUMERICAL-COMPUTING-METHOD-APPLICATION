package com.example.fyp_numerical;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.Math;//in the top of my file

import static java.lang.Math.*;

public class bisection extends Activity implements OnClickListener {

	EditText e1,e2,e3,e4,u_tb,l_tb,itr_tb;
	Button go;
	TextView ans_lb,ans2_lb;
	double d1,d2,d3,d4;
	//double x2, x11, con, x_val, x_val2, solve;
	double a,b,c,d,e;
	double x33, x22, x11, con, x_val3 = 0, x_val2 = 0, x_val = 0, solve;
	double dfx33, dfx22, dfx11, dfcon, dfx_val3=0, dfx_val2=0, dfx_val, dfsolve;
	
	int count=1,n;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bisection);
		go=(Button)findViewById(R.id.go);
		e1=(EditText)findViewById(R.id.e1);
		e2=(EditText)findViewById(R.id.e2);
		e3=(EditText)findViewById(R.id.e3);
		e4=(EditText)findViewById(R.id.e4);
		u_tb=(EditText)findViewById(R.id.u_tb);
		l_tb=(EditText)findViewById(R.id.l_tb);
		ans_lb=(TextView)findViewById(R.id.ans_lb);
		ans2_lb=(TextView)findViewById(R.id.ans2_lb);
		itr_tb=(EditText)findViewById(R.id.itr_tb);
		
		go.setOnClickListener(this);
		
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		try {
			 ans_lb.setText(" ");
			 ans2_lb.setText(" ");
			  double  xx=Double.parseDouble(u_tb.getText().toString());
			     double  yy=Double.parseDouble(l_tb.getText().toString());
			      //z=x+y;
			      //double distance = Math.pow(x,y);
			    //  z=distance;
			    //  tt.setText(Double.toString(z));
			     
			     int ii = 1;
			     double x0,x1,x2;
			     double f1,f2,f0 = 0,t;
			     x0=xx;
			     x1=yy;
			       
			     
			     f1= funct(x0);
			    		 f0=funct(x1);
			    		 
			    		 f0=x0-((f1*(x0-x1)))/(f1-f0);
	//  x_lb.setText (x_lb.getText () + "\n" + Double.toString(x));
		 ans_lb.setText(ans_lb.getText() + "\n" + Double.toString(f0));
		 ans2_lb.setText(ans2_lb.getText() + "\n" + Double.toString(f1));
	
		//	d1=Double.parseDouble(e1.getText().toString());

		//	d5=F(d1);
	//	e5.setText(Double.toString(d5));
	} catch (Exception e) {
			// TODO: handle exception
		
		//Toast.makeText(
			//	"Incorrect Username or Password!",e.getMessage()
				//).show();
			//e6.setText(e.getMessage());
		}
	}
		
	
	
	  double funct(double x)
    {//our function
		  //x33 = Convert.ToDouble(textBox6.Text);
        //x22 = Convert.ToDouble(textBox1.Text);
        //x11 = Convert.ToDouble(textBox2.Text);
      //  con = Convert.ToDouble(textBox3.Text);*/
	//	  double  xx=Double.parseDouble(amount1.getText().toString());
		  x33=Double.parseDouble(e1.getText().toString());
		  x22=Double.parseDouble(e2.getText().toString());
		  x11=Double.parseDouble(e3.getText().toString());
		  con=Double.parseDouble(e4.getText().toString());
		  
		  x_val3 = x * x * x;
          x33 = x33 * x_val3;

          x_val2 = x * x ;
          x22 = x22 * x_val2;

          x11 = x11 * x;

          return (x33 + x22 + x11 + con);
    }

}