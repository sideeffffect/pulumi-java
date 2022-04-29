// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;


public final class BucketVersioningArgs extends ResourceArgs {

    public static final BucketVersioningArgs Empty = new BucketVersioningArgs();

    /**
     * While set to `true`, versioning is fully enabled for this bucket.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return While set to `true`, versioning is fully enabled for this bucket.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private BucketVersioningArgs() {}

    private BucketVersioningArgs(BucketVersioningArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketVersioningArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketVersioningArgs $;

        public Builder() {
            $ = new BucketVersioningArgs();
        }

        public Builder(BucketVersioningArgs defaults) {
            $ = new BucketVersioningArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled While set to `true`, versioning is fully enabled for this bucket.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled While set to `true`, versioning is fully enabled for this bucket.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public BucketVersioningArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
