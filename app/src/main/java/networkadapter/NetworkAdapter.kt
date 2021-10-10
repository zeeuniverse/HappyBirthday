package networkadapter

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


object NetworkAdapter {
    val retrofit: Retrofit = Retrofit
        .Builder()
        .baseUrl("fake URL")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
}