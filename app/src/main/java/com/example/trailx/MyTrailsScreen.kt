package com.example.trailx

//Necessary imports
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MyTrailsScreen : AppCompatActivity() {
    //Variables necessary to display the saved trails
    private lateinit var route01:ImageView
    private lateinit var route02:ImageView
    private lateinit var route03:ImageView
    private lateinit var route01_tv:TextView
    private lateinit var route02_tv:TextView
    private lateinit var route03_tv:TextView

    //Function that is called on the Activity creation
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_trails_screen)
        supportActionBar?.hide()

        //Accessing the XML tags
        route01 = findViewById<ImageView>(R.id.route01)
        route02 = findViewById<ImageView>(R.id.route02)
        route03 = findViewById<ImageView>(R.id.route03)
        route01_tv = findViewById<TextView>(R.id.telok)
        route02_tv = findViewById<TextView>(R.id.bukit)
        route03_tv = findViewById<TextView>(R.id.bedok)

        if(global.choice != 0){
            if(global.telok){
                route01.setImageResource(R.drawable.telok)
                route01_tv.text = "Telok Ayer Trail"
                route02.setImageResource(R.drawable.no_route_blank)
                route02_tv.text = ""
            }
            if(global.bukit){
                route02.setImageResource(R.drawable.no_route_blank)
                route02.setImageResource(R.drawable.bukit)
                route02_tv.text = "Bukit Batok Trail"
            }
            if(global.bedok){
                route02.setImageResource(R.drawable.no_route_blank)
                route02_tv.text = ""
                route03.setImageResource(R.drawable.telok)
                route03_tv.text = "Bedok Loop Trail"
            }
        }

        //Home button
        val back_to_home_bt_bar = findViewById<Button>(R.id.back_to_home_bt_my_trails)
        back_to_home_bt_bar.setOnClickListener{
            val intent_back_to_home_bt_bar = Intent(this, HomeScreen::class.java)
            startActivity(intent_back_to_home_bt_bar)
        }

        //Settings button
        val settings_bt_bar = findViewById<Button>(R.id.settings_bt_my_trails)
        settings_bt_bar.setOnClickListener{
            val intent_settings_bt_bar = Intent(this, SettingsScreen::class.java)
            startActivity(intent_settings_bt_bar)
        }

        //Discover New Trails button
        val discover_new_trails_bt_bar = findViewById<Button>(R.id.discover_new_trails_bt_my_trails)
        discover_new_trails_bt_bar.setOnClickListener{
            val intent_discover_new_trails_bt_bar = Intent(this, DiscoverNewTrailsScreen::class.java)
            startActivity(intent_discover_new_trails_bt_bar)
        }

        //Active trails Button
        val active_trail_bt_bar = findViewById<Button>(R.id.active_trail_bt_my_trails)
        active_trail_bt_bar.setOnClickListener{
            val intent_active_trail_bt_bar = Intent(this, ActiveTrailScreen::class.java)
            startActivity(intent_active_trail_bt_bar)
        }

        //My Trails button
        val my_trails_bt_bar = findViewById<Button>(R.id.my_trails_bt_my_trails)
        my_trails_bt_bar.setOnClickListener{
            val intent_my_trails_bt_bar = Intent(this, MyTrailsScreen::class.java)
            startActivity(intent_my_trails_bt_bar)
        }

        //Music Button
        val music_bt_bar = findViewById<Button>(R.id.music_bt_my_trails)
        music_bt_bar.setOnClickListener {
            val intent_music_bt_bar = Intent(this, MusicScreen::class.java)
            startActivity(intent_music_bt_bar)
        }
    }
}