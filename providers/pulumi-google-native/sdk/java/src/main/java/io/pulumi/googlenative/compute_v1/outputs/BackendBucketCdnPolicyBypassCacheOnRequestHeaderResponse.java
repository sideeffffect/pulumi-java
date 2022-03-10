// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse {
    /**
     * The header field name to match on when bypassing cache. Values are case-insensitive.
     * 
     */
    private final String headerName;

    @OutputCustomType.Constructor
    private BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse(@OutputCustomType.Parameter("headerName") String headerName) {
        this.headerName = headerName;
    }

    /**
     * The header field name to match on when bypassing cache. Values are case-insensitive.
     * 
    */
    public String getHeaderName() {
        return this.headerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String headerName;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
        }

        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        public BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse build() {
            return new BackendBucketCdnPolicyBypassCacheOnRequestHeaderResponse(headerName);
        }
    }
}
