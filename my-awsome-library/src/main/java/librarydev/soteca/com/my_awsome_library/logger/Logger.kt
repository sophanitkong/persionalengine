package librarydev.soteca.com.my_awsome_library.logger

import android.util.Log

class Logger {
    companion object {
        val TAG = "Logger"
        fun logger(message: String) {
            Log.d(TAG, message)
        }
    }
}