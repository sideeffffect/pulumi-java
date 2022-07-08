// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PacketMirroringForwardingRuleInfoResponse {
    /**
     * @return Unique identifier for the forwarding rule; defined by the server.
     * 
     */
    private final String canonicalUrl;
    /**
     * @return Resource URL to the forwarding rule representing the ILB configured as destination of the mirrored traffic.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private PacketMirroringForwardingRuleInfoResponse(
        @CustomType.Parameter("canonicalUrl") String canonicalUrl,
        @CustomType.Parameter("url") String url) {
        this.canonicalUrl = canonicalUrl;
        this.url = url;
    }

    /**
     * @return Unique identifier for the forwarding rule; defined by the server.
     * 
     */
    public String canonicalUrl() {
        return this.canonicalUrl;
    }
    /**
     * @return Resource URL to the forwarding rule representing the ILB configured as destination of the mirrored traffic.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringForwardingRuleInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String canonicalUrl;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringForwardingRuleInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonicalUrl = defaults.canonicalUrl;
    	      this.url = defaults.url;
        }

        public Builder canonicalUrl(String canonicalUrl) {
            this.canonicalUrl = Objects.requireNonNull(canonicalUrl);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public PacketMirroringForwardingRuleInfoResponse build() {
            return new PacketMirroringForwardingRuleInfoResponse(canonicalUrl, url);
        }
    }
}
