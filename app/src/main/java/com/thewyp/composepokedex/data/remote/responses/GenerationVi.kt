package com.thewyp.composepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName
import com.thewyp.composepokedex.data.remote.responses.XY

data class GenerationVi(
    @SerializedName("omegaruby-alphasapphire")
    val omegarubyAlphasapphire: OmegarubyAlphasapphire,
    @SerializedName("x-y")
    val xY: XY
)