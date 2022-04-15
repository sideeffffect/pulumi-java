// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetBackendBucketCdnPolicyNegativeCachingPolicy {
    private final Integer code;
    private final Integer ttl;

    @CustomType.Constructor
    private GetBackendBucketCdnPolicyNegativeCachingPolicy(
        @CustomType.Parameter("code") Integer code,
        @CustomType.Parameter("ttl") Integer ttl) {
        this.code = code;
        this.ttl = ttl;
    }

    public Integer code() {
        return this.code;
    }
    public Integer ttl() {
        return this.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendBucketCdnPolicyNegativeCachingPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer code;
        private Integer ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendBucketCdnPolicyNegativeCachingPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.ttl = defaults.ttl;
        }

        public Builder code(Integer code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder ttl(Integer ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }        public GetBackendBucketCdnPolicyNegativeCachingPolicy build() {
            return new GetBackendBucketCdnPolicyNegativeCachingPolicy(code, ttl);
        }
    }
}
