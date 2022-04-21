// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceAttachedDisk extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceAttachedDisk Empty = new GetInstanceAttachedDisk();

    /**
     * Name with which the attached disk is accessible
     * under `/dev/disk/by-id/`
     * 
     */
    @Import(name="deviceName", required=true)
    private String deviceName;

    public String deviceName() {
        return this.deviceName;
    }

    @Import(name="diskEncryptionKeyRaw", required=true)
    private String diskEncryptionKeyRaw;

    public String diskEncryptionKeyRaw() {
        return this.diskEncryptionKeyRaw;
    }

    @Import(name="diskEncryptionKeySha256", required=true)
    private String diskEncryptionKeySha256;

    public String diskEncryptionKeySha256() {
        return this.diskEncryptionKeySha256;
    }

    @Import(name="kmsKeySelfLink", required=true)
    private String kmsKeySelfLink;

    public String kmsKeySelfLink() {
        return this.kmsKeySelfLink;
    }

    /**
     * Read/write mode for the disk. One of `&#34;READ_ONLY&#34;` or `&#34;READ_WRITE&#34;`.
     * 
     */
    @Import(name="mode", required=true)
    private String mode;

    public String mode() {
        return this.mode;
    }

    /**
     * The name or self_link of the disk attached to this instance.
     * 
     */
    @Import(name="source", required=true)
    private String source;

    public String source() {
        return this.source;
    }

    private GetInstanceAttachedDisk() {}

    private GetInstanceAttachedDisk(GetInstanceAttachedDisk $) {
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
    public static Builder builder(GetInstanceAttachedDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceAttachedDisk $;

        public Builder() {
            $ = new GetInstanceAttachedDisk();
        }

        public Builder(GetInstanceAttachedDisk defaults) {
            $ = new GetInstanceAttachedDisk(Objects.requireNonNull(defaults));
        }

        public Builder deviceName(String deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        public Builder diskEncryptionKeyRaw(String diskEncryptionKeyRaw) {
            $.diskEncryptionKeyRaw = diskEncryptionKeyRaw;
            return this;
        }

        public Builder diskEncryptionKeySha256(String diskEncryptionKeySha256) {
            $.diskEncryptionKeySha256 = diskEncryptionKeySha256;
            return this;
        }

        public Builder kmsKeySelfLink(String kmsKeySelfLink) {
            $.kmsKeySelfLink = kmsKeySelfLink;
            return this;
        }

        public Builder mode(String mode) {
            $.mode = mode;
            return this;
        }

        public Builder source(String source) {
            $.source = source;
            return this;
        }

        public GetInstanceAttachedDisk build() {
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.diskEncryptionKeyRaw = Objects.requireNonNull($.diskEncryptionKeyRaw, "expected parameter 'diskEncryptionKeyRaw' to be non-null");
            $.diskEncryptionKeySha256 = Objects.requireNonNull($.diskEncryptionKeySha256, "expected parameter 'diskEncryptionKeySha256' to be non-null");
            $.kmsKeySelfLink = Objects.requireNonNull($.kmsKeySelfLink, "expected parameter 'kmsKeySelfLink' to be non-null");
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}
