// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetResponsePolicyRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResponsePolicyRuleArgs Empty = new GetResponsePolicyRuleArgs();

    @Import(name="clientOperationId")
    private @Nullable Output<String> clientOperationId;

    public Optional<Output<String>> clientOperationId() {
        return Optional.ofNullable(this.clientOperationId);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="responsePolicy", required=true)
    private Output<String> responsePolicy;

    public Output<String> responsePolicy() {
        return this.responsePolicy;
    }

    @Import(name="responsePolicyRule", required=true)
    private Output<String> responsePolicyRule;

    public Output<String> responsePolicyRule() {
        return this.responsePolicyRule;
    }

    private GetResponsePolicyRuleArgs() {}

    private GetResponsePolicyRuleArgs(GetResponsePolicyRuleArgs $) {
        this.clientOperationId = $.clientOperationId;
        this.project = $.project;
        this.responsePolicy = $.responsePolicy;
        this.responsePolicyRule = $.responsePolicyRule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResponsePolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResponsePolicyRuleArgs $;

        public Builder() {
            $ = new GetResponsePolicyRuleArgs();
        }

        public Builder(GetResponsePolicyRuleArgs defaults) {
            $ = new GetResponsePolicyRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientOperationId(@Nullable Output<String> clientOperationId) {
            $.clientOperationId = clientOperationId;
            return this;
        }

        public Builder clientOperationId(String clientOperationId) {
            return clientOperationId(Output.of(clientOperationId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder responsePolicy(Output<String> responsePolicy) {
            $.responsePolicy = responsePolicy;
            return this;
        }

        public Builder responsePolicy(String responsePolicy) {
            return responsePolicy(Output.of(responsePolicy));
        }

        public Builder responsePolicyRule(Output<String> responsePolicyRule) {
            $.responsePolicyRule = responsePolicyRule;
            return this;
        }

        public Builder responsePolicyRule(String responsePolicyRule) {
            return responsePolicyRule(Output.of(responsePolicyRule));
        }

        public GetResponsePolicyRuleArgs build() {
            $.responsePolicy = Objects.requireNonNull($.responsePolicy, "expected parameter 'responsePolicy' to be non-null");
            $.responsePolicyRule = Objects.requireNonNull($.responsePolicyRule, "expected parameter 'responsePolicyRule' to be non-null");
            return $;
        }
    }

}
