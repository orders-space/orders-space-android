package com.ordersspace.android.model

import kotlinx.serialization.Serializable

@Serializable
data class MenuItem(
    val id: ULong,
    val name: String,
    val type: ItemType,
    val cost: Double,
    val weight: Double,
    val volume: Double,
    val description: String?,
    val isAgeRestricted: Boolean,
    val imageUrl: String?,
    val networkId: ULong,
) {

    enum class ItemType(val displayName: String) {
        GOODS("Товар"),
        DISH("Блюдо"),
        PREPARED("Заготовка"),
        SERVICE("Услуга"),
        RATE("Оценка (?)");

        companion object {

            fun String.toItemType(): ItemType? = values().find { it.name.equals(this, true) }
        }
    }
}
