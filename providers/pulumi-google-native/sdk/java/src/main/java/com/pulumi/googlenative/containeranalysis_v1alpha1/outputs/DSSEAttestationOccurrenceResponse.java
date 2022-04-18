// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.EnvelopeResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.InTotoStatementResponse;
import java.util.Objects;

@CustomType
public final class DSSEAttestationOccurrenceResponse {
    /**
     * If doing something security critical, make sure to verify the signatures in this metadata.
     * 
     */
    private final EnvelopeResponse envelope;
    private final InTotoStatementResponse statement;

    @CustomType.Constructor
    private DSSEAttestationOccurrenceResponse(
        @CustomType.Parameter("envelope") EnvelopeResponse envelope,
        @CustomType.Parameter("statement") InTotoStatementResponse statement) {
        this.envelope = envelope;
        this.statement = statement;
    }

    /**
     * If doing something security critical, make sure to verify the signatures in this metadata.
     * 
    */
    public EnvelopeResponse envelope() {
        return this.envelope;
    }
    public InTotoStatementResponse statement() {
        return this.statement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DSSEAttestationOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvelopeResponse envelope;
        private InTotoStatementResponse statement;

        public Builder() {
    	      // Empty
        }

        public Builder(DSSEAttestationOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.envelope = defaults.envelope;
    	      this.statement = defaults.statement;
        }

        public Builder envelope(EnvelopeResponse envelope) {
            this.envelope = Objects.requireNonNull(envelope);
            return this;
        }
        public Builder statement(InTotoStatementResponse statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }        public DSSEAttestationOccurrenceResponse build() {
            return new DSSEAttestationOccurrenceResponse(envelope, statement);
        }
    }
}
