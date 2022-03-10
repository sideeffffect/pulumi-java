// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1beta1.enums.KeyVersionSpecAlgorithm;
import java.lang.String;
import java.util.Objects;


/**
 * A Cloud KMS key configuration that a CertificateAuthority will use.
 * 
 */
public final class KeyVersionSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVersionSpecArgs Empty = new KeyVersionSpecArgs();

    /**
     * The algorithm to use for creating a managed Cloud KMS key for a for a simplified experience. All managed keys will be have their ProtectionLevel as `HSM`.
     * 
     */
    @InputImport(name="algorithm", required=true)
      private final Input<KeyVersionSpecAlgorithm> algorithm;

    public Input<KeyVersionSpecAlgorithm> getAlgorithm() {
        return this.algorithm;
    }

    /**
     * The resource name for an existing Cloud KMS CryptoKeyVersion in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*{@literal /}cryptoKeyVersions/*`. This option enables full flexibility in the key's capabilities and properties.
     * 
     */
    @InputImport(name="cloudKmsKeyVersion", required=true)
      private final Input<String> cloudKmsKeyVersion;

    public Input<String> getCloudKmsKeyVersion() {
        return this.cloudKmsKeyVersion;
    }

    public KeyVersionSpecArgs(
        Input<KeyVersionSpecAlgorithm> algorithm,
        Input<String> cloudKmsKeyVersion) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.cloudKmsKeyVersion = Objects.requireNonNull(cloudKmsKeyVersion, "expected parameter 'cloudKmsKeyVersion' to be non-null");
    }

    private KeyVersionSpecArgs() {
        this.algorithm = Input.empty();
        this.cloudKmsKeyVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVersionSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<KeyVersionSpecAlgorithm> algorithm;
        private Input<String> cloudKmsKeyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVersionSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.cloudKmsKeyVersion = defaults.cloudKmsKeyVersion;
        }

        public Builder algorithm(Input<KeyVersionSpecAlgorithm> algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder algorithm(KeyVersionSpecAlgorithm algorithm) {
            this.algorithm = Input.of(Objects.requireNonNull(algorithm));
            return this;
        }

        public Builder cloudKmsKeyVersion(Input<String> cloudKmsKeyVersion) {
            this.cloudKmsKeyVersion = Objects.requireNonNull(cloudKmsKeyVersion);
            return this;
        }

        public Builder cloudKmsKeyVersion(String cloudKmsKeyVersion) {
            this.cloudKmsKeyVersion = Input.of(Objects.requireNonNull(cloudKmsKeyVersion));
            return this;
        }
        public KeyVersionSpecArgs build() {
            return new KeyVersionSpecArgs(algorithm, cloudKmsKeyVersion);
        }
    }
}
