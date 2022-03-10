// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelStateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Information that defines how a detector operates.
 * 
 */
public final class DetectorModelDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelDefinitionArgs Empty = new DetectorModelDefinitionArgs();

    /**
     * The state that is entered at the creation of each detector (instance).
     * 
     */
    @InputImport(name="initialStateName", required=true)
      private final Input<String> initialStateName;

    public Input<String> getInitialStateName() {
        return this.initialStateName;
    }

    /**
     * Information about the states of the detector.
     * 
     */
    @InputImport(name="states", required=true)
      private final Input<List<DetectorModelStateArgs>> states;

    public Input<List<DetectorModelStateArgs>> getStates() {
        return this.states;
    }

    public DetectorModelDefinitionArgs(
        Input<String> initialStateName,
        Input<List<DetectorModelStateArgs>> states) {
        this.initialStateName = Objects.requireNonNull(initialStateName, "expected parameter 'initialStateName' to be non-null");
        this.states = Objects.requireNonNull(states, "expected parameter 'states' to be non-null");
    }

    private DetectorModelDefinitionArgs() {
        this.initialStateName = Input.empty();
        this.states = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> initialStateName;
        private Input<List<DetectorModelStateArgs>> states;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initialStateName = defaults.initialStateName;
    	      this.states = defaults.states;
        }

        public Builder initialStateName(Input<String> initialStateName) {
            this.initialStateName = Objects.requireNonNull(initialStateName);
            return this;
        }

        public Builder initialStateName(String initialStateName) {
            this.initialStateName = Input.of(Objects.requireNonNull(initialStateName));
            return this;
        }

        public Builder states(Input<List<DetectorModelStateArgs>> states) {
            this.states = Objects.requireNonNull(states);
            return this;
        }

        public Builder states(List<DetectorModelStateArgs> states) {
            this.states = Input.of(Objects.requireNonNull(states));
            return this;
        }
        public DetectorModelDefinitionArgs build() {
            return new DetectorModelDefinitionArgs(initialStateName, states);
        }
    }
}
