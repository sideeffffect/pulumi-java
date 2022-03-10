// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.inputs;

import io.pulumi.azurenative.solutions.inputs.JitApproverDefinitionResponse;
import io.pulumi.core.annotations.InputImport;
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
public final class ApplicationJitAccessPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationJitAccessPolicyResponse Empty = new ApplicationJitAccessPolicyResponse();

    /**
     * Whether the JIT access is enabled.
     * 
     */
    @InputImport(name="jitAccessEnabled", required=true)
      private final Boolean jitAccessEnabled;

    public Boolean getJitAccessEnabled() {
        return this.jitAccessEnabled;
    }

    /**
     * JIT approval mode.
     * 
     */
    @InputImport(name="jitApprovalMode")
      private final @Nullable String jitApprovalMode;

    public Optional<String> getJitApprovalMode() {
        return this.jitApprovalMode == null ? Optional.empty() : Optional.ofNullable(this.jitApprovalMode);
    }

    /**
     * The JIT approvers
     * 
     */
    @InputImport(name="jitApprovers")
      private final @Nullable List<JitApproverDefinitionResponse> jitApprovers;

    public List<JitApproverDefinitionResponse> getJitApprovers() {
        return this.jitApprovers == null ? List.of() : this.jitApprovers;
    }

    /**
     * The maximum duration JIT access is granted. This is an ISO8601 time period value.
     * 
     */
    @InputImport(name="maximumJitAccessDuration")
      private final @Nullable String maximumJitAccessDuration;

    public Optional<String> getMaximumJitAccessDuration() {
        return this.maximumJitAccessDuration == null ? Optional.empty() : Optional.ofNullable(this.maximumJitAccessDuration);
    }

    public ApplicationJitAccessPolicyResponse(
        Boolean jitAccessEnabled,
        @Nullable String jitApprovalMode,
        @Nullable List<JitApproverDefinitionResponse> jitApprovers,
        @Nullable String maximumJitAccessDuration) {
        this.jitAccessEnabled = Objects.requireNonNull(jitAccessEnabled, "expected parameter 'jitAccessEnabled' to be non-null");
        this.jitApprovalMode = jitApprovalMode;
        this.jitApprovers = jitApprovers;
        this.maximumJitAccessDuration = maximumJitAccessDuration;
    }

    private ApplicationJitAccessPolicyResponse() {
        this.jitAccessEnabled = null;
        this.jitApprovalMode = null;
        this.jitApprovers = List.of();
        this.maximumJitAccessDuration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationJitAccessPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean jitAccessEnabled;
        private @Nullable String jitApprovalMode;
        private @Nullable List<JitApproverDefinitionResponse> jitApprovers;
        private @Nullable String maximumJitAccessDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationJitAccessPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jitAccessEnabled = defaults.jitAccessEnabled;
    	      this.jitApprovalMode = defaults.jitApprovalMode;
    	      this.jitApprovers = defaults.jitApprovers;
    	      this.maximumJitAccessDuration = defaults.maximumJitAccessDuration;
        }

        public Builder jitAccessEnabled(Boolean jitAccessEnabled) {
            this.jitAccessEnabled = Objects.requireNonNull(jitAccessEnabled);
            return this;
        }

        public Builder jitApprovalMode(@Nullable String jitApprovalMode) {
            this.jitApprovalMode = jitApprovalMode;
            return this;
        }

        public Builder jitApprovers(@Nullable List<JitApproverDefinitionResponse> jitApprovers) {
            this.jitApprovers = jitApprovers;
            return this;
        }

        public Builder maximumJitAccessDuration(@Nullable String maximumJitAccessDuration) {
            this.maximumJitAccessDuration = maximumJitAccessDuration;
            return this;
        }
        public ApplicationJitAccessPolicyResponse build() {
            return new ApplicationJitAccessPolicyResponse(jitAccessEnabled, jitApprovalMode, jitApprovers, maximumJitAccessDuration);
        }
    }
}
