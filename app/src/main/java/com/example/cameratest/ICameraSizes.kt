package com.example.cameratest

import android.hardware.camera2.CameraCharacteristics
import android.util.Size
import android.view.Display

interface ICameraSizes {
    fun getDisplaySmartSize(display: Display): SmartSize
    fun <T>getPreviewOutputSize(
        display: Display,
        characteristics: CameraCharacteristics,
        targetClass: Class<T>,
        format: Int? = null
    ): Size

}