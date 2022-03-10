// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.DiscoveredResponse;
import java.util.Objects;


/**
 * Details of a discovery occurrence.
 * 
 */
public final class GrafeasV1beta1DiscoveryDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GrafeasV1beta1DiscoveryDetailsResponse Empty = new GrafeasV1beta1DiscoveryDetailsResponse();

    /**
     * Analysis status for the discovered resource.
     * 
     */
    @InputImport(name="discovered", required=true)
      private final DiscoveredResponse discovered;

    public DiscoveredResponse getDiscovered() {
        return this.discovered;
    }

    public GrafeasV1beta1DiscoveryDetailsResponse(DiscoveredResponse discovered) {
        this.discovered = Objects.requireNonNull(discovered, "expected parameter 'discovered' to be non-null");
    }

    private GrafeasV1beta1DiscoveryDetailsResponse() {
        this.discovered = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrafeasV1beta1DiscoveryDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiscoveredResponse discovered;

        public Builder() {
    	      // Empty
        }

        public Builder(GrafeasV1beta1DiscoveryDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.discovered = defaults.discovered;
        }

        public Builder discovered(DiscoveredResponse discovered) {
            this.discovered = Objects.requireNonNull(discovered);
            return this;
        }
        public GrafeasV1beta1DiscoveryDetailsResponse build() {
            return new GrafeasV1beta1DiscoveryDetailsResponse(discovered);
        }
    }
}
