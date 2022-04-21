// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.storagegateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StoredIscsiVolumeArgs extends com.pulumi.resources.ResourceArgs {

    public static final StoredIscsiVolumeArgs Empty = new StoredIscsiVolumeArgs();

    /**
     * The unique identifier for the gateway local disk that is configured as a stored volume.
     * 
     */
    @Import(name="diskId", required=true)
    private Output<String> diskId;

    public Output<String> diskId() {
        return this.diskId;
    }

    /**
     * The Amazon Resource Name (ARN) of the gateway.
     * 
     */
    @Import(name="gatewayArn", required=true)
    private Output<String> gatewayArn;

    public Output<String> gatewayArn() {
        return this.gatewayArn;
    }

    /**
     * `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Optional.
     * 
     */
    @Import(name="kmsEncrypted")
    private @Nullable Output<Boolean> kmsEncrypted;

    public Optional<Output<Boolean>> kmsEncrypted() {
        return Optional.ofNullable(this.kmsEncrypted);
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when `kms_encrypted` is `true`.
     * 
     */
    @Import(name="kmsKey")
    private @Nullable Output<String> kmsKey;

    public Optional<Output<String>> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }

    /**
     * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
     * 
     */
    @Import(name="networkInterfaceId", required=true)
    private Output<String> networkInterfaceId;

    public Output<String> networkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * Specify this field as `true` if you want to preserve the data on the local disk. Otherwise, specifying this field as false creates an empty volume.
     * 
     */
    @Import(name="preserveExistingData", required=true)
    private Output<Boolean> preserveExistingData;

    public Output<Boolean> preserveExistingData() {
        return this.preserveExistingData;
    }

    /**
     * The snapshot ID of the snapshot to restore as the new stored volumeE.g., `snap-1122aabb`.
     * 
     */
    @Import(name="snapshotId")
    private @Nullable Output<String> snapshotId;

    public Optional<Output<String>> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }

    /**
     * Key-value mapping of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
     * 
     */
    @Import(name="targetName", required=true)
    private Output<String> targetName;

    public Output<String> targetName() {
        return this.targetName;
    }

    private StoredIscsiVolumeArgs() {}

    private StoredIscsiVolumeArgs(StoredIscsiVolumeArgs $) {
        this.diskId = $.diskId;
        this.gatewayArn = $.gatewayArn;
        this.kmsEncrypted = $.kmsEncrypted;
        this.kmsKey = $.kmsKey;
        this.networkInterfaceId = $.networkInterfaceId;
        this.preserveExistingData = $.preserveExistingData;
        this.snapshotId = $.snapshotId;
        this.tags = $.tags;
        this.targetName = $.targetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StoredIscsiVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StoredIscsiVolumeArgs $;

        public Builder() {
            $ = new StoredIscsiVolumeArgs();
        }

        public Builder(StoredIscsiVolumeArgs defaults) {
            $ = new StoredIscsiVolumeArgs(Objects.requireNonNull(defaults));
        }

        public Builder diskId(Output<String> diskId) {
            $.diskId = diskId;
            return this;
        }

        public Builder diskId(String diskId) {
            return diskId(Output.of(diskId));
        }

        public Builder gatewayArn(Output<String> gatewayArn) {
            $.gatewayArn = gatewayArn;
            return this;
        }

        public Builder gatewayArn(String gatewayArn) {
            return gatewayArn(Output.of(gatewayArn));
        }

        public Builder kmsEncrypted(@Nullable Output<Boolean> kmsEncrypted) {
            $.kmsEncrypted = kmsEncrypted;
            return this;
        }

        public Builder kmsEncrypted(Boolean kmsEncrypted) {
            return kmsEncrypted(Output.of(kmsEncrypted));
        }

        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            $.kmsKey = kmsKey;
            return this;
        }

        public Builder kmsKey(String kmsKey) {
            return kmsKey(Output.of(kmsKey));
        }

        public Builder networkInterfaceId(Output<String> networkInterfaceId) {
            $.networkInterfaceId = networkInterfaceId;
            return this;
        }

        public Builder networkInterfaceId(String networkInterfaceId) {
            return networkInterfaceId(Output.of(networkInterfaceId));
        }

        public Builder preserveExistingData(Output<Boolean> preserveExistingData) {
            $.preserveExistingData = preserveExistingData;
            return this;
        }

        public Builder preserveExistingData(Boolean preserveExistingData) {
            return preserveExistingData(Output.of(preserveExistingData));
        }

        public Builder snapshotId(@Nullable Output<String> snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        public Builder snapshotId(String snapshotId) {
            return snapshotId(Output.of(snapshotId));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder targetName(Output<String> targetName) {
            $.targetName = targetName;
            return this;
        }

        public Builder targetName(String targetName) {
            return targetName(Output.of(targetName));
        }

        public StoredIscsiVolumeArgs build() {
            $.diskId = Objects.requireNonNull($.diskId, "expected parameter 'diskId' to be non-null");
            $.gatewayArn = Objects.requireNonNull($.gatewayArn, "expected parameter 'gatewayArn' to be non-null");
            $.networkInterfaceId = Objects.requireNonNull($.networkInterfaceId, "expected parameter 'networkInterfaceId' to be non-null");
            $.preserveExistingData = Objects.requireNonNull($.preserveExistingData, "expected parameter 'preserveExistingData' to be non-null");
            $.targetName = Objects.requireNonNull($.targetName, "expected parameter 'targetName' to be non-null");
            return $;
        }
    }

}
