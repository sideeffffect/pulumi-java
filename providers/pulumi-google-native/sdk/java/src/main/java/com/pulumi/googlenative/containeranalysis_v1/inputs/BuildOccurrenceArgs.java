// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1.inputs.BuildProvenanceArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.InTotoStatementArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of a build occurrence.
 * 
 */
public final class BuildOccurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final BuildOccurrenceArgs Empty = new BuildOccurrenceArgs();

    /**
     * In-toto Statement representation as defined in spec. The intoto_statement can contain any type of provenance. The serialized payload of the statement can be stored and signed in the Occurrence&#39;s envelope.
     * 
     */
    @Import(name="intotoStatement")
    private @Nullable Output<InTotoStatementArgs> intotoStatement;

    public Optional<Output<InTotoStatementArgs>> intotoStatement() {
        return Optional.ofNullable(this.intotoStatement);
    }

    /**
     * The actual provenance for the build.
     * 
     */
    @Import(name="provenance")
    private @Nullable Output<BuildProvenanceArgs> provenance;

    public Optional<Output<BuildProvenanceArgs>> provenance() {
        return Optional.ofNullable(this.provenance);
    }

    /**
     * Serialized JSON representation of the provenance, used in generating the build signature in the corresponding build note. After verifying the signature, `provenance_bytes` can be unmarshalled and compared to the provenance to confirm that it is unchanged. A base64-encoded string representation of the provenance bytes is used for the signature in order to interoperate with openssl which expects this format for signature verification. The serialized form is captured both to avoid ambiguity in how the provenance is marshalled to json as well to prevent incompatibilities with future changes.
     * 
     */
    @Import(name="provenanceBytes")
    private @Nullable Output<String> provenanceBytes;

    public Optional<Output<String>> provenanceBytes() {
        return Optional.ofNullable(this.provenanceBytes);
    }

    private BuildOccurrenceArgs() {}

    private BuildOccurrenceArgs(BuildOccurrenceArgs $) {
        this.intotoStatement = $.intotoStatement;
        this.provenance = $.provenance;
        this.provenanceBytes = $.provenanceBytes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BuildOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuildOccurrenceArgs $;

        public Builder() {
            $ = new BuildOccurrenceArgs();
        }

        public Builder(BuildOccurrenceArgs defaults) {
            $ = new BuildOccurrenceArgs(Objects.requireNonNull(defaults));
        }

        public Builder intotoStatement(@Nullable Output<InTotoStatementArgs> intotoStatement) {
            $.intotoStatement = intotoStatement;
            return this;
        }

        public Builder intotoStatement(InTotoStatementArgs intotoStatement) {
            return intotoStatement(Output.of(intotoStatement));
        }

        public Builder provenance(@Nullable Output<BuildProvenanceArgs> provenance) {
            $.provenance = provenance;
            return this;
        }

        public Builder provenance(BuildProvenanceArgs provenance) {
            return provenance(Output.of(provenance));
        }

        public Builder provenanceBytes(@Nullable Output<String> provenanceBytes) {
            $.provenanceBytes = provenanceBytes;
            return this;
        }

        public Builder provenanceBytes(String provenanceBytes) {
            return provenanceBytes(Output.of(provenanceBytes));
        }

        public BuildOccurrenceArgs build() {
            return $;
        }
    }

}
