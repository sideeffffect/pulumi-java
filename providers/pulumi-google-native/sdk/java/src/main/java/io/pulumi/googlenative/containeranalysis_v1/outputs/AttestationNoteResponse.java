// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.HintResponse;
import java.util.Objects;

@OutputCustomType
public final class AttestationNoteResponse {
    /**
     * Hint hints at the purpose of the attestation authority.
     * 
     */
    private final HintResponse hint;

    @OutputCustomType.Constructor
    private AttestationNoteResponse(@OutputCustomType.Parameter("hint") HintResponse hint) {
        this.hint = hint;
    }

    /**
     * Hint hints at the purpose of the attestation authority.
     * 
    */
    public HintResponse getHint() {
        return this.hint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestationNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HintResponse hint;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestationNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hint = defaults.hint;
        }

        public Builder hint(HintResponse hint) {
            this.hint = Objects.requireNonNull(hint);
            return this;
        }
        public AttestationNoteResponse build() {
            return new AttestationNoteResponse(hint);
        }
    }
}
