// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CertificateAuthorityEdiPartyName {
    private final String nameAssigner;
    private final String partyName;

    @OutputCustomType.Constructor({"nameAssigner","partyName"})
    private CertificateAuthorityEdiPartyName(
        String nameAssigner,
        String partyName) {
        this.nameAssigner = nameAssigner;
        this.partyName = partyName;
    }

    public String getNameAssigner() {
        return this.nameAssigner;
    }
    public String getPartyName() {
        return this.partyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityEdiPartyName defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nameAssigner;
        private String partyName;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityEdiPartyName defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nameAssigner = defaults.nameAssigner;
    	      this.partyName = defaults.partyName;
        }

        public Builder setNameAssigner(String nameAssigner) {
            this.nameAssigner = Objects.requireNonNull(nameAssigner);
            return this;
        }

        public Builder setPartyName(String partyName) {
            this.partyName = Objects.requireNonNull(partyName);
            return this;
        }
        public CertificateAuthorityEdiPartyName build() {
            return new CertificateAuthorityEdiPartyName(nameAssigner, partyName);
        }
    }
}
