package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.NoteList;
import org.openapitools.vertxweb.server.model.NoteListResponse;
import org.openapitools.vertxweb.server.model.NoteResponse;
import org.openapitools.vertxweb.server.model.NoteWrapper;

import org.openapitools.vertxweb.server.ApiResponse;
import org.openapitools.vertxweb.server.ApiException;

import io.reactivex.Single;

import java.util.List;
import java.util.Map;

// Implement this class

public class NoteApiImpl implements NoteApi {
    public Single<ApiResponse<NoteListResponse>> createNote(NoteList noteList) {
        return Single.error(new ApiException("Not Implemented").setStatusCode(501));
    }

    public Single<ApiResponse<Void>> deleteNote(String noteId) {
        return Single.error(new ApiException("Not Implemented").setStatusCode(501));
    }

    public Single<ApiResponse<NoteListResponse>> getNote(String noteId) {
        return Single.error(new ApiException("Not Implemented").setStatusCode(501));
    }

    public Single<ApiResponse<NoteResponse>> updateNote(String noteId,NoteWrapper noteWrapper) {
        return Single.error(new ApiException("Not Implemented").setStatusCode(501));
    }

}
