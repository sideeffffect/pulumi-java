// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatalabelingV1beta1GcsSourceResponse {
    /**
     * The input URI of source file. This must be a Cloud Storage path (`gs://...`).
     * 
     */
    private final String inputUri;
    /**
     * The format of the source file. Only "text/csv" is supported.
     * 
     */
    private final String mimeType;

    @OutputCustomType.Constructor
    private GoogleCloudDatalabelingV1beta1GcsSourceResponse(
        @OutputCustomType.Parameter("inputUri") String inputUri,
        @OutputCustomType.Parameter("mimeType") String mimeType) {
        this.inputUri = inputUri;
        this.mimeType = mimeType;
    }

    /**
     * The input URI of source file. This must be a Cloud Storage path (`gs://...`).
     * 
    */
    public String getInputUri() {
        return this.inputUri;
    }
    /**
     * The format of the source file. Only "text/csv" is supported.
     * 
    */
    public String getMimeType() {
        return this.mimeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1GcsSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String inputUri;
        private String mimeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1GcsSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputUri = defaults.inputUri;
    	      this.mimeType = defaults.mimeType;
        }

        public Builder inputUri(String inputUri) {
            this.inputUri = Objects.requireNonNull(inputUri);
            return this;
        }

        public Builder mimeType(String mimeType) {
            this.mimeType = Objects.requireNonNull(mimeType);
            return this;
        }
        public GoogleCloudDatalabelingV1beta1GcsSourceResponse build() {
            return new GoogleCloudDatalabelingV1beta1GcsSourceResponse(inputUri, mimeType);
        }
    }
}
