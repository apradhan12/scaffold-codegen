package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.NoteList;
import org.openapitools.vertxweb.server.model.NoteListResponse;
import org.openapitools.vertxweb.server.model.NoteResponse;
import org.openapitools.vertxweb.server.model.NoteWrapper;

import org.openapitools.vertxweb.server.ParameterCast;
import org.openapitools.vertxweb.server.ApiException;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.Json;
import io.vertx.core.Handler;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.RoutingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.reactivex.Single;

import java.util.List;
import java.util.Map;

public class NoteApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(NoteApiHandler.class);
    private NoteApi apiImpl = new NoteApiImpl();

    public NoteApiHandler(Map<String, Handler<RoutingContext>> operationHandlers) {
        operationHandlers.put("createNote", this::createNote);
        operationHandlers.put("deleteNote", this::deleteNote);
        operationHandlers.put("getNote", this::getNote);
        operationHandlers.put("updateNote", this::updateNote);
    }

    private void createNote(RoutingContext routingContext) {
        logger.info("createNote()");
        HttpServerResponse response = routingContext.response();

        Single.defer( () -> {

            String jsonString = routingContext.getBodyAsString();
            NoteList noteList = jsonString == null ? null : Json.decodeValue(jsonString, new TypeReference<NoteList>(){});
            logger.info("Parameter noteList is {}", noteList);
            return apiImpl.createNote(noteList);
        })
        .subscribe(
            apiResponse -> {
                response.setStatusCode(apiResponse.getStatusCode())
                        .end(Json.encodePrettily(apiResponse.getData()));
            }, error -> {
                if (error instanceof ApiException) {
                    ApiException apiException = (ApiException) error;
                    response.setStatusCode(apiException.getStatusCode()).end(apiException.getMessage());
                } else {
                    response.setStatusCode(500).end(error.getMessage());
                }
            }).dispose();
    }


    private void deleteNote(RoutingContext routingContext) {
        logger.info("deleteNote()");
        HttpServerResponse response = routingContext.response();

        Single.defer( () -> {
            String noteId = ParameterCast.toString(routingContext.pathParams().get("note_id"));

            logger.info("Parameter noteId is {}", noteId);
            return apiImpl.deleteNote(noteId);
        })
        .subscribe(
            apiResponse -> {
                response.setStatusCode(apiResponse.getStatusCode())
                        .end(Json.encodePrettily(apiResponse.getData()));
            }, error -> {
                if (error instanceof ApiException) {
                    ApiException apiException = (ApiException) error;
                    response.setStatusCode(apiException.getStatusCode()).end(apiException.getMessage());
                } else {
                    response.setStatusCode(500).end(error.getMessage());
                }
            }).dispose();
    }


    private void getNote(RoutingContext routingContext) {
        logger.info("getNote()");
        HttpServerResponse response = routingContext.response();

        Single.defer( () -> {
            String noteId = ParameterCast.toString(routingContext.queryParams().get("note_id"));

            logger.info("Parameter noteId is {}", noteId);
            return apiImpl.getNote(noteId);
        })
        .subscribe(
            apiResponse -> {
                response.setStatusCode(apiResponse.getStatusCode())
                        .end(Json.encodePrettily(apiResponse.getData()));
            }, error -> {
                if (error instanceof ApiException) {
                    ApiException apiException = (ApiException) error;
                    response.setStatusCode(apiException.getStatusCode()).end(apiException.getMessage());
                } else {
                    response.setStatusCode(500).end(error.getMessage());
                }
            }).dispose();
    }


    private void updateNote(RoutingContext routingContext) {
        logger.info("updateNote()");
        HttpServerResponse response = routingContext.response();

        Single.defer( () -> {
            String noteId = ParameterCast.toString(routingContext.pathParams().get("note_id"));

            String jsonString = routingContext.getBodyAsString();
            NoteWrapper noteWrapper = jsonString == null ? null : Json.decodeValue(jsonString, new TypeReference<NoteWrapper>(){});
            logger.info("Parameter noteId is {}", noteId);
            logger.info("Parameter noteWrapper is {}", noteWrapper);
            return apiImpl.updateNote(noteId, noteWrapper);
        })
        .subscribe(
            apiResponse -> {
                response.setStatusCode(apiResponse.getStatusCode())
                        .end(Json.encodePrettily(apiResponse.getData()));
            }, error -> {
                if (error instanceof ApiException) {
                    ApiException apiException = (ApiException) error;
                    response.setStatusCode(apiException.getStatusCode()).end(apiException.getMessage());
                } else {
                    response.setStatusCode(500).end(error.getMessage());
                }
            }).dispose();
    }

}
