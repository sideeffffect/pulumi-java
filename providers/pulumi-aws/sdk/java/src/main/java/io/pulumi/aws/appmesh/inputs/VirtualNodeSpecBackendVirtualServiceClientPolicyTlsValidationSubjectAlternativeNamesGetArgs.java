// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesGetArgs Empty = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesGetArgs();

    /**
     * The criteria for determining a SAN's match.
     * 
     */
    @InputImport(name="match", required=true)
      private final Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs> match;

    public Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs> getMatch() {
        return this.match;
    }

    public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesGetArgs(Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs> match) {
        this.match = Objects.requireNonNull(match, "expected parameter 'match' to be non-null");
    }

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesGetArgs() {
        this.match = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs> match;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.match = defaults.match;
        }

        public Builder match(Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs> match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }

        public Builder match(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs match) {
            this.match = Input.of(Objects.requireNonNull(match));
            return this;
        }
        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesGetArgs build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesGetArgs(match);
        }
    }
}
