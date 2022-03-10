// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2RequestedOptionsResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ResultResponse;
import java.util.Objects;


/**
 * The results of an inspect DataSource job.
 * 
 */
public final class GooglePrivacyDlpV2InspectDataSourceDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2InspectDataSourceDetailsResponse Empty = new GooglePrivacyDlpV2InspectDataSourceDetailsResponse();

    /**
     * The configuration used for this job.
     * 
     */
    @InputImport(name="requestedOptions", required=true)
      private final GooglePrivacyDlpV2RequestedOptionsResponse requestedOptions;

    public GooglePrivacyDlpV2RequestedOptionsResponse getRequestedOptions() {
        return this.requestedOptions;
    }

    /**
     * A summary of the outcome of this inspection job.
     * 
     */
    @InputImport(name="result", required=true)
      private final GooglePrivacyDlpV2ResultResponse result;

    public GooglePrivacyDlpV2ResultResponse getResult() {
        return this.result;
    }

    public GooglePrivacyDlpV2InspectDataSourceDetailsResponse(
        GooglePrivacyDlpV2RequestedOptionsResponse requestedOptions,
        GooglePrivacyDlpV2ResultResponse result) {
        this.requestedOptions = Objects.requireNonNull(requestedOptions, "expected parameter 'requestedOptions' to be non-null");
        this.result = Objects.requireNonNull(result, "expected parameter 'result' to be non-null");
    }

    private GooglePrivacyDlpV2InspectDataSourceDetailsResponse() {
        this.requestedOptions = null;
        this.result = null;
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

        public Builder requestedOptions(GooglePrivacyDlpV2RequestedOptionsResponse requestedOptions) {
            this.requestedOptions = Objects.requireNonNull(requestedOptions);
            return this;
        }

        public Builder result(GooglePrivacyDlpV2ResultResponse result) {
            this.result = Objects.requireNonNull(result);
            return this;
        }
        public GooglePrivacyDlpV2InspectDataSourceDetailsResponse build() {
            return new GooglePrivacyDlpV2InspectDataSourceDetailsResponse(requestedOptions, result);
        }
    }
}
