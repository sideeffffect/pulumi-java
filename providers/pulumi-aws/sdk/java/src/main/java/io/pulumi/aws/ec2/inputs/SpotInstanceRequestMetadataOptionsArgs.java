// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotInstanceRequestMetadataOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotInstanceRequestMetadataOptionsArgs Empty = new SpotInstanceRequestMetadataOptionsArgs();

    /**
     * Whether the metadata service is available. Valid values include `enabled` or `disabled`. Defaults to `enabled`.
     * 
     */
    @InputImport(name="httpEndpoint")
      private final @Nullable Input<String> httpEndpoint;

    public Input<String> getHttpEndpoint() {
        return this.httpEndpoint == null ? Input.empty() : this.httpEndpoint;
    }

    /**
     * Desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. Valid values are integer from `1` to `64`. Defaults to `1`.
     * 
     */
    @InputImport(name="httpPutResponseHopLimit")
      private final @Nullable Input<Integer> httpPutResponseHopLimit;

    public Input<Integer> getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit == null ? Input.empty() : this.httpPutResponseHopLimit;
    }

    /**
     * Whether or not the metadata service requires session tokens, also referred to as _Instance Metadata Service Version 2 (IMDSv2)_. Valid values include `optional` or `required`. Defaults to `optional`.
     * 
     */
    @InputImport(name="httpTokens")
      private final @Nullable Input<String> httpTokens;

    public Input<String> getHttpTokens() {
        return this.httpTokens == null ? Input.empty() : this.httpTokens;
    }

    /**
     * Enables or disables access to instance tags from the instance metadata service. Valid values include `enabled` or `disabled`. Defaults to `disabled`.
     * 
     */
    @InputImport(name="instanceMetadataTags")
      private final @Nullable Input<String> instanceMetadataTags;

    public Input<String> getInstanceMetadataTags() {
        return this.instanceMetadataTags == null ? Input.empty() : this.instanceMetadataTags;
    }

    public SpotInstanceRequestMetadataOptionsArgs(
        @Nullable Input<String> httpEndpoint,
        @Nullable Input<Integer> httpPutResponseHopLimit,
        @Nullable Input<String> httpTokens,
        @Nullable Input<String> instanceMetadataTags) {
        this.httpEndpoint = httpEndpoint;
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        this.httpTokens = httpTokens;
        this.instanceMetadataTags = instanceMetadataTags;
    }

    private SpotInstanceRequestMetadataOptionsArgs() {
        this.httpEndpoint = Input.empty();
        this.httpPutResponseHopLimit = Input.empty();
        this.httpTokens = Input.empty();
        this.instanceMetadataTags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotInstanceRequestMetadataOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> httpEndpoint;
        private @Nullable Input<Integer> httpPutResponseHopLimit;
        private @Nullable Input<String> httpTokens;
        private @Nullable Input<String> instanceMetadataTags;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotInstanceRequestMetadataOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpEndpoint = defaults.httpEndpoint;
    	      this.httpPutResponseHopLimit = defaults.httpPutResponseHopLimit;
    	      this.httpTokens = defaults.httpTokens;
    	      this.instanceMetadataTags = defaults.instanceMetadataTags;
        }

        public Builder httpEndpoint(@Nullable Input<String> httpEndpoint) {
            this.httpEndpoint = httpEndpoint;
            return this;
        }

        public Builder httpEndpoint(@Nullable String httpEndpoint) {
            this.httpEndpoint = Input.ofNullable(httpEndpoint);
            return this;
        }

        public Builder httpPutResponseHopLimit(@Nullable Input<Integer> httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }

        public Builder httpPutResponseHopLimit(@Nullable Integer httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = Input.ofNullable(httpPutResponseHopLimit);
            return this;
        }

        public Builder httpTokens(@Nullable Input<String> httpTokens) {
            this.httpTokens = httpTokens;
            return this;
        }

        public Builder httpTokens(@Nullable String httpTokens) {
            this.httpTokens = Input.ofNullable(httpTokens);
            return this;
        }

        public Builder instanceMetadataTags(@Nullable Input<String> instanceMetadataTags) {
            this.instanceMetadataTags = instanceMetadataTags;
            return this;
        }

        public Builder instanceMetadataTags(@Nullable String instanceMetadataTags) {
            this.instanceMetadataTags = Input.ofNullable(instanceMetadataTags);
            return this;
        }
        public SpotInstanceRequestMetadataOptionsArgs build() {
            return new SpotInstanceRequestMetadataOptionsArgs(httpEndpoint, httpPutResponseHopLimit, httpTokens, instanceMetadataTags);
        }
    }
}
