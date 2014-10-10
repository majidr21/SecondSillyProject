package crec.secondsillyproject.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class WeirdActivity extends Activity
{
	private Button appButton;
	private TextView appText;
	private ArrayList<Integer>colorList;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weird);


		appButton=(Button) findViewById(R.id.firstButton);
		appText = (TextView) findViewById(R.id.boringTextView);
		colorList = new ArrayList<Integer>();
		
		fillTheColorList();
		setupListeners();
	private void fillTheColorList()
	{
		colorList.add(R.color.black);
		colorList.add(R.color.prettyPurple);
		
	}
		
		private void setupListeners()
		
		setupListeners();
		{
		}
		}
		
		private void setupListeners()
		{
			appButton.setOnClickListener(new OnClickListener()
			{
			@
			
				Override
				public void onClick(View currentView)
				{
					//Button click stuff goes here
					appButton.setBackgroundResource(R.color.uglyBrown);
				}
			});
		}
		
}
				
				
	
// everything you use in xml will get screweed up
