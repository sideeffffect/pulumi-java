// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.InstanceFromMachineImageBootDiskInitializeParamsGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFromMachineImageBootDiskGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageBootDiskGetArgs Empty = new InstanceFromMachineImageBootDiskGetArgs();

    @Import(name="autoDelete")
      private final @Nullable Output<Boolean> autoDelete;

    public Output<Boolean> autoDelete() {
        return this.autoDelete == null ? Codegen.empty() : this.autoDelete;
    }

    @Import(name="deviceName")
      private final @Nullable Output<String> deviceName;

    public Output<String> deviceName() {
        return this.deviceName == null ? Codegen.empty() : this.deviceName;
    }

    @Import(name="diskEncryptionKeyRaw")
      private final @Nullable Output<String> diskEncryptionKeyRaw;

    public Output<String> diskEncryptionKeyRaw() {
        return this.diskEncryptionKeyRaw == null ? Codegen.empty() : this.diskEncryptionKeyRaw;
    }

    @Import(name="diskEncryptionKeySha256")
      private final @Nullable Output<String> diskEncryptionKeySha256;

    public Output<String> diskEncryptionKeySha256() {
        return this.diskEncryptionKeySha256 == null ? Codegen.empty() : this.diskEncryptionKeySha256;
    }

    @Import(name="initializeParams")
      private final @Nullable Output<InstanceFromMachineImageBootDiskInitializeParamsGetArgs> initializeParams;

    public Output<InstanceFromMachineImageBootDiskInitializeParamsGetArgs> initializeParams() {
        return this.initializeParams == null ? Codegen.empty() : this.initializeParams;
    }

    @Import(name="kmsKeySelfLink")
      private final @Nullable Output<String> kmsKeySelfLink;

    public Output<String> kmsKeySelfLink() {
        return this.kmsKeySelfLink == null ? Codegen.empty() : this.kmsKeySelfLink;
    }

    @Import(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> mode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    @Import(name="source")
      private final @Nullable Output<String> source;

    public Output<String> source() {
        return this.source == null ? Codegen.empty() : this.source;
    }

    public InstanceFromMachineImageBootDiskGetArgs(
        @Nullable Output<Boolean> autoDelete,
        @Nullable Output<String> deviceName,
        @Nullable Output<String> diskEncryptionKeyRaw,
        @Nullable Output<String> diskEncryptionKeySha256,
        @Nullable Output<InstanceFromMachineImageBootDiskInitializeParamsGetArgs> initializeParams,
        @Nullable Output<String> kmsKeySelfLink,
        @Nullable Output<String> mode,
        @Nullable Output<String> source) {
        this.autoDelete = autoDelete;
        this.deviceName = deviceName;
        this.diskEncryptionKeyRaw = diskEncryptionKeyRaw;
        this.diskEncryptionKeySha256 = diskEncryptionKeySha256;
        this.initializeParams = initializeParams;
        this.kmsKeySelfLink = kmsKeySelfLink;
        this.mode = mode;
        this.source = source;
    }

    private InstanceFromMachineImageBootDiskGetArgs() {
        this.autoDelete = Codegen.empty();
        this.deviceName = Codegen.empty();
        this.diskEncryptionKeyRaw = Codegen.empty();
        this.diskEncryptionKeySha256 = Codegen.empty();
        this.initializeParams = Codegen.empty();
        this.kmsKeySelfLink = Codegen.empty();
        this.mode = Codegen.empty();
        this.source = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromMachineImageBootDiskGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoDelete;
        private @Nullable Output<String> deviceName;
        private @Nullable Output<String> diskEncryptionKeyRaw;
        private @Nullable Output<String> diskEncryptionKeySha256;
        private @Nullable Output<InstanceFromMachineImageBootDiskInitializeParamsGetArgs> initializeParams;
        private @Nullable Output<String> kmsKeySelfLink;
        private @Nullable Output<String> mode;
        private @Nullable Output<String> source;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromMachineImageBootDiskGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKeyRaw = defaults.diskEncryptionKeyRaw;
    	      this.diskEncryptionKeySha256 = defaults.diskEncryptionKeySha256;
    	      this.initializeParams = defaults.initializeParams;
    	      this.kmsKeySelfLink = defaults.kmsKeySelfLink;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
        }

        public Builder autoDelete(@Nullable Output<Boolean> autoDelete) {
            this.autoDelete = autoDelete;
            return this;
        }
        public Builder autoDelete(@Nullable Boolean autoDelete) {
            this.autoDelete = Codegen.ofNullable(autoDelete);
            return this;
        }
        public Builder deviceName(@Nullable Output<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = Codegen.ofNullable(deviceName);
            return this;
        }
        public Builder diskEncryptionKeyRaw(@Nullable Output<String> diskEncryptionKeyRaw) {
            this.diskEncryptionKeyRaw = diskEncryptionKeyRaw;
            return this;
        }
        public Builder diskEncryptionKeyRaw(@Nullable String diskEncryptionKeyRaw) {
            this.diskEncryptionKeyRaw = Codegen.ofNullable(diskEncryptionKeyRaw);
            return this;
        }
        public Builder diskEncryptionKeySha256(@Nullable Output<String> diskEncryptionKeySha256) {
            this.diskEncryptionKeySha256 = diskEncryptionKeySha256;
            return this;
        }
        public Builder diskEncryptionKeySha256(@Nullable String diskEncryptionKeySha256) {
            this.diskEncryptionKeySha256 = Codegen.ofNullable(diskEncryptionKeySha256);
            return this;
        }
        public Builder initializeParams(@Nullable Output<InstanceFromMachineImageBootDiskInitializeParamsGetArgs> initializeParams) {
            this.initializeParams = initializeParams;
            return this;
        }
        public Builder initializeParams(@Nullable InstanceFromMachineImageBootDiskInitializeParamsGetArgs initializeParams) {
            this.initializeParams = Codegen.ofNullable(initializeParams);
            return this;
        }
        public Builder kmsKeySelfLink(@Nullable Output<String> kmsKeySelfLink) {
            this.kmsKeySelfLink = kmsKeySelfLink;
            return this;
        }
        public Builder kmsKeySelfLink(@Nullable String kmsKeySelfLink) {
            this.kmsKeySelfLink = Codegen.ofNullable(kmsKeySelfLink);
            return this;
        }
        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }
        public Builder source(@Nullable Output<String> source) {
            this.source = source;
            return this;
        }
        public Builder source(@Nullable String source) {
            this.source = Codegen.ofNullable(source);
            return this;
        }        public InstanceFromMachineImageBootDiskGetArgs build() {
            return new InstanceFromMachineImageBootDiskGetArgs(autoDelete, deviceName, diskEncryptionKeyRaw, diskEncryptionKeySha256, initializeParams, kmsKeySelfLink, mode, source);
        }
    }
}
