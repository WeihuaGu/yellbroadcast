package com.weihuagu.yellbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import android.util.Log;
import android.os.Vibrator; 

/**
 * Created by weihuagu.
 */

public class MyBroadcastReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent){

	Log.i("yellbroadcast","received broadcast");
	//String yellcontent=intent.getStringExtra("yell");
        Toast.makeText ( context, "yellbroadcast received broadcast", Toast.LENGTH_LONG ).show ();

	
	//new Speech(context.getApplicationContext()).speak(yellcontent);
	Vibrator vibrator = (Vibrator)context.getApplicationContext().getSystemService(context.getApplicationContext().VIBRATOR_SERVICE);
    long[] patter = {1000, 1000, 2000, 50};
    vibrator.vibrate(patter, 15);
    abortBroadcast ();
    }
}
