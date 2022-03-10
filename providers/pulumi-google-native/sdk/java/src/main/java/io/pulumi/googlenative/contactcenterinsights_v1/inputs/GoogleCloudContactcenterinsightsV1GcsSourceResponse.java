// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A Cloud Storage source of conversation data.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1GcsSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1GcsSourceResponse Empty = new GoogleCloudContactcenterinsightsV1GcsSourceResponse();

    /**
     * Cloud Storage URI that points to a file that contains the conversation audio.
     * 
     */
    @InputImport(name="audioUri", required=true)
      private final String audioUri;

    public String getAudioUri() {
        return this.audioUri;
    }

    /**
     * Immutable. Cloud Storage URI that points to a file that contains the conversation transcript.
     * 
     */
    @InputImport(name="transcriptUri", required=true)
      private final String transcriptUri;

    public String getTranscriptUri() {
        return this.transcriptUri;
    }

    public GoogleCloudContactcenterinsightsV1GcsSourceResponse(
        String audioUri,
        String transcriptUri) {
        this.audioUri = Objects.requireNonNull(audioUri, "expected parameter 'audioUri' to be non-null");
        this.transcriptUri = Objects.requireNonNull(transcriptUri, "expected parameter 'transcriptUri' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1GcsSourceResponse() {
        this.audioUri = null;
        this.transcriptUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1GcsSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String audioUri;
        private String transcriptUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1GcsSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioUri = defaults.audioUri;
    	      this.transcriptUri = defaults.transcriptUri;
        }

        public Builder audioUri(String audioUri) {
            this.audioUri = Objects.requireNonNull(audioUri);
            return this;
        }

        public Builder transcriptUri(String transcriptUri) {
            this.transcriptUri = Objects.requireNonNull(transcriptUri);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1GcsSourceResponse build() {
            return new GoogleCloudContactcenterinsightsV1GcsSourceResponse(audioUri, transcriptUri);
        }
    }
}
