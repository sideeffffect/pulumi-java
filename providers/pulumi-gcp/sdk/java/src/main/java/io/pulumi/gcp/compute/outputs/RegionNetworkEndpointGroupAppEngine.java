// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionNetworkEndpointGroupAppEngine {
    /**
     * Optional serving service.
     * The service name must be 1-63 characters long, and comply with RFC1035.
     * Example value: "default", "my-service".
     * 
     */
    private final @Nullable String service;
    /**
     * A template to parse function field from a request URL. URL mask allows
     * for routing to multiple Cloud Functions without having to create
     * multiple Network Endpoint Groups and backend services.
     * For example, request URLs "mydomain.com/function1" and "mydomain.com/function2"
     * can be backed by the same Serverless NEG with URL mask "/". The URL mask
     * will parse them to { function = "function1" } and { function = "function2" } respectively.
     * 
     */
    private final @Nullable String urlMask;
    /**
     * Optional serving version.
     * The version must be 1-63 characters long, and comply with RFC1035.
     * Example value: "v1", "v2".
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private RegionNetworkEndpointGroupAppEngine(
        @CustomType.Parameter("service") @Nullable String service,
        @CustomType.Parameter("urlMask") @Nullable String urlMask,
        @CustomType.Parameter("version") @Nullable String version) {
        this.service = service;
        this.urlMask = urlMask;
        this.version = version;
    }

    /**
     * Optional serving service.
     * The service name must be 1-63 characters long, and comply with RFC1035.
     * Example value: "default", "my-service".
     * 
    */
    public Optional<String> service() {
        return Optional.ofNullable(this.service);
    }
    /**
     * A template to parse function field from a request URL. URL mask allows
     * for routing to multiple Cloud Functions without having to create
     * multiple Network Endpoint Groups and backend services.
     * For example, request URLs "mydomain.com/function1" and "mydomain.com/function2"
     * can be backed by the same Serverless NEG with URL mask "/". The URL mask
     * will parse them to { function = "function1" } and { function = "function2" } respectively.
     * 
    */
    public Optional<String> urlMask() {
        return Optional.ofNullable(this.urlMask);
    }
    /**
     * Optional serving version.
     * The version must be 1-63 characters long, and comply with RFC1035.
     * Example value: "v1", "v2".
     * 
    */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionNetworkEndpointGroupAppEngine defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String service;
        private @Nullable String urlMask;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionNetworkEndpointGroupAppEngine defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
    	      this.urlMask = defaults.urlMask;
    	      this.version = defaults.version;
        }

        public Builder service(@Nullable String service) {
            this.service = service;
            return this;
        }
        public Builder urlMask(@Nullable String urlMask) {
            this.urlMask = urlMask;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public RegionNetworkEndpointGroupAppEngine build() {
            return new RegionNetworkEndpointGroupAppEngine(service, urlMask, version);
        }
    }
}
