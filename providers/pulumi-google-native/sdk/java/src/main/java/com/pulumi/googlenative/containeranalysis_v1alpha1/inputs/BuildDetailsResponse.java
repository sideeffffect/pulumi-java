// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.BuildProvenanceResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.InTotoStatementResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Message encapsulating build provenance details.
 * 
 */
public final class BuildDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final BuildDetailsResponse Empty = new BuildDetailsResponse();

    /**
     * In-toto Statement representation as defined in spec. The intoto_statement can contain any type of provenance. The serialized payload of the statement can be stored and signed in the Occurrence&#39;s envelope.
     * 
     */
    @Import(name="intotoStatement", required=true)
    private InTotoStatementResponse intotoStatement;

    public InTotoStatementResponse intotoStatement() {
        return this.intotoStatement;
    }

    /**
     * The actual provenance
     * 
     */
    @Import(name="provenance", required=true)
    private BuildProvenanceResponse provenance;

    public BuildProvenanceResponse provenance() {
        return this.provenance;
    }

    /**
     * Serialized JSON representation of the provenance, used in generating the `BuildSignature` in the corresponding Result. After verifying the signature, `provenance_bytes` can be unmarshalled and compared to the provenance to confirm that it is unchanged. A base64-encoded string representation of the provenance bytes is used for the signature in order to interoperate with openssl which expects this format for signature verification. The serialized form is captured both to avoid ambiguity in how the provenance is marshalled to json as well to prevent incompatibilities with future changes.
     * 
     */
    @Import(name="provenanceBytes", required=true)
    private String provenanceBytes;

    public String provenanceBytes() {
        return this.provenanceBytes;
    }

    private BuildDetailsResponse() {}

    private BuildDetailsResponse(BuildDetailsResponse $) {
        this.intotoStatement = $.intotoStatement;
        this.provenance = $.provenance;
        this.provenanceBytes = $.provenanceBytes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BuildDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuildDetailsResponse $;

        public Builder() {
            $ = new BuildDetailsResponse();
        }

        public Builder(BuildDetailsResponse defaults) {
            $ = new BuildDetailsResponse(Objects.requireNonNull(defaults));
        }

        public Builder intotoStatement(InTotoStatementResponse intotoStatement) {
            $.intotoStatement = intotoStatement;
            return this;
        }

        public Builder provenance(BuildProvenanceResponse provenance) {
            $.provenance = provenance;
            return this;
        }

        public Builder provenanceBytes(String provenanceBytes) {
            $.provenanceBytes = provenanceBytes;
            return this;
        }

        public BuildDetailsResponse build() {
            $.intotoStatement = Objects.requireNonNull($.intotoStatement, "expected parameter 'intotoStatement' to be non-null");
            $.provenance = Objects.requireNonNull($.provenance, "expected parameter 'provenance' to be non-null");
            $.provenanceBytes = Objects.requireNonNull($.provenanceBytes, "expected parameter 'provenanceBytes' to be non-null");
            return $;
        }
    }

}
