// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * GcfsConfig contains configurations of Google Container File System.
 * 
 */
public final class GcfsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GcfsConfigArgs Empty = new GcfsConfigArgs();

    /**
     * Whether to use GCFS.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether to use GCFS.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private GcfsConfigArgs() {}

    private GcfsConfigArgs(GcfsConfigArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcfsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcfsConfigArgs $;

        public Builder() {
            $ = new GcfsConfigArgs();
        }

        public Builder(GcfsConfigArgs defaults) {
            $ = new GcfsConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether to use GCFS.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to use GCFS.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public GcfsConfigArgs build() {
            return $;
        }
    }

}
