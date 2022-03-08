// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2RequestedOptionsResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ResultResponse;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2InspectDataSourceDetailsResponse {
    /**
     * The configuration used for this job.
     * 
     */
    private final GooglePrivacyDlpV2RequestedOptionsResponse requestedOptions;
    /**
     * A summary of the outcome of this inspection job.
     * 
     */
    private final GooglePrivacyDlpV2ResultResponse result;

    @OutputCustomType.Constructor({"requestedOptions","result"})
    private GooglePrivacyDlpV2InspectDataSourceDetailsResponse(
        GooglePrivacyDlpV2RequestedOptionsResponse requestedOptions,
        GooglePrivacyDlpV2ResultResponse result) {
        this.requestedOptions = requestedOptions;
        this.result = result;
    }

    /**
     * The configuration used for this job.
     * 
    */
    public GooglePrivacyDlpV2RequestedOptionsResponse getRequestedOptions() {
        return this.requestedOptions;
    }
    /**
     * A summary of the outcome of this inspection job.
     * 
    */
    public GooglePrivacyDlpV2ResultResponse getResult() {
        return this.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InspectDataSourceDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2RequestedOptionsResponse requestedOptions;
        private GooglePrivacyDlpV2ResultResponse result;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InspectDataSourceDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestedOptions = defaults.requestedOptions;
    	      this.result = defaults.result;
        }

        public Builder setRequestedOptions(GooglePrivacyDlpV2RequestedOptionsResponse requestedOptions) {
            this.requestedOptions = Objects.requireNonNull(requestedOptions);
            return this;
        }

        public Builder setResult(GooglePrivacyDlpV2ResultResponse result) {
            this.result = Objects.requireNonNull(result);
            return this;
        }
        public GooglePrivacyDlpV2InspectDataSourceDetailsResponse build() {
            return new GooglePrivacyDlpV2InspectDataSourceDetailsResponse(requestedOptions, result);
        }
    }
}
