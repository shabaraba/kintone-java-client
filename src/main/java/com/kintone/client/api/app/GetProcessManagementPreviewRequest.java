package com.kintone.client.api.app;

import com.kintone.client.api.KintoneRequest;
import lombok.Data;

/** A request object for Get Process Management Preview API. */
@Data
public class GetProcessManagementPreviewRequest implements KintoneRequest {

    /** The App ID (required). */
    private Long app;

    /**
     * The localization language setting (optional). If set to null, the default names will be
     * retrieved.
     */
    private String lang;
}
