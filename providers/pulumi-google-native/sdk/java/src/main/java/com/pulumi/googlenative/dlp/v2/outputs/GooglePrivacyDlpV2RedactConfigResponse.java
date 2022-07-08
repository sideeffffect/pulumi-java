// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2RedactConfigResponse {
    @CustomType.Constructor
    private GooglePrivacyDlpV2RedactConfigResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2RedactConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2RedactConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public GooglePrivacyDlpV2RedactConfigResponse build() {
            return new GooglePrivacyDlpV2RedactConfigResponse();
        }
    }
}
