package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoddieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslops Graphic Beanie","Rs.100", "hat01"),
        Product("Devslops Hat Black","Rs.110", "hat02"),
        Product("Devslops Hat Blue","Rs.120", "hat03"),
        Product("Devslops Hat Smackback","Rs.130", "hat04")

    )

    val hoodies = listOf(
        Product("Devslops Hoodie Grey", "Rs.250", "hoodies01"),
        Product("Devslops Hoodie Red", "Rs.260", "hoodies02"),
        Product("Devslops Grey", "Rs.270", "hoodies03"),
        Product("Devslops Hoodie Black", "Rs.280", "hoodies04")

    )

    val shirts = listOf(
        Product("Devslops Shirt Black","350", "shirt01"),
        Product("Devslops Badge Light Grey","360", "shirt02"),
        Product("Devslops Logo Red","370", "shirt03"),
        Product("Devslops Hustle","380", "shirt04"),
        Product("KickFlip Studios","400", "shirt05")
    )

}