// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Target scaling by disk usage. Only applicable in the App Engine flexible environment.
 * 
 */
public final class DiskUtilizationResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiskUtilizationResponse Empty = new DiskUtilizationResponse();

    /**
     * Target bytes read per second.
     * 
     */
    @InputImport(name="targetReadBytesPerSecond", required=true)
      private final Integer targetReadBytesPerSecond;

    public Integer getTargetReadBytesPerSecond() {
        return this.targetReadBytesPerSecond;
    }

    /**
     * Target ops read per seconds.
     * 
     */
    @InputImport(name="targetReadOpsPerSecond", required=true)
      private final Integer targetReadOpsPerSecond;

    public Integer getTargetReadOpsPerSecond() {
        return this.targetReadOpsPerSecond;
    }

    /**
     * Target bytes written per second.
     * 
     */
    @InputImport(name="targetWriteBytesPerSecond", required=true)
      private final Integer targetWriteBytesPerSecond;

    public Integer getTargetWriteBytesPerSecond() {
        return this.targetWriteBytesPerSecond;
    }

    /**
     * Target ops written per second.
     * 
     */
    @InputImport(name="targetWriteOpsPerSecond", required=true)
      private final Integer targetWriteOpsPerSecond;

    public Integer getTargetWriteOpsPerSecond() {
        return this.targetWriteOpsPerSecond;
    }

    public DiskUtilizationResponse(
        Integer targetReadBytesPerSecond,
        Integer targetReadOpsPerSecond,
        Integer targetWriteBytesPerSecond,
        Integer targetWriteOpsPerSecond) {
        this.targetReadBytesPerSecond = Objects.requireNonNull(targetReadBytesPerSecond, "expected parameter 'targetReadBytesPerSecond' to be non-null");
        this.targetReadOpsPerSecond = Objects.requireNonNull(targetReadOpsPerSecond, "expected parameter 'targetReadOpsPerSecond' to be non-null");
        this.targetWriteBytesPerSecond = Objects.requireNonNull(targetWriteBytesPerSecond, "expected parameter 'targetWriteBytesPerSecond' to be non-null");
        this.targetWriteOpsPerSecond = Objects.requireNonNull(targetWriteOpsPerSecond, "expected parameter 'targetWriteOpsPerSecond' to be non-null");
    }

    private DiskUtilizationResponse() {
        this.targetReadBytesPerSecond = null;
        this.targetReadOpsPerSecond = null;
        this.targetWriteBytesPerSecond = null;
        this.targetWriteOpsPerSecond = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskUtilizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer targetReadBytesPerSecond;
        private Integer targetReadOpsPerSecond;
        private Integer targetWriteBytesPerSecond;
        private Integer targetWriteOpsPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskUtilizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetReadBytesPerSecond = defaults.targetReadBytesPerSecond;
    	      this.targetReadOpsPerSecond = defaults.targetReadOpsPerSecond;
    	      this.targetWriteBytesPerSecond = defaults.targetWriteBytesPerSecond;
    	      this.targetWriteOpsPerSecond = defaults.targetWriteOpsPerSecond;
        }

        public Builder targetReadBytesPerSecond(Integer targetReadBytesPerSecond) {
            this.targetReadBytesPerSecond = Objects.requireNonNull(targetReadBytesPerSecond);
            return this;
        }

        public Builder targetReadOpsPerSecond(Integer targetReadOpsPerSecond) {
            this.targetReadOpsPerSecond = Objects.requireNonNull(targetReadOpsPerSecond);
            return this;
        }

        public Builder targetWriteBytesPerSecond(Integer targetWriteBytesPerSecond) {
            this.targetWriteBytesPerSecond = Objects.requireNonNull(targetWriteBytesPerSecond);
            return this;
        }

        public Builder targetWriteOpsPerSecond(Integer targetWriteOpsPerSecond) {
            this.targetWriteOpsPerSecond = Objects.requireNonNull(targetWriteOpsPerSecond);
            return this;
        }
        public DiskUtilizationResponse build() {
            return new DiskUtilizationResponse(targetReadBytesPerSecond, targetReadOpsPerSecond, targetWriteBytesPerSecond, targetWriteOpsPerSecond);
        }
    }
}
