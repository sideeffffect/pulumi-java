// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkconnectivity_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPolicyBasedRouteIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPolicyBasedRouteIamPolicyPlainArgs Empty = new GetPolicyBasedRouteIamPolicyPlainArgs();

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="policyBasedRouteId", required=true)
    private String policyBasedRouteId;

    public String policyBasedRouteId() {
        return this.policyBasedRouteId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetPolicyBasedRouteIamPolicyPlainArgs() {}

    private GetPolicyBasedRouteIamPolicyPlainArgs(GetPolicyBasedRouteIamPolicyPlainArgs $) {
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.policyBasedRouteId = $.policyBasedRouteId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyBasedRouteIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyBasedRouteIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetPolicyBasedRouteIamPolicyPlainArgs();
        }

        public Builder(GetPolicyBasedRouteIamPolicyPlainArgs defaults) {
            $ = new GetPolicyBasedRouteIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder policyBasedRouteId(String policyBasedRouteId) {
            $.policyBasedRouteId = policyBasedRouteId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetPolicyBasedRouteIamPolicyPlainArgs build() {
            $.policyBasedRouteId = Objects.requireNonNull($.policyBasedRouteId, "expected parameter 'policyBasedRouteId' to be non-null");
            return $;
        }
    }

}
