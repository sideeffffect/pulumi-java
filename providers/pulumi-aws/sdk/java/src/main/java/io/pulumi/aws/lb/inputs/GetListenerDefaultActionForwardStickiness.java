// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


public final class GetListenerDefaultActionForwardStickiness extends io.pulumi.resources.InvokeArgs {

    public static final GetListenerDefaultActionForwardStickiness Empty = new GetListenerDefaultActionForwardStickiness();

    @InputImport(name="duration", required=true)
      private final Integer duration;

    public Integer getDuration() {
        return this.duration;
    }

    @InputImport(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetListenerDefaultActionForwardStickiness(
        Integer duration,
        Boolean enabled) {
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private GetListenerDefaultActionForwardStickiness() {
        this.duration = null;
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerDefaultActionForwardStickiness defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer duration;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerDefaultActionForwardStickiness defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.enabled = defaults.enabled;
        }

        public Builder duration(Integer duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public GetListenerDefaultActionForwardStickiness build() {
            return new GetListenerDefaultActionForwardStickiness(duration, enabled);
        }
    }
}
