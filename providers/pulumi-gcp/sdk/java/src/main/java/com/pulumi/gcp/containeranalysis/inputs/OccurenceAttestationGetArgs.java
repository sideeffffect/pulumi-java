// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.containeranalysis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationSignatureGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class OccurenceAttestationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final OccurenceAttestationGetArgs Empty = new OccurenceAttestationGetArgs();

    /**
     * The serialized payload that is verified by one or
     * more signatures. A base64-encoded string.
     * 
     */
    @Import(name="serializedPayload", required=true)
    private Output<String> serializedPayload;

    public Output<String> serializedPayload() {
        return this.serializedPayload;
    }

    /**
     * One or more signatures over serializedPayload.
     * Verifier implementations should consider this attestation
     * message verified if at least one signature verifies
     * serializedPayload. See Signature in common.proto for more
     * details on signature structure and verification.
     * Structure is documented below.
     * 
     */
    @Import(name="signatures", required=true)
    private Output<List<OccurenceAttestationSignatureGetArgs>> signatures;

    public Output<List<OccurenceAttestationSignatureGetArgs>> signatures() {
        return this.signatures;
    }

    private OccurenceAttestationGetArgs() {}

    private OccurenceAttestationGetArgs(OccurenceAttestationGetArgs $) {
        this.serializedPayload = $.serializedPayload;
        this.signatures = $.signatures;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OccurenceAttestationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OccurenceAttestationGetArgs $;

        public Builder() {
            $ = new OccurenceAttestationGetArgs();
        }

        public Builder(OccurenceAttestationGetArgs defaults) {
            $ = new OccurenceAttestationGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder serializedPayload(Output<String> serializedPayload) {
            $.serializedPayload = serializedPayload;
            return this;
        }

        public Builder serializedPayload(String serializedPayload) {
            return serializedPayload(Output.of(serializedPayload));
        }

        public Builder signatures(Output<List<OccurenceAttestationSignatureGetArgs>> signatures) {
            $.signatures = signatures;
            return this;
        }

        public Builder signatures(List<OccurenceAttestationSignatureGetArgs> signatures) {
            return signatures(Output.of(signatures));
        }

        public Builder signatures(OccurenceAttestationSignatureGetArgs... signatures) {
            return signatures(List.of(signatures));
        }

        public OccurenceAttestationGetArgs build() {
            $.serializedPayload = Objects.requireNonNull($.serializedPayload, "expected parameter 'serializedPayload' to be non-null");
            $.signatures = Objects.requireNonNull($.signatures, "expected parameter 'signatures' to be non-null");
            return $;
        }
    }

}
