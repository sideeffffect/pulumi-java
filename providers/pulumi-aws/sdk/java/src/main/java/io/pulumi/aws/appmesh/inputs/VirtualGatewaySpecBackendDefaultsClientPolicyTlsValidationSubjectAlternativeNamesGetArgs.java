// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


public final class VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesGetArgs Empty = new VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesGetArgs();

    /**
     * The criteria for determining a SAN's match.
     * 
     */
    @Import(name="match", required=true)
      private final Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs> match;

    public Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs> match() {
        return this.match;
    }

    public VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesGetArgs(Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs> match) {
        this.match = Objects.requireNonNull(match, "expected parameter 'match' to be non-null");
    }

    private VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesGetArgs() {
        this.match = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs> match;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.match = defaults.match;
        }

        public Builder match(Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs> match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }
        public Builder match(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs match) {
            this.match = Output.of(Objects.requireNonNull(match));
            return this;
        }        public VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesGetArgs build() {
            return new VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesGetArgs(match);
        }
    }
}
