package classdesign

class Progress {
    fun showProgress() {
    }

    fun hideProgress() {
    }
}

class ProfileLoader {
    val progress = Progress()

    fun load() {
        progress.showProgress()

        // load to profile

        progress.hideProgress()
    }
}

class ImageLoader {
    val progress = Progress()

    fun load() {
        progress.showProgress()

        // load to imagefile

        progress.hideProgress()
    }
}