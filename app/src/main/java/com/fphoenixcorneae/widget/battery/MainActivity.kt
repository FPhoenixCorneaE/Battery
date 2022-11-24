package com.fphoenixcorneae.widget.battery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 电池头朝右
        findViewById<Battery>(R.id.batteryRight1).setLifecycleOwner(this)
        findViewById<Battery>(R.id.batteryRight2).setPower(0)
        findViewById<Battery>(R.id.batteryRight3).setPower(20)
        findViewById<Battery>(R.id.batteryRight4).setPower(40)
        findViewById<Battery>(R.id.batteryRight5).setPower(100)

        // 电池头朝左
        findViewById<Battery>(R.id.batteryLeft1).setLifecycleOwner(this)
        findViewById<Battery>(R.id.batteryLeft2).setPower(0)
        findViewById<Battery>(R.id.batteryLeft3).setPower(20)
        findViewById<Battery>(R.id.batteryLeft4).setPower(40)
        findViewById<Battery>(R.id.batteryLeft5).setPower(100)

        // 电池头朝上
        findViewById<Battery>(R.id.batteryTop1).setLifecycleOwner(this)

        // 电池头朝下
        findViewById<Battery>(R.id.batteryBottom1).setLifecycleOwner(this)
    }
}