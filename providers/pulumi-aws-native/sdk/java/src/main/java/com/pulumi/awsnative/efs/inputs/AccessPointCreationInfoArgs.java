// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.efs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AccessPointCreationInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPointCreationInfoArgs Empty = new AccessPointCreationInfoArgs();

    /**
     * Specifies the POSIX group ID to apply to the RootDirectory. Accepts values from 0 to 2^32 (4294967295).
     * 
     */
    @Import(name="ownerGid", required=true)
    private Output<String> ownerGid;

    /**
     * @return Specifies the POSIX group ID to apply to the RootDirectory. Accepts values from 0 to 2^32 (4294967295).
     * 
     */
    public Output<String> ownerGid() {
        return this.ownerGid;
    }

    /**
     * Specifies the POSIX user ID to apply to the RootDirectory. Accepts values from 0 to 2^32 (4294967295).
     * 
     */
    @Import(name="ownerUid", required=true)
    private Output<String> ownerUid;

    /**
     * @return Specifies the POSIX user ID to apply to the RootDirectory. Accepts values from 0 to 2^32 (4294967295).
     * 
     */
    public Output<String> ownerUid() {
        return this.ownerUid;
    }

    /**
     * Specifies the POSIX permissions to apply to the RootDirectory, in the format of an octal number representing the file&#39;s mode bits.
     * 
     */
    @Import(name="permissions", required=true)
    private Output<String> permissions;

    /**
     * @return Specifies the POSIX permissions to apply to the RootDirectory, in the format of an octal number representing the file&#39;s mode bits.
     * 
     */
    public Output<String> permissions() {
        return this.permissions;
    }

    private AccessPointCreationInfoArgs() {}

    private AccessPointCreationInfoArgs(AccessPointCreationInfoArgs $) {
        this.ownerGid = $.ownerGid;
        this.ownerUid = $.ownerUid;
        this.permissions = $.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPointCreationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPointCreationInfoArgs $;

        public Builder() {
            $ = new AccessPointCreationInfoArgs();
        }

        public Builder(AccessPointCreationInfoArgs defaults) {
            $ = new AccessPointCreationInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ownerGid Specifies the POSIX group ID to apply to the RootDirectory. Accepts values from 0 to 2^32 (4294967295).
         * 
         * @return builder
         * 
         */
        public Builder ownerGid(Output<String> ownerGid) {
            $.ownerGid = ownerGid;
            return this;
        }

        /**
         * @param ownerGid Specifies the POSIX group ID to apply to the RootDirectory. Accepts values from 0 to 2^32 (4294967295).
         * 
         * @return builder
         * 
         */
        public Builder ownerGid(String ownerGid) {
            return ownerGid(Output.of(ownerGid));
        }

        /**
         * @param ownerUid Specifies the POSIX user ID to apply to the RootDirectory. Accepts values from 0 to 2^32 (4294967295).
         * 
         * @return builder
         * 
         */
        public Builder ownerUid(Output<String> ownerUid) {
            $.ownerUid = ownerUid;
            return this;
        }

        /**
         * @param ownerUid Specifies the POSIX user ID to apply to the RootDirectory. Accepts values from 0 to 2^32 (4294967295).
         * 
         * @return builder
         * 
         */
        public Builder ownerUid(String ownerUid) {
            return ownerUid(Output.of(ownerUid));
        }

        /**
         * @param permissions Specifies the POSIX permissions to apply to the RootDirectory, in the format of an octal number representing the file&#39;s mode bits.
         * 
         * @return builder
         * 
         */
        public Builder permissions(Output<String> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions Specifies the POSIX permissions to apply to the RootDirectory, in the format of an octal number representing the file&#39;s mode bits.
         * 
         * @return builder
         * 
         */
        public Builder permissions(String permissions) {
            return permissions(Output.of(permissions));
        }

        public AccessPointCreationInfoArgs build() {
            $.ownerGid = Objects.requireNonNull($.ownerGid, "expected parameter 'ownerGid' to be non-null");
            $.ownerUid = Objects.requireNonNull($.ownerUid, "expected parameter 'ownerUid' to be non-null");
            $.permissions = Objects.requireNonNull($.permissions, "expected parameter 'permissions' to be non-null");
            return $;
        }
    }

}
