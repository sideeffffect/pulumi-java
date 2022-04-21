// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExternalVpnGatewayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExternalVpnGatewayArgs Empty = new GetExternalVpnGatewayArgs();

    @Import(name="externalVpnGateway", required=true)
    private String externalVpnGateway;

    public String externalVpnGateway() {
        return this.externalVpnGateway;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetExternalVpnGatewayArgs() {}

    private GetExternalVpnGatewayArgs(GetExternalVpnGatewayArgs $) {
        this.externalVpnGateway = $.externalVpnGateway;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExternalVpnGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExternalVpnGatewayArgs $;

        public Builder() {
            $ = new GetExternalVpnGatewayArgs();
        }

        public Builder(GetExternalVpnGatewayArgs defaults) {
            $ = new GetExternalVpnGatewayArgs(Objects.requireNonNull(defaults));
        }

        public Builder externalVpnGateway(String externalVpnGateway) {
            $.externalVpnGateway = externalVpnGateway;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetExternalVpnGatewayArgs build() {
            $.externalVpnGateway = Objects.requireNonNull($.externalVpnGateway, "expected parameter 'externalVpnGateway' to be non-null");
            return $;
        }
    }

}
