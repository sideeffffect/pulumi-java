// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.composer_v1beta1.outputs.AllowedIpRangeResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebServerNetworkAccessControlResponse {
    /**
     * A collection of allowed IP ranges with descriptions.
     * 
     */
    private final List<AllowedIpRangeResponse> allowedIpRanges;

    @CustomType.Constructor
    private WebServerNetworkAccessControlResponse(@CustomType.Parameter("allowedIpRanges") List<AllowedIpRangeResponse> allowedIpRanges) {
        this.allowedIpRanges = allowedIpRanges;
    }

    /**
     * A collection of allowed IP ranges with descriptions.
     * 
    */
    public List<AllowedIpRangeResponse> allowedIpRanges() {
        return this.allowedIpRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebServerNetworkAccessControlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AllowedIpRangeResponse> allowedIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(WebServerNetworkAccessControlResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedIpRanges = defaults.allowedIpRanges;
        }

        public Builder allowedIpRanges(List<AllowedIpRangeResponse> allowedIpRanges) {
            this.allowedIpRanges = Objects.requireNonNull(allowedIpRanges);
            return this;
        }
        public Builder allowedIpRanges(AllowedIpRangeResponse... allowedIpRanges) {
            return allowedIpRanges(List.of(allowedIpRanges));
        }        public WebServerNetworkAccessControlResponse build() {
            return new WebServerNetworkAccessControlResponse(allowedIpRanges);
        }
    }
}
