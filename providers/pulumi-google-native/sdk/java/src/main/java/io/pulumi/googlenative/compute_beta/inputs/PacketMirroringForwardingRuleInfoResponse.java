// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PacketMirroringForwardingRuleInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final PacketMirroringForwardingRuleInfoResponse Empty = new PacketMirroringForwardingRuleInfoResponse();

    /**
     * Unique identifier for the forwarding rule; defined by the server.
     * 
     */
    @InputImport(name="canonicalUrl", required=true)
      private final String canonicalUrl;

    public String getCanonicalUrl() {
        return this.canonicalUrl;
    }

    /**
     * Resource URL to the forwarding rule representing the ILB configured as destination of the mirrored traffic.
     * 
     */
    @InputImport(name="url", required=true)
      private final String url;

    public String getUrl() {
        return this.url;
    }

    public PacketMirroringForwardingRuleInfoResponse(
        String canonicalUrl,
        String url) {
        this.canonicalUrl = Objects.requireNonNull(canonicalUrl, "expected parameter 'canonicalUrl' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private PacketMirroringForwardingRuleInfoResponse() {
        this.canonicalUrl = null;
        this.url = null;
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
        }
        public PacketMirroringForwardingRuleInfoResponse build() {
            return new PacketMirroringForwardingRuleInfoResponse(canonicalUrl, url);
        }
    }
}
