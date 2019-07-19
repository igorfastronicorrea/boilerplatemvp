package mobot.com.br.boilerplate.network

import mobot.com.br.boilerplate.models.HeroesListResponse
import retrofit2.Call
import retrofit2.http.GET

interface APIInterface{

    @GET("5d2e08d42e00005900c582ba")
    fun getList() : Call<HeroesListResponse>
}