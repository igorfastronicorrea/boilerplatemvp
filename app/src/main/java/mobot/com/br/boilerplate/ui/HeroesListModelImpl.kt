package mobot.com.br.boilerplate.ui

import mobot.com.br.boilerplate.models.HeroesListResponse
import mobot.com.br.boilerplate.network.APIClient
import mobot.com.br.boilerplate.network.APIInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HeroesListModelImpl: HeroesListContract.Model {

    override fun getHeroesList(onFinishedListener: HeroesListContract.Model.OnFinishedListener) {
        val retrofit = APIClient.getDataApi()
        val endpoint = retrofit.create(APIInterface::class.java)
        val call = endpoint.getList()

        call.enqueue(object : Callback<HeroesListResponse>{
            override fun onFailure(call: Call<HeroesListResponse>?, t: Throwable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<HeroesListResponse>?, response: Response<HeroesListResponse>?) {
                onFinishedListener.onFinished(response?.body()?.heroes)
            }

        })
    }


}