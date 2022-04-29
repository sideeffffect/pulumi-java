// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.inputs;

import com.pulumi.awsnative.iotevents.inputs.DetectorModelEventArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * When entering this state, perform these `actions` if the `condition` is `TRUE`.
 * 
 */
public final class DetectorModelOnEnterArgs extends ResourceArgs {

    public static final DetectorModelOnEnterArgs Empty = new DetectorModelOnEnterArgs();

    /**
     * Specifies the `actions` that are performed when the state is entered and the `condition` is `TRUE`.
     * 
     */
    @Import(name="events")
    private @Nullable Output<List<DetectorModelEventArgs>> events;

    /**
     * @return Specifies the `actions` that are performed when the state is entered and the `condition` is `TRUE`.
     * 
     */
    public Optional<Output<List<DetectorModelEventArgs>>> events() {
        return Optional.ofNullable(this.events);
    }

    private DetectorModelOnEnterArgs() {}

    private DetectorModelOnEnterArgs(DetectorModelOnEnterArgs $) {
        this.events = $.events;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DetectorModelOnEnterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetectorModelOnEnterArgs $;

        public Builder() {
            $ = new DetectorModelOnEnterArgs();
        }

        public Builder(DetectorModelOnEnterArgs defaults) {
            $ = new DetectorModelOnEnterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param events Specifies the `actions` that are performed when the state is entered and the `condition` is `TRUE`.
         * 
         * @return builder
         * 
         */
        public Builder events(@Nullable Output<List<DetectorModelEventArgs>> events) {
            $.events = events;
            return this;
        }

        /**
         * @param events Specifies the `actions` that are performed when the state is entered and the `condition` is `TRUE`.
         * 
         * @return builder
         * 
         */
        public Builder events(List<DetectorModelEventArgs> events) {
            return events(Output.of(events));
        }

        /**
         * @param events Specifies the `actions` that are performed when the state is entered and the `condition` is `TRUE`.
         * 
         * @return builder
         * 
         */
        public Builder events(DetectorModelEventArgs... events) {
            return events(List.of(events));
        }

        public DetectorModelOnEnterArgs build() {
            return $;
        }
    }

}
