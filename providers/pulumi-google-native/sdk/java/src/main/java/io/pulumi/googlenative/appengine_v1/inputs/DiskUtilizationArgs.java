// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Target scaling by disk usage. Only applicable in the App Engine flexible environment.
 * 
 */
public final class DiskUtilizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskUtilizationArgs Empty = new DiskUtilizationArgs();

    /**
     * Target bytes read per second.
     * 
     */
    @InputImport(name="targetReadBytesPerSecond")
      private final @Nullable Input<Integer> targetReadBytesPerSecond;

    public Input<Integer> getTargetReadBytesPerSecond() {
        return this.targetReadBytesPerSecond == null ? Input.empty() : this.targetReadBytesPerSecond;
    }

    /**
     * Target ops read per seconds.
     * 
     */
    @InputImport(name="targetReadOpsPerSecond")
      private final @Nullable Input<Integer> targetReadOpsPerSecond;

    public Input<Integer> getTargetReadOpsPerSecond() {
        return this.targetReadOpsPerSecond == null ? Input.empty() : this.targetReadOpsPerSecond;
    }

    /**
     * Target bytes written per second.
     * 
     */
    @InputImport(name="targetWriteBytesPerSecond")
      private final @Nullable Input<Integer> targetWriteBytesPerSecond;

    public Input<Integer> getTargetWriteBytesPerSecond() {
        return this.targetWriteBytesPerSecond == null ? Input.empty() : this.targetWriteBytesPerSecond;
    }

    /**
     * Target ops written per second.
     * 
     */
    @InputImport(name="targetWriteOpsPerSecond")
      private final @Nullable Input<Integer> targetWriteOpsPerSecond;

    public Input<Integer> getTargetWriteOpsPerSecond() {
        return this.targetWriteOpsPerSecond == null ? Input.empty() : this.targetWriteOpsPerSecond;
    }

    public DiskUtilizationArgs(
        @Nullable Input<Integer> targetReadBytesPerSecond,
        @Nullable Input<Integer> targetReadOpsPerSecond,
        @Nullable Input<Integer> targetWriteBytesPerSecond,
        @Nullable Input<Integer> targetWriteOpsPerSecond) {
        this.targetReadBytesPerSecond = targetReadBytesPerSecond;
        this.targetReadOpsPerSecond = targetReadOpsPerSecond;
        this.targetWriteBytesPerSecond = targetWriteBytesPerSecond;
        this.targetWriteOpsPerSecond = targetWriteOpsPerSecond;
    }

    private DiskUtilizationArgs() {
        this.targetReadBytesPerSecond = Input.empty();
        this.targetReadOpsPerSecond = Input.empty();
        this.targetWriteBytesPerSecond = Input.empty();
        this.targetWriteOpsPerSecond = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskUtilizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> targetReadBytesPerSecond;
        private @Nullable Input<Integer> targetReadOpsPerSecond;
        private @Nullable Input<Integer> targetWriteBytesPerSecond;
        private @Nullable Input<Integer> targetWriteOpsPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskUtilizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetReadBytesPerSecond = defaults.targetReadBytesPerSecond;
    	      this.targetReadOpsPerSecond = defaults.targetReadOpsPerSecond;
    	      this.targetWriteBytesPerSecond = defaults.targetWriteBytesPerSecond;
    	      this.targetWriteOpsPerSecond = defaults.targetWriteOpsPerSecond;
        }

        public Builder targetReadBytesPerSecond(@Nullable Input<Integer> targetReadBytesPerSecond) {
            this.targetReadBytesPerSecond = targetReadBytesPerSecond;
            return this;
        }

        public Builder targetReadBytesPerSecond(@Nullable Integer targetReadBytesPerSecond) {
            this.targetReadBytesPerSecond = Input.ofNullable(targetReadBytesPerSecond);
            return this;
        }

        public Builder targetReadOpsPerSecond(@Nullable Input<Integer> targetReadOpsPerSecond) {
            this.targetReadOpsPerSecond = targetReadOpsPerSecond;
            return this;
        }

        public Builder targetReadOpsPerSecond(@Nullable Integer targetReadOpsPerSecond) {
            this.targetReadOpsPerSecond = Input.ofNullable(targetReadOpsPerSecond);
            return this;
        }

        public Builder targetWriteBytesPerSecond(@Nullable Input<Integer> targetWriteBytesPerSecond) {
            this.targetWriteBytesPerSecond = targetWriteBytesPerSecond;
            return this;
        }

        public Builder targetWriteBytesPerSecond(@Nullable Integer targetWriteBytesPerSecond) {
            this.targetWriteBytesPerSecond = Input.ofNullable(targetWriteBytesPerSecond);
            return this;
        }

        public Builder targetWriteOpsPerSecond(@Nullable Input<Integer> targetWriteOpsPerSecond) {
            this.targetWriteOpsPerSecond = targetWriteOpsPerSecond;
            return this;
        }

        public Builder targetWriteOpsPerSecond(@Nullable Integer targetWriteOpsPerSecond) {
            this.targetWriteOpsPerSecond = Input.ofNullable(targetWriteOpsPerSecond);
            return this;
        }
        public DiskUtilizationArgs build() {
            return new DiskUtilizationArgs(targetReadBytesPerSecond, targetReadOpsPerSecond, targetWriteBytesPerSecond, targetWriteOpsPerSecond);
        }
    }
}
