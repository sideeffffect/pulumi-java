// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.inputs;

import com.pulumi.awsnative.mediapackage.inputs.OriginEndpointSpekeKeyProviderArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A Common Media Application Format (CMAF) encryption configuration.
 * 
 */
public final class OriginEndpointCmafEncryptionArgs extends ResourceArgs {

    public static final OriginEndpointCmafEncryptionArgs Empty = new OriginEndpointCmafEncryptionArgs();

    /**
     * An optional 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the key for encrypting blocks. If you don&#39;t specify a value, then MediaPackage creates the constant initialization vector (IV).
     * 
     */
    @Import(name="constantInitializationVector")
    private @Nullable Output<String> constantInitializationVector;

    /**
     * @return An optional 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the key for encrypting blocks. If you don&#39;t specify a value, then MediaPackage creates the constant initialization vector (IV).
     * 
     */
    public Optional<Output<String>> constantInitializationVector() {
        return Optional.ofNullable(this.constantInitializationVector);
    }

    /**
     * Time (in seconds) between each encryption key rotation.
     * 
     */
    @Import(name="keyRotationIntervalSeconds")
    private @Nullable Output<Integer> keyRotationIntervalSeconds;

    /**
     * @return Time (in seconds) between each encryption key rotation.
     * 
     */
    public Optional<Output<Integer>> keyRotationIntervalSeconds() {
        return Optional.ofNullable(this.keyRotationIntervalSeconds);
    }

    @Import(name="spekeKeyProvider", required=true)
    private Output<OriginEndpointSpekeKeyProviderArgs> spekeKeyProvider;

    public Output<OriginEndpointSpekeKeyProviderArgs> spekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    private OriginEndpointCmafEncryptionArgs() {}

    private OriginEndpointCmafEncryptionArgs(OriginEndpointCmafEncryptionArgs $) {
        this.constantInitializationVector = $.constantInitializationVector;
        this.keyRotationIntervalSeconds = $.keyRotationIntervalSeconds;
        this.spekeKeyProvider = $.spekeKeyProvider;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OriginEndpointCmafEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OriginEndpointCmafEncryptionArgs $;

        public Builder() {
            $ = new OriginEndpointCmafEncryptionArgs();
        }

        public Builder(OriginEndpointCmafEncryptionArgs defaults) {
            $ = new OriginEndpointCmafEncryptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param constantInitializationVector An optional 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the key for encrypting blocks. If you don&#39;t specify a value, then MediaPackage creates the constant initialization vector (IV).
         * 
         * @return builder
         * 
         */
        public Builder constantInitializationVector(@Nullable Output<String> constantInitializationVector) {
            $.constantInitializationVector = constantInitializationVector;
            return this;
        }

        /**
         * @param constantInitializationVector An optional 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the key for encrypting blocks. If you don&#39;t specify a value, then MediaPackage creates the constant initialization vector (IV).
         * 
         * @return builder
         * 
         */
        public Builder constantInitializationVector(String constantInitializationVector) {
            return constantInitializationVector(Output.of(constantInitializationVector));
        }

        /**
         * @param keyRotationIntervalSeconds Time (in seconds) between each encryption key rotation.
         * 
         * @return builder
         * 
         */
        public Builder keyRotationIntervalSeconds(@Nullable Output<Integer> keyRotationIntervalSeconds) {
            $.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
            return this;
        }

        /**
         * @param keyRotationIntervalSeconds Time (in seconds) between each encryption key rotation.
         * 
         * @return builder
         * 
         */
        public Builder keyRotationIntervalSeconds(Integer keyRotationIntervalSeconds) {
            return keyRotationIntervalSeconds(Output.of(keyRotationIntervalSeconds));
        }

        public Builder spekeKeyProvider(Output<OriginEndpointSpekeKeyProviderArgs> spekeKeyProvider) {
            $.spekeKeyProvider = spekeKeyProvider;
            return this;
        }

        public Builder spekeKeyProvider(OriginEndpointSpekeKeyProviderArgs spekeKeyProvider) {
            return spekeKeyProvider(Output.of(spekeKeyProvider));
        }

        public OriginEndpointCmafEncryptionArgs build() {
            $.spekeKeyProvider = Objects.requireNonNull($.spekeKeyProvider, "expected parameter 'spekeKeyProvider' to be non-null");
            return $;
        }
    }

}
