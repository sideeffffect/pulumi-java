// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ThingGroupPropertiesAttributePayloadArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThingGroupPropertiesAttributePayloadArgs Empty = new ThingGroupPropertiesAttributePayloadArgs();

    /**
     * Key-value map.
     * 
     */
    @Import(name="attributes")
      private final @Nullable Output<Map<String,String>> attributes;

    public Output<Map<String,String>> attributes() {
        return this.attributes == null ? Codegen.empty() : this.attributes;
    }

    public ThingGroupPropertiesAttributePayloadArgs(@Nullable Output<Map<String,String>> attributes) {
        this.attributes = attributes;
    }

    private ThingGroupPropertiesAttributePayloadArgs() {
        this.attributes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThingGroupPropertiesAttributePayloadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> attributes;

        public Builder() {
    	      // Empty
        }

        public Builder(ThingGroupPropertiesAttributePayloadArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
        }

        public Builder attributes(@Nullable Output<Map<String,String>> attributes) {
            this.attributes = attributes;
            return this;
        }
        public Builder attributes(@Nullable Map<String,String> attributes) {
            this.attributes = Codegen.ofNullable(attributes);
            return this;
        }        public ThingGroupPropertiesAttributePayloadArgs build() {
            return new ThingGroupPropertiesAttributePayloadArgs(attributes);
        }
    }
}
