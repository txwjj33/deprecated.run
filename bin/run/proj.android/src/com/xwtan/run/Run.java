/****************************************************************************
Copyright (c) 2010-2012 cocos2d-x.org

http://www.cocos2d-x.org

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
****************************************************************************/
package com.xwtan.run;

import org.cocos2dx.lib.Cocos2dxActivity;
//import com.pkag.m.MyMDListner;
//import com.pkag.m.MyMediaManager;

//import android.app.Activity��
import net.youmi.android.AdManager;
import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;
import net.youmi.android.spot.SpotDialogListener;
import net.youmi.android.spot.SpotManager;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.FrameLayout;

public class Run extends Cocos2dxActivity {
	
	static private Run sInstance;
	
	private static Cocos2dxActivity context;
	
    public static Run getInstance() { return sInstance; }

    public static void setInstance(final Run instance) { sInstance = instance; }

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_ad);
		setInstance(this);
		Log.d("Youmi", "onCreate, show ads!");
		
		context = (Cocos2dxActivity) Cocos2dxActivity.getContext();
		
//		AdManager.getInstance(this).init("6699b8ebfd92e055", "64956e39f0ed9461", true);
//		SpotManager.getInstance(this).loadSpotAds();
//		
//		FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams( FrameLayout.LayoutParams.FILL_PARENT,
//		    FrameLayout.LayoutParams.WRAP_CONTENT);
//
//		layoutParams.gravity = Gravity.BOTTOM | Gravity.RIGHT; // ����ʾ��Ϊ���½�
//		AdView adView = new AdView(this, AdSize.FIT_SCREEN);
//		this.addContentView(adView, layoutParams);
		
//		adView.setAdListener(new AdViewListener() {
//		    @Override
//		    public void onSwitchedAd(AdView adView) {
//		    }
//
//		    @Override
//		    public void onReceivedAd(AdView adView) {
//		    }
//
//		    @Override
//		    public void onFailedToReceivedAd(AdView adView) {
//		    }
//		});
	}
	
	@Override
    protected void onDestroy() {
            SpotManager.getInstance(this).unregisterSceenReceiver();
            super.onDestroy();
    }

    static {
    	System.loadLibrary("game");
    }
    

    
    public static void showSpotAd(){
    	//if(SpotManager.getInstance(sInstance).checkLoadComplete()){
//    		Log.d("Youmi", "checkLoadComplete, show ads!");
//
//    		//context.addContentView(view, params)
//    		context.runOnUiThread(new Runnable() {
//    	            @Override
//    	            public void run() {
//    	            	SpotManager.getInstance(context).showSpotAds(context, new SpotDialogListener() {
//    	        		    @Override
//    	        		    public void onShowSuccess() {
//    	        		        Log.i("Youmi", "onShowSuccess");
//    	        		    }
//
//    	        		    @Override
//    	        		    public void onShowFailed() {
//    	        		        Log.i("Youmi", "onShowFailed");
//    	        		    }
//    	        		});
//    	            }
//    	        });
    	//}
    	//else{
    		//Log.d("Youmi", "checkLoadComplete failed, not show ads!");
    	//}
    	
    }
    
//    static public void onScreenADClick(){
//    	MyMediaManager.setListner(new MyMDListner() {
//			@Override
//			public void onMDShow() {
//			}
//			@Override
//			public void onMDClose() {
//				System.out.println("���ر�");
//			}
//			@Override
//			public void onInstanll(int id) {
//				System.out.println("��氲װid��"+id);
//			}
//			@Override
//			public void onMDLoadSuccess() {

//				MyMediaManager.show(Run.getInstance(),MyMediaManager.LEFT_TOP);
//			}
//			@Override
//			public void onMDExitInFinish() {
//			}
//			@Override
//			public void onMDExitOutFinish() {
//			}
//		});
//		
//		MyMediaManager.load(Run.getInstance(), "5b42cc6caef743e28eaf09c294e5d395", "m-appchina");
//    }
}
