// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class FirewallLogConfigArgs extends ResourceArgs {

    public static final FirewallLogConfigArgs Empty = new FirewallLogConfigArgs();

    /**
     * This field denotes whether to include or exclude metadata for firewall logs.
     * Possible values are `EXCLUDE_ALL_METADATA` and `INCLUDE_ALL_METADATA`.
     * 
     */
    @Import(name="metadata", required=true)
    private Output<String> metadata;

    /**
     * @return This field denotes whether to include or exclude metadata for firewall logs.
     * Possible values are `EXCLUDE_ALL_METADATA` and `INCLUDE_ALL_METADATA`.
     * 
     */
    public Output<String> metadata() {
        return this.metadata;
    }

    private FirewallLogConfigArgs() {}

    private FirewallLogConfigArgs(FirewallLogConfigArgs $) {
        this.metadata = $.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallLogConfigArgs $;

        public Builder() {
            $ = new FirewallLogConfigArgs();
        }

        public Builder(FirewallLogConfigArgs defaults) {
            $ = new FirewallLogConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metadata This field denotes whether to include or exclude metadata for firewall logs.
         * Possible values are `EXCLUDE_ALL_METADATA` and `INCLUDE_ALL_METADATA`.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Output<String> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata This field denotes whether to include or exclude metadata for firewall logs.
         * Possible values are `EXCLUDE_ALL_METADATA` and `INCLUDE_ALL_METADATA`.
         * 
         * @return builder
         * 
         */
        public Builder metadata(String metadata) {
            return metadata(Output.of(metadata));
        }

        public FirewallLogConfigArgs build() {
            $.metadata = Objects.requireNonNull($.metadata, "expected parameter 'metadata' to be non-null");
            return $;
        }
    }

}
