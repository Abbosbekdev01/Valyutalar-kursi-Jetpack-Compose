package uz.abbosbek.converterapp.data.remote

import retrofit2.http.GET
import uz.abbosbek.converterapp.data.remote.models.ValyutaResponse

interface ApiService {

    @GET("json/")
    suspend fun getAllData(): List<ValyutaResponse>


    companion object {
        val BASE_URL = "http://cbu.uz/uzc/arkhiv-kursov-valyut/"
    }
}