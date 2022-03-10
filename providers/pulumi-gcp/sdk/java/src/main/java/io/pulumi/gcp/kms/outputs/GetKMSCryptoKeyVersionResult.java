// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.kms.outputs.GetKMSCryptoKeyVersionPublicKey;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetKMSCryptoKeyVersionResult {
    /**
     * The CryptoKeyVersionAlgorithm that this CryptoKeyVersion supports.
     * 
     */
    private final String algorithm;
    private final String cryptoKey;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The resource name for this CryptoKeyVersion in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*{@literal /}cryptoKeyVersions/*`
     * 
     */
    private final String name;
    /**
     * The ProtectionLevel describing how crypto operations are performed with this CryptoKeyVersion. See the [protection_level reference](https://cloud.google.com/kms/docs/reference/rest/v1/ProtectionLevel) for possible outputs.
     * 
     */
    private final String protectionLevel;
    /**
     * If the enclosing CryptoKey has purpose `ASYMMETRIC_SIGN` or `ASYMMETRIC_DECRYPT`, this block contains details about the public key associated to this CryptoKeyVersion. Structure is documented below.
     * 
     */
    private final List<GetKMSCryptoKeyVersionPublicKey> publicKeys;
    /**
     * The current state of the CryptoKeyVersion. See the [state reference](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys.cryptoKeyVersions#CryptoKeyVersion.CryptoKeyVersionState) for possible outputs.
     * 
     */
    private final String state;
    private final @Nullable Integer version;

    @OutputCustomType.Constructor
    private GetKMSCryptoKeyVersionResult(
        @OutputCustomType.Parameter("algorithm") String algorithm,
        @OutputCustomType.Parameter("cryptoKey") String cryptoKey,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("protectionLevel") String protectionLevel,
        @OutputCustomType.Parameter("publicKeys") List<GetKMSCryptoKeyVersionPublicKey> publicKeys,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("version") @Nullable Integer version) {
        this.algorithm = algorithm;
        this.cryptoKey = cryptoKey;
        this.id = id;
        this.name = name;
        this.protectionLevel = protectionLevel;
        this.publicKeys = publicKeys;
        this.state = state;
        this.version = version;
    }

    /**
     * The CryptoKeyVersionAlgorithm that this CryptoKeyVersion supports.
     * 
    */
    public String getAlgorithm() {
        return this.algorithm;
    }
    public String getCryptoKey() {
        return this.cryptoKey;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The resource name for this CryptoKeyVersion in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*{@literal /}cryptoKeyVersions/*`
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The ProtectionLevel describing how crypto operations are performed with this CryptoKeyVersion. See the [protection_level reference](https://cloud.google.com/kms/docs/reference/rest/v1/ProtectionLevel) for possible outputs.
     * 
    */
    public String getProtectionLevel() {
        return this.protectionLevel;
    }
    /**
     * If the enclosing CryptoKey has purpose `ASYMMETRIC_SIGN` or `ASYMMETRIC_DECRYPT`, this block contains details about the public key associated to this CryptoKeyVersion. Structure is documented below.
     * 
    */
    public List<GetKMSCryptoKeyVersionPublicKey> getPublicKeys() {
        return this.publicKeys;
    }
    /**
     * The current state of the CryptoKeyVersion. See the [state reference](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys.cryptoKeyVersions#CryptoKeyVersion.CryptoKeyVersionState) for possible outputs.
     * 
    */
    public String getState() {
        return this.state;
    }
    public Optional<Integer> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKMSCryptoKeyVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private String cryptoKey;
        private String id;
        private String name;
        private String protectionLevel;
        private List<GetKMSCryptoKeyVersionPublicKey> publicKeys;
        private String state;
        private @Nullable Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKMSCryptoKeyVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.cryptoKey = defaults.cryptoKey;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.protectionLevel = defaults.protectionLevel;
    	      this.publicKeys = defaults.publicKeys;
    	      this.state = defaults.state;
    	      this.version = defaults.version;
        }

        public Builder algorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder cryptoKey(String cryptoKey) {
            this.cryptoKey = Objects.requireNonNull(cryptoKey);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder protectionLevel(String protectionLevel) {
            this.protectionLevel = Objects.requireNonNull(protectionLevel);
            return this;
        }

        public Builder publicKeys(List<GetKMSCryptoKeyVersionPublicKey> publicKeys) {
            this.publicKeys = Objects.requireNonNull(publicKeys);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder version(@Nullable Integer version) {
            this.version = version;
            return this;
        }
        public GetKMSCryptoKeyVersionResult build() {
            return new GetKMSCryptoKeyVersionResult(algorithm, cryptoKey, id, name, protectionLevel, publicKeys, state, version);
        }
    }
}
