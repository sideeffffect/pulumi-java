// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Target scaling by disk usage. Only applicable in the App Engine flexible environment.
 * 
 */
public final class DiskUtilizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiskUtilizationArgs Empty = new DiskUtilizationArgs();

    /**
     * Target bytes read per second.
     * 
     */
    @Import(name="targetReadBytesPerSecond")
    private @Nullable Output<Integer> targetReadBytesPerSecond;

    /**
     * @return Target bytes read per second.
     * 
     */
    public Optional<Output<Integer>> targetReadBytesPerSecond() {
        return Optional.ofNullable(this.targetReadBytesPerSecond);
    }

    /**
     * Target ops read per seconds.
     * 
     */
    @Import(name="targetReadOpsPerSecond")
    private @Nullable Output<Integer> targetReadOpsPerSecond;

    /**
     * @return Target ops read per seconds.
     * 
     */
    public Optional<Output<Integer>> targetReadOpsPerSecond() {
        return Optional.ofNullable(this.targetReadOpsPerSecond);
    }

    /**
     * Target bytes written per second.
     * 
     */
    @Import(name="targetWriteBytesPerSecond")
    private @Nullable Output<Integer> targetWriteBytesPerSecond;

    /**
     * @return Target bytes written per second.
     * 
     */
    public Optional<Output<Integer>> targetWriteBytesPerSecond() {
        return Optional.ofNullable(this.targetWriteBytesPerSecond);
    }

    /**
     * Target ops written per second.
     * 
     */
    @Import(name="targetWriteOpsPerSecond")
    private @Nullable Output<Integer> targetWriteOpsPerSecond;

    /**
     * @return Target ops written per second.
     * 
     */
    public Optional<Output<Integer>> targetWriteOpsPerSecond() {
        return Optional.ofNullable(this.targetWriteOpsPerSecond);
    }

    private DiskUtilizationArgs() {}

    private DiskUtilizationArgs(DiskUtilizationArgs $) {
        this.targetReadBytesPerSecond = $.targetReadBytesPerSecond;
        this.targetReadOpsPerSecond = $.targetReadOpsPerSecond;
        this.targetWriteBytesPerSecond = $.targetWriteBytesPerSecond;
        this.targetWriteOpsPerSecond = $.targetWriteOpsPerSecond;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskUtilizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskUtilizationArgs $;

        public Builder() {
            $ = new DiskUtilizationArgs();
        }

        public Builder(DiskUtilizationArgs defaults) {
            $ = new DiskUtilizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param targetReadBytesPerSecond Target bytes read per second.
         * 
         * @return builder
         * 
         */
        public Builder targetReadBytesPerSecond(@Nullable Output<Integer> targetReadBytesPerSecond) {
            $.targetReadBytesPerSecond = targetReadBytesPerSecond;
            return this;
        }

        /**
         * @param targetReadBytesPerSecond Target bytes read per second.
         * 
         * @return builder
         * 
         */
        public Builder targetReadBytesPerSecond(Integer targetReadBytesPerSecond) {
            return targetReadBytesPerSecond(Output.of(targetReadBytesPerSecond));
        }

        /**
         * @param targetReadOpsPerSecond Target ops read per seconds.
         * 
         * @return builder
         * 
         */
        public Builder targetReadOpsPerSecond(@Nullable Output<Integer> targetReadOpsPerSecond) {
            $.targetReadOpsPerSecond = targetReadOpsPerSecond;
            return this;
        }

        /**
         * @param targetReadOpsPerSecond Target ops read per seconds.
         * 
         * @return builder
         * 
         */
        public Builder targetReadOpsPerSecond(Integer targetReadOpsPerSecond) {
            return targetReadOpsPerSecond(Output.of(targetReadOpsPerSecond));
        }

        /**
         * @param targetWriteBytesPerSecond Target bytes written per second.
         * 
         * @return builder
         * 
         */
        public Builder targetWriteBytesPerSecond(@Nullable Output<Integer> targetWriteBytesPerSecond) {
            $.targetWriteBytesPerSecond = targetWriteBytesPerSecond;
            return this;
        }

        /**
         * @param targetWriteBytesPerSecond Target bytes written per second.
         * 
         * @return builder
         * 
         */
        public Builder targetWriteBytesPerSecond(Integer targetWriteBytesPerSecond) {
            return targetWriteBytesPerSecond(Output.of(targetWriteBytesPerSecond));
        }

        /**
         * @param targetWriteOpsPerSecond Target ops written per second.
         * 
         * @return builder
         * 
         */
        public Builder targetWriteOpsPerSecond(@Nullable Output<Integer> targetWriteOpsPerSecond) {
            $.targetWriteOpsPerSecond = targetWriteOpsPerSecond;
            return this;
        }

        /**
         * @param targetWriteOpsPerSecond Target ops written per second.
         * 
         * @return builder
         * 
         */
        public Builder targetWriteOpsPerSecond(Integer targetWriteOpsPerSecond) {
            return targetWriteOpsPerSecond(Output.of(targetWriteOpsPerSecond));
        }

        public DiskUtilizationArgs build() {
            return $;
        }
    }

}
