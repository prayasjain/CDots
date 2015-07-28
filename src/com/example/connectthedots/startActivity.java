package com.example.connectthedots;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class startActivity extends Activity implements OnClickListener  {
	public Button btn ;
	@Override  
	protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.start);
	        btn=(Button)findViewById(R.id.button1);
	        btn.setOnClickListener(this);
	        
	  }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()){
			case R.id.button1 :
				Intent i=new Intent(startActivity.this,FrontActivity.class) ;
				startActivity.this.startActivity(i);
		}
	}

}
