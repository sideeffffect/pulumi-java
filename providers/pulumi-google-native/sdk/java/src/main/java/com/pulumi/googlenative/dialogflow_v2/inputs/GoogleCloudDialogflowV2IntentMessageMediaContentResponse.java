// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The media content card for Actions on Google.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageMediaContentResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2IntentMessageMediaContentResponse Empty = new GoogleCloudDialogflowV2IntentMessageMediaContentResponse();

    /**
     * List of media objects.
     * 
     */
    @Import(name="mediaObjects", required=true)
    private List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse> mediaObjects;

    public List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse> mediaObjects() {
        return this.mediaObjects;
    }

    /**
     * Optional. What type of media is the content (ie &#34;audio&#34;).
     * 
     */
    @Import(name="mediaType", required=true)
    private String mediaType;

    public String mediaType() {
        return this.mediaType;
    }

    private GoogleCloudDialogflowV2IntentMessageMediaContentResponse() {}

    private GoogleCloudDialogflowV2IntentMessageMediaContentResponse(GoogleCloudDialogflowV2IntentMessageMediaContentResponse $) {
        this.mediaObjects = $.mediaObjects;
        this.mediaType = $.mediaType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2IntentMessageMediaContentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageMediaContentResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2IntentMessageMediaContentResponse();
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageMediaContentResponse defaults) {
            $ = new GoogleCloudDialogflowV2IntentMessageMediaContentResponse(Objects.requireNonNull(defaults));
        }

        public Builder mediaObjects(List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse> mediaObjects) {
            $.mediaObjects = mediaObjects;
            return this;
        }

        public Builder mediaObjects(GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse... mediaObjects) {
            return mediaObjects(List.of(mediaObjects));
        }

        public Builder mediaType(String mediaType) {
            $.mediaType = mediaType;
            return this;
        }

        public GoogleCloudDialogflowV2IntentMessageMediaContentResponse build() {
            $.mediaObjects = Objects.requireNonNull($.mediaObjects, "expected parameter 'mediaObjects' to be non-null");
            $.mediaType = Objects.requireNonNull($.mediaType, "expected parameter 'mediaType' to be non-null");
            return $;
        }
    }

}
