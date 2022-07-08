// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.container.v1.outputs.CidrBlockResponse;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MasterAuthorizedNetworksConfigResponse {
    /**
     * @return cidr_blocks define up to 50 external networks that could access Kubernetes master through HTTPS.
     * 
     */
    private final List<CidrBlockResponse> cidrBlocks;
    /**
     * @return Whether or not master authorized networks is enabled.
     * 
     */
    private final Boolean enabled;

    @CustomType.Constructor
    private MasterAuthorizedNetworksConfigResponse(
        @CustomType.Parameter("cidrBlocks") List<CidrBlockResponse> cidrBlocks,
        @CustomType.Parameter("enabled") Boolean enabled) {
        this.cidrBlocks = cidrBlocks;
        this.enabled = enabled;
    }

    /**
     * @return cidr_blocks define up to 50 external networks that could access Kubernetes master through HTTPS.
     * 
     */
    public List<CidrBlockResponse> cidrBlocks() {
        return this.cidrBlocks;
    }
    /**
     * @return Whether or not master authorized networks is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MasterAuthorizedNetworksConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CidrBlockResponse> cidrBlocks;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(MasterAuthorizedNetworksConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.enabled = defaults.enabled;
        }

        public Builder cidrBlocks(List<CidrBlockResponse> cidrBlocks) {
            this.cidrBlocks = Objects.requireNonNull(cidrBlocks);
            return this;
        }
        public Builder cidrBlocks(CidrBlockResponse... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public MasterAuthorizedNetworksConfigResponse build() {
            return new MasterAuthorizedNetworksConfigResponse(cidrBlocks, enabled);
        }
    }
}
