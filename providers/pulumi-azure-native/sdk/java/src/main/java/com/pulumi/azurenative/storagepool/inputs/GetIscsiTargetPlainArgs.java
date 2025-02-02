// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagepool.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIscsiTargetPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIscsiTargetPlainArgs Empty = new GetIscsiTargetPlainArgs();

    /**
     * The name of the Disk pool.
     * 
     */
    @Import(name="diskPoolName", required=true)
    private String diskPoolName;

    /**
     * @return The name of the Disk pool.
     * 
     */
    public String diskPoolName() {
        return this.diskPoolName;
    }

    /**
     * The name of the iSCSI target.
     * 
     */
    @Import(name="iscsiTargetName", required=true)
    private String iscsiTargetName;

    /**
     * @return The name of the iSCSI target.
     * 
     */
    public String iscsiTargetName() {
        return this.iscsiTargetName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetIscsiTargetPlainArgs() {}

    private GetIscsiTargetPlainArgs(GetIscsiTargetPlainArgs $) {
        this.diskPoolName = $.diskPoolName;
        this.iscsiTargetName = $.iscsiTargetName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIscsiTargetPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIscsiTargetPlainArgs $;

        public Builder() {
            $ = new GetIscsiTargetPlainArgs();
        }

        public Builder(GetIscsiTargetPlainArgs defaults) {
            $ = new GetIscsiTargetPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskPoolName The name of the Disk pool.
         * 
         * @return builder
         * 
         */
        public Builder diskPoolName(String diskPoolName) {
            $.diskPoolName = diskPoolName;
            return this;
        }

        /**
         * @param iscsiTargetName The name of the iSCSI target.
         * 
         * @return builder
         * 
         */
        public Builder iscsiTargetName(String iscsiTargetName) {
            $.iscsiTargetName = iscsiTargetName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetIscsiTargetPlainArgs build() {
            $.diskPoolName = Objects.requireNonNull($.diskPoolName, "expected parameter 'diskPoolName' to be non-null");
            $.iscsiTargetName = Objects.requireNonNull($.iscsiTargetName, "expected parameter 'iscsiTargetName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
