// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.inputs;

import com.pulumi.awsnative.mediapackage.enums.PackagingConfigurationHlsEncryptionEncryptionMethod;
import com.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationSpekeKeyProviderArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An HTTP Live Streaming (HLS) encryption configuration.
 * 
 */
public final class PackagingConfigurationHlsEncryptionArgs extends ResourceArgs {

    public static final PackagingConfigurationHlsEncryptionArgs Empty = new PackagingConfigurationHlsEncryptionArgs();

    /**
     * An HTTP Live Streaming (HLS) encryption configuration.
     * 
     */
    @Import(name="constantInitializationVector")
    private @Nullable Output<String> constantInitializationVector;

    /**
     * @return An HTTP Live Streaming (HLS) encryption configuration.
     * 
     */
    public Optional<Output<String>> constantInitializationVector() {
        return Optional.ofNullable(this.constantInitializationVector);
    }

    /**
     * The encryption method to use.
     * 
     */
    @Import(name="encryptionMethod")
    private @Nullable Output<PackagingConfigurationHlsEncryptionEncryptionMethod> encryptionMethod;

    /**
     * @return The encryption method to use.
     * 
     */
    public Optional<Output<PackagingConfigurationHlsEncryptionEncryptionMethod>> encryptionMethod() {
        return Optional.ofNullable(this.encryptionMethod);
    }

    @Import(name="spekeKeyProvider", required=true)
    private Output<PackagingConfigurationSpekeKeyProviderArgs> spekeKeyProvider;

    public Output<PackagingConfigurationSpekeKeyProviderArgs> spekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    private PackagingConfigurationHlsEncryptionArgs() {}

    private PackagingConfigurationHlsEncryptionArgs(PackagingConfigurationHlsEncryptionArgs $) {
        this.constantInitializationVector = $.constantInitializationVector;
        this.encryptionMethod = $.encryptionMethod;
        this.spekeKeyProvider = $.spekeKeyProvider;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PackagingConfigurationHlsEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PackagingConfigurationHlsEncryptionArgs $;

        public Builder() {
            $ = new PackagingConfigurationHlsEncryptionArgs();
        }

        public Builder(PackagingConfigurationHlsEncryptionArgs defaults) {
            $ = new PackagingConfigurationHlsEncryptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param constantInitializationVector An HTTP Live Streaming (HLS) encryption configuration.
         * 
         * @return builder
         * 
         */
        public Builder constantInitializationVector(@Nullable Output<String> constantInitializationVector) {
            $.constantInitializationVector = constantInitializationVector;
            return this;
        }

        /**
         * @param constantInitializationVector An HTTP Live Streaming (HLS) encryption configuration.
         * 
         * @return builder
         * 
         */
        public Builder constantInitializationVector(String constantInitializationVector) {
            return constantInitializationVector(Output.of(constantInitializationVector));
        }

        /**
         * @param encryptionMethod The encryption method to use.
         * 
         * @return builder
         * 
         */
        public Builder encryptionMethod(@Nullable Output<PackagingConfigurationHlsEncryptionEncryptionMethod> encryptionMethod) {
            $.encryptionMethod = encryptionMethod;
            return this;
        }

        /**
         * @param encryptionMethod The encryption method to use.
         * 
         * @return builder
         * 
         */
        public Builder encryptionMethod(PackagingConfigurationHlsEncryptionEncryptionMethod encryptionMethod) {
            return encryptionMethod(Output.of(encryptionMethod));
        }

        public Builder spekeKeyProvider(Output<PackagingConfigurationSpekeKeyProviderArgs> spekeKeyProvider) {
            $.spekeKeyProvider = spekeKeyProvider;
            return this;
        }

        public Builder spekeKeyProvider(PackagingConfigurationSpekeKeyProviderArgs spekeKeyProvider) {
            return spekeKeyProvider(Output.of(spekeKeyProvider));
        }

        public PackagingConfigurationHlsEncryptionArgs build() {
            $.spekeKeyProvider = Objects.requireNonNull($.spekeKeyProvider, "expected parameter 'spekeKeyProvider' to be non-null");
            return $;
        }
    }

}
