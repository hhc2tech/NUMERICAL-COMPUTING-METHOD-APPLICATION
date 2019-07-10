package com.example.fyp_numerical;

import android.app.Activity;
import android.os.Bundle;



import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class newton extends Activity implements OnClickListener{
	

	EditText textBox6,textBox3,textBox2,textBox1,textBox8,textBox9,textBox10;
	Button btn;
	TextView label9,label10,label11;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newton);
		btn=(Button)findViewById(R.id.btn);
		textBox6=(EditText)findViewById(R.id.textBox6);
		textBox3=(EditText)findViewById(R.id.textBox3);
		textBox2=(EditText)findViewById(R.id.textBox2);
		textBox1=(EditText)findViewById(R.id.textBox1);
		textBox8=(EditText)findViewById(R.id.textBox8);
		textBox9=(EditText)findViewById(R.id.textBox9);
		
		textBox10=(EditText)findViewById(R.id.textBox10);
		
		
		label9=(TextView)findViewById(R.id.label9);
		label10=(TextView)findViewById(R.id.label10);
		label11=(TextView)findViewById(R.id.label11);
		btn.setOnClickListener(this);
		
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		try {
			 label9.setText (" ");
			 label10.setText (" ");
			 label11.setText (" ");
			    
			   
			    
			    double x0, h, err, root=0, x1=0;
			    int miter, iter;
			    x0=Double.parseDouble(textBox8.getText().toString());
			    err=Double.parseDouble(textBox9.getText().toString());
			    miter=Integer.parseInt(textBox10.getText().toString());
			    
			    iter = 1;
                while (iter <= miter)
                {
                    h = F(x0) / Fd(x0);//calculatinf f(x)/f'(x)as we do in Newton Raphson method
                    x1 = x0 - h;//x1=x0-f(x)/f'(x)
                    label9.setText ("The approximation's value after" + "\n" + Double.toString(iter)  + "iteration is" +"\br" +  Double.toString(x1));
                    //label9.Text = "The approximation's value after"+ Convert.ToString(iter) +"iteration is %.12lf\n" + Convert.ToString(x1);
                    if (Math.abs(h) < err)//If the difference between the 2 approximations is below the max error
                    {
                        root = x1;//then make the approximation as the root
                        break;
                    }
                    else
                        x0 = x1;
                    iter++;
                }
                if (root == x1)
                {//display root and the function value
                	 label10.setText ("The root is:" + "\n" + Double.toString(root));
                   //label10.Text = "The root is: %.12lf\n" +Convert.ToString(root);
                    double fncvalue = F(root);
                    label11.setText ("Value of F(root) is:" + "\n" + Double.toString(fncvalue));
                   //label11.Text= "Value of F(root) is: \n" +Convert.ToString( fncvalue);
                }
                
	} catch (Exception e) {
			// TODO: handle exception
		
		//Toast.makeText(
			//	"Incorrect Username or Password!",e.getMessage()
				//).show();
			//e6.setText(e.getMessage());
		}
	}
	
	
	 double F(double x)
     {//our function
         //textBox7.Text = Convert.ToString(((x) * (x) - 5));
         //return ((x) * (x) - 5);
         double x33, x22, x11, con, x_val3 = x, x_val2 = x, x_val = x, solve;

         x33=Double.parseDouble(textBox6.getText().toString());
		    x22=Double.parseDouble(textBox1.getText().toString());
		    x11=Double.parseDouble(textBox2.getText().toString());
		    con=Double.parseDouble(textBox3.getText().toString());

        // x_val3 = Convert.ToDouble(textBox4.Text);
         x_val3 = x_val3 * x_val3 * x_val3;
         x33 = x33 * x_val3;

       //  x_val2 = Convert.ToDouble(textBox4.Text);
         x_val2 = x_val2 * x_val2;
         x22 = x22 * x_val2;

        // x_val = Convert.ToDouble(textBox4.Text);
         x11 = x11 * x_val;

         solve = x33 + x22 + x11 + con;
         //textBox7.Text = Convert.ToString(solve)
         return solve;
     }
     double Fd(double x)
     {//function's differentiation
         //return (3 * (x*x));
         double dfx33, dfx22, dfx11, dfcon, dfx_val3=x, dfx_val2=x, dfx_val, dfsolve;

        dfx33=Double.parseDouble(textBox6.getText().toString());
		    dfx22=Double.parseDouble(textBox1.getText().toString());
		    dfx11=Double.parseDouble(textBox2.getText().toString());
		    dfcon=Double.parseDouble(textBox3.getText().toString());

        
         
         dfx_val3 = 3*(dfx_val3 * dfx_val3);
         dfx33 = dfx33 * dfx_val3;

         dfx_val2 = 2*(dfx_val2);
         dfx22 = dfx22 * dfx_val2;
         //dfsolve = dfx33 * 4 + dfx22 * 2 + dfx11;
         dfx11 = dfx11 * 1;
         return dfx33+dfx22+dfx11;
     }
		

}
