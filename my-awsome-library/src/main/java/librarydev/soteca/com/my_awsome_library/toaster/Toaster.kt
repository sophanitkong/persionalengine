package librarydev.soteca.com.my_awsome_library.toaster

import android.content.Context
import android.widget.Toast

class Toaster {
    companion object {
        fun toaster(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}