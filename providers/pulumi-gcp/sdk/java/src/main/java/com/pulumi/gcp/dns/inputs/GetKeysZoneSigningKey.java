// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dns.inputs.GetKeysZoneSigningKeyDigest;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetKeysZoneSigningKey extends com.pulumi.resources.InvokeArgs {

    public static final GetKeysZoneSigningKey Empty = new GetKeysZoneSigningKey();

    /**
     * String mnemonic specifying the DNSSEC algorithm of this key. Immutable after creation time. Possible values are `ecdsap256sha256`, `ecdsap384sha384`, `rsasha1`, `rsasha256`, and `rsasha512`.
     * 
     */
    @Import(name="algorithm", required=true)
    private String algorithm;

    public String algorithm() {
        return this.algorithm;
    }

    /**
     * The time that this resource was created in the control plane. This is in RFC3339 text format.
     * 
     */
    @Import(name="creationTime", required=true)
    private String creationTime;

    public String creationTime() {
        return this.creationTime;
    }

    /**
     * A mutable string of at most 1024 characters associated with this resource for the user&#39;s convenience.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    public String description() {
        return this.description;
    }

    /**
     * A list of cryptographic hashes of the DNSKEY resource record associated with this DnsKey. These digests are needed to construct a DS record that points at this DNS key. Each contains:
     * 
     */
    @Import(name="digests", required=true)
    private List<GetKeysZoneSigningKeyDigest> digests;

    public List<GetKeysZoneSigningKeyDigest> digests() {
        return this.digests;
    }

    /**
     * Unique identifier for the resource; defined by the server.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    /**
     * Active keys will be used to sign subsequent changes to the ManagedZone. Inactive keys will still be present as DNSKEY Resource Records for the use of resolvers validating existing signatures.
     * 
     */
    @Import(name="isActive", required=true)
    private Boolean isActive;

    public Boolean isActive() {
        return this.isActive;
    }

    /**
     * Length of the key in bits. Specified at creation time then immutable.
     * 
     */
    @Import(name="keyLength", required=true)
    private Integer keyLength;

    public Integer keyLength() {
        return this.keyLength;
    }

    /**
     * The key tag is a non-cryptographic hash of the a DNSKEY resource record associated with this DnsKey. The key tag can be used to identify a DNSKEY more quickly (but it is not a unique identifier). In particular, the key tag is used in a parent zone&#39;s DS record to point at the DNSKEY in this child ManagedZone. The key tag is a number in the range [0, 65535] and the algorithm to calculate it is specified in RFC4034 Appendix B.
     * 
     */
    @Import(name="keyTag", required=true)
    private Integer keyTag;

    public Integer keyTag() {
        return this.keyTag;
    }

    /**
     * Base64 encoded public half of this key.
     * 
     */
    @Import(name="publicKey", required=true)
    private String publicKey;

    public String publicKey() {
        return this.publicKey;
    }

    private GetKeysZoneSigningKey() {}

    private GetKeysZoneSigningKey(GetKeysZoneSigningKey $) {
        this.algorithm = $.algorithm;
        this.creationTime = $.creationTime;
        this.description = $.description;
        this.digests = $.digests;
        this.id = $.id;
        this.isActive = $.isActive;
        this.keyLength = $.keyLength;
        this.keyTag = $.keyTag;
        this.publicKey = $.publicKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeysZoneSigningKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeysZoneSigningKey $;

        public Builder() {
            $ = new GetKeysZoneSigningKey();
        }

        public Builder(GetKeysZoneSigningKey defaults) {
            $ = new GetKeysZoneSigningKey(Objects.requireNonNull(defaults));
        }

        public Builder algorithm(String algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        public Builder creationTime(String creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        public Builder description(String description) {
            $.description = description;
            return this;
        }

        public Builder digests(List<GetKeysZoneSigningKeyDigest> digests) {
            $.digests = digests;
            return this;
        }

        public Builder digests(GetKeysZoneSigningKeyDigest... digests) {
            return digests(List.of(digests));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder isActive(Boolean isActive) {
            $.isActive = isActive;
            return this;
        }

        public Builder keyLength(Integer keyLength) {
            $.keyLength = keyLength;
            return this;
        }

        public Builder keyTag(Integer keyTag) {
            $.keyTag = keyTag;
            return this;
        }

        public Builder publicKey(String publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        public GetKeysZoneSigningKey build() {
            $.algorithm = Objects.requireNonNull($.algorithm, "expected parameter 'algorithm' to be non-null");
            $.creationTime = Objects.requireNonNull($.creationTime, "expected parameter 'creationTime' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.digests = Objects.requireNonNull($.digests, "expected parameter 'digests' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.isActive = Objects.requireNonNull($.isActive, "expected parameter 'isActive' to be non-null");
            $.keyLength = Objects.requireNonNull($.keyLength, "expected parameter 'keyLength' to be non-null");
            $.keyTag = Objects.requireNonNull($.keyTag, "expected parameter 'keyTag' to be non-null");
            $.publicKey = Objects.requireNonNull($.publicKey, "expected parameter 'publicKey' to be non-null");
            return $;
        }
    }

}
