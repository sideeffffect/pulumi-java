// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.containeranalysis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityHintGetArgs;
import java.util.Objects;


public final class NoteAttestationAuthorityGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final NoteAttestationAuthorityGetArgs Empty = new NoteAttestationAuthorityGetArgs();

    /**
     * This submessage provides human-readable hints about the purpose of
     * the AttestationAuthority. Because the name of a Note acts as its
     * resource reference, it is important to disambiguate the canonical
     * name of the Note (which might be a UUID for security purposes)
     * from &#34;readable&#34; names more suitable for debug output. Note that
     * these hints should NOT be used to look up AttestationAuthorities
     * in security sensitive contexts, such as when looking up
     * Attestations to verify.
     * Structure is documented below.
     * 
     */
    @Import(name="hint", required=true)
    private Output<NoteAttestationAuthorityHintGetArgs> hint;

    public Output<NoteAttestationAuthorityHintGetArgs> hint() {
        return this.hint;
    }

    private NoteAttestationAuthorityGetArgs() {}

    private NoteAttestationAuthorityGetArgs(NoteAttestationAuthorityGetArgs $) {
        this.hint = $.hint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NoteAttestationAuthorityGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NoteAttestationAuthorityGetArgs $;

        public Builder() {
            $ = new NoteAttestationAuthorityGetArgs();
        }

        public Builder(NoteAttestationAuthorityGetArgs defaults) {
            $ = new NoteAttestationAuthorityGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder hint(Output<NoteAttestationAuthorityHintGetArgs> hint) {
            $.hint = hint;
            return this;
        }

        public Builder hint(NoteAttestationAuthorityHintGetArgs hint) {
            return hint(Output.of(hint));
        }

        public NoteAttestationAuthorityGetArgs build() {
            $.hint = Objects.requireNonNull($.hint, "expected parameter 'hint' to be non-null");
            return $;
        }
    }

}
