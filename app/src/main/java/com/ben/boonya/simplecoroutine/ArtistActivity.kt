package com.ben.boonya.simplecoroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.getKoin
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class ArtistActivity : AppCompatActivity() {

    private val viewModel: ArtistViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.getArtist()
        attachObserver()
        recyclerView.adapter = ArtistAdapter()
    }

    private fun attachObserver() {
        viewModel.artistsLiveData.observe(this, Observer {
            it?.let {
                (recyclerView.adapter as ArtistAdapter).values = it
            }
        })
    }
}
