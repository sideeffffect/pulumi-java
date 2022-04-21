// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Represents one segment of audio.
 * 
 */
public final class GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse Empty = new GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse();

    /**
     * Whether the playback of this segment can be interrupted by the end user&#39;s speech and the client should then start the next Dialogflow request.
     * 
     */
    @Import(name="allowPlaybackInterruption", required=true)
    private Boolean allowPlaybackInterruption;

    public Boolean allowPlaybackInterruption() {
        return this.allowPlaybackInterruption;
    }

    /**
     * Raw audio synthesized from the Dialogflow agent&#39;s response using the output config specified in the request.
     * 
     */
    @Import(name="audio", required=true)
    private String audio;

    public String audio() {
        return this.audio;
    }

    /**
     * Client-specific URI that points to an audio clip accessible to the client. Dialogflow does not impose any validation on it.
     * 
     */
    @Import(name="uri", required=true)
    private String uri;

    public String uri() {
        return this.uri;
    }

    private GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse() {}

    private GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse(GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse $) {
        this.allowPlaybackInterruption = $.allowPlaybackInterruption;
        this.audio = $.audio;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse();
        }

        public Builder(GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse defaults) {
            $ = new GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse(Objects.requireNonNull(defaults));
        }

        public Builder allowPlaybackInterruption(Boolean allowPlaybackInterruption) {
            $.allowPlaybackInterruption = allowPlaybackInterruption;
            return this;
        }

        public Builder audio(String audio) {
            $.audio = audio;
            return this;
        }

        public Builder uri(String uri) {
            $.uri = uri;
            return this;
        }

        public GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse build() {
            $.allowPlaybackInterruption = Objects.requireNonNull($.allowPlaybackInterruption, "expected parameter 'allowPlaybackInterruption' to be non-null");
            $.audio = Objects.requireNonNull($.audio, "expected parameter 'audio' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
