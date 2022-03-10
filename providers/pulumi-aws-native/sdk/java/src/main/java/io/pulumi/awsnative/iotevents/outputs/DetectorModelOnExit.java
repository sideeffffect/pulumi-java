// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.awsnative.iotevents.outputs.DetectorModelEvent;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DetectorModelOnExit {
    /**
     * Specifies the `actions` that are performed when the state is exited and the `condition` is `TRUE`.
     * 
     */
    private final @Nullable List<DetectorModelEvent> events;

    @OutputCustomType.Constructor
    private DetectorModelOnExit(@OutputCustomType.Parameter("events") @Nullable List<DetectorModelEvent> events) {
        this.events = events;
    }

    /**
     * Specifies the `actions` that are performed when the state is exited and the `condition` is `TRUE`.
     * 
    */
    public List<DetectorModelEvent> getEvents() {
        return this.events == null ? List.of() : this.events;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelOnExit defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DetectorModelEvent> events;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelOnExit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.events = defaults.events;
        }

        public Builder events(@Nullable List<DetectorModelEvent> events) {
            this.events = events;
            return this;
        }
        public DetectorModelOnExit build() {
            return new DetectorModelOnExit(events);
        }
    }
}
