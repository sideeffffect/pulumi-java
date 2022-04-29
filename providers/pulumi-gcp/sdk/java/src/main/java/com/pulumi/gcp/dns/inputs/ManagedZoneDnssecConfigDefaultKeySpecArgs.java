// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedZoneDnssecConfigDefaultKeySpecArgs extends ResourceArgs {

    public static final ManagedZoneDnssecConfigDefaultKeySpecArgs Empty = new ManagedZoneDnssecConfigDefaultKeySpecArgs();

    /**
     * String mnemonic specifying the DNSSEC algorithm of this key
     * Possible values are `ecdsap256sha256`, `ecdsap384sha384`, `rsasha1`, `rsasha256`, and `rsasha512`.
     * 
     */
    @Import(name="algorithm")
    private @Nullable Output<String> algorithm;

    /**
     * @return String mnemonic specifying the DNSSEC algorithm of this key
     * Possible values are `ecdsap256sha256`, `ecdsap384sha384`, `rsasha1`, `rsasha256`, and `rsasha512`.
     * 
     */
    public Optional<Output<String>> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }

    /**
     * Length of the keys in bits
     * 
     */
    @Import(name="keyLength")
    private @Nullable Output<Integer> keyLength;

    /**
     * @return Length of the keys in bits
     * 
     */
    public Optional<Output<Integer>> keyLength() {
        return Optional.ofNullable(this.keyLength);
    }

    /**
     * Specifies whether this is a key signing key (KSK) or a zone
     * signing key (ZSK). Key signing keys have the Secure Entry
     * Point flag set and, when active, will only be used to sign
     * resource record sets of type DNSKEY. Zone signing keys do
     * not have the Secure Entry Point flag set and will be used
     * to sign all other types of resource record sets.
     * Possible values are `keySigning` and `zoneSigning`.
     * 
     */
    @Import(name="keyType")
    private @Nullable Output<String> keyType;

    /**
     * @return Specifies whether this is a key signing key (KSK) or a zone
     * signing key (ZSK). Key signing keys have the Secure Entry
     * Point flag set and, when active, will only be used to sign
     * resource record sets of type DNSKEY. Zone signing keys do
     * not have the Secure Entry Point flag set and will be used
     * to sign all other types of resource record sets.
     * Possible values are `keySigning` and `zoneSigning`.
     * 
     */
    public Optional<Output<String>> keyType() {
        return Optional.ofNullable(this.keyType);
    }

    /**
     * Identifies what kind of resource this is
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Identifies what kind of resource this is
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    private ManagedZoneDnssecConfigDefaultKeySpecArgs() {}

    private ManagedZoneDnssecConfigDefaultKeySpecArgs(ManagedZoneDnssecConfigDefaultKeySpecArgs $) {
        this.algorithm = $.algorithm;
        this.keyLength = $.keyLength;
        this.keyType = $.keyType;
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedZoneDnssecConfigDefaultKeySpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZoneDnssecConfigDefaultKeySpecArgs $;

        public Builder() {
            $ = new ManagedZoneDnssecConfigDefaultKeySpecArgs();
        }

        public Builder(ManagedZoneDnssecConfigDefaultKeySpecArgs defaults) {
            $ = new ManagedZoneDnssecConfigDefaultKeySpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param algorithm String mnemonic specifying the DNSSEC algorithm of this key
         * Possible values are `ecdsap256sha256`, `ecdsap384sha384`, `rsasha1`, `rsasha256`, and `rsasha512`.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(@Nullable Output<String> algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        /**
         * @param algorithm String mnemonic specifying the DNSSEC algorithm of this key
         * Possible values are `ecdsap256sha256`, `ecdsap384sha384`, `rsasha1`, `rsasha256`, and `rsasha512`.
         * 
         * @return builder
         * 
         */
        public Builder algorithm(String algorithm) {
            return algorithm(Output.of(algorithm));
        }

        /**
         * @param keyLength Length of the keys in bits
         * 
         * @return builder
         * 
         */
        public Builder keyLength(@Nullable Output<Integer> keyLength) {
            $.keyLength = keyLength;
            return this;
        }

        /**
         * @param keyLength Length of the keys in bits
         * 
         * @return builder
         * 
         */
        public Builder keyLength(Integer keyLength) {
            return keyLength(Output.of(keyLength));
        }

        /**
         * @param keyType Specifies whether this is a key signing key (KSK) or a zone
         * signing key (ZSK). Key signing keys have the Secure Entry
         * Point flag set and, when active, will only be used to sign
         * resource record sets of type DNSKEY. Zone signing keys do
         * not have the Secure Entry Point flag set and will be used
         * to sign all other types of resource record sets.
         * Possible values are `keySigning` and `zoneSigning`.
         * 
         * @return builder
         * 
         */
        public Builder keyType(@Nullable Output<String> keyType) {
            $.keyType = keyType;
            return this;
        }

        /**
         * @param keyType Specifies whether this is a key signing key (KSK) or a zone
         * signing key (ZSK). Key signing keys have the Secure Entry
         * Point flag set and, when active, will only be used to sign
         * resource record sets of type DNSKEY. Zone signing keys do
         * not have the Secure Entry Point flag set and will be used
         * to sign all other types of resource record sets.
         * Possible values are `keySigning` and `zoneSigning`.
         * 
         * @return builder
         * 
         */
        public Builder keyType(String keyType) {
            return keyType(Output.of(keyType));
        }

        /**
         * @param kind Identifies what kind of resource this is
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Identifies what kind of resource this is
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public ManagedZoneDnssecConfigDefaultKeySpecArgs build() {
            return $;
        }
    }

}
