// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lambda.outputs;

import com.pulumi.awsnative.lambda.enums.CodeSigningConfigCodeSigningPoliciesUntrustedArtifactOnDeployment;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class CodeSigningConfigCodeSigningPolicies {
    /**
     * Indicates how Lambda operations involve updating the code artifact will operate. Default to Warn if not provided
     * 
     */
    private final CodeSigningConfigCodeSigningPoliciesUntrustedArtifactOnDeployment untrustedArtifactOnDeployment;

    @CustomType.Constructor
    private CodeSigningConfigCodeSigningPolicies(@CustomType.Parameter("untrustedArtifactOnDeployment") CodeSigningConfigCodeSigningPoliciesUntrustedArtifactOnDeployment untrustedArtifactOnDeployment) {
        this.untrustedArtifactOnDeployment = untrustedArtifactOnDeployment;
    }

    /**
     * Indicates how Lambda operations involve updating the code artifact will operate. Default to Warn if not provided
     * 
    */
    public CodeSigningConfigCodeSigningPoliciesUntrustedArtifactOnDeployment untrustedArtifactOnDeployment() {
        return this.untrustedArtifactOnDeployment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeSigningConfigCodeSigningPolicies defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CodeSigningConfigCodeSigningPoliciesUntrustedArtifactOnDeployment untrustedArtifactOnDeployment;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeSigningConfigCodeSigningPolicies defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.untrustedArtifactOnDeployment = defaults.untrustedArtifactOnDeployment;
        }

        public Builder untrustedArtifactOnDeployment(CodeSigningConfigCodeSigningPoliciesUntrustedArtifactOnDeployment untrustedArtifactOnDeployment) {
            this.untrustedArtifactOnDeployment = Objects.requireNonNull(untrustedArtifactOnDeployment);
            return this;
        }        public CodeSigningConfigCodeSigningPolicies build() {
            return new CodeSigningConfigCodeSigningPolicies(untrustedArtifactOnDeployment);
        }
    }
}
