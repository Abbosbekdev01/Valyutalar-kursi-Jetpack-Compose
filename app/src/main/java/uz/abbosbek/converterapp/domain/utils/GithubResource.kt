package uz.abbosbek.converterapp.domain.utils

import uz.abbosbek.converterapp.data.remote.models.ValyutaResponse

sealed class GithubResource {

    object Loading : GithubResource()
    data class Success(val list: List<ValyutaResponse>) : GithubResource()
    data class Error(val message: String) : GithubResource()
}