// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EventFilterResponse {
    /**
     * The name of a CloudEvents attribute. Currently, only a subset of attributes are supported for filtering. All triggers MUST provide a filter for the 'type' attribute.
     * 
     */
    private final String attribute;
    /**
     * The value for the attribute.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor
    private EventFilterResponse(
        @OutputCustomType.Parameter("attribute") String attribute,
        @OutputCustomType.Parameter("value") String value) {
        this.attribute = attribute;
        this.value = value;
    }

    /**
     * The name of a CloudEvents attribute. Currently, only a subset of attributes are supported for filtering. All triggers MUST provide a filter for the 'type' attribute.
     * 
    */
    public String getAttribute() {
        return this.attribute;
    }
    /**
     * The value for the attribute.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attribute;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EventFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.value = defaults.value;
        }

        public Builder attribute(String attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public EventFilterResponse build() {
            return new EventFilterResponse(attribute, value);
        }
    }
}
