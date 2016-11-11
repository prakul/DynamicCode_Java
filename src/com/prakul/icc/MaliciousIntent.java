package com.prakul.icc;

import android.content.Context;
import android.content.Intent;

public class MaliciousIntent {
    public Intent getIntent(String componentType){
        Intent i = new Intent();
        i.setAction("net.everythingandroid.smspopup.SEND_SMS");
        i.putExtra("phNo", "9493829890");
        i.putExtra("txtMsg", "The user has started activity tracking");
    	return i;
    }
    public void startComponentExplicit(Context context, String componentType, Intent intent){
    	//you can use the Context to start a component with the given Intent 
    	
    }
    public void startComponentImplicit(Context context, String componentType, String action){
    	//you can use the Context to start a component with the given action
    	//make sure to create an Intent from that action
    	
    }

}
