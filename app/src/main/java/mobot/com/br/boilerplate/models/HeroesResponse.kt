package mobot.com.br.boilerplate.models

import java.io.Serializable

data class HeroesResponse(
        val name: String,
        val image: String
) : Serializable