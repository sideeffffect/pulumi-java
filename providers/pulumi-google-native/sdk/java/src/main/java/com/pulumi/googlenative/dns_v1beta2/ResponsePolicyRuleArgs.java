// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dns_v1beta2.enums.ResponsePolicyRuleBehavior;
import com.pulumi.googlenative.dns_v1beta2.inputs.ResponsePolicyRuleLocalDataArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponsePolicyRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponsePolicyRuleArgs Empty = new ResponsePolicyRuleArgs();

    /**
     * Answer this query with a behavior rather than DNS data.
     * 
     */
    @Import(name="behavior")
    private @Nullable Output<ResponsePolicyRuleBehavior> behavior;

    public Optional<Output<ResponsePolicyRuleBehavior>> behavior() {
        return Optional.ofNullable(this.behavior);
    }

    @Import(name="clientOperationId")
    private @Nullable Output<String> clientOperationId;

    public Optional<Output<String>> clientOperationId() {
        return Optional.ofNullable(this.clientOperationId);
    }

    /**
     * The DNS name (wildcard or exact) to apply this rule to. Must be unique within the Response Policy Rule.
     * 
     */
    @Import(name="dnsName")
    private @Nullable Output<String> dnsName;

    public Optional<Output<String>> dnsName() {
        return Optional.ofNullable(this.dnsName);
    }

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Answer this query directly with DNS data. These ResourceRecordSets override any other DNS behavior for the matched name; in particular they override private zones, the public internet, and GCP internal DNS. No SOA nor NS types are allowed.
     * 
     */
    @Import(name="localData")
    private @Nullable Output<ResponsePolicyRuleLocalDataArgs> localData;

    public Optional<Output<ResponsePolicyRuleLocalDataArgs>> localData() {
        return Optional.ofNullable(this.localData);
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

    /**
     * An identifier for this rule. Must be unique with the ResponsePolicy.
     * 
     */
    @Import(name="ruleName")
    private @Nullable Output<String> ruleName;

    public Optional<Output<String>> ruleName() {
        return Optional.ofNullable(this.ruleName);
    }

    private ResponsePolicyRuleArgs() {}

    private ResponsePolicyRuleArgs(ResponsePolicyRuleArgs $) {
        this.behavior = $.behavior;
        this.clientOperationId = $.clientOperationId;
        this.dnsName = $.dnsName;
        this.kind = $.kind;
        this.localData = $.localData;
        this.project = $.project;
        this.responsePolicy = $.responsePolicy;
        this.ruleName = $.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponsePolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponsePolicyRuleArgs $;

        public Builder() {
            $ = new ResponsePolicyRuleArgs();
        }

        public Builder(ResponsePolicyRuleArgs defaults) {
            $ = new ResponsePolicyRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder behavior(@Nullable Output<ResponsePolicyRuleBehavior> behavior) {
            $.behavior = behavior;
            return this;
        }

        public Builder behavior(ResponsePolicyRuleBehavior behavior) {
            return behavior(Output.of(behavior));
        }

        public Builder clientOperationId(@Nullable Output<String> clientOperationId) {
            $.clientOperationId = clientOperationId;
            return this;
        }

        public Builder clientOperationId(String clientOperationId) {
            return clientOperationId(Output.of(clientOperationId));
        }

        public Builder dnsName(@Nullable Output<String> dnsName) {
            $.dnsName = dnsName;
            return this;
        }

        public Builder dnsName(String dnsName) {
            return dnsName(Output.of(dnsName));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder localData(@Nullable Output<ResponsePolicyRuleLocalDataArgs> localData) {
            $.localData = localData;
            return this;
        }

        public Builder localData(ResponsePolicyRuleLocalDataArgs localData) {
            return localData(Output.of(localData));
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

        public Builder ruleName(@Nullable Output<String> ruleName) {
            $.ruleName = ruleName;
            return this;
        }

        public Builder ruleName(String ruleName) {
            return ruleName(Output.of(ruleName));
        }

        public ResponsePolicyRuleArgs build() {
            $.responsePolicy = Objects.requireNonNull($.responsePolicy, "expected parameter 'responsePolicy' to be non-null");
            return $;
        }
    }

}
