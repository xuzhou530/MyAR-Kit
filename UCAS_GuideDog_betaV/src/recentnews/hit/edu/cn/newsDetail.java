package recentnews.hit.edu.cn;

import hit.edu.cn.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class newsDetail extends Activity {

	private WebView webView;
	private Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newsdetail_activity);
		
		webView=(WebView) findViewById(R.id.webView1);
		intent=this.getIntent();
		
		WebSettings ws=webView.getSettings();
		ws.setBuiltInZoomControls(true);
		
		webView.loadUrl(intent.getStringExtra("url"));
		
	}
	
}
