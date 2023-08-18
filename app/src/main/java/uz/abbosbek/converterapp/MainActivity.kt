package uz.abbosbek.converterapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.forEach
import kotlinx.coroutines.launch
import uz.abbosbek.converterapp.data.remote.models.ValyutaResponse
import uz.abbosbek.converterapp.domain.MyViewModel
import uz.abbosbek.converterapp.presentation.MainScreen
import kotlin.coroutines.CoroutineContext
import kotlin.math.log

@AndroidEntryPoint
class MainActivity : ComponentActivity(), CoroutineScope {
    private val viewModel: MyViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
//            MainScreen()
        }
    }

    override val coroutineContext: CoroutineContext
        get() = Job()
}
