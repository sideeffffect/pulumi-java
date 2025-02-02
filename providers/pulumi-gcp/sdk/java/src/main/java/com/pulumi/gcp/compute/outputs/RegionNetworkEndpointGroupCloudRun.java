// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionNetworkEndpointGroupCloudRun {
    /**
     * @return Optional serving service.
     * The service name must be 1-63 characters long, and comply with RFC1035.
     * Example value: &#34;default&#34;, &#34;my-service&#34;.
     * 
     */
    private final @Nullable String service;
    /**
     * @return Cloud Run tag represents the &#34;named-revision&#34; to provide
     * additional fine-grained traffic routing information.
     * The tag must be 1-63 characters long, and comply with RFC1035.
     * Example value: &#34;revision-0010&#34;.
     * 
     */
    private final @Nullable String tag;
    /**
     * @return A template to parse platform-specific fields from a request URL. URL mask allows for routing to multiple resources
     * on the same serverless platform without having to create multiple Network Endpoint Groups and backend resources.
     * The fields parsed by this template are platform-specific and are as follows: API Gateway: The gateway ID,
     * App Engine: The service and version, Cloud Functions: The function name, Cloud Run: The service and tag
     * 
     */
    private final @Nullable String urlMask;

    @CustomType.Constructor
    private RegionNetworkEndpointGroupCloudRun(
        @CustomType.Parameter("service") @Nullable String service,
        @CustomType.Parameter("tag") @Nullable String tag,
        @CustomType.Parameter("urlMask") @Nullable String urlMask) {
        this.service = service;
        this.tag = tag;
        this.urlMask = urlMask;
    }

    /**
     * @return Optional serving service.
     * The service name must be 1-63 characters long, and comply with RFC1035.
     * Example value: &#34;default&#34;, &#34;my-service&#34;.
     * 
     */
    public Optional<String> service() {
        return Optional.ofNullable(this.service);
    }
    /**
     * @return Cloud Run tag represents the &#34;named-revision&#34; to provide
     * additional fine-grained traffic routing information.
     * The tag must be 1-63 characters long, and comply with RFC1035.
     * Example value: &#34;revision-0010&#34;.
     * 
     */
    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }
    /**
     * @return A template to parse platform-specific fields from a request URL. URL mask allows for routing to multiple resources
     * on the same serverless platform without having to create multiple Network Endpoint Groups and backend resources.
     * The fields parsed by this template are platform-specific and are as follows: API Gateway: The gateway ID,
     * App Engine: The service and version, Cloud Functions: The function name, Cloud Run: The service and tag
     * 
     */
    public Optional<String> urlMask() {
        return Optional.ofNullable(this.urlMask);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionNetworkEndpointGroupCloudRun defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String service;
        private @Nullable String tag;
        private @Nullable String urlMask;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionNetworkEndpointGroupCloudRun defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
    	      this.tag = defaults.tag;
    	      this.urlMask = defaults.urlMask;
        }

        public Builder service(@Nullable String service) {
            this.service = service;
            return this;
        }
        public Builder tag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }
        public Builder urlMask(@Nullable String urlMask) {
            this.urlMask = urlMask;
            return this;
        }        public RegionNetworkEndpointGroupCloudRun build() {
            return new RegionNetworkEndpointGroupCloudRun(service, tag, urlMask);
        }
    }
}
