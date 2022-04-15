// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkconnectivity.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class SpokeLinkedVpnTunnelsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpokeLinkedVpnTunnelsGetArgs Empty = new SpokeLinkedVpnTunnelsGetArgs();

    /**
     * A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
     * 
     */
    @Import(name="siteToSiteDataTransfer", required=true)
      private final Output<Boolean> siteToSiteDataTransfer;

    public Output<Boolean> siteToSiteDataTransfer() {
        return this.siteToSiteDataTransfer;
    }

    /**
     * The URIs of linked VPN tunnel resources.
     * 
     */
    @Import(name="uris", required=true)
      private final Output<List<String>> uris;

    public Output<List<String>> uris() {
        return this.uris;
    }

    public SpokeLinkedVpnTunnelsGetArgs(
        Output<Boolean> siteToSiteDataTransfer,
        Output<List<String>> uris) {
        this.siteToSiteDataTransfer = Objects.requireNonNull(siteToSiteDataTransfer, "expected parameter 'siteToSiteDataTransfer' to be non-null");
        this.uris = Objects.requireNonNull(uris, "expected parameter 'uris' to be non-null");
    }

    private SpokeLinkedVpnTunnelsGetArgs() {
        this.siteToSiteDataTransfer = Codegen.empty();
        this.uris = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpokeLinkedVpnTunnelsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> siteToSiteDataTransfer;
        private Output<List<String>> uris;

        public Builder() {
    	      // Empty
        }

        public Builder(SpokeLinkedVpnTunnelsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.siteToSiteDataTransfer = defaults.siteToSiteDataTransfer;
    	      this.uris = defaults.uris;
        }

        public Builder siteToSiteDataTransfer(Output<Boolean> siteToSiteDataTransfer) {
            this.siteToSiteDataTransfer = Objects.requireNonNull(siteToSiteDataTransfer);
            return this;
        }
        public Builder siteToSiteDataTransfer(Boolean siteToSiteDataTransfer) {
            this.siteToSiteDataTransfer = Output.of(Objects.requireNonNull(siteToSiteDataTransfer));
            return this;
        }
        public Builder uris(Output<List<String>> uris) {
            this.uris = Objects.requireNonNull(uris);
            return this;
        }
        public Builder uris(List<String> uris) {
            this.uris = Output.of(Objects.requireNonNull(uris));
            return this;
        }
        public Builder uris(String... uris) {
            return uris(List.of(uris));
        }        public SpokeLinkedVpnTunnelsGetArgs build() {
            return new SpokeLinkedVpnTunnelsGetArgs(siteToSiteDataTransfer, uris);
        }
    }
}
