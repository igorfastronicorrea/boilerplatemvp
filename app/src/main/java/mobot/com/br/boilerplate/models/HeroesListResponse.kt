package mobot.com.br.boilerplate.models

import java.io.Serializable

data class HeroesListResponse(
    val heroes : List<HeroesResponse>
) : Serializable