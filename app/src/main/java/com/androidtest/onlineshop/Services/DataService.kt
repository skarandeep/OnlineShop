package com.androidtest.onlineshop.Services

import com.androidtest.onlineshop.Model.Category
import com.androidtest.onlineshop.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Graphic Beanie", "$18", "hat01"),
        Product("Hat Black", "$20", "hat02"),
        Product("Hat White", "$18", "hat03"),
        Product("Hat Snapback", "$20", "hat04")
    )

    val hoodies = listOf(
        Product("Hoodie Gray", "$28", "hoodie01"),
        Product("Hoodie Red", "$32", "hoodie02"),
        Product("Gray Hoodie", "$28", "hoodie03"),
        Product("Black Hoodie", "$32", "hoodie04")
    )
    val shirts = listOf(
        Product("Shirt Black", "$18", "shirt01"),
        Product("Badge Light Gray", "$20", "shirt02"),
        Product("Shirt Red", "$22", "shirt03"),
        Product("Hustle", "$22", "shirt04"),
        Product("Kickflip Studios", "$18", "shirt05")
    )

}