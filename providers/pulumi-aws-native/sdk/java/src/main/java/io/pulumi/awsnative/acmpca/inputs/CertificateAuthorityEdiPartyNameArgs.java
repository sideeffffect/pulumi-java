// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Structure that contains X.509 EdiPartyName information.
 * 
 */
public final class CertificateAuthorityEdiPartyNameArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityEdiPartyNameArgs Empty = new CertificateAuthorityEdiPartyNameArgs();

    @InputImport(name="nameAssigner", required=true)
      private final Input<String> nameAssigner;

    public Input<String> getNameAssigner() {
        return this.nameAssigner;
    }

    @InputImport(name="partyName", required=true)
      private final Input<String> partyName;

    public Input<String> getPartyName() {
        return this.partyName;
    }

    public CertificateAuthorityEdiPartyNameArgs(
        Input<String> nameAssigner,
        Input<String> partyName) {
        this.nameAssigner = Objects.requireNonNull(nameAssigner, "expected parameter 'nameAssigner' to be non-null");
        this.partyName = Objects.requireNonNull(partyName, "expected parameter 'partyName' to be non-null");
    }

    private CertificateAuthorityEdiPartyNameArgs() {
        this.nameAssigner = Input.empty();
        this.partyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityEdiPartyNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> nameAssigner;
        private Input<String> partyName;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityEdiPartyNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nameAssigner = defaults.nameAssigner;
    	      this.partyName = defaults.partyName;
        }

        public Builder nameAssigner(Input<String> nameAssigner) {
            this.nameAssigner = Objects.requireNonNull(nameAssigner);
            return this;
        }

        public Builder nameAssigner(String nameAssigner) {
            this.nameAssigner = Input.of(Objects.requireNonNull(nameAssigner));
            return this;
        }

        public Builder partyName(Input<String> partyName) {
            this.partyName = Objects.requireNonNull(partyName);
            return this;
        }

        public Builder partyName(String partyName) {
            this.partyName = Input.of(Objects.requireNonNull(partyName));
            return this;
        }
        public CertificateAuthorityEdiPartyNameArgs build() {
            return new CertificateAuthorityEdiPartyNameArgs(nameAssigner, partyName);
        }
    }
}
