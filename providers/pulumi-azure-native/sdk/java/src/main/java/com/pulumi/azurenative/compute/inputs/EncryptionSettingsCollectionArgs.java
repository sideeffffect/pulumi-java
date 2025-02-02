// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.EncryptionSettingsElementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Encryption settings for disk or snapshot
 * 
 */
public final class EncryptionSettingsCollectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EncryptionSettingsCollectionArgs Empty = new EncryptionSettingsCollectionArgs();

    /**
     * Set this flag to true and provide DiskEncryptionKey and optional KeyEncryptionKey to enable encryption. Set this flag to false and remove DiskEncryptionKey and KeyEncryptionKey to disable encryption. If EncryptionSettings is null in the request object, the existing settings remain unchanged.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Set this flag to true and provide DiskEncryptionKey and optional KeyEncryptionKey to enable encryption. Set this flag to false and remove DiskEncryptionKey and KeyEncryptionKey to disable encryption. If EncryptionSettings is null in the request object, the existing settings remain unchanged.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * A collection of encryption settings, one for each disk volume.
     * 
     */
    @Import(name="encryptionSettings")
    private @Nullable Output<List<EncryptionSettingsElementArgs>> encryptionSettings;

    /**
     * @return A collection of encryption settings, one for each disk volume.
     * 
     */
    public Optional<Output<List<EncryptionSettingsElementArgs>>> encryptionSettings() {
        return Optional.ofNullable(this.encryptionSettings);
    }

    /**
     * Describes what type of encryption is used for the disks. Once this field is set, it cannot be overwritten. &#39;1.0&#39; corresponds to Azure Disk Encryption with AAD app.&#39;1.1&#39; corresponds to Azure Disk Encryption.
     * 
     */
    @Import(name="encryptionSettingsVersion")
    private @Nullable Output<String> encryptionSettingsVersion;

    /**
     * @return Describes what type of encryption is used for the disks. Once this field is set, it cannot be overwritten. &#39;1.0&#39; corresponds to Azure Disk Encryption with AAD app.&#39;1.1&#39; corresponds to Azure Disk Encryption.
     * 
     */
    public Optional<Output<String>> encryptionSettingsVersion() {
        return Optional.ofNullable(this.encryptionSettingsVersion);
    }

    private EncryptionSettingsCollectionArgs() {}

    private EncryptionSettingsCollectionArgs(EncryptionSettingsCollectionArgs $) {
        this.enabled = $.enabled;
        this.encryptionSettings = $.encryptionSettings;
        this.encryptionSettingsVersion = $.encryptionSettingsVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionSettingsCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionSettingsCollectionArgs $;

        public Builder() {
            $ = new EncryptionSettingsCollectionArgs();
        }

        public Builder(EncryptionSettingsCollectionArgs defaults) {
            $ = new EncryptionSettingsCollectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Set this flag to true and provide DiskEncryptionKey and optional KeyEncryptionKey to enable encryption. Set this flag to false and remove DiskEncryptionKey and KeyEncryptionKey to disable encryption. If EncryptionSettings is null in the request object, the existing settings remain unchanged.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Set this flag to true and provide DiskEncryptionKey and optional KeyEncryptionKey to enable encryption. Set this flag to false and remove DiskEncryptionKey and KeyEncryptionKey to disable encryption. If EncryptionSettings is null in the request object, the existing settings remain unchanged.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param encryptionSettings A collection of encryption settings, one for each disk volume.
         * 
         * @return builder
         * 
         */
        public Builder encryptionSettings(@Nullable Output<List<EncryptionSettingsElementArgs>> encryptionSettings) {
            $.encryptionSettings = encryptionSettings;
            return this;
        }

        /**
         * @param encryptionSettings A collection of encryption settings, one for each disk volume.
         * 
         * @return builder
         * 
         */
        public Builder encryptionSettings(List<EncryptionSettingsElementArgs> encryptionSettings) {
            return encryptionSettings(Output.of(encryptionSettings));
        }

        /**
         * @param encryptionSettings A collection of encryption settings, one for each disk volume.
         * 
         * @return builder
         * 
         */
        public Builder encryptionSettings(EncryptionSettingsElementArgs... encryptionSettings) {
            return encryptionSettings(List.of(encryptionSettings));
        }

        /**
         * @param encryptionSettingsVersion Describes what type of encryption is used for the disks. Once this field is set, it cannot be overwritten. &#39;1.0&#39; corresponds to Azure Disk Encryption with AAD app.&#39;1.1&#39; corresponds to Azure Disk Encryption.
         * 
         * @return builder
         * 
         */
        public Builder encryptionSettingsVersion(@Nullable Output<String> encryptionSettingsVersion) {
            $.encryptionSettingsVersion = encryptionSettingsVersion;
            return this;
        }

        /**
         * @param encryptionSettingsVersion Describes what type of encryption is used for the disks. Once this field is set, it cannot be overwritten. &#39;1.0&#39; corresponds to Azure Disk Encryption with AAD app.&#39;1.1&#39; corresponds to Azure Disk Encryption.
         * 
         * @return builder
         * 
         */
        public Builder encryptionSettingsVersion(String encryptionSettingsVersion) {
            return encryptionSettingsVersion(Output.of(encryptionSettingsVersion));
        }

        public EncryptionSettingsCollectionArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
