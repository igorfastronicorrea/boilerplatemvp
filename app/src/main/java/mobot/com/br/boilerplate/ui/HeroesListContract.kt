package mobot.com.br.boilerplate.ui

import mobot.com.br.boilerplate.models.HeroesResponse

interface HeroesListContract{

    interface Model{
        interface OnFinishedListener{
            fun onFinished(datHeroes : List<HeroesResponse>?)

            fun onFailure(t: Throwable)
        }

        fun getHeroesList(onFinishedListener: OnFinishedListener)
    }

    interface View{
        fun setDataToRecyclerView(dataHeroes: List<HeroesResponse>?)
    }

    interface Presenter{

        fun requestDataFromServer()
    }
}