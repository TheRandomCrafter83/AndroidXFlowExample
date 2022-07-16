package com.coderz.f1.gridviewexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.coderz.f1.gridviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val entries: ArrayList<GridViewEntry> = arrayListOf(
            GridViewEntry(R.drawable.circulatory_system,"Circulatory"),
            GridViewEntry(R.drawable.circulatory_system,"Circulatory"),
            GridViewEntry(R.drawable.circulatory_system,"Circulatory"),
            GridViewEntry(R.drawable.circulatory_system,"Circulatory"),
            GridViewEntry(R.drawable.circulatory_system,"Circulatory"),
            GridViewEntry(R.drawable.circulatory_system,"Circulatory"),
            GridViewEntry(R.drawable.circulatory_system,"Circulatory"),
            GridViewEntry(R.drawable.circulatory_system,"Circulatory"),
            GridViewEntry(R.drawable.circulatory_system,"Circulatory"),
            GridViewEntry(R.drawable.circulatory_system,"Circulatory"),
            GridViewEntry(R.drawable.circulatory_system,"Circulatory"),
        )
        val adapter = BodySystemAdapter(this,entries)
        binding.gridView.adapter = adapter
    }
}