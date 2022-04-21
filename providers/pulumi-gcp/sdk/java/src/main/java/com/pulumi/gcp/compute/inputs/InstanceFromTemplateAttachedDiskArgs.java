// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceFromTemplateAttachedDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFromTemplateAttachedDiskArgs Empty = new InstanceFromTemplateAttachedDiskArgs();

    @Import(name="deviceName")
    private @Nullable Output<String> deviceName;

    public Optional<Output<String>> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }

    @Import(name="diskEncryptionKeyRaw")
    private @Nullable Output<String> diskEncryptionKeyRaw;

    public Optional<Output<String>> diskEncryptionKeyRaw() {
        return Optional.ofNullable(this.diskEncryptionKeyRaw);
    }

    @Import(name="diskEncryptionKeySha256")
    private @Nullable Output<String> diskEncryptionKeySha256;

    public Optional<Output<String>> diskEncryptionKeySha256() {
        return Optional.ofNullable(this.diskEncryptionKeySha256);
    }

    @Import(name="kmsKeySelfLink")
    private @Nullable Output<String> kmsKeySelfLink;

    public Optional<Output<String>> kmsKeySelfLink() {
        return Optional.ofNullable(this.kmsKeySelfLink);
    }

    @Import(name="mode")
    private @Nullable Output<String> mode;

    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    @Import(name="source", required=true)
    private Output<String> source;

    public Output<String> source() {
        return this.source;
    }

    private InstanceFromTemplateAttachedDiskArgs() {}

    private InstanceFromTemplateAttachedDiskArgs(InstanceFromTemplateAttachedDiskArgs $) {
        this.deviceName = $.deviceName;
        this.diskEncryptionKeyRaw = $.diskEncryptionKeyRaw;
        this.diskEncryptionKeySha256 = $.diskEncryptionKeySha256;
        this.kmsKeySelfLink = $.kmsKeySelfLink;
        this.mode = $.mode;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFromTemplateAttachedDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFromTemplateAttachedDiskArgs $;

        public Builder() {
            $ = new InstanceFromTemplateAttachedDiskArgs();
        }

        public Builder(InstanceFromTemplateAttachedDiskArgs defaults) {
            $ = new InstanceFromTemplateAttachedDiskArgs(Objects.requireNonNull(defaults));
        }

        public Builder deviceName(@Nullable Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        public Builder diskEncryptionKeyRaw(@Nullable Output<String> diskEncryptionKeyRaw) {
            $.diskEncryptionKeyRaw = diskEncryptionKeyRaw;
            return this;
        }

        public Builder diskEncryptionKeyRaw(String diskEncryptionKeyRaw) {
            return diskEncryptionKeyRaw(Output.of(diskEncryptionKeyRaw));
        }

        public Builder diskEncryptionKeySha256(@Nullable Output<String> diskEncryptionKeySha256) {
            $.diskEncryptionKeySha256 = diskEncryptionKeySha256;
            return this;
        }

        public Builder diskEncryptionKeySha256(String diskEncryptionKeySha256) {
            return diskEncryptionKeySha256(Output.of(diskEncryptionKeySha256));
        }

        public Builder kmsKeySelfLink(@Nullable Output<String> kmsKeySelfLink) {
            $.kmsKeySelfLink = kmsKeySelfLink;
            return this;
        }

        public Builder kmsKeySelfLink(String kmsKeySelfLink) {
            return kmsKeySelfLink(Output.of(kmsKeySelfLink));
        }

        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public InstanceFromTemplateAttachedDiskArgs build() {
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}
