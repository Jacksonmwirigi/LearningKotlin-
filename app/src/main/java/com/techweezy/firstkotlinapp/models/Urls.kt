package com.techweezy.firstkotlinapp.models

object Urls {
    val BaseURL = "https://en.wikipedia.org/w/api.php"

    fun getSearchUrl (term:String, skip:Int, take:Int ) :String {

        return BaseURL + "?action=query" +
                "&formatversion=2"+
                "&generator=prefixsearch"+
                "&gpssearch=$term" +
                "&gpslimit=$take" +
                "&gpsoffset =$skip" +
                "&prop=pageimages|info" +
                "pipprop=thumbnail|url" +
                "&pithumbsize=200" +
                "&pilimit=$take" +
                "&wbpterms=description" +
                "&format=json" +
                "&inprop=url"

    }

    fun getRandomUrls(take:Int ):String{
        return BaseURL + "?action=query" +
                "&format=json" +
                "&formatversion=2"+
                "&generator=random"+
                "&grnnamespace=0" +
                "&prop=pageimages|info" +
                "&gnrlimit=$take" +
                "&inprop=url" +
                "&pithumbsize=200"
    }

}