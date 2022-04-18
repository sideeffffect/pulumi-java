// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for resources used by Airflow web server.
 * 
 */
public final class WebServerResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebServerResourceArgs Empty = new WebServerResourceArgs();

    /**
     * Optional. CPU request and limit for Airflow web server.
     * 
     */
    @Import(name="cpu")
      private final @Nullable Output<Double> cpu;

    public Output<Double> cpu() {
        return this.cpu == null ? Codegen.empty() : this.cpu;
    }

    /**
     * Optional. Memory (GB) request and limit for Airflow web server.
     * 
     */
    @Import(name="memoryGb")
      private final @Nullable Output<Double> memoryGb;

    public Output<Double> memoryGb() {
        return this.memoryGb == null ? Codegen.empty() : this.memoryGb;
    }

    /**
     * Optional. Storage (GB) request and limit for Airflow web server.
     * 
     */
    @Import(name="storageGb")
      private final @Nullable Output<Double> storageGb;

    public Output<Double> storageGb() {
        return this.storageGb == null ? Codegen.empty() : this.storageGb;
    }

    public WebServerResourceArgs(
        @Nullable Output<Double> cpu,
        @Nullable Output<Double> memoryGb,
        @Nullable Output<Double> storageGb) {
        this.cpu = cpu;
        this.memoryGb = memoryGb;
        this.storageGb = storageGb;
    }

    private WebServerResourceArgs() {
        this.cpu = Codegen.empty();
        this.memoryGb = Codegen.empty();
        this.storageGb = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebServerResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> cpu;
        private @Nullable Output<Double> memoryGb;
        private @Nullable Output<Double> storageGb;

        public Builder() {
    	      // Empty
        }

        public Builder(WebServerResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.memoryGb = defaults.memoryGb;
    	      this.storageGb = defaults.storageGb;
        }

        public Builder cpu(@Nullable Output<Double> cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder cpu(@Nullable Double cpu) {
            this.cpu = Codegen.ofNullable(cpu);
            return this;
        }
        public Builder memoryGb(@Nullable Output<Double> memoryGb) {
            this.memoryGb = memoryGb;
            return this;
        }
        public Builder memoryGb(@Nullable Double memoryGb) {
            this.memoryGb = Codegen.ofNullable(memoryGb);
            return this;
        }
        public Builder storageGb(@Nullable Output<Double> storageGb) {
            this.storageGb = storageGb;
            return this;
        }
        public Builder storageGb(@Nullable Double storageGb) {
            this.storageGb = Codegen.ofNullable(storageGb);
            return this;
        }        public WebServerResourceArgs build() {
            return new WebServerResourceArgs(cpu, memoryGb, storageGb);
        }
    }
}
