// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2TransientCryptoKeyResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2UnwrappedCryptoKeyResponse;
import java.util.Objects;


/**
 * This is a data encryption key (DEK) (as opposed to a key encryption key (KEK) stored by Cloud Key Management Service (Cloud KMS). When using Cloud KMS to wrap or unwrap a DEK, be sure to set an appropriate IAM policy on the KEK to ensure an attacker cannot unwrap the DEK.
 * 
 */
public final class GooglePrivacyDlpV2CryptoKeyResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2CryptoKeyResponse Empty = new GooglePrivacyDlpV2CryptoKeyResponse();

    /**
     * Key wrapped using Cloud KMS
     * 
     */
    @Import(name="kmsWrapped", required=true)
      private final GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse kmsWrapped;

    public GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse kmsWrapped() {
        return this.kmsWrapped;
    }

    /**
     * Transient crypto key
     * 
     */
    @Import(name="transient", required=true)
      private final GooglePrivacyDlpV2TransientCryptoKeyResponse transient_;

    public GooglePrivacyDlpV2TransientCryptoKeyResponse transient_() {
        return this.transient_;
    }

    /**
     * Unwrapped crypto key
     * 
     */
    @Import(name="unwrapped", required=true)
      private final GooglePrivacyDlpV2UnwrappedCryptoKeyResponse unwrapped;

    public GooglePrivacyDlpV2UnwrappedCryptoKeyResponse unwrapped() {
        return this.unwrapped;
    }

    public GooglePrivacyDlpV2CryptoKeyResponse(
        GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse kmsWrapped,
        GooglePrivacyDlpV2TransientCryptoKeyResponse transient_,
        GooglePrivacyDlpV2UnwrappedCryptoKeyResponse unwrapped) {
        this.kmsWrapped = Objects.requireNonNull(kmsWrapped, "expected parameter 'kmsWrapped' to be non-null");
        this.transient_ = Objects.requireNonNull(transient_, "expected parameter 'transient_' to be non-null");
        this.unwrapped = Objects.requireNonNull(unwrapped, "expected parameter 'unwrapped' to be non-null");
    }

    private GooglePrivacyDlpV2CryptoKeyResponse() {
        this.kmsWrapped = null;
        this.transient_ = null;
        this.unwrapped = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CryptoKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse kmsWrapped;
        private GooglePrivacyDlpV2TransientCryptoKeyResponse transient_;
        private GooglePrivacyDlpV2UnwrappedCryptoKeyResponse unwrapped;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CryptoKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsWrapped = defaults.kmsWrapped;
    	      this.transient_ = defaults.transient_;
    	      this.unwrapped = defaults.unwrapped;
        }

        public Builder kmsWrapped(GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse kmsWrapped) {
            this.kmsWrapped = Objects.requireNonNull(kmsWrapped);
            return this;
        }
        public Builder transient_(GooglePrivacyDlpV2TransientCryptoKeyResponse transient_) {
            this.transient_ = Objects.requireNonNull(transient_);
            return this;
        }
        public Builder unwrapped(GooglePrivacyDlpV2UnwrappedCryptoKeyResponse unwrapped) {
            this.unwrapped = Objects.requireNonNull(unwrapped);
            return this;
        }        public GooglePrivacyDlpV2CryptoKeyResponse build() {
            return new GooglePrivacyDlpV2CryptoKeyResponse(kmsWrapped, transient_, unwrapped);
        }
    }
}
