package com.example.connectthedots;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class FrontActivity extends Activity implements OnClickListener {
	public Button h[][]=new Button[6][5];
	public Button v[][]=new Button [5][6] ;
	public Button c[][]=new Button [5][5] ;
	public Button tb,re ;
	public int hi[][]=new int [6][5] ;
	public int t ;
	public int vi[][]=new int [5][6] ;
	public int ci[][]=new int [5][5] ;
	public int score1,score2 ;
	public TextView s1,s2,w ;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front);
        re=(Button)findViewById(R.id.button3) ;
        w=(TextView)findViewById(R.id.textView4) ;
        s1=(TextView)findViewById(R.id.textView2) ;
        s2=(TextView)findViewById(R.id.textView3) ;
        tb=(Button)findViewById(R.id.button2);
        h[0][0]=(Button)findViewById(R.id.l1121);
        h[0][1]=(Button)findViewById(R.id.l2131);
        h[0][2]=(Button)findViewById(R.id.l3141);
        h[0][3]=(Button)findViewById(R.id.l4151);
        h[1][0]=(Button)findViewById(R.id.l1222);
        h[1][1]=(Button)findViewById(R.id.l2232);
        h[1][2]=(Button)findViewById(R.id.l3242);
        h[1][3]=(Button)findViewById(R.id.l4252); 
        h[2][0]=(Button)findViewById(R.id.l1323);
        h[2][1]=(Button)findViewById(R.id.l2333);
        h[2][2]=(Button)findViewById(R.id.l3343);
        h[2][3]=(Button)findViewById(R.id.l4353);        
        h[3][0]=(Button)findViewById(R.id.l1424);
        h[3][1]=(Button)findViewById(R.id.l2434);
        h[3][2]=(Button)findViewById(R.id.l3444);
        h[3][3]=(Button)findViewById(R.id.l4454); 
        h[4][0]=(Button)findViewById(R.id.l1525);
        h[4][1]=(Button)findViewById(R.id.l2535);
        h[4][2]=(Button)findViewById(R.id.l3545);
        h[4][3]=(Button)findViewById(R.id.l4555);  
        h[0][4]=(Button)findViewById(R.id.l5161);
        h[1][4]=(Button)findViewById(R.id.l5262);
        h[2][4]=(Button)findViewById(R.id.l5363);
        h[3][4]=(Button)findViewById(R.id.l5464);
        h[4][4]=(Button)findViewById(R.id.l5565);
        h[5][0]=(Button)findViewById(R.id.l1626);
        h[5][1]=(Button)findViewById(R.id.l2636);
        h[5][2]=(Button)findViewById(R.id.l3646);
        h[5][3]=(Button)findViewById(R.id.l4656);
        h[5][4]=(Button)findViewById(R.id.l5666);
        
        v[0][0]=(Button)findViewById(R.id.l1112);
        v[0][1]=(Button)findViewById(R.id.l2122);
        v[0][2]=(Button)findViewById(R.id.l3132);
        v[0][3]=(Button)findViewById(R.id.l4142);
        v[0][4]=(Button)findViewById(R.id.l5152);
        v[1][0]=(Button)findViewById(R.id.l1213);
        v[1][1]=(Button)findViewById(R.id.l2223);
        v[1][2]=(Button)findViewById(R.id.l3233);
        v[1][3]=(Button)findViewById(R.id.l4243);
        v[1][4]=(Button)findViewById(R.id.l5253);
        v[2][0]=(Button)findViewById(R.id.l1314);
        v[2][1]=(Button)findViewById(R.id.l2324);
        v[2][2]=(Button)findViewById(R.id.l3334);
        v[2][3]=(Button)findViewById(R.id.l4344);
        v[2][4]=(Button)findViewById(R.id.l5354);        
        v[3][0]=(Button)findViewById(R.id.l1415);
        v[3][1]=(Button)findViewById(R.id.l2425);
        v[3][2]=(Button)findViewById(R.id.l3435);
        v[3][3]=(Button)findViewById(R.id.l4445);
        v[3][4]=(Button)findViewById(R.id.l5455);
        v[0][5]=(Button)findViewById(R.id.l6162);
        v[1][5]=(Button)findViewById(R.id.l6263);
        v[2][5]=(Button)findViewById(R.id.l6364);
        v[3][5]=(Button)findViewById(R.id.l6465);
        v[4][0]=(Button)findViewById(R.id.l1516);
        v[4][1]=(Button)findViewById(R.id.l2526);
        v[4][2]=(Button)findViewById(R.id.l3536);
        v[4][3]=(Button)findViewById(R.id.l4546);
        v[4][4]=(Button)findViewById(R.id.l5556);
        v[4][5]=(Button)findViewById(R.id.l6566);
 
        

        c[0][0]=(Button)findViewById(R.id.Button01);
        c[0][1]=(Button)findViewById(R.id.button1);
        c[0][2]=(Button)findViewById(R.id.Button02);
        c[0][3]=(Button)findViewById(R.id.Button03);
        c[0][4]=(Button)findViewById(R.id.Button17);
        c[1][0]=(Button)findViewById(R.id.Button05);
        c[1][1]=(Button)findViewById(R.id.Button06);
        c[1][2]=(Button)findViewById(R.id.Button09);
        c[1][3]=(Button)findViewById(R.id.Button10);
        c[1][4]=(Button)findViewById(R.id.Button18);
        c[2][0]=(Button)findViewById(R.id.Button04);
        c[2][1]=(Button)findViewById(R.id.Button07);
        c[2][2]=(Button)findViewById(R.id.Button08);
        c[2][3]=(Button)findViewById(R.id.Button11);
        c[2][4]=(Button)findViewById(R.id.Button19);        
        c[3][0]=(Button)findViewById(R.id.Button12);
        c[3][1]=(Button)findViewById(R.id.Button13);
        c[3][2]=(Button)findViewById(R.id.Button14);
        c[3][3]=(Button)findViewById(R.id.Button15);
        c[3][4]=(Button)findViewById(R.id.Button20);
        c[4][0]=(Button)findViewById(R.id.Button21);
        c[4][1]=(Button)findViewById(R.id.Button22);
        c[4][2]=(Button)findViewById(R.id.Button23);
        c[4][3]=(Button)findViewById(R.id.Button24);
        c[4][4]=(Button)findViewById(R.id.Button25);
        
        
        re.setOnClickListener(this) ;
        h[0][0].setOnClickListener(this);
        h[0][1].setOnClickListener(this);
        h[0][2].setOnClickListener(this);
        h[0][3].setOnClickListener(this);
        h[1][0].setOnClickListener(this);
        h[1][1].setOnClickListener(this);
        h[1][2].setOnClickListener(this);
        h[1][3].setOnClickListener(this);
        h[2][0].setOnClickListener(this);
        h[2][1].setOnClickListener(this);
        h[2][2].setOnClickListener(this);
        h[2][3].setOnClickListener(this);
        h[3][0].setOnClickListener(this);
        h[3][1].setOnClickListener(this);
        h[3][2].setOnClickListener(this);
        h[3][3].setOnClickListener(this);
        h[4][0].setOnClickListener(this);
        h[4][1].setOnClickListener(this);
        h[4][2].setOnClickListener(this);
        h[4][3].setOnClickListener(this);
        h[0][4].setOnClickListener(this);
        h[1][4].setOnClickListener(this);
        h[2][4].setOnClickListener(this);
        h[3][4].setOnClickListener(this);
        h[4][4].setOnClickListener(this);
        h[5][0].setOnClickListener(this);
        h[5][1].setOnClickListener(this);
        h[5][2].setOnClickListener(this);
        h[5][3].setOnClickListener(this);
        h[5][4].setOnClickListener(this);
        
        v[0][0].setOnClickListener(this);
        v[0][1].setOnClickListener(this);
        v[0][2].setOnClickListener(this);
        v[0][3].setOnClickListener(this);
        v[0][4].setOnClickListener(this);
        v[1][0].setOnClickListener(this);
        v[1][1].setOnClickListener(this);
        v[1][2].setOnClickListener(this);
        v[1][3].setOnClickListener(this);
        v[1][4].setOnClickListener(this);
        v[2][0].setOnClickListener(this);
        v[2][1].setOnClickListener(this);
        v[2][2].setOnClickListener(this);
        v[2][3].setOnClickListener(this);
        v[2][4].setOnClickListener(this);
        v[3][0].setOnClickListener(this);
        v[3][1].setOnClickListener(this);
        v[3][2].setOnClickListener(this);
        v[3][3].setOnClickListener(this);
        v[3][4].setOnClickListener(this);
        v[0][5].setOnClickListener(this);
        v[1][5].setOnClickListener(this);
        v[2][5].setOnClickListener(this);
        v[3][5].setOnClickListener(this);
        v[4][0].setOnClickListener(this);
        v[4][1].setOnClickListener(this);
        v[4][2].setOnClickListener(this);
        v[4][3].setOnClickListener(this);
        v[4][4].setOnClickListener(this);
        v[4][5].setOnClickListener(this);
        initialize() ;
        change() ;
            }
	public void win(){
		if(score1>=13){
			w.setText("Player 1 Wins :)") ;
		}
		else if(score2>=13){
			w.setText("Player 2 Wins :)") ;
		}
	}
public void display(){
	if(score1==score2){
		for(int k=0;k<5;k++){
			for(int p=0;p<5;p++){
				if(ci[k][p]==1){
					c[k][p].setBackgroundResource(R.drawable.bturn2);
				}
				if(ci[k][p]==2){
					c[k][p].setBackgroundResource(R.drawable.rturn2);
				}
			}
		}
		if(t==2){
			tb.setBackgroundResource(R.drawable.rturn2);
		}
		if(t==1){
			tb.setBackgroundResource(R.drawable.bturn2);
		}
	}
	if(score1>score2){
		for(int k=0;k<5;k++){
			for(int p=0;p<5;p++){
				if(ci[k][p]==1){
					c[k][p].setBackgroundResource(R.drawable.bturn);
				}
				if(ci[k][p]==2){
					c[k][p].setBackgroundResource(R.drawable.rturn3);
				}
			}
		}
		if(t==2){
			tb.setBackgroundResource(R.drawable.rturn3);
		}
		if(t==1){
			tb.setBackgroundResource(R.drawable.bturn);
		}

	}
	else if(score1<score2)
	{
		for(int k=0;k<5;k++){
			for(int p=0;p<5;p++){
				if(ci[k][p]==1){
					c[k][p].setBackgroundResource(R.drawable.bturn3);
				}
				if(ci[k][p]==2){
					c[k][p].setBackgroundResource(R.drawable.rturn);
				}
			}
		}
		if(t==2){
			tb.setBackgroundResource(R.drawable.rturn);
		}
		if(t==1){
			tb.setBackgroundResource(R.drawable.bturn3);
		}

	}
}
public void calc(){
	score1=score2=0;
	for(int k=0;k<5;k++){
		for(int p=0;p<5;p++){
			if(ci[k][p]==1){
				score1++ ;
			}
			else if(ci[k][p]==2){
				score2++ ;
			}
		}
	}
	s1.setText(Integer.toString(score1));
	s2.setText(Integer.toString(score2));
}
	
  public int exit(int x, int y ,int p){
	if(p==0){
		return hi[x][y] ;
	}
	else{
		return vi[x][y] ;
	}
}

public void check(){
	  int f=0,fl=0 ;
	  for(int i=0;i<5;i++){
		  for(int j=0;j<5;j++){
			  	if(hi[i+1][j]!=0&&hi[i][j]!=0){
			  		if(vi[i][j+1]!=0&&vi[i][j]!=0 && ci[i][j]==0){
			  			f=1 ;
			  			if(t==2)
			  			{
			  				//c[i][j].setBackgroundResource(R.drawable.bturn);
			  				ci[i][j]=1 ;
			  				
			  				
			  			}
			  			else{
			  			//	c[i][j].setBackgroundResource(R.drawable.rturn);
			  				ci[i][j]=2 ;
			  				
			  			}
			  			
			  		}
			  		
			  	}
		  }
	  }
	  if(f==1){
		  f=0;
		  fl=1 ;
		  check() ;
	  }
	  if(fl==1){
		  if(t==2)
		  {
			  t=1 ;
		  }
		  else{
			  t=2 ;
		  }
		  f=0;
	  }
  }

public void change(){
	check();
	//if(t==1){
	//	tb.setBackgroundResource(R.drawable.bturn);
	//	
	//}
	//else{
	//	tb.setBackgroundResource(R.drawable.rturn);
//	}
	calc() ;
	display() ;
	win();
	
		
}
	@Override
	public void onClick(View v2) {
		// TODO Auto-generated method stub
		switch (v2.getId())
		{
		case R.id.button3 :
			initialize() ;
			
			s1.setText("0") ;
			s2.setText("0") ;
			w.setText("");
			break ;
		case R.id.l1121 :
			if(exit(0,0,0)!=0)
				break ;
			if (t==2)
			h[0][0].setBackgroundResource(R.drawable.lh) ;
			else
				h[0][0].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[0][0]=2 ;
			else
				hi[0][0]=1 ;
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			
			break ;
		case R.id.l2131 :
			if(exit(0,1,0)!=0)
				break ;
			if (t==2)
			h[0][1].setBackgroundResource(R.drawable.lh);
			else
				h[0][1].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[0][1]=2 ;
			else
				hi[0][1]=1 ;
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l3141 :

			if(exit(0,2,0)!=0)
				break ;
			if (t==2)
			h[0][2].setBackgroundResource(R.drawable.lh);
			else
				h[0][2].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[0][2]=2 ;
			else
				hi[0][2]=1 ;
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l4151 :

			if(exit(0,3,0)!=0)
				break ;
			
			if (t==2)
			h[0][3].setBackgroundResource(R.drawable.lh);
			else
				h[0][3].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[0][3]=2 ;
			else
				hi[0][3]=1 ;
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l1222 :
			if(exit(1,0,0)!=0)
				break ;
			
			if (t==2)
			h[1][0].setBackgroundResource(R.drawable.lh) ;
			else
				h[1][0].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[1][0]=2 ;
			else
				hi[1][0]=1 ;
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l2232 :
			if(exit(1,1,0)!=0)
				break ;
			
			if (t==2)
			h[1][1].setBackgroundResource(R.drawable.lh);
			else
				h[1][1].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[1][1]=2 ;
			else
				hi[1][1]=1 ;
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l3242 :
			if(exit(1,2,0)!=0)
				break ;
			
			if (t==2)
			h[1][2].setBackgroundResource(R.drawable.lh);
			else
				h[1][2].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[1][2]=2 ;
			else
				hi[1][2]=1 ;
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l4252 :

			if(exit(1,3,0)!=0)
				break ;
			if (t==2)
			h[1][3].setBackgroundResource(R.drawable.lh);
			else
				h[1][3].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[1][3]=2 ;
			else
				hi[1][3]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l1323 :
			if(exit(2,0,0)!=0)
				break ;
			
			if (t==2)
			h[2][0].setBackgroundResource(R.drawable.lh) ;
			else
				h[2][0].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[2][0]=2 ;
			else
				hi[2][0]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l2333 :
			if(exit(2,1,0)!=0)
				break ;
			
			if (t==2)
			h[2][1].setBackgroundResource(R.drawable.lh);
			else
				h[2][1].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[2][1]=2 ;
			else
				hi[2][1]=1 ;

			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l3343 :
			if(exit(2,2,0)!=0)
				break ;
			
			if (t==2)
			h[2][2].setBackgroundResource(R.drawable.lh);
			else

				h[2][2].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[2][2]=2 ;
			else
				hi[2][2]=1 ;

			
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l4353 :

			if(exit(2,3,0)!=0)
				break ;
			if (t==2)
			h[2][3].setBackgroundResource(R.drawable.lh);

			else
				h[2][3].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[2][3]=2 ;
			else
				hi[2][3]=1 ;

			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l1424 :

			if(exit(3,0,0)!=0)
				break ;
			
			if (t==2)
			h[3][0].setBackgroundResource(R.drawable.lh) ;

			
			else
				h[3][0].setBackgroundResource(R.drawable.lhb) ;
			
			if(t==2)
				hi[3][0]=2 ;
			else
				hi[3][0]=1 ;
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l2434 :
			if(exit(3,1,0)!=0)
				break ;
			
			
			if (t==2)
			h[3][1].setBackgroundResource(R.drawable.lh);
			else
				h[3][1].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[3][1]=2 ;
			else
				hi[3][1]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l3444 :
			if(exit(3,2,0)!=0)
				break ;
			
			if (t==2)
			h[3][2].setBackgroundResource(R.drawable.lh);
			else
				h[3][2].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[3][2]=2 ;
			else
				hi[3][2]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l4454 :
			if(exit(3,3,0)!=0)
				break ;
			
			if (t==2)
			h[3][3].setBackgroundResource(R.drawable.lh);
			else
				h[3][3].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[3][3]=2 ;
			else
				hi[3][3]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l1525 :

			if(exit(4,0,0)!=0)
				break ;
			
			if (t==2)
			h[4][0].setBackgroundResource(R.drawable.lh) ;
			else
				h[4][0].setBackgroundResource(R.drawable.lhb) ;

			if(t==2)
				hi[4][0]=2 ;
			else
				hi[4][0]=1 ;
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l2535 :
			if(exit(4,1,0)!=0)
				break ;
			
			
			if (t==2)
			h[4][1].setBackgroundResource(R.drawable.lh);
			else
				h[4][1].setBackgroundResource(R.drawable.lhb) ;


			if(t==2)
				hi[4][1]=2 ;
			else
				hi[4][1]=1 ;
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l3545 :

			if(exit(4,2,0)!=0)
				break ;
			
			if (t==2)
			h[4][2].setBackgroundResource(R.drawable.lh);
			else
				h[4][2].setBackgroundResource(R.drawable.lhb) ;

			if(t==2)
				hi[4][2]=2 ;
			else
				hi[4][2]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l4555 :

			if(exit(4,3,0)!=0)
				break ;
			
			if (t==2)
			h[4][3].setBackgroundResource(R.drawable.lh);
			else
				h[4][3].setBackgroundResource(R.drawable.lhb) ;

			if(t==2)
				hi[4][3]=2 ;
			else
				hi[4][3]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l5161 :
			if(exit(0,4,0)!=0)
				break ;
			
			if (t==2)
			h[0][4].setBackgroundResource(R.drawable.lh);
			else
				h[0][4].setBackgroundResource(R.drawable.lhb) ;


			if(t==2)
				hi[0][4]=2 ;
			else
				hi[0][4]=1 ;
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l5262 :
			if(exit(1,4,0)!=0)
				break ;
			
			if (t==2)
			h[1][4].setBackgroundResource(R.drawable.lh);
			else
				h[1][4].setBackgroundResource(R.drawable.lhb) ;

			if(t==2)
				hi[1][4]=2 ;
			else
				hi[1][4]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l5363 :
			if(exit(2,4,0)!=0)
				break ;
			
			if (t==2)
			h[2][4].setBackgroundResource(R.drawable.lh);
			else
				h[2][4].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[2][4]=2 ;
			else
				hi[2][4]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l5464 :
			if(exit(3,4,0)!=0)
				break ;
			
			if (t==2)
			h[3][4].setBackgroundResource(R.drawable.lh);
			else
				h[3][4].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[3][4]=2 ;
			else
				hi[3][4]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l5565 :
			if(exit(4,4,0)!=0)
				break ;
			
			if (t==2)
			h[4][4].setBackgroundResource(R.drawable.lh);
			else
				h[4][4].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[4][4]=2 ;
			else
				hi[4][4]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l1626 :
			if(exit(5,0,0)!=0)
				break ;
			
			if (t==2)
			h[5][0].setBackgroundResource(R.drawable.lh);
			else
				h[5][0].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[5][0]=2 ;
			else
				hi[5][0]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;	
		case R.id.l2636 :
			if(exit(5,1,0)!=0)
				break ;
			
			if (t==2)
			h[5][1].setBackgroundResource(R.drawable.lh);
			else
				h[5][1].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[5][1]=2 ;
			else
				hi[5][1]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l3646 :
			if(exit(5,2,0)!=0)
				break ;
			
			if (t==2)
			h[5][2].setBackgroundResource(R.drawable.lh);
			else
				h[5][2].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[5][2]=2 ;
			else
				hi[5][2]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;	
		case R.id.l4656 :
			if(exit(5,3,0)!=0)
				break ;
			
			if (t==2)
			h[5][3].setBackgroundResource(R.drawable.lh);
			else
				h[5][3].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[5][3]=2 ;
			else
				hi[5][3]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l5666 :
			
			if(exit(5,4,0)!=0)
				break ;
			
			if (t==2)
			h[5][4].setBackgroundResource(R.drawable.lh);
			else
				h[5][4].setBackgroundResource(R.drawable.lhb) ;
			if(t==2)
				hi[5][4]=2 ;
			else
				hi[5][4]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;	
			
		case R.id.l1112 :

			if(exit(0,0,1)!=0)
				break ;
			if (t==2)
			v[0][0].setBackgroundResource(R.drawable.lv);
			else
			v[0][0].setBackgroundResource(R.drawable.lvb);
			if(t==2)
				vi[0][0]=2 ;
			else
				vi[0][0]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l2122 :
			if(exit(0,1,1)!=0)
				break ;
			
			if (t==2)
			v[0][1].setBackgroundResource(R.drawable.lv);
		
			
			else
				v[0][1].setBackgroundResource(R.drawable.lvb);
			
			if(t==2)
				vi[0][1]=2 ;
			else
				vi[0][1]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l3132 :
			if(exit(0,2,1)!=0)
				break ;
			
			if (t==2)
			v[0][2].setBackgroundResource(R.drawable.lv);
			else
				v[0][2].setBackgroundResource(R.drawable.lvb);
			if(t==2)
				vi[0][2]=2 ;
			else
				vi[0][2]=1 ;
			
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l4142 :

			if(exit(0,3,1)!=0)
				break ;
			if (t==2)
			v[0][3].setBackgroundResource(R.drawable.lv);
			else
				v[0][3].setBackgroundResource(R.drawable.lvb);
			if(t==2)
				vi[0][3]=2 ;
			else
				vi[0][3]=1 ;
			
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l5152 :
		
			if(exit(0,4,1)!=0)
				break ;
			if (t==2)
			v[0][4].setBackgroundResource(R.drawable.lv);
			else
				v[0][4].setBackgroundResource(R.drawable.lvb);
			if(t==2)
				vi[0][4]=2 ;
			else
				vi[0][4]=1 ;
			
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l1213 :

			if(exit(1,0,1)!=0)
				break ;
			if (t==2)
			v[1][0].setBackgroundResource(R.drawable.lv);
			else
				v[1][0].setBackgroundResource(R.drawable.lvb);
			if(t==2)
				vi[1][0]=2 ;
			else
				vi[1][0]=1 ;
			
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l2223 :
			if(exit(1,1,1)!=0)
				break ;
			if (t==2)
			v[1][1].setBackgroundResource(R.drawable.lv);
			else
				v[1][1].setBackgroundResource(R.drawable.lvb);
		
			if(t==2)
				vi[1][1]=2 ;
			else
				vi[1][1]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l3233 :

			if(exit(1,2,1)!=0)
				break ;
			if (t==2)
			v[1][2].setBackgroundResource(R.drawable.lv);
			else
				v[1][2].setBackgroundResource(R.drawable.lvb);
			if(t==2)
				vi[1][2]=2 ;
			else
				vi[1][2]=1 ;
			
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l4243 :
			if(exit(1,3,1)!=0)
				break ;
			
			if (t==2)
			v[1][3].setBackgroundResource(R.drawable.lv);
			else
				v[1][3].setBackgroundResource(R.drawable.lvb);
			if(t==2)
				vi[1][3]=2 ;
			else
				vi[1][3]=1 ;
			
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l5253 :
			if(exit(1,4,1)!=0)
				break ;
			
			if (t==2)
			v[1][4].setBackgroundResource(R.drawable.lv);
			else
				v[1][4].setBackgroundResource(R.drawable.lvb);

			if(t==2)
				vi[1][4]=2 ;
			else
				vi[1][4]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l1314 :
			if(exit(2,0,1)!=0)
				break ;
			if (t==2)
			v[2][0].setBackgroundResource(R.drawable.lv);
			else
				v[2][0].setBackgroundResource(R.drawable.lvb);

			if(t==2)
				vi[2][0]=2 ;
			else
				vi[2][0]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l2324 :
			if(exit(2,1,1)!=0)
				break ;
			
			if (t==2)
			v[2][1].setBackgroundResource(R.drawable.lv);
			else
				v[2][1].setBackgroundResource(R.drawable.lvb);
			
			if(t==2)
				vi[2][1]=2 ;
			else
				vi[2][1]=1 ;
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l3334 :
			if(exit(2,2,1)!=0)
				break ;
			
			if (t==2)
			v[2][2].setBackgroundResource(R.drawable.lv);
			else
				v[2][2].setBackgroundResource(R.drawable.lvb);
			if(t==2)
				vi[2][2]=2 ;
			else
				vi[2][2]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l4344 :

			if(exit(2,3,1)!=0)
				break ;
			if (t==2)
			v[2][3].setBackgroundResource(R.drawable.lv);
			else
				v[2][3].setBackgroundResource(R.drawable.lvb);
			if(t==2)
				vi[2][3]=2 ;
			else
				vi[2][3]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l5354 :

			if(exit(2,4,1)!=0)
				break ;
			if (t==2)
			v[2][4].setBackgroundResource(R.drawable.lv);
			else
				v[2][4].setBackgroundResource(R.drawable.lvb);
		
			if(t==2)
				vi[2][4]=2 ;
			else
				vi[2][4]=1 ;
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l1415 :

			if(exit(3,0,1)!=0)
				break ;
			if (t==2)
			v[3][0].setBackgroundResource(R.drawable.lv);
			else
				v[3][0].setBackgroundResource(R.drawable.lvb);
			if(t==2)
				vi[3][0]=2 ;
			else
				vi[3][0]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l2425 :
		
			if(exit(3,1,1)!=0)
				break ;
			if (t==2)
			v[3][1].setBackgroundResource(R.drawable.lv);
			else
				v[3][1].setBackgroundResource(R.drawable.lvb);
		
			if(t==2)
				vi[3][1]=2 ;
			else
				vi[3][1]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l3435 :

			if(exit(3,2,1)!=0)
				break ;
			if (t==2)
			v[3][2].setBackgroundResource(R.drawable.lv);
			else
				v[3][2].setBackgroundResource(R.drawable.lvb);

			if(t==2)
				vi[3][2]=2 ;
			else
				vi[3][2]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l4445 :

			if(exit(3,3,1)!=0)
				break ;
			if (t==2)
			v[3][3].setBackgroundResource(R.drawable.lv);
			else
				v[3][3].setBackgroundResource(R.drawable.lvb);
			if(t==2)
				vi[3][3]=2 ;
			else
				vi[3][3]=1 ;
			
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l5455 :

			if(exit(3,4,1)!=0)
				break ;
			if (t==2)
			v[3][4].setBackgroundResource(R.drawable.lv);
			else
				v[3][4].setBackgroundResource(R.drawable.lvb);
		
			if(t==2)
				vi[3][4]=2 ;
			else
				vi[3][4]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l6162 :

			if(exit(0,5,1)!=0)
				break ;
			if (t==2)
			v[0][5].setBackgroundResource(R.drawable.lv);
			else
				v[0][5].setBackgroundResource(R.drawable.lvb);

			if(t==2)
				vi[0][5]=2 ;
			else
				vi[0][5]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l6263 :
			if(exit(1,5,1)!=0)
				break ;
			if (t==2)
			v[1][5].setBackgroundResource(R.drawable.lv);
			else
				v[1][5].setBackgroundResource(R.drawable.lvb);

			if(t==2)
				vi[1][5]=2 ;
			else
				vi[1][5]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l6364 :
			if(exit(2,5,1)!=0)
				break ;
			if (t==2)
			v[2][5].setBackgroundResource(R.drawable.lv);
			else
				v[2][5].setBackgroundResource(R.drawable.lvb);
			if(t==2)
				vi[2][5]=2 ;
			else
				vi[2][5]=1 ;
			
			
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l6465 :

			if(exit(3,5,1)!=0)
				break ;
			
			if (t==2)
			v[3][5].setBackgroundResource(R.drawable.lv);
			else
				v[3][5].setBackgroundResource(R.drawable.lvb);
		
			if(t==2)
				vi[3][5]=2 ;
			else
				vi[3][5]=1 ;
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l1516 :

			if(exit(4,0,1)!=0)
				break ;
			if (t==2)
			v[4][0].setBackgroundResource(R.drawable.lv);
			else
				v[4][0].setBackgroundResource(R.drawable.lvb);
			if(t==2)
				vi[4][0]=2 ;
			else
				vi[4][0]=1 ;
			
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l2526 :
		
			if(exit(4,1,1)!=0)
				break ;
			if (t==2)
			v[4][1].setBackgroundResource(R.drawable.lv);
			else
				v[4][1].setBackgroundResource(R.drawable.lvb);
		
			if(t==2)
				vi[4][1]=2 ;
			else
				vi[4][1]=1 ;
		
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l3536 :

			if(exit(4,2,1)!=0)
				break ;
			if (t==2)
			v[4][2].setBackgroundResource(R.drawable.lv);
			else
				v[4][2].setBackgroundResource(R.drawable.lvb);
			if(t==2)
				vi[4][2]=2 ;
			else
				vi[4][2]=1 ;
		
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l4546 :

			if(exit(4,3,1)!=0)
				break ;
			if (t==2)
			v[4][3].setBackgroundResource(R.drawable.lv);
			else
				v[4][3].setBackgroundResource(R.drawable.lvb);
	
			if(t==2)
				vi[4][3]=2 ;
			else
				vi[4][3]=1 ;
		
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l5556 :
			if(exit(4,4,1)!=0)
				break ;
			
			if (t==2)
			v[4][4].setBackgroundResource(R.drawable.lv);
			else
				v[4][4].setBackgroundResource(R.drawable.lvb);
		
			if(t==2)
				vi[4][4]=2 ;
			else
				vi[4][4]=1 ;
		
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		case R.id.l6566 :

			if(exit(4,5,1)!=0)
				break ;
			if (t==2)
			v[4][5].setBackgroundResource(R.drawable.lv);
			else
				v[4][5].setBackgroundResource(R.drawable.lvb);
			if(t==2)
				vi[4][5]=2 ;
			else
				vi[4][5]=1 ;
		
			
			if(t==2)
				t=1 ;
			else
				t=2 ;
			change();
			break ;
		}
		
	}
	public void initialize(){
		t=1;
		for(int i=0;i<6;i++){
			for(int j=0;j<5;j++){
				hi[i][j]=0 ;
				vi[j][i]=0 ;
				h[i][j].setBackgroundResource(R.drawable.wh) ;
				v[j][i].setBackgroundResource(R.drawable.wv) ;
		}
			for(int k=0;k<5;k++){
				for(int p=0;p<5;p++)
				{
					ci[k][p]=0 ;
					c[k][p].setBackgroundResource(R.drawable.wbox) ;
				}
			}
			
	}
		score1=0;
		score2=0 ;
		tb.setBackgroundResource(R.drawable.bturn2);
		}
}
