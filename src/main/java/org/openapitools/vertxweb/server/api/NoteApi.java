package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.NoteList;
import org.openapitools.vertxweb.server.model.NoteListResponse;
import org.openapitools.vertxweb.server.model.NoteResponse;
import org.openapitools.vertxweb.server.model.NoteWrapper;

import org.openapitools.vertxweb.server.ApiResponse;

import io.reactivex.Single;

import java.util.List;
import java.util.Map;

public interface NoteApi  {
    Single<ApiResponse<NoteListResponse>> createNote(NoteList noteList);
    Single<ApiResponse<Void>> deleteNote(String noteId);
    Single<ApiResponse<NoteListResponse>> getNote(String noteId);
    Single<ApiResponse<NoteResponse>> updateNote(String noteId,NoteWrapper noteWrapper);
}
