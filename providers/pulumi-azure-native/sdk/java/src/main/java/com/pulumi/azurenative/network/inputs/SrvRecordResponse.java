// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An SRV record.
 * 
 */
public final class SrvRecordResponse extends com.pulumi.resources.InvokeArgs {

    public static final SrvRecordResponse Empty = new SrvRecordResponse();

    /**
     * The port value for this SRV record.
     * 
     */
    @Import(name="port")
      private final @Nullable Integer port;

    public Optional<Integer> port() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    /**
     * The priority value for this SRV record.
     * 
     */
    @Import(name="priority")
      private final @Nullable Integer priority;

    public Optional<Integer> priority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    /**
     * The target domain name for this SRV record.
     * 
     */
    @Import(name="target")
      private final @Nullable String target;

    public Optional<String> target() {
        return this.target == null ? Optional.empty() : Optional.ofNullable(this.target);
    }

    /**
     * The weight value for this SRV record.
     * 
     */
    @Import(name="weight")
      private final @Nullable Integer weight;

    public Optional<Integer> weight() {
        return this.weight == null ? Optional.empty() : Optional.ofNullable(this.weight);
    }

    public SrvRecordResponse(
        @Nullable Integer port,
        @Nullable Integer priority,
        @Nullable String target,
        @Nullable Integer weight) {
        this.port = port;
        this.priority = priority;
        this.target = target;
        this.weight = weight;
    }

    private SrvRecordResponse() {
        this.port = null;
        this.priority = null;
        this.target = null;
        this.weight = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SrvRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer port;
        private @Nullable Integer priority;
        private @Nullable String target;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(SrvRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.priority = defaults.priority;
    	      this.target = defaults.target;
    	      this.weight = defaults.weight;
        }

        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }        public SrvRecordResponse build() {
            return new SrvRecordResponse(port, priority, target, weight);
        }
    }
}
