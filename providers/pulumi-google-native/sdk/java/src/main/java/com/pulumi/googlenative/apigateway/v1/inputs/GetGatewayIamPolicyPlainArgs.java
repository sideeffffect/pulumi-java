// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigateway.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGatewayIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGatewayIamPolicyPlainArgs Empty = new GetGatewayIamPolicyPlainArgs();

    @Import(name="gatewayId", required=true)
    private String gatewayId;

    public String gatewayId() {
        return this.gatewayId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetGatewayIamPolicyPlainArgs() {}

    private GetGatewayIamPolicyPlainArgs(GetGatewayIamPolicyPlainArgs $) {
        this.gatewayId = $.gatewayId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGatewayIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGatewayIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetGatewayIamPolicyPlainArgs();
        }

        public Builder(GetGatewayIamPolicyPlainArgs defaults) {
            $ = new GetGatewayIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder gatewayId(String gatewayId) {
            $.gatewayId = gatewayId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetGatewayIamPolicyPlainArgs build() {
            $.gatewayId = Objects.requireNonNull($.gatewayId, "expected parameter 'gatewayId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
