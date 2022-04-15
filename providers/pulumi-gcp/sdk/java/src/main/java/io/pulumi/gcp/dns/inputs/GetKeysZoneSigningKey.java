// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dns.inputs.GetKeysZoneSigningKeyDigest;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetKeysZoneSigningKey extends io.pulumi.resources.InvokeArgs {

    public static final GetKeysZoneSigningKey Empty = new GetKeysZoneSigningKey();

    /**
     * String mnemonic specifying the DNSSEC algorithm of this key. Immutable after creation time. Possible values are `ecdsap256sha256`, `ecdsap384sha384`, `rsasha1`, `rsasha256`, and `rsasha512`.
     * 
     */
    @Import(name="algorithm", required=true)
      private final String algorithm;

    public String algorithm() {
        return this.algorithm;
    }

    /**
     * The time that this resource was created in the control plane. This is in RFC3339 text format.
     * 
     */
    @Import(name="creationTime", required=true)
      private final String creationTime;

    public String creationTime() {
        return this.creationTime;
    }

    /**
     * A mutable string of at most 1024 characters associated with this resource for the user's convenience.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    /**
     * A list of cryptographic hashes of the DNSKEY resource record associated with this DnsKey. These digests are needed to construct a DS record that points at this DNS key. Each contains:
     * 
     */
    @Import(name="digests", required=true)
      private final List<GetKeysZoneSigningKeyDigest> digests;

    public List<GetKeysZoneSigningKeyDigest> digests() {
        return this.digests;
    }

    /**
     * Unique identifier for the resource; defined by the server.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * Active keys will be used to sign subsequent changes to the ManagedZone. Inactive keys will still be present as DNSKEY Resource Records for the use of resolvers validating existing signatures.
     * 
     */
    @Import(name="isActive", required=true)
      private final Boolean isActive;

    public Boolean isActive() {
        return this.isActive;
    }

    /**
     * Length of the key in bits. Specified at creation time then immutable.
     * 
     */
    @Import(name="keyLength", required=true)
      private final Integer keyLength;

    public Integer keyLength() {
        return this.keyLength;
    }

    /**
     * The key tag is a non-cryptographic hash of the a DNSKEY resource record associated with this DnsKey. The key tag can be used to identify a DNSKEY more quickly (but it is not a unique identifier). In particular, the key tag is used in a parent zone's DS record to point at the DNSKEY in this child ManagedZone. The key tag is a number in the range [0, 65535] and the algorithm to calculate it is specified in RFC4034 Appendix B.
     * 
     */
    @Import(name="keyTag", required=true)
      private final Integer keyTag;

    public Integer keyTag() {
        return this.keyTag;
    }

    /**
     * Base64 encoded public half of this key.
     * 
     */
    @Import(name="publicKey", required=true)
      private final String publicKey;

    public String publicKey() {
        return this.publicKey;
    }

    public GetKeysZoneSigningKey(
        String algorithm,
        String creationTime,
        String description,
        List<GetKeysZoneSigningKeyDigest> digests,
        String id,
        Boolean isActive,
        Integer keyLength,
        Integer keyTag,
        String publicKey) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.creationTime = Objects.requireNonNull(creationTime, "expected parameter 'creationTime' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.digests = Objects.requireNonNull(digests, "expected parameter 'digests' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.isActive = Objects.requireNonNull(isActive, "expected parameter 'isActive' to be non-null");
        this.keyLength = Objects.requireNonNull(keyLength, "expected parameter 'keyLength' to be non-null");
        this.keyTag = Objects.requireNonNull(keyTag, "expected parameter 'keyTag' to be non-null");
        this.publicKey = Objects.requireNonNull(publicKey, "expected parameter 'publicKey' to be non-null");
    }

    private GetKeysZoneSigningKey() {
        this.algorithm = null;
        this.creationTime = null;
        this.description = null;
        this.digests = List.of();
        this.id = null;
        this.isActive = null;
        this.keyLength = null;
        this.keyTag = null;
        this.publicKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeysZoneSigningKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private String creationTime;
        private String description;
        private List<GetKeysZoneSigningKeyDigest> digests;
        private String id;
        private Boolean isActive;
        private Integer keyLength;
        private Integer keyTag;
        private String publicKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeysZoneSigningKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.digests = defaults.digests;
    	      this.id = defaults.id;
    	      this.isActive = defaults.isActive;
    	      this.keyLength = defaults.keyLength;
    	      this.keyTag = defaults.keyTag;
    	      this.publicKey = defaults.publicKey;
        }

        public Builder algorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder digests(List<GetKeysZoneSigningKeyDigest> digests) {
            this.digests = Objects.requireNonNull(digests);
            return this;
        }
        public Builder digests(GetKeysZoneSigningKeyDigest... digests) {
            return digests(List.of(digests));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isActive(Boolean isActive) {
            this.isActive = Objects.requireNonNull(isActive);
            return this;
        }
        public Builder keyLength(Integer keyLength) {
            this.keyLength = Objects.requireNonNull(keyLength);
            return this;
        }
        public Builder keyTag(Integer keyTag) {
            this.keyTag = Objects.requireNonNull(keyTag);
            return this;
        }
        public Builder publicKey(String publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }        public GetKeysZoneSigningKey build() {
            return new GetKeysZoneSigningKey(algorithm, creationTime, description, digests, id, isActive, keyLength, keyTag, publicKey);
        }
    }
}
