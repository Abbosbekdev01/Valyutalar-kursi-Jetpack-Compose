package uz.abbosbek.converterapp.domain.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flow
import uz.abbosbek.converterapp.data.remote.ApiService
import uz.abbosbek.converterapp.data.remote.models.ValyutaResponse
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ValyutaRepository @Inject constructor(val apiService: ApiService) {
    suspend fun getAllData(): MutableStateFlow<List<ValyutaResponse>> = MutableStateFlow(apiService.getAllData())
}