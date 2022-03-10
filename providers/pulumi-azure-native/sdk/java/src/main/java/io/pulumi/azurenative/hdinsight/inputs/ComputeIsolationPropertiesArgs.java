// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The compute isolation properties.
 * 
 */
public final class ComputeIsolationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComputeIsolationPropertiesArgs Empty = new ComputeIsolationPropertiesArgs();

    /**
     * The flag indicates whether enable compute isolation or not.
     * 
     */
    @InputImport(name="enableComputeIsolation")
      private final @Nullable Input<Boolean> enableComputeIsolation;

    public Input<Boolean> getEnableComputeIsolation() {
        return this.enableComputeIsolation == null ? Input.empty() : this.enableComputeIsolation;
    }

    /**
     * The host sku.
     * 
     */
    @InputImport(name="hostSku")
      private final @Nullable Input<String> hostSku;

    public Input<String> getHostSku() {
        return this.hostSku == null ? Input.empty() : this.hostSku;
    }

    public ComputeIsolationPropertiesArgs(
        @Nullable Input<Boolean> enableComputeIsolation,
        @Nullable Input<String> hostSku) {
        this.enableComputeIsolation = enableComputeIsolation == null ? Input.ofNullable(false) : enableComputeIsolation;
        this.hostSku = hostSku;
    }

    private ComputeIsolationPropertiesArgs() {
        this.enableComputeIsolation = Input.empty();
        this.hostSku = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeIsolationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableComputeIsolation;
        private @Nullable Input<String> hostSku;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeIsolationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableComputeIsolation = defaults.enableComputeIsolation;
    	      this.hostSku = defaults.hostSku;
        }

        public Builder enableComputeIsolation(@Nullable Input<Boolean> enableComputeIsolation) {
            this.enableComputeIsolation = enableComputeIsolation;
            return this;
        }

        public Builder enableComputeIsolation(@Nullable Boolean enableComputeIsolation) {
            this.enableComputeIsolation = Input.ofNullable(enableComputeIsolation);
            return this;
        }

        public Builder hostSku(@Nullable Input<String> hostSku) {
            this.hostSku = hostSku;
            return this;
        }

        public Builder hostSku(@Nullable String hostSku) {
            this.hostSku = Input.ofNullable(hostSku);
            return this;
        }
        public ComputeIsolationPropertiesArgs build() {
            return new ComputeIsolationPropertiesArgs(enableComputeIsolation, hostSku);
        }
    }
}
