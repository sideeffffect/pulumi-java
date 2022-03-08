// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NetworkEndpointGroupServerlessDeploymentResponse {
    /**
     * The platform of the backend target(s) of this NEG. Possible values include: 1. API Gateway: apigateway.googleapis.com 2. App Engine: appengine.googleapis.com 3. Cloud Functions: cloudfunctions.googleapis.com 4. Cloud Run: run.googleapis.com
     * 
     */
    private final String platform;
    /**
     * The user-defined name of the workload/instance. This value must be provided explicitly or in the urlMask. The resource identified by this value is platform-specific and is as follows: 1. API Gateway: The gateway ID 2. App Engine: The service name 3. Cloud Functions: The function name 4. Cloud Run: The service name
     * 
     */
    private final String resource;
    /**
     * A template to parse platform-specific fields from a request URL. URL mask allows for routing to multiple resources on the same serverless platform without having to create multiple Network Endpoint Groups and backend resources. The fields parsed by this template are platform-specific and are as follows: 1. API Gateway: The gateway ID 2. App Engine: The service and version 3. Cloud Functions: The function name 4. Cloud Run: The service and tag
     * 
     */
    private final String urlMask;
    /**
     * The optional resource version. The version identified by this value is platform-specific and is follows: 1. API Gateway: Unused 2. App Engine: The service version 3. Cloud Functions: Unused 4. Cloud Run: The service tag
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"platform","resource","urlMask","version"})
    private NetworkEndpointGroupServerlessDeploymentResponse(
        String platform,
        String resource,
        String urlMask,
        String version) {
        this.platform = platform;
        this.resource = resource;
        this.urlMask = urlMask;
        this.version = version;
    }

    /**
     * The platform of the backend target(s) of this NEG. Possible values include: 1. API Gateway: apigateway.googleapis.com 2. App Engine: appengine.googleapis.com 3. Cloud Functions: cloudfunctions.googleapis.com 4. Cloud Run: run.googleapis.com
     * 
    */
    public String getPlatform() {
        return this.platform;
    }
    /**
     * The user-defined name of the workload/instance. This value must be provided explicitly or in the urlMask. The resource identified by this value is platform-specific and is as follows: 1. API Gateway: The gateway ID 2. App Engine: The service name 3. Cloud Functions: The function name 4. Cloud Run: The service name
     * 
    */
    public String getResource() {
        return this.resource;
    }
    /**
     * A template to parse platform-specific fields from a request URL. URL mask allows for routing to multiple resources on the same serverless platform without having to create multiple Network Endpoint Groups and backend resources. The fields parsed by this template are platform-specific and are as follows: 1. API Gateway: The gateway ID 2. App Engine: The service and version 3. Cloud Functions: The function name 4. Cloud Run: The service and tag
     * 
    */
    public String getUrlMask() {
        return this.urlMask;
    }
    /**
     * The optional resource version. The version identified by this value is platform-specific and is follows: 1. API Gateway: Unused 2. App Engine: The service version 3. Cloud Functions: Unused 4. Cloud Run: The service tag
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointGroupServerlessDeploymentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String platform;
        private String resource;
        private String urlMask;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointGroupServerlessDeploymentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.platform = defaults.platform;
    	      this.resource = defaults.resource;
    	      this.urlMask = defaults.urlMask;
    	      this.version = defaults.version;
        }

        public Builder setPlatform(String platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }

        public Builder setResource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }

        public Builder setUrlMask(String urlMask) {
            this.urlMask = Objects.requireNonNull(urlMask);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public NetworkEndpointGroupServerlessDeploymentResponse build() {
            return new NetworkEndpointGroupServerlessDeploymentResponse(platform, resource, urlMask, version);
        }
    }
}
