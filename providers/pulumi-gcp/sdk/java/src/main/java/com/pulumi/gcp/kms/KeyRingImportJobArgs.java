// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class KeyRingImportJobArgs extends ResourceArgs {

    public static final KeyRingImportJobArgs Empty = new KeyRingImportJobArgs();

    /**
     * It must be unique within a KeyRing and match the regular expression [a-zA-Z0-9_-]{1,63}
     * 
     */
    @Import(name="importJobId", required=true)
    private Output<String> importJobId;

    /**
     * @return It must be unique within a KeyRing and match the regular expression [a-zA-Z0-9_-]{1,63}
     * 
     */
    public Output<String> importJobId() {
        return this.importJobId;
    }

    /**
     * The wrapping method to be used for incoming key material.
     * Possible values are `RSA_OAEP_3072_SHA1_AES_256` and `RSA_OAEP_4096_SHA1_AES_256`.
     * 
     */
    @Import(name="importMethod", required=true)
    private Output<String> importMethod;

    /**
     * @return The wrapping method to be used for incoming key material.
     * Possible values are `RSA_OAEP_3072_SHA1_AES_256` and `RSA_OAEP_4096_SHA1_AES_256`.
     * 
     */
    public Output<String> importMethod() {
        return this.importMethod;
    }

    /**
     * The KeyRing that this import job belongs to.
     * Format: `&#39;projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}&#39;`.
     * 
     */
    @Import(name="keyRing", required=true)
    private Output<String> keyRing;

    /**
     * @return The KeyRing that this import job belongs to.
     * Format: `&#39;projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}&#39;`.
     * 
     */
    public Output<String> keyRing() {
        return this.keyRing;
    }

    /**
     * The protection level of the ImportJob. This must match the protectionLevel of the
     * versionTemplate on the CryptoKey you attempt to import into.
     * Possible values are `SOFTWARE`, `HSM`, and `EXTERNAL`.
     * 
     */
    @Import(name="protectionLevel", required=true)
    private Output<String> protectionLevel;

    /**
     * @return The protection level of the ImportJob. This must match the protectionLevel of the
     * versionTemplate on the CryptoKey you attempt to import into.
     * Possible values are `SOFTWARE`, `HSM`, and `EXTERNAL`.
     * 
     */
    public Output<String> protectionLevel() {
        return this.protectionLevel;
    }

    private KeyRingImportJobArgs() {}

    private KeyRingImportJobArgs(KeyRingImportJobArgs $) {
        this.importJobId = $.importJobId;
        this.importMethod = $.importMethod;
        this.keyRing = $.keyRing;
        this.protectionLevel = $.protectionLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyRingImportJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyRingImportJobArgs $;

        public Builder() {
            $ = new KeyRingImportJobArgs();
        }

        public Builder(KeyRingImportJobArgs defaults) {
            $ = new KeyRingImportJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param importJobId It must be unique within a KeyRing and match the regular expression [a-zA-Z0-9_-]{1,63}
         * 
         * @return builder
         * 
         */
        public Builder importJobId(Output<String> importJobId) {
            $.importJobId = importJobId;
            return this;
        }

        /**
         * @param importJobId It must be unique within a KeyRing and match the regular expression [a-zA-Z0-9_-]{1,63}
         * 
         * @return builder
         * 
         */
        public Builder importJobId(String importJobId) {
            return importJobId(Output.of(importJobId));
        }

        /**
         * @param importMethod The wrapping method to be used for incoming key material.
         * Possible values are `RSA_OAEP_3072_SHA1_AES_256` and `RSA_OAEP_4096_SHA1_AES_256`.
         * 
         * @return builder
         * 
         */
        public Builder importMethod(Output<String> importMethod) {
            $.importMethod = importMethod;
            return this;
        }

        /**
         * @param importMethod The wrapping method to be used for incoming key material.
         * Possible values are `RSA_OAEP_3072_SHA1_AES_256` and `RSA_OAEP_4096_SHA1_AES_256`.
         * 
         * @return builder
         * 
         */
        public Builder importMethod(String importMethod) {
            return importMethod(Output.of(importMethod));
        }

        /**
         * @param keyRing The KeyRing that this import job belongs to.
         * Format: `&#39;projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}&#39;`.
         * 
         * @return builder
         * 
         */
        public Builder keyRing(Output<String> keyRing) {
            $.keyRing = keyRing;
            return this;
        }

        /**
         * @param keyRing The KeyRing that this import job belongs to.
         * Format: `&#39;projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}&#39;`.
         * 
         * @return builder
         * 
         */
        public Builder keyRing(String keyRing) {
            return keyRing(Output.of(keyRing));
        }

        /**
         * @param protectionLevel The protection level of the ImportJob. This must match the protectionLevel of the
         * versionTemplate on the CryptoKey you attempt to import into.
         * Possible values are `SOFTWARE`, `HSM`, and `EXTERNAL`.
         * 
         * @return builder
         * 
         */
        public Builder protectionLevel(Output<String> protectionLevel) {
            $.protectionLevel = protectionLevel;
            return this;
        }

        /**
         * @param protectionLevel The protection level of the ImportJob. This must match the protectionLevel of the
         * versionTemplate on the CryptoKey you attempt to import into.
         * Possible values are `SOFTWARE`, `HSM`, and `EXTERNAL`.
         * 
         * @return builder
         * 
         */
        public Builder protectionLevel(String protectionLevel) {
            return protectionLevel(Output.of(protectionLevel));
        }

        public KeyRingImportJobArgs build() {
            $.importJobId = Objects.requireNonNull($.importJobId, "expected parameter 'importJobId' to be non-null");
            $.importMethod = Objects.requireNonNull($.importMethod, "expected parameter 'importMethod' to be non-null");
            $.keyRing = Objects.requireNonNull($.keyRing, "expected parameter 'keyRing' to be non-null");
            $.protectionLevel = Objects.requireNonNull($.protectionLevel, "expected parameter 'protectionLevel' to be non-null");
            return $;
        }
    }

}
