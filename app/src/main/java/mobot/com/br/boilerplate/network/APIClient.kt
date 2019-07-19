package mobot.com.br.boilerplate.network

import mobot.com.br.boilerplate.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class APIClient{

    companion object {

        fun getDataApi() : Retrofit{
           return Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

        }
    }

}