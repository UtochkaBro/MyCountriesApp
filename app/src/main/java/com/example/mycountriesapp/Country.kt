package com.example.mycountriesapp

data class Country (
    val name: List<CountryName>,
    val capital: List<Capital>,
    val population: Long,
    val area: Long,
    val languages: List<Language>
        )

data class Language(
    val name: String
)

data class CountryName(
    val official: String
)

data class Capital(
    val name: String
)



