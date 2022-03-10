// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpnGatewayArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVpnGatewayArgs Empty = new GetVpnGatewayArgs();

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="region", required=true)
      private final String region;

    public String getRegion() {
        return this.region;
    }

    @InputImport(name="vpnGateway", required=true)
      private final String vpnGateway;

    public String getVpnGateway() {
        return this.vpnGateway;
    }

    public GetVpnGatewayArgs(
        @Nullable String project,
        String region,
        String vpnGateway) {
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.vpnGateway = Objects.requireNonNull(vpnGateway, "expected parameter 'vpnGateway' to be non-null");
    }

    private GetVpnGatewayArgs() {
        this.project = null;
        this.region = null;
        this.vpnGateway = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpnGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String region;
        private String vpnGateway;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpnGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.vpnGateway = defaults.vpnGateway;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder vpnGateway(String vpnGateway) {
            this.vpnGateway = Objects.requireNonNull(vpnGateway);
            return this;
        }
        public GetVpnGatewayArgs build() {
            return new GetVpnGatewayArgs(project, region, vpnGateway);
        }
    }
}
