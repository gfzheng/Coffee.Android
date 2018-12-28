package studio.xmatrix.coffee

import android.app.Application
import io.objectbox.BoxStore
import io.objectbox.android.AndroidObjectBrowser
import studio.xmatrix.coffee.data.model.MyObjectBox
import studio.xmatrix.coffee.inject.AppInjector
import timber.log.Timber

class App : Application() {

    lateinit var boxStore: BoxStore
        private set

    override fun onCreate() {
        super.onCreate()

        boxStore = MyObjectBox.builder().androidContext(this).build()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
            AndroidObjectBrowser(boxStore).start(this)
        }

        AppInjector.init(this)
    }
}
