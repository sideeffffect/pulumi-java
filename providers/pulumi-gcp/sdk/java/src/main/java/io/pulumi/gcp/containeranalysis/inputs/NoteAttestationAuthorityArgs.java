// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.containeranalysis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityHintArgs;
import java.util.Objects;


public final class NoteAttestationAuthorityArgs extends io.pulumi.resources.ResourceArgs {

    public static final NoteAttestationAuthorityArgs Empty = new NoteAttestationAuthorityArgs();

    /**
     * This submessage provides human-readable hints about the purpose of
     * the AttestationAuthority. Because the name of a Note acts as its
     * resource reference, it is important to disambiguate the canonical
     * name of the Note (which might be a UUID for security purposes)
     * from "readable" names more suitable for debug output. Note that
     * these hints should NOT be used to look up AttestationAuthorities
     * in security sensitive contexts, such as when looking up
     * Attestations to verify.
     * Structure is documented below.
     * 
     */
    @InputImport(name="hint", required=true)
      private final Input<NoteAttestationAuthorityHintArgs> hint;

    public Input<NoteAttestationAuthorityHintArgs> getHint() {
        return this.hint;
    }

    public NoteAttestationAuthorityArgs(Input<NoteAttestationAuthorityHintArgs> hint) {
        this.hint = Objects.requireNonNull(hint, "expected parameter 'hint' to be non-null");
    }

    private NoteAttestationAuthorityArgs() {
        this.hint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NoteAttestationAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<NoteAttestationAuthorityHintArgs> hint;

        public Builder() {
    	      // Empty
        }

        public Builder(NoteAttestationAuthorityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hint = defaults.hint;
        }

        public Builder hint(Input<NoteAttestationAuthorityHintArgs> hint) {
            this.hint = Objects.requireNonNull(hint);
            return this;
        }

        public Builder hint(NoteAttestationAuthorityHintArgs hint) {
            this.hint = Input.of(Objects.requireNonNull(hint));
            return this;
        }
        public NoteAttestationAuthorityArgs build() {
            return new NoteAttestationAuthorityArgs(hint);
        }
    }
}
