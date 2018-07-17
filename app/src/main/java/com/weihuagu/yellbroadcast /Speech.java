package com.weihuagu.yellbroadcast;
import android.util.Log;
import android.speech.tts.TextToSpeech;
import java.util.Locale;
import android.content.Context;

public class Speech{

private TextToSpeech textToSpeech;

Speech(Context context){

textToSpeech = new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == textToSpeech.SUCCESS) {
                    int result = textToSpeech.setLanguage(Locale.CHINA);
                    if (result != TextToSpeech.LANG_COUNTRY_AVAILABLE
                            && result != TextToSpeech.LANG_AVAILABLE){
                        Log.i("yellbroadcast", "TTS暂时不支持这种语音的朗读！");
                    }
                }
            }
        });

}

public void speak(String speak){
textToSpeech.speak(speak,TextToSpeech.QUEUE_ADD, null);
}


} 
