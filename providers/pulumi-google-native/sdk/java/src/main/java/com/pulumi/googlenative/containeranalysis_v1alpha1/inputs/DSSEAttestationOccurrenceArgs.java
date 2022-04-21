// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.EnvelopeArgs;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.InTotoStatementArgs;
import java.util.Objects;
import java.util.Optional;
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
    private @Nullable Output<EnvelopeArgs> envelope;

    public Optional<Output<EnvelopeArgs>> envelope() {
        return Optional.ofNullable(this.envelope);
    }

    @Import(name="statement")
    private @Nullable Output<InTotoStatementArgs> statement;

    public Optional<Output<InTotoStatementArgs>> statement() {
        return Optional.ofNullable(this.statement);
    }

    private DSSEAttestationOccurrenceArgs() {}

    private DSSEAttestationOccurrenceArgs(DSSEAttestationOccurrenceArgs $) {
        this.envelope = $.envelope;
        this.statement = $.statement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DSSEAttestationOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DSSEAttestationOccurrenceArgs $;

        public Builder() {
            $ = new DSSEAttestationOccurrenceArgs();
        }

        public Builder(DSSEAttestationOccurrenceArgs defaults) {
            $ = new DSSEAttestationOccurrenceArgs(Objects.requireNonNull(defaults));
        }

        public Builder envelope(@Nullable Output<EnvelopeArgs> envelope) {
            $.envelope = envelope;
            return this;
        }

        public Builder envelope(EnvelopeArgs envelope) {
            return envelope(Output.of(envelope));
        }

        public Builder statement(@Nullable Output<InTotoStatementArgs> statement) {
            $.statement = statement;
            return this;
        }

        public Builder statement(InTotoStatementArgs statement) {
            return statement(Output.of(statement));
        }

        public DSSEAttestationOccurrenceArgs build() {
            return $;
        }
    }

}
