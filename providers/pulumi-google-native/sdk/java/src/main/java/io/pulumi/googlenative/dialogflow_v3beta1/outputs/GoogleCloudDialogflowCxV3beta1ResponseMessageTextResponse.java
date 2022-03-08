// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1ResponseMessageTextResponse {
    /**
     * Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request.
     * 
     */
    private final Boolean allowPlaybackInterruption;
    /**
     * A collection of text responses.
     * 
     */
    private final List<String> text;

    @OutputCustomType.Constructor({"allowPlaybackInterruption","text"})
    private GoogleCloudDialogflowCxV3beta1ResponseMessageTextResponse(
        Boolean allowPlaybackInterruption,
        List<String> text) {
        this.allowPlaybackInterruption = allowPlaybackInterruption;
        this.text = text;
    }

    /**
     * Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request.
     * 
    */
    public Boolean getAllowPlaybackInterruption() {
        return this.allowPlaybackInterruption;
    }
    /**
     * A collection of text responses.
     * 
    */
    public List<String> getText() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ResponseMessageTextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowPlaybackInterruption;
        private List<String> text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ResponseMessageTextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPlaybackInterruption = defaults.allowPlaybackInterruption;
    	      this.text = defaults.text;
        }

        public Builder setAllowPlaybackInterruption(Boolean allowPlaybackInterruption) {
            this.allowPlaybackInterruption = Objects.requireNonNull(allowPlaybackInterruption);
            return this;
        }

        public Builder setText(List<String> text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1ResponseMessageTextResponse build() {
            return new GoogleCloudDialogflowCxV3beta1ResponseMessageTextResponse(allowPlaybackInterruption, text);
        }
    }
}
