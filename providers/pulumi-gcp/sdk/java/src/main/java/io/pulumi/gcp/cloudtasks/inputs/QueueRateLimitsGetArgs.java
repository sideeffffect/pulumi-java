// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudtasks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueueRateLimitsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueueRateLimitsGetArgs Empty = new QueueRateLimitsGetArgs();

    /**
     * - 
     * The max burst size.
     * Max burst size limits how fast tasks in queue are processed when many tasks are
     * in the queue and the rate is high. This field allows the queue to have a high
     * rate so processing starts shortly after a task is enqueued, but still limits
     * resource usage when many tasks are enqueued in a short period of time.
     * 
     */
    @Import(name="maxBurstSize")
      private final @Nullable Output<Integer> maxBurstSize;

    public Output<Integer> maxBurstSize() {
        return this.maxBurstSize == null ? Codegen.empty() : this.maxBurstSize;
    }

    /**
     * The maximum number of concurrent tasks that Cloud Tasks allows to
     * be dispatched for this queue. After this threshold has been
     * reached, Cloud Tasks stops dispatching tasks until the number of
     * concurrent requests decreases.
     * 
     */
    @Import(name="maxConcurrentDispatches")
      private final @Nullable Output<Integer> maxConcurrentDispatches;

    public Output<Integer> maxConcurrentDispatches() {
        return this.maxConcurrentDispatches == null ? Codegen.empty() : this.maxConcurrentDispatches;
    }

    /**
     * The maximum rate at which tasks are dispatched from this queue.
     * If unspecified when the queue is created, Cloud Tasks will pick the default.
     * 
     */
    @Import(name="maxDispatchesPerSecond")
      private final @Nullable Output<Double> maxDispatchesPerSecond;

    public Output<Double> maxDispatchesPerSecond() {
        return this.maxDispatchesPerSecond == null ? Codegen.empty() : this.maxDispatchesPerSecond;
    }

    public QueueRateLimitsGetArgs(
        @Nullable Output<Integer> maxBurstSize,
        @Nullable Output<Integer> maxConcurrentDispatches,
        @Nullable Output<Double> maxDispatchesPerSecond) {
        this.maxBurstSize = maxBurstSize;
        this.maxConcurrentDispatches = maxConcurrentDispatches;
        this.maxDispatchesPerSecond = maxDispatchesPerSecond;
    }

    private QueueRateLimitsGetArgs() {
        this.maxBurstSize = Codegen.empty();
        this.maxConcurrentDispatches = Codegen.empty();
        this.maxDispatchesPerSecond = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueRateLimitsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxBurstSize;
        private @Nullable Output<Integer> maxConcurrentDispatches;
        private @Nullable Output<Double> maxDispatchesPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueRateLimitsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxBurstSize = defaults.maxBurstSize;
    	      this.maxConcurrentDispatches = defaults.maxConcurrentDispatches;
    	      this.maxDispatchesPerSecond = defaults.maxDispatchesPerSecond;
        }

        public Builder maxBurstSize(@Nullable Output<Integer> maxBurstSize) {
            this.maxBurstSize = maxBurstSize;
            return this;
        }
        public Builder maxBurstSize(@Nullable Integer maxBurstSize) {
            this.maxBurstSize = Codegen.ofNullable(maxBurstSize);
            return this;
        }
        public Builder maxConcurrentDispatches(@Nullable Output<Integer> maxConcurrentDispatches) {
            this.maxConcurrentDispatches = maxConcurrentDispatches;
            return this;
        }
        public Builder maxConcurrentDispatches(@Nullable Integer maxConcurrentDispatches) {
            this.maxConcurrentDispatches = Codegen.ofNullable(maxConcurrentDispatches);
            return this;
        }
        public Builder maxDispatchesPerSecond(@Nullable Output<Double> maxDispatchesPerSecond) {
            this.maxDispatchesPerSecond = maxDispatchesPerSecond;
            return this;
        }
        public Builder maxDispatchesPerSecond(@Nullable Double maxDispatchesPerSecond) {
            this.maxDispatchesPerSecond = Codegen.ofNullable(maxDispatchesPerSecond);
            return this;
        }        public QueueRateLimitsGetArgs build() {
            return new QueueRateLimitsGetArgs(maxBurstSize, maxConcurrentDispatches, maxDispatchesPerSecond);
        }
    }
}
