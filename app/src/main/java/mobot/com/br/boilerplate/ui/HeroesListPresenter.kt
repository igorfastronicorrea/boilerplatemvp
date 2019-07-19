package mobot.com.br.boilerplate.ui

import android.util.Log
import mobot.com.br.boilerplate.models.HeroesResponse

class HeroesListPresenter(view: HeroesListContract.View) : HeroesListContract.Presenter, HeroesListContract.Model.OnFinishedListener {

    val view : HeroesListContract.View = view
    val model : HeroesListContract.Model = HeroesListModelImpl()


    override fun onFinished(datHeroes: List<HeroesResponse>?) {
        view.setDataToRecyclerView(datHeroes)

    }

    override fun onFailure(t: Throwable) {
        Log.i("HEROESLIST", "Fail")
    }


    override fun requestDataFromServer() {
        model.getHeroesList(this)


    }

}