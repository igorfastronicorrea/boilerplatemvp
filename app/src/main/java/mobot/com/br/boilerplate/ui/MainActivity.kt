package mobot.com.br.boilerplate.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import mobot.com.br.boilerplate.R
import mobot.com.br.boilerplate.models.HeroesResponse

class MainActivity : AppCompatActivity(), HeroesListContract.View{

    var presenter: HeroesListContract.Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = HeroesListPresenter(this)

        btnTest.setOnClickListener {  presenter?.requestDataFromServer() }
    }


    override fun setDataToRecyclerView(dataHeroes: List<HeroesResponse>?) {
        if (dataHeroes != null) {

            rvHeroes.adapter = HeroesListAdapter(dataHeroes, this)
            val layoutManager = LinearLayoutManager(this)
            rvHeroes.layoutManager = layoutManager

        }
    }

}
