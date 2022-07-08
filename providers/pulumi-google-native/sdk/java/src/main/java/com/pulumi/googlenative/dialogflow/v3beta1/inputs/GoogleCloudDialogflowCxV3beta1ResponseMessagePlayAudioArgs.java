// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies an audio clip to be played by the client as part of the response.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs Empty = new GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs();

    /**
     * URI of the audio clip. Dialogflow does not impose any validation on this value. It is specific to the client that reads it.
     * 
     */
    @Import(name="audioUri", required=true)
    private Output<String> audioUri;

    /**
     * @return URI of the audio clip. Dialogflow does not impose any validation on this value. It is specific to the client that reads it.
     * 
     */
    public Output<String> audioUri() {
        return this.audioUri;
    }

    private GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs() {}

    private GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs(GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs $) {
        this.audioUri = $.audioUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audioUri URI of the audio clip. Dialogflow does not impose any validation on this value. It is specific to the client that reads it.
         * 
         * @return builder
         * 
         */
        public Builder audioUri(Output<String> audioUri) {
            $.audioUri = audioUri;
            return this;
        }

        /**
         * @param audioUri URI of the audio clip. Dialogflow does not impose any validation on this value. It is specific to the client that reads it.
         * 
         * @return builder
         * 
         */
        public Builder audioUri(String audioUri) {
            return audioUri(Output.of(audioUri));
        }

        public GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs build() {
            $.audioUri = Objects.requireNonNull($.audioUri, "expected parameter 'audioUri' to be non-null");
            return $;
        }
    }

}
