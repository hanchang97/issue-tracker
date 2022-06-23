package com.team1.issuetracker.data.dto

import com.google.gson.annotations.SerializedName
import com.team1.issuetracker.data.model.Label

data class LabelDTO(
    @SerializedName("color")
    val color: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("label_id")
    val labelId: Int?,
    @SerializedName("name")
    val name: String?
)

fun LabelDTO.toLabels(): Label {
    val color = requireNotNull(this.color)
    val description = this.description ?: ""
    val id = requireNotNull(this.labelId)
    val title = requireNotNull(this.name)

    return Label(id, color, title, description)
}