// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebasehosting_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A configured rewrite that directs requests to a Cloud Run service. If the Cloud Run service does not exist when setting or updating your Firebase Hosting configuration, then the request fails. Any errors from the Cloud Run service are passed to the end user (for example, if you delete a service, any requests directed to that service receive a `404` error).
 * 
 */
public final class CloudRunRewriteResponse extends com.pulumi.resources.InvokeArgs {

    public static final CloudRunRewriteResponse Empty = new CloudRunRewriteResponse();

    /**
     * Optional. User-provided region where the Cloud Run service is hosted. Defaults to `us-central1` if not supplied.
     * 
     */
    @Import(name="region", required=true)
      private final String region;

    public String region() {
        return this.region;
    }

    /**
     * User-defined ID of the Cloud Run service.
     * 
     */
    @Import(name="serviceId", required=true)
      private final String serviceId;

    public String serviceId() {
        return this.serviceId;
    }

    public CloudRunRewriteResponse(
        String region,
        String serviceId) {
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
    }

    private CloudRunRewriteResponse() {
        this.region = null;
        this.serviceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudRunRewriteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String region;
        private String serviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudRunRewriteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
    	      this.serviceId = defaults.serviceId;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder serviceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }        public CloudRunRewriteResponse build() {
            return new CloudRunRewriteResponse(region, serviceId);
        }
    }
}
