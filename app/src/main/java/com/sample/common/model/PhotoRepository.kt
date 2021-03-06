package com.sample.common.model

import io.reactivex.Observable

open class PhotoRepository {

    private val photoService = PhotoService.create()

    fun loadPhotos(query: String, page: Int): Observable<PhotoResponse> {
        return photoService.getPhotos(query, page)
    }

}