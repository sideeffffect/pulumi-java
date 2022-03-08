// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class KeyUsageOptionsResponse {
    /**
     * The key may be used to sign certificates.
     * 
     */
    private final Boolean certSign;
    /**
     * The key may be used for cryptographic commitments. Note that this may also be referred to as "non-repudiation".
     * 
     */
    private final Boolean contentCommitment;
    /**
     * The key may be used sign certificate revocation lists.
     * 
     */
    private final Boolean crlSign;
    /**
     * The key may be used to encipher data.
     * 
     */
    private final Boolean dataEncipherment;
    /**
     * The key may be used to decipher only.
     * 
     */
    private final Boolean decipherOnly;
    /**
     * The key may be used for digital signatures.
     * 
     */
    private final Boolean digitalSignature;
    /**
     * The key may be used to encipher only.
     * 
     */
    private final Boolean encipherOnly;
    /**
     * The key may be used in a key agreement protocol.
     * 
     */
    private final Boolean keyAgreement;
    /**
     * The key may be used to encipher other keys.
     * 
     */
    private final Boolean keyEncipherment;

    @OutputCustomType.Constructor({"certSign","contentCommitment","crlSign","dataEncipherment","decipherOnly","digitalSignature","encipherOnly","keyAgreement","keyEncipherment"})
    private KeyUsageOptionsResponse(
        Boolean certSign,
        Boolean contentCommitment,
        Boolean crlSign,
        Boolean dataEncipherment,
        Boolean decipherOnly,
        Boolean digitalSignature,
        Boolean encipherOnly,
        Boolean keyAgreement,
        Boolean keyEncipherment) {
        this.certSign = certSign;
        this.contentCommitment = contentCommitment;
        this.crlSign = crlSign;
        this.dataEncipherment = dataEncipherment;
        this.decipherOnly = decipherOnly;
        this.digitalSignature = digitalSignature;
        this.encipherOnly = encipherOnly;
        this.keyAgreement = keyAgreement;
        this.keyEncipherment = keyEncipherment;
    }

    /**
     * The key may be used to sign certificates.
     * 
    */
    public Boolean getCertSign() {
        return this.certSign;
    }
    /**
     * The key may be used for cryptographic commitments. Note that this may also be referred to as "non-repudiation".
     * 
    */
    public Boolean getContentCommitment() {
        return this.contentCommitment;
    }
    /**
     * The key may be used sign certificate revocation lists.
     * 
    */
    public Boolean getCrlSign() {
        return this.crlSign;
    }
    /**
     * The key may be used to encipher data.
     * 
    */
    public Boolean getDataEncipherment() {
        return this.dataEncipherment;
    }
    /**
     * The key may be used to decipher only.
     * 
    */
    public Boolean getDecipherOnly() {
        return this.decipherOnly;
    }
    /**
     * The key may be used for digital signatures.
     * 
    */
    public Boolean getDigitalSignature() {
        return this.digitalSignature;
    }
    /**
     * The key may be used to encipher only.
     * 
    */
    public Boolean getEncipherOnly() {
        return this.encipherOnly;
    }
    /**
     * The key may be used in a key agreement protocol.
     * 
    */
    public Boolean getKeyAgreement() {
        return this.keyAgreement;
    }
    /**
     * The key may be used to encipher other keys.
     * 
    */
    public Boolean getKeyEncipherment() {
        return this.keyEncipherment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyUsageOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean certSign;
        private Boolean contentCommitment;
        private Boolean crlSign;
        private Boolean dataEncipherment;
        private Boolean decipherOnly;
        private Boolean digitalSignature;
        private Boolean encipherOnly;
        private Boolean keyAgreement;
        private Boolean keyEncipherment;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyUsageOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certSign = defaults.certSign;
    	      this.contentCommitment = defaults.contentCommitment;
    	      this.crlSign = defaults.crlSign;
    	      this.dataEncipherment = defaults.dataEncipherment;
    	      this.decipherOnly = defaults.decipherOnly;
    	      this.digitalSignature = defaults.digitalSignature;
    	      this.encipherOnly = defaults.encipherOnly;
    	      this.keyAgreement = defaults.keyAgreement;
    	      this.keyEncipherment = defaults.keyEncipherment;
        }

        public Builder setCertSign(Boolean certSign) {
            this.certSign = Objects.requireNonNull(certSign);
            return this;
        }

        public Builder setContentCommitment(Boolean contentCommitment) {
            this.contentCommitment = Objects.requireNonNull(contentCommitment);
            return this;
        }

        public Builder setCrlSign(Boolean crlSign) {
            this.crlSign = Objects.requireNonNull(crlSign);
            return this;
        }

        public Builder setDataEncipherment(Boolean dataEncipherment) {
            this.dataEncipherment = Objects.requireNonNull(dataEncipherment);
            return this;
        }

        public Builder setDecipherOnly(Boolean decipherOnly) {
            this.decipherOnly = Objects.requireNonNull(decipherOnly);
            return this;
        }

        public Builder setDigitalSignature(Boolean digitalSignature) {
            this.digitalSignature = Objects.requireNonNull(digitalSignature);
            return this;
        }

        public Builder setEncipherOnly(Boolean encipherOnly) {
            this.encipherOnly = Objects.requireNonNull(encipherOnly);
            return this;
        }

        public Builder setKeyAgreement(Boolean keyAgreement) {
            this.keyAgreement = Objects.requireNonNull(keyAgreement);
            return this;
        }

        public Builder setKeyEncipherment(Boolean keyEncipherment) {
            this.keyEncipherment = Objects.requireNonNull(keyEncipherment);
            return this;
        }
        public KeyUsageOptionsResponse build() {
            return new KeyUsageOptionsResponse(certSign, contentCommitment, crlSign, dataEncipherment, decipherOnly, digitalSignature, encipherOnly, keyAgreement, keyEncipherment);
        }
    }
}
