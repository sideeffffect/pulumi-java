// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The result of an analysis.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1AnalysisResultResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1AnalysisResultResponse Empty = new GoogleCloudContactcenterinsightsV1AnalysisResultResponse();

    /**
     * Call-specific metadata created by the analysis.
     * 
     */
    @Import(name="callAnalysisMetadata", required=true)
      private final GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse callAnalysisMetadata;

    public GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse callAnalysisMetadata() {
        return this.callAnalysisMetadata;
    }

    /**
     * The time at which the analysis ended.
     * 
     */
    @Import(name="endTime", required=true)
      private final String endTime;

    public String endTime() {
        return this.endTime;
    }

    public GoogleCloudContactcenterinsightsV1AnalysisResultResponse(
        GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse callAnalysisMetadata,
        String endTime) {
        this.callAnalysisMetadata = Objects.requireNonNull(callAnalysisMetadata, "expected parameter 'callAnalysisMetadata' to be non-null");
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1AnalysisResultResponse() {
        this.callAnalysisMetadata = null;
        this.endTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1AnalysisResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse callAnalysisMetadata;
        private String endTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1AnalysisResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callAnalysisMetadata = defaults.callAnalysisMetadata;
    	      this.endTime = defaults.endTime;
        }

        public Builder callAnalysisMetadata(GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse callAnalysisMetadata) {
            this.callAnalysisMetadata = Objects.requireNonNull(callAnalysisMetadata);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }        public GoogleCloudContactcenterinsightsV1AnalysisResultResponse build() {
            return new GoogleCloudContactcenterinsightsV1AnalysisResultResponse(callAnalysisMetadata, endTime);
        }
    }
}
