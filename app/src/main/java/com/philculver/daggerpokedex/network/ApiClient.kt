package com.philculver.daggerpokedex.network
import com.google.gson.annotations.SerializedName


import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
interface ApiClient {

    companion object {
        const val ENDPOINT =  "https://pokeapi.co/api/v2/"
    }

    @GET("pokemon/{name}")
    suspend fun getPokemon(@Path("name") name: String): Response<PokemonResponse>

}

data class PokemonResponse(
    @SerializedName("abilities")
    val abilities: List<Ability?>?,
    @SerializedName("base_experience")
    val baseExperience: Int?,
    @SerializedName("forms")
    val forms: List<Form?>?,
    @SerializedName("game_indices")
    val gameIndices: List<GameIndice?>?,
    @SerializedName("height")
    val height: Int?,
    @SerializedName("held_items")
    val heldItems: List<HeldItem?>?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("is_default")
    val isDefault: Boolean?,
    @SerializedName("location_area_encounters")
    val locationAreaEncounters: String?,
    @SerializedName("moves")
    val moves: List<Move?>?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("order")
    val order: Int?,
    @SerializedName("species")
    val species: Species?,
    @SerializedName("sprites")
    val sprites: Sprites?,
    @SerializedName("stats")
    val stats: List<Stat?>?,
    @SerializedName("types")
    val types: List<Type?>?,
    @SerializedName("weight")
    val weight: Int?
)

data class Ability(
    @SerializedName("ability")
    val ability: AbilityX?,
    @SerializedName("is_hidden")
    val isHidden: Boolean?,
    @SerializedName("slot")
    val slot: Int?
)

data class AbilityX(
    @SerializedName("name")
    val name: String?,
    @SerializedName("url")
    val url: String?
)

data class Form(
    @SerializedName("name")
    val name: String?,
    @SerializedName("url")
    val url: String?
)

data class GameIndice(
    @SerializedName("game_index")
    val gameIndex: Int?,
    @SerializedName("version")
    val version: Version?
)

data class Version(
    @SerializedName("name")
    val name: String?,
    @SerializedName("url")
    val url: String?
)

data class HeldItem(
    @SerializedName("item")
    val item: Item?,
    @SerializedName("version_details")
    val versionDetails: List<VersionDetail?>?
)

data class Item(
    @SerializedName("name")
    val name: String?,
    @SerializedName("url")
    val url: String?
)

data class VersionDetail(
    @SerializedName("rarity")
    val rarity: Int?,
    @SerializedName("version")
    val version: VersionX?
)

data class VersionX(
    @SerializedName("name")
    val name: String?,
    @SerializedName("url")
    val url: String?
)

data class Move(
    @SerializedName("move")
    val move: MoveX?,
    @SerializedName("version_group_details")
    val versionGroupDetails: List<VersionGroupDetail?>?
)

data class MoveX(
    @SerializedName("name")
    val name: String?,
    @SerializedName("url")
    val url: String?
)

data class VersionGroupDetail(
    @SerializedName("level_learned_at")
    val levelLearnedAt: Int?,
    @SerializedName("move_learn_method")
    val moveLearnMethod: MoveLearnMethod?,
    @SerializedName("version_group")
    val versionGroup: VersionGroup?
)

data class MoveLearnMethod(
    @SerializedName("name")
    val name: String?,
    @SerializedName("url")
    val url: String?
)

data class VersionGroup(
    @SerializedName("name")
    val name: String?,
    @SerializedName("url")
    val url: String?
)

data class Species(
    @SerializedName("name")
    val name: String?,
    @SerializedName("url")
    val url: String?
)

data class Sprites(
    @SerializedName("back_default")
    val backDefault: String?,
    @SerializedName("back_female")
    val backFemale: Any?,
    @SerializedName("back_shiny")
    val backShiny: String?,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any?,
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_female")
    val frontFemale: Any?,
    @SerializedName("front_shiny")
    val frontShiny: String?,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any?
)

data class Stat(
    @SerializedName("base_stat")
    val baseStat: Int?,
    @SerializedName("effort")
    val effort: Int?,
    @SerializedName("stat")
    val stat: StatX?
)

data class StatX(
    @SerializedName("name")
    val name: String?,
    @SerializedName("url")
    val url: String?
)

data class Type(
    @SerializedName("slot")
    val slot: Int?,
    @SerializedName("type")
    val type: TypeX?
)

data class TypeX(
    @SerializedName("name")
    val name: String?,
    @SerializedName("url")
    val url: String?
)