package com.example.broadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangedReceiver:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneModeChanged= intent?.getBooleanExtra("state",false)?:return
        if(isAirplaneModeChanged){
            Toast.makeText(context,"Airplane mode is enabled!",Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context,"Airplane mode is disabled!",Toast.LENGTH_LONG).show()
        }
    }
}