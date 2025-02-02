// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.outputs;

import com.pulumi.awsnative.iotevents.outputs.InputAttribute;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class InputDefinition {
    /**
     * @return The attributes from the JSON payload that are made available by the input. Inputs are derived from messages sent to the AWS IoT Events system using `BatchPutMessage`. Each such message contains a JSON payload, and those attributes (and their paired values) specified here are available for use in the `condition` expressions used by detectors that monitor this input.
     * 
     */
    private final List<InputAttribute> attributes;

    @CustomType.Constructor
    private InputDefinition(@CustomType.Parameter("attributes") List<InputAttribute> attributes) {
        this.attributes = attributes;
    }

    /**
     * @return The attributes from the JSON payload that are made available by the input. Inputs are derived from messages sent to the AWS IoT Events system using `BatchPutMessage`. Each such message contains a JSON payload, and those attributes (and their paired values) specified here are available for use in the `condition` expressions used by detectors that monitor this input.
     * 
     */
    public List<InputAttribute> attributes() {
        return this.attributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<InputAttribute> attributes;

        public Builder() {
    	      // Empty
        }

        public Builder(InputDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
        }

        public Builder attributes(List<InputAttribute> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }
        public Builder attributes(InputAttribute... attributes) {
            return attributes(List.of(attributes));
        }        public InputDefinition build() {
            return new InputDefinition(attributes);
        }
    }
}
