// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dns_v1beta2.enums.DnsKeySpecAlgorithm;
import com.pulumi.googlenative.dns_v1beta2.enums.DnsKeySpecKeyType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameters for DnsKey key generation. Used for generating initial keys for a new ManagedZone and as default when adding a new DnsKey.
 * 
 */
public final class DnsKeySpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final DnsKeySpecArgs Empty = new DnsKeySpecArgs();

    /**
     * String mnemonic specifying the DNSSEC algorithm of this key.
     * 
     */
    @Import(name="algorithm")
    private @Nullable Output<DnsKeySpecAlgorithm> algorithm;

    public Optional<Output<DnsKeySpecAlgorithm>> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }

    /**
     * Length of the keys in bits.
     * 
     */
    @Import(name="keyLength")
    private @Nullable Output<Integer> keyLength;

    public Optional<Output<Integer>> keyLength() {
        return Optional.ofNullable(this.keyLength);
    }

    /**
     * Specifies whether this is a key signing key (KSK) or a zone signing key (ZSK). Key signing keys have the Secure Entry Point flag set and, when active, are only used to sign resource record sets of type DNSKEY. Zone signing keys do not have the Secure Entry Point flag set and are used to sign all other types of resource record sets.
     * 
     */
    @Import(name="keyType")
    private @Nullable Output<DnsKeySpecKeyType> keyType;

    public Optional<Output<DnsKeySpecKeyType>> keyType() {
        return Optional.ofNullable(this.keyType);
    }

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    private DnsKeySpecArgs() {}

    private DnsKeySpecArgs(DnsKeySpecArgs $) {
        this.algorithm = $.algorithm;
        this.keyLength = $.keyLength;
        this.keyType = $.keyType;
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DnsKeySpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DnsKeySpecArgs $;

        public Builder() {
            $ = new DnsKeySpecArgs();
        }

        public Builder(DnsKeySpecArgs defaults) {
            $ = new DnsKeySpecArgs(Objects.requireNonNull(defaults));
        }

        public Builder algorithm(@Nullable Output<DnsKeySpecAlgorithm> algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        public Builder algorithm(DnsKeySpecAlgorithm algorithm) {
            return algorithm(Output.of(algorithm));
        }

        public Builder keyLength(@Nullable Output<Integer> keyLength) {
            $.keyLength = keyLength;
            return this;
        }

        public Builder keyLength(Integer keyLength) {
            return keyLength(Output.of(keyLength));
        }

        public Builder keyType(@Nullable Output<DnsKeySpecKeyType> keyType) {
            $.keyType = keyType;
            return this;
        }

        public Builder keyType(DnsKeySpecKeyType keyType) {
            return keyType(Output.of(keyType));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public DnsKeySpecArgs build() {
            return $;
        }
    }

}
