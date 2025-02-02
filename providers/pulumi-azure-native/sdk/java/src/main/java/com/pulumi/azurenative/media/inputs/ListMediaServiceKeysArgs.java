// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListMediaServiceKeysArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListMediaServiceKeysArgs Empty = new ListMediaServiceKeysArgs();

    /**
     * Name of the Media Service.
     * 
     */
    @Import(name="mediaServiceName", required=true)
    private Output<String> mediaServiceName;

    /**
     * @return Name of the Media Service.
     * 
     */
    public Output<String> mediaServiceName() {
        return this.mediaServiceName;
    }

    /**
     * Name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group within the Azure subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListMediaServiceKeysArgs() {}

    private ListMediaServiceKeysArgs(ListMediaServiceKeysArgs $) {
        this.mediaServiceName = $.mediaServiceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListMediaServiceKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListMediaServiceKeysArgs $;

        public Builder() {
            $ = new ListMediaServiceKeysArgs();
        }

        public Builder(ListMediaServiceKeysArgs defaults) {
            $ = new ListMediaServiceKeysArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mediaServiceName Name of the Media Service.
         * 
         * @return builder
         * 
         */
        public Builder mediaServiceName(Output<String> mediaServiceName) {
            $.mediaServiceName = mediaServiceName;
            return this;
        }

        /**
         * @param mediaServiceName Name of the Media Service.
         * 
         * @return builder
         * 
         */
        public Builder mediaServiceName(String mediaServiceName) {
            return mediaServiceName(Output.of(mediaServiceName));
        }

        /**
         * @param resourceGroupName Name of the resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ListMediaServiceKeysArgs build() {
            $.mediaServiceName = Objects.requireNonNull($.mediaServiceName, "expected parameter 'mediaServiceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
