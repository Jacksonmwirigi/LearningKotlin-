package com.techweezy.firstkotlinapp.providers

import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.github.kittinunf.fuel.gson.GsonDeserializer
import com.techweezy.firstkotlinapp.models.WikiResults
import java.io.Reader
import com.google.gson.Gson

class ArticleDataProvider {
    class WikiDataDeserializer: ResponseDeserializable<WikiResults>{
        override fun deserialize(reader: Reader)= Gson().fromJson(reader,WikiResults::class.java)
        }
    }
}