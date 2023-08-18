package uz.abbosbek.converterapp.domain

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import uz.abbosbek.converterapp.data.remote.models.ValyutaResponse
import uz.abbosbek.converterapp.domain.repository.ValyutaRepository
import uz.abbosbek.converterapp.domain.utils.GithubResource
import java.util.concurrent.Flow
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(val valyutaRepository: ValyutaRepository) : ViewModel() {

    val stateFlow = MutableStateFlow<List<ValyutaResponse>>(emptyList())
    fun getAllData(): MutableStateFlow<List<ValyutaResponse>> {
        viewModelScope.launch {
            val list = ArrayList<ValyutaResponse>()
            valyutaRepository.getAllData().collectLatest {
                stateFlow.value=it
            }
        }
        return stateFlow
    }
}