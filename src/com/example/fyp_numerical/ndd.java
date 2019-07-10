package com.example.fyp_numerical;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ndd extends Activity implements OnClickListener{
	

	EditText tb_x1,tb_x2,tb_x3,tb_x4,tb_x0,tb_fx1,tb_fx0,tb_fx2,tb_fx3,tb_fx4,tb_x;
	Button btn;
	TextView label;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ndd);
		btn=(Button)findViewById(R.id.btn);
		tb_x0=(EditText)findViewById(R.id.tb_x0);
		tb_x1=(EditText)findViewById(R.id.tb_x1);
		tb_x2=(EditText)findViewById(R.id.tb_x2);
		tb_x3=(EditText)findViewById(R.id.tb_x3);
		tb_x4=(EditText)findViewById(R.id.tb_x4);
		tb_fx0=(EditText)findViewById(R.id.tb_fx0);
		tb_fx1=(EditText)findViewById(R.id.tb_fx1);
		tb_fx2=(EditText)findViewById(R.id.tb_fx2);
		tb_fx3=(EditText)findViewById(R.id.tb_fx3);
		tb_fx4=(EditText)findViewById(R.id.tb_fx4);
		tb_x=(EditText)findViewById(R.id.tb_x);
		label=(TextView)findViewById(R.id.label);
		
		
		btn.setOnClickListener(this);
		
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		try {
			


            double result=0;
          
            double[] xv = new double[10];

            xv[0] = Double.parseDouble(tb_x0.getText().toString());
            xv[1] = Double.parseDouble(tb_x1.getText().toString());
            xv[2] = Double.parseDouble(tb_x2.getText().toString());
            xv[3] = Double.parseDouble(tb_x3.getText().toString());
            xv[4] = Double.parseDouble(tb_x4.getText().toString());
            
        
            double[] y= new double[10];
            y[0] = Double.parseDouble(tb_fx0.getText().toString());
            y[1] = Double.parseDouble(tb_fx1.getText().toString());
            y[2] = Double.parseDouble(tb_fx2.getText().toString());
            y[3] = Double.parseDouble(tb_fx3.getText().toString());
            y[4] = Double.parseDouble(tb_fx4.getText().toString());
            
          
         
            double F, LN, XX, X = 1;
            int i, j, k,n=5,t=Integer.parseInt(tb_x.getText().toString());;
            for (i = 1, LN = y[0]; i < n; i++)
            {
                X *= (t - xv[i - 1]);
                for (j = 0, F = 0; j <= i; j++)
                {
                    for (k = 0, XX = 1; k <= i; k++)
                    {
                        if (k != j)
                            XX *= xv[j] - xv[k];
                    }
                    F += y[j] / XX;
                }
                LN += X * F;
            }
         
            result = LN;
            label.setText(Double.toString(result));
            
        
   }
		 catch (Exception e) {
				// TODO: handle exception
			
			}
		}
	
	
	
		}

