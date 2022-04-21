// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.solutions.inputs;

import com.pulumi.azurenative.solutions.inputs.JitApproverDefinitionResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed application Jit access policy.
 * 
 */
public final class ApplicationJitAccessPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApplicationJitAccessPolicyResponse Empty = new ApplicationJitAccessPolicyResponse();

    /**
     * Whether the JIT access is enabled.
     * 
     */
    @Import(name="jitAccessEnabled", required=true)
    private Boolean jitAccessEnabled;

    public Boolean jitAccessEnabled() {
        return this.jitAccessEnabled;
    }

    /**
     * JIT approval mode.
     * 
     */
    @Import(name="jitApprovalMode")
    private @Nullable String jitApprovalMode;

    public Optional<String> jitApprovalMode() {
        return Optional.ofNullable(this.jitApprovalMode);
    }

    /**
     * The JIT approvers
     * 
     */
    @Import(name="jitApprovers")
    private @Nullable List<JitApproverDefinitionResponse> jitApprovers;

    public Optional<List<JitApproverDefinitionResponse>> jitApprovers() {
        return Optional.ofNullable(this.jitApprovers);
    }

    /**
     * The maximum duration JIT access is granted. This is an ISO8601 time period value.
     * 
     */
    @Import(name="maximumJitAccessDuration")
    private @Nullable String maximumJitAccessDuration;

    public Optional<String> maximumJitAccessDuration() {
        return Optional.ofNullable(this.maximumJitAccessDuration);
    }

    private ApplicationJitAccessPolicyResponse() {}

    private ApplicationJitAccessPolicyResponse(ApplicationJitAccessPolicyResponse $) {
        this.jitAccessEnabled = $.jitAccessEnabled;
        this.jitApprovalMode = $.jitApprovalMode;
        this.jitApprovers = $.jitApprovers;
        this.maximumJitAccessDuration = $.maximumJitAccessDuration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationJitAccessPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationJitAccessPolicyResponse $;

        public Builder() {
            $ = new ApplicationJitAccessPolicyResponse();
        }

        public Builder(ApplicationJitAccessPolicyResponse defaults) {
            $ = new ApplicationJitAccessPolicyResponse(Objects.requireNonNull(defaults));
        }

        public Builder jitAccessEnabled(Boolean jitAccessEnabled) {
            $.jitAccessEnabled = jitAccessEnabled;
            return this;
        }

        public Builder jitApprovalMode(@Nullable String jitApprovalMode) {
            $.jitApprovalMode = jitApprovalMode;
            return this;
        }

        public Builder jitApprovers(@Nullable List<JitApproverDefinitionResponse> jitApprovers) {
            $.jitApprovers = jitApprovers;
            return this;
        }

        public Builder jitApprovers(JitApproverDefinitionResponse... jitApprovers) {
            return jitApprovers(List.of(jitApprovers));
        }

        public Builder maximumJitAccessDuration(@Nullable String maximumJitAccessDuration) {
            $.maximumJitAccessDuration = maximumJitAccessDuration;
            return this;
        }

        public ApplicationJitAccessPolicyResponse build() {
            $.jitAccessEnabled = Objects.requireNonNull($.jitAccessEnabled, "expected parameter 'jitAccessEnabled' to be non-null");
            return $;
        }
    }

}
