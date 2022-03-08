// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatch;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class VirtualNodeSpecListenerTlsValidationSubjectAlternativeNames {
    /**
     * The criteria for determining a SAN's match.
     * 
     */
    private final VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatch match;

    @OutputCustomType.Constructor({"match"})
    private VirtualNodeSpecListenerTlsValidationSubjectAlternativeNames(VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatch match) {
        this.match = match;
    }

    /**
     * The criteria for determining a SAN's match.
     * 
    */
    public VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatch getMatch() {
        return this.match;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTlsValidationSubjectAlternativeNames defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatch match;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTlsValidationSubjectAlternativeNames defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.match = defaults.match;
        }

        public Builder setMatch(VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatch match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }
        public VirtualNodeSpecListenerTlsValidationSubjectAlternativeNames build() {
            return new VirtualNodeSpecListenerTlsValidationSubjectAlternativeNames(match);
        }
    }
}
