package com.ulegalize.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * The type Object request.
 */
public class ObjectRequest implements Serializable {
    /**
     * The Obj.
     */
    @Getter
    @Setter
    String obj;
    /**
     * The Id.
     */
    @Getter
    @Setter
    String id;
    /**
     * The Shared with.
     */
    @Getter
    @Setter
    List<String> shared_with;
    /**
     * The Msg.
     */
    @Getter
    @Setter
    String msg;
    /**
     * The Right.
     */
    @Getter
    @Setter
    String right;
    /**
     * The Size.
     */
    @Getter
    @Setter
    Integer size;
    /**
     * The Deleted with.
     */
    @Getter
    @Setter
    String deleted_with;
    /**
     * The Permission id.
     */
    @Getter
    @Setter
    String permissionId;

    /**
     * Instantiates a new Object request.
     */
    public ObjectRequest() {
    }

}
