// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.EnvelopeArgs;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.InTotoStatementArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An occurrence describing an attestation on a resource
 * 
 */
public final class DSSEAttestationOccurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DSSEAttestationOccurrenceArgs Empty = new DSSEAttestationOccurrenceArgs();

    /**
     * If doing something security critical, make sure to verify the signatures in this metadata.
     * 
     */
    @Import(name="envelope")
      private final @Nullable Output<EnvelopeArgs> envelope;

    public Output<EnvelopeArgs> envelope() {
        return this.envelope == null ? Codegen.empty() : this.envelope;
    }

    @Import(name="statement")
      private final @Nullable Output<InTotoStatementArgs> statement;

    public Output<InTotoStatementArgs> statement() {
        return this.statement == null ? Codegen.empty() : this.statement;
    }

    public DSSEAttestationOccurrenceArgs(
        @Nullable Output<EnvelopeArgs> envelope,
        @Nullable Output<InTotoStatementArgs> statement) {
        this.envelope = envelope;
        this.statement = statement;
    }

    private DSSEAttestationOccurrenceArgs() {
        this.envelope = Codegen.empty();
        this.statement = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DSSEAttestationOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EnvelopeArgs> envelope;
        private @Nullable Output<InTotoStatementArgs> statement;

        public Builder() {
    	      // Empty
        }

        public Builder(DSSEAttestationOccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.envelope = defaults.envelope;
    	      this.statement = defaults.statement;
        }

        public Builder envelope(@Nullable Output<EnvelopeArgs> envelope) {
            this.envelope = envelope;
            return this;
        }
        public Builder envelope(@Nullable EnvelopeArgs envelope) {
            this.envelope = Codegen.ofNullable(envelope);
            return this;
        }
        public Builder statement(@Nullable Output<InTotoStatementArgs> statement) {
            this.statement = statement;
            return this;
        }
        public Builder statement(@Nullable InTotoStatementArgs statement) {
            this.statement = Codegen.ofNullable(statement);
            return this;
        }        public DSSEAttestationOccurrenceArgs build() {
            return new DSSEAttestationOccurrenceArgs(envelope, statement);
        }
    }
}
